package uz.geeks.hh_uz.domains;

import lombok.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import uz.geeks.hh_uz.enums.EducationLevel;
import uz.geeks.hh_uz.enums.LanguageType;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
@DynamicUpdate
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
    private String faculty;

    @Column(nullable = false)
    private LocalDateTime yearOfGraduation;

    @ManyToOne
    private Resume resume;

}
