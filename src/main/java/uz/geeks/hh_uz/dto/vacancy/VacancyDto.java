package uz.geeks.hh_uz.dto.vacancy;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import uz.geeks.hh_uz.dto.GenericDto;
import uz.geeks.hh_uz.enums.JobSchedule;
import uz.geeks.hh_uz.enums.JobType;




@Getter
@Setter
@ToString
public class VacancyDto extends GenericDto {

    private String title;

    private Double salary;

    private String experience;

    private JobSchedule jobSchedule;

    private JobType jobType;

    private String offer;

    private String demands;


}
