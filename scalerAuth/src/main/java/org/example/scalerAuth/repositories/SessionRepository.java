package org.example.scalerAuth.repositories;

import org.example.scalerAuth.models.Session;
import org.example.scalerAuth.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface SessionRepository extends JpaRepository<Session, Long> {
    Optional<Session> findByToken(String token);

    Session findByUser(User user);
}
