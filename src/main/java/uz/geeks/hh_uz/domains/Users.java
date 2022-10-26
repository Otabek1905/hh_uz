package uz.geeks.hh_uz.domains;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import uz.geeks.hh_uz.enums.Location;
import uz.geeks.hh_uz.enums.UserType;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 21/10/22 17:18 (Friday)
 * hh_uz/IntelliJ IDEA
 */
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
@DynamicUpdate
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Embedded
    private Auditable auditable;

    @Column(name = "full_name")
    private String fullName;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(unique = true, nullable = false)
    private String email;

    @OneToMany(mappedBy = "users")
    private List<SocialNetwork> socialNetworks;

    @Column(nullable = false)
    private Location location;

    private String image_url;

    @Column(nullable = false)
    private UserType userType;


    @Enumerated(EnumType.STRING)
    private Status status = Status.NOT_ACTIVE;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLoginAt;

    private Integer loginTryCount;

//    @OneToMany(mappedBy = "user")
//    private Collection<AuthRole> userRoles;

    public enum Status {
        ACTIVE,
        NOT_ACTIVE,
        ACCOUNT_EXPIRED,
        CREDENTIALS_EXPIRED;

        public boolean notEquals(Status status) {

            return !this.equals(status);
        }
    }


}