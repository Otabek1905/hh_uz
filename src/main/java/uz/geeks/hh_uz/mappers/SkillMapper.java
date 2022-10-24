package uz.geeks.hh_uz.mappers;

import org.mapstruct.Mapper;
import uz.geeks.hh_uz.domains.Skills;
import uz.geeks.hh_uz.dto.resume.ResumeCreateDTO;
import uz.geeks.hh_uz.dto.resume.ResumeDTO;
import uz.geeks.hh_uz.dto.resume.ResumeUpdateDTO;
import uz.geeks.hh_uz.dto.skills.SkillCreateDTO;
import uz.geeks.hh_uz.dto.skills.SkillDTO;
import uz.geeks.hh_uz.dto.skills.SkillUpdateDTO;

@Mapper(componentModel = "spring")
public interface SkillMapper extends BaseMapper<Skills, SkillDTO, SkillCreateDTO, SkillUpdateDTO>{

}
