package name.cgt.demo.learnjpa;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;
}
