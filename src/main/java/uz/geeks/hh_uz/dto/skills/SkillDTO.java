package uz.geeks.hh_uz.dto.skills;

import lombok.*;
import uz.geeks.hh_uz.dto.GenericDto;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SkillDTO extends GenericDto {
    private String name;

}
