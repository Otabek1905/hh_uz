package uz.geeks.hh_uz.domains;

import lombok.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.geeks.hh_uz.enums.EducationLevel;
import uz.geeks.hh_uz.enums.LanguageType;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Embedded
    private Auditable auditable;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private EducationLevel educationLevel;

    @Column(nullable = false)
    private String department;

    @Column(nullable = false)
    private LanguageType languageType;

    @ManyToOne
    private Resume resume;


}
