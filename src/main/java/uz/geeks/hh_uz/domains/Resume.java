package uz.geeks.hh_uz.domains;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.geeks.hh_uz.enums.City;
import uz.geeks.hh_uz.enums.Employment;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
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

    @OneToMany(mappedBy = "resume")
    private List<Education> educations;

    @OneToMany(mappedBy = "resume")
    private List<Language> languages;

    @OneToMany(mappedBy = "resume")
    private List<Experience> experiences;

    @OneToMany(mappedBy = "resume")
    private List<Skills> skills;







}
