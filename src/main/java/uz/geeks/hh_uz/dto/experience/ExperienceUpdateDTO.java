package uz.geeks.hh_uz.dto.experience;

import lombok.*;
import uz.geeks.hh_uz.dto.Dto;
import uz.geeks.hh_uz.dto.GenericDto;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExperienceUpdateDTO extends GenericDto {

        @NotBlank(message = "id cannot be empty")
        private Long id;

        @NotBlank(message = "starting date cannot be empty")
        private LocalDate startingDate;

        @NotBlank(message = "ending date cannot be empty")
        private LocalDate endingDate;

        @NotBlank(message = "organization cannot be empty")
        private String organization;

        @NotBlank(message = "region cannot be empty")
        private String region;

        private String website;

        @NotBlank(message = "position cannot be empty")
        private String position;

        @NotBlank(message = "duties cannot be empty")
        private String duties;


    }
