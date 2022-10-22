package uz.geeks.hh_uz.domains;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.geeks.hh_uz.enums.LanguageDegree;
import uz.geeks.hh_uz.enums.LanguageType;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Auditable auditable;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private LanguageType languageType;

    @Column(nullable = false)
    private LanguageDegree languageDegree;

    @ManyToOne
    private Resume resume;


}
