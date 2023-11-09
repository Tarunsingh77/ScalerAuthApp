package org.example.scalerAuth.repositories;

import org.example.scalerAuth.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Map;
import java.util.Optional;
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsernameAndPassword(String username, String password);

    Map<Object, Object> findByEmail(String s);

}
