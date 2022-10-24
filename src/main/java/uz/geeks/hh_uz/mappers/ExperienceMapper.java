package uz.geeks.hh_uz.mappers;

import org.mapstruct.Mapper;
import uz.geeks.hh_uz.domains.Experience;
import uz.geeks.hh_uz.dto.experience.ExperienceCreateDTO;
import uz.geeks.hh_uz.dto.experience.ExperienceDTO;
import uz.geeks.hh_uz.dto.experience.ExperienceUpdateDTO;

@Mapper(componentModel = "spring")
public interface ExperienceMapper extends BaseMapper<Experience, ExperienceDTO, ExperienceCreateDTO, ExperienceUpdateDTO>{
}
