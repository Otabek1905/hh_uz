package uz.geeks.hh_uz.domains;

import uz.geeks.hh_uz.enums.Location;
import uz.geeks.hh_uz.enums.UserType;

import javax.persistence.*;
import java.util.List;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 21/10/22 17:18 (Friday)
 * hh_uz/IntelliJ IDEA
 */
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Embedded
    private Auditable auditable;

    @Column(name = "full name")
    private String fullname;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(unique = true, nullable = false)
    private String email;

    @OneToMany(mappedBy = "user")
    private List<SocialNetwork> socialNetworks;

    @Column(nullable = false)
    private Location location;

    private String image_url;
    @Column(nullable = false, unique = true)
    private UserType type;


}
