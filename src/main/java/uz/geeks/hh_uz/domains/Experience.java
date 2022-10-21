package uz.geeks.hh_uz.domains;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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
