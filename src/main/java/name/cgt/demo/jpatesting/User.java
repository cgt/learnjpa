package name.cgt.demo.jpatesting;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "users")
class User {
    @Id
    private long id;
}
