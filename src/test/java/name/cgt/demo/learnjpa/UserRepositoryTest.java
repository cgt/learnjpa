package name.cgt.demo.learnjpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.orm.jpa.JpaSystemException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DataJpaTest
public class UserRepositoryTest {
    @Autowired
    private UserRepository repository;

    @Test
    public void findAll_returns_empty_collection() {
        var users = repository.findAll();
        assertThat(users).isEmpty();
    }

    @Test
    public void save_user_fails_when_user_does_not_have_id() {
        var user = new User();
        user.setName("");
        assertThrows(
            JpaSystemException.class,
            () -> repository.save(user)
        );
    }
}
