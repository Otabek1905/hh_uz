package uz.geeks.hh_uz.mappers;

import org.mapstruct.Mapper;
import uz.geeks.hh_uz.domains.Experience;
import uz.geeks.hh_uz.domains.Language;
import uz.geeks.hh_uz.dto.experience.ExperienceCreateDTO;
import uz.geeks.hh_uz.dto.experience.ExperienceDTO;
import uz.geeks.hh_uz.dto.experience.ExperienceUpdateDTO;
import uz.geeks.hh_uz.dto.language.LanguageCreateDTO;
import uz.geeks.hh_uz.dto.language.LanguageDTO;
import uz.geeks.hh_uz.dto.language.LanguageUpdateDTO;

@Mapper(componentModel = "spring")
public interface LanguageMapper extends BaseMapper<Language, LanguageDTO, LanguageCreateDTO, LanguageUpdateDTO> {



}
