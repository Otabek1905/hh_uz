package uz.geeks.hh_uz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.geeks.hh_uz.domains.Experience;

public interface ExperienceRepository extends JpaRepository<Experience,Long>,GenericRepository {
}
