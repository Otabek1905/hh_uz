package uz.geeks.hh_uz.mappers;


import org.mapstruct.Mapper;
import uz.geeks.hh_uz.domains.Education;
import uz.geeks.hh_uz.domains.Resume;
import uz.geeks.hh_uz.dto.education.EducationCreateDTO;
import uz.geeks.hh_uz.dto.education.EducationDTO;
import uz.geeks.hh_uz.dto.education.EducationUpdateDTO;
import uz.geeks.hh_uz.dto.resume.ResumeCreateDTO;
import uz.geeks.hh_uz.dto.resume.ResumeDTO;
import uz.geeks.hh_uz.dto.resume.ResumeUpdateDTO;

@Mapper(componentModel = "spring")
public interface EducationMapper extends BaseMapper<Education, EducationDTO, EducationCreateDTO, EducationUpdateDTO>  {
}
