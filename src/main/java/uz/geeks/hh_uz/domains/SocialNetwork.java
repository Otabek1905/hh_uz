package uz.geeks.hh_uz.domains;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 21/10/22 17:31 (Friday)
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
public class SocialNetwork {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Auditable auditable;

    @Column(nullable = false,unique = true)
    private String link;
    @ManyToOne
    private User user;
}
