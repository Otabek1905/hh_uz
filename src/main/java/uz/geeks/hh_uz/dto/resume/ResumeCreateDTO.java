package uz.geeks.hh_uz.dto.resume;

import lombok.*;
import uz.geeks.hh_uz.dto.Dto;
import uz.geeks.hh_uz.dto.experience.ExperienceCreateDTO;
import uz.geeks.hh_uz.dto.education.EducationCreateDTO;
import uz.geeks.hh_uz.dto.language.LanguageCreateDTO;
import uz.geeks.hh_uz.dto.skills.SkillCreateDTO;
import uz.geeks.hh_uz.enums.City;
import uz.geeks.hh_uz.enums.Employment;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ResumeCreateDTO implements Dto {

    @NotBlank(message = "full name cannot be null")
    private String fullName;

    @NotBlank(message = "phone number cannot be null")
    private String phoneNumber;

    @Email(regexp = ".+@.+\\..+")
    private String email;

    @NotBlank(message = "city required")
    private City city;

    @NotBlank(message = "job title required")
    private String jobTitle;

    @NotBlank(message = "employment required! example : fullTime..")
    private Employment employment;

    private String aboutMe;

    private Double salary;

    private List<EducationCreateDTO> educationCreateDTOList;

    private List<ExperienceCreateDTO> experienceCreateDTOList;

    private List<LanguageCreateDTO> languageCreateDTOList;

    private List<SkillCreateDTO> skillCreateDTOList;




}
