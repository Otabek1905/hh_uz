package uz.geeks.hh_uz.domains;

import uz.geeks.hh_uz.enums.JobSchedule;
import uz.geeks.hh_uz.enums.JobType;

import javax.persistence.*;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 21/10/22 17:57 (Friday)
 * hh_uz/IntelliJ IDEA
 */
public class Vacancy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Embedded
    private Auditable auditable;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private Double salary;
    @Column
    private String experience;

    @Column(nullable = false)
    private JobSchedule jobSchedule;
    @Column(nullable = false)
    private JobType jobType;

    private String offer;

    private String demands;


}
