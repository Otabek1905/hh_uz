package uz.geeks.hh_uz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.geeks.hh_uz.domains.Language;
import uz.geeks.hh_uz.service.langAndSkill.LanguageService;

public interface LanguageRepository extends JpaRepository<Language,Long>,GenericRepository {
}
