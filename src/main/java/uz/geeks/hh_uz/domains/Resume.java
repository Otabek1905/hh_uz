package uz.geeks.hh_uz.domains;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import uz.geeks.hh_uz.enums.City;
import uz.geeks.hh_uz.enums.Employment;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
@DynamicUpdate
public class Resume {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private City city = City.TASHKENT;

    @Column(nullable = false)
    private String jobTitle;

    @Column(nullable = false)
    private Employment employment;

    @Column(nullable = true)
    private String aboutMe;

    @Column(nullable = true)
    private Double salary;

    @Embedded
    private Auditable auditable;

    @OneToMany(mappedBy = "resume")
    private List<Education> educations;

    @OneToMany(mappedBy = "resume")
    private List<Language> languages;

    @OneToMany(mappedBy = "resume")
    private List<Experience> experiences;

    @OneToMany(mappedBy = "resume")
    private List<Skills> skills;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "Resume_Vacancy",
            joinColumns = { @JoinColumn(name = "resume_id") },
            inverseJoinColumns = { @JoinColumn(name = "vacancy_id") }
    )
    Set<Vacancy> vacancies = new HashSet<>();

}
