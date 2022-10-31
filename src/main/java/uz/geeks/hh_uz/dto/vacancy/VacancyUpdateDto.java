package uz.geeks.hh_uz.dto.vacancy;

import lombok.*;
import uz.geeks.hh_uz.dto.GenericDto;
import uz.geeks.hh_uz.enums.JobSchedule;
import uz.geeks.hh_uz.enums.JobType;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class VacancyUpdateDto extends GenericDto {
    private String title;

    private Double salary;

    private String experience;

    private JobSchedule jobSchedule;

    private JobType jobType;

    private String offer;

    private String demands;

    private Long companyId;
}
