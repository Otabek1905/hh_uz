package uz.geeks.hh_uz.domains;

import javax.persistence.*;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 21/10/22 17:31 (Friday)
 * hh_uz/IntelliJ IDEA
 */
@Entity
public class SocialNetwork {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,unique = true)
    private String link;
    @ManyToOne
    private User user;
}
