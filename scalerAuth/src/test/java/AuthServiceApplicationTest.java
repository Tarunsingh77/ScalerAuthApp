import org.example.scalerAuth.models.Session;
import org.example.scalerAuth.models.User;
import org.example.scalerAuth.repositories.SessionRepository;
import org.example.scalerAuth.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class AuthServiceApplicationTest {
    @Test
    void contextLoads() {

    }
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private SessionRepository sessionRepository;
    @Test
    void saveUser() {
        User user = new User();
        user.setUsername("test");
        user.setPassword("test");
        user.setEmail("abc@gmail.com");
        userRepository.save(user);
    }

}