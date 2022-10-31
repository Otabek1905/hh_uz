package uz.geeks.hh_uz.dto.education;

import lombok.*;
import uz.geeks.hh_uz.domains.Auditable;
import uz.geeks.hh_uz.domains.Resume;
import uz.geeks.hh_uz.dto.Dto;
import uz.geeks.hh_uz.enums.EducationLevel;
import uz.geeks.hh_uz.enums.LanguageType;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class EducationCreateDTO implements Dto {

    @NotBlank(message = "Education name cannot be empty")
    private String name;

    @NotBlank(message = "Education level cannot be empty")
    private EducationLevel educationLevel;

    @NotBlank(message = "department cannot be empty")
    private String department;

    @NotBlank(message = "department cannot be empty")
    private String faculty;

    private LocalDateTime yearOfGraduation;


}
