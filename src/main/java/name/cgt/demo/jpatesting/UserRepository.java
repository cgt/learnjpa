package name.cgt.demo.jpatesting;

import org.springframework.data.repository.CrudRepository;

interface UserRepository extends CrudRepository<User, Long> {
}
