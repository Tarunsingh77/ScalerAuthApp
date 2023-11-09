package org.example.scalerAuth.services;

import org.example.scalerAuth.models.Session;
import org.example.scalerAuth.models.User;
import org.example.scalerAuth.repositories.SessionRepository;
import org.example.scalerAuth.repositories.UserRepository;
import org.example.scalerAuth.util.TcokenGenerator;

import java.util.Optional;

public class ScalerAuthenticationServiceImpl implements ScalerAuthenticationService {
    UserRepository userRepository;
    SessionRepository sessionRepository;
    public ScalerAuthenticationServiceImpl(UserRepository userRepository, SessionRepository sessionRepository) {
        this.userRepository = userRepository;
        this.sessionRepository = sessionRepository;
    }
    @Override
    public String login(String username, String password) {
        Optional<User> user = userRepository.findByUsernameAndPassword(username, password);
        if (user.isPresent()) {
            String Token = new TcokenGenerator().generateToken();
            Session session = new Session();
            session.setToken(Token);

            sessionRepository.save(session);

            return Optional.of(Token).get();
        }
        return null;
    }
    @Override
    public boolean isSessionTokenValid(String token) {
        Optional<Session> session = sessionRepository.findByToken(token);
        return session.isPresent();
    }
}
