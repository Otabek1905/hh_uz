package uz.geeks.hh_uz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.geeks.hh_uz.domains.Vacancy;
import uz.geeks.hh_uz.dto.vacancy.VacancyDto;

import java.util.List;

public interface VacancyRepository extends JpaRepository<Vacancy, Long>, GenericRepository {

}
