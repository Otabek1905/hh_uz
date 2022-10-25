package uz.geeks.hh_uz.mappers;

import org.mapstruct.Mapper;
import org.springframework.context.annotation.ComponentScan;
import uz.geeks.hh_uz.domains.Resume;
import uz.geeks.hh_uz.dto.resume.ResumeCreateDTO;
import uz.geeks.hh_uz.dto.resume.ResumeDTO;
import uz.geeks.hh_uz.dto.resume.ResumeUpdateDTO;

@Mapper(componentModel = "spring")
public interface ResumeMapper extends BaseMapper<Resume, ResumeDTO, ResumeCreateDTO, ResumeUpdateDTO> {

}
