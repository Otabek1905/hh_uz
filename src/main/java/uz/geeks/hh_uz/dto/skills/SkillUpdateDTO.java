package uz.geeks.hh_uz.dto.skills;

import lombok.*;
import uz.geeks.hh_uz.dto.GenericDto;

import javax.validation.constraints.NotBlank;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SkillUpdateDTO extends GenericDto {

    @NotBlank(message = "skill id cannot be empty")
    private Long id;
    @NotBlank(message = "skill name cannot be empty")
    private String name;

}
