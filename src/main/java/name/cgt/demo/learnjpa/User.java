package name.cgt.demo.learnjpa;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "users")
class User {
    @Id
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;
}
