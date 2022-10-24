package uz.geeks.hh_uz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.geeks.hh_uz.domains.Skills;

public interface SkillRepository extends JpaRepository<Skills,Long>, GenericRepository {
}
