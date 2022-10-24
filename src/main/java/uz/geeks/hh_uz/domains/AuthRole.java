package uz.geeks.hh_uz.domains;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AuthRole implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String code;

    private String name;


    @Override
    public String getAuthority() {
        return "ROLE_" + code;
    }

}
