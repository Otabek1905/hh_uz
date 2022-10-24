package uz.geeks.hh_uz.dto.skills;


import lombok.*;
import uz.geeks.hh_uz.dto.Dto;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SkillCreateDTO implements Dto {
    @NotBlank(message = "skill name cannot be empty")
    private String name;
}
