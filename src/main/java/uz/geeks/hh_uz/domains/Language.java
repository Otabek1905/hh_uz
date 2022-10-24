package uz.geeks.hh_uz.domains;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import uz.geeks.hh_uz.enums.LanguageDegree;
import uz.geeks.hh_uz.enums.LanguageType;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
@DynamicUpdate
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
