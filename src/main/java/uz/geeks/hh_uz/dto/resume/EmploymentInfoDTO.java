package uz.geeks.hh_uz.dto.resume;


import lombok.*;
import uz.geeks.hh_uz.enums.Employment;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class EmploymentInfoDTO {

    @NotBlank(message = "job title cannot be empty")
    private String jobTitle;

    @NotBlank(message = "employment cannot be empty")
    private Employment employment;

    private String aboutMe;

    private Double salary;

}
