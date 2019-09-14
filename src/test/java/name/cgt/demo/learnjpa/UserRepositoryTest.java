package name.cgt.demo.learnjpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

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
    public void new_user_without_id_is_given_id_when_saved() {
        var user = new User();
        user.setName("");
        assertThat(user.getId()).isNull();

        var savedUser = repository.save(user);
        assertThat(savedUser.getId()).isNotNull();
    }
}
