package uz.geeks.hh_uz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.geeks.hh_uz.domains.Users;

public interface AuthUserRepository extends JpaRepository<Users, Long>, GenericRepository {
}
