package uz.geeks.hh_uz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.geeks.hh_uz.domains.Resume;

public interface ResumeRepository extends JpaRepository<Resume,Long>, GenericRepository {

}
