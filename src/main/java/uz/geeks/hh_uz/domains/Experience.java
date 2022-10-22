package uz.geeks.hh_uz.domains;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;

@Getter
@Setter
@ToString
@Builder
@Entity
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


}
