package uz.geeks.hh_uz.dto.education;

import lombok.*;
import uz.geeks.hh_uz.dto.GenericDto;
import uz.geeks.hh_uz.enums.EducationLevel;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class EducationUpdateDTO extends GenericDto {

    private Long id;

    @NotBlank(message = "Education name cannot be empty")
    private String name;

    @NotBlank(message = "Education level cannot be empty")
    private EducationLevel educationLevel;

    @NotBlank(message = "department cannot be empty")
    private String department;

    @NotBlank(message = "faculty cannot be empty")
    private String faculty;

    @NotBlank(message = "graduation year cannot be empty")
    private LocalDateTime yearOfGraduation;


}
