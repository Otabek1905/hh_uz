package uz.geeks.hh_uz.dto.experience;

import uz.geeks.hh_uz.dto.GenericDto;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

public class ExperienceDTO extends GenericDto {

    private LocalDate startingDate;

    private LocalDate endingDate;

    private String organization;

    private String region;

    private String website;

    private String position;

    private String duties;
}
