package uz.geeks.hh_uz.mappers;

import org.mapstruct.Mapper;
import uz.geeks.hh_uz.domains.Vacancy;
import uz.geeks.hh_uz.dto.vacancy.VacancyCreateDto;
import uz.geeks.hh_uz.dto.vacancy.VacancyDto;
import uz.geeks.hh_uz.dto.vacancy.VacancyUpdateDto;

@Mapper(componentModel = "spring")
public interface VacancyMapper extends BaseMapper<Vacancy, VacancyDto, VacancyCreateDto, VacancyUpdateDto> {
}
