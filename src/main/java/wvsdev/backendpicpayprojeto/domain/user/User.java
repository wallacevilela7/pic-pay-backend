package wvsdev.backendpicpayprojeto.domain.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import wvsdev.backendpicpayprojeto.domain.user.enums.UserType;
import wvsdev.backendpicpayprojeto.dtos.UserDTO;

import java.math.BigDecimal;

@Entity(name = "users")
@Table(name = "tb_user")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;

    @Column(unique = true)
    private String document;

    @Column(unique = true)
    private String email;
    private String password;
    private BigDecimal balance;

    @Enumerated(EnumType.STRING)
    private UserType userType;

    public User() {
    }

    public User(UserDTO data){
        this.firstName = data.firstName();
        this.lastName = data.lastName();
        this.balance = data.balance();
        this.userType = data.userType();
        this.password = data.password();
        this.email = data.email();
        this.document = data.document();
    }
}
