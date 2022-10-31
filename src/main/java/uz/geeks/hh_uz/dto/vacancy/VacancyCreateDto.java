package uz.geeks.hh_uz.dto.vacancy;

import lombok.*;
import uz.geeks.hh_uz.dto.Dto;
import uz.geeks.hh_uz.enums.JobSchedule;
import uz.geeks.hh_uz.enums.JobType;

import javax.persistence.Column;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VacancyCreateDto implements Dto {
    private String title;

    private Double salary;

    private String experience;

    private JobSchedule jobSchedule;

    private JobType jobType;

    private String offer;

    private String demands;

    private Long companyId;
}
