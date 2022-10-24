package uz.geeks.hh_uz.domains;


import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Auditable auditable;

    @Column(nullable = false)
    private LocalDate startingDate;

    @Column(nullable = false)
    private LocalDate endingDate;

    @Column(nullable = false)
    private String organization;

    @Column(nullable = false)
    private String region;

    @Column(nullable = false)
    private String website;

    @Column(nullable = false)
    private String position;

    @Column(nullable = false)
    private String duties;

    @ManyToOne
    private Resume resume;
}


