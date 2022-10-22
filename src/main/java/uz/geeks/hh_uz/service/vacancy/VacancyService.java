package uz.geeks.hh_uz.service.vacancy;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.geeks.hh_uz.dto.user.AuthUserCreateDto;
import uz.geeks.hh_uz.dto.user.AuthUserDto;
import uz.geeks.hh_uz.dto.user.AuthUserUpdateDto;
import uz.geeks.hh_uz.dto.vacancy.VacancyCreateDto;
import uz.geeks.hh_uz.dto.vacancy.VacancyDto;
import uz.geeks.hh_uz.dto.vacancy.VacancyUpdateDto;
import uz.geeks.hh_uz.mappers.AuthUserMapper;
import uz.geeks.hh_uz.mappers.VacancyMapper;
import uz.geeks.hh_uz.repository.AuthUserRepository;
import uz.geeks.hh_uz.repository.VacancyRepository;
import uz.geeks.hh_uz.service.base.AbstractService;
import uz.geeks.hh_uz.service.base.GenericCrudService;
import uz.geeks.hh_uz.utils.BaseUtils;

import java.util.List;

@Service
public class VacancyService extends AbstractService<VacancyRepository, VacancyMapper>
        implements GenericCrudService<Long, VacancyDto, VacancyCreateDto, VacancyUpdateDto> {

    public VacancyService(VacancyRepository repository, VacancyMapper mapper, BaseUtils utils) {
        super(repository, mapper, utils);
    }

    @Override
    public Long create(@NonNull VacancyCreateDto dto) {
        return null;
    }

    @Override
    public void delete(@NonNull Long aLong) {

    }

    @Override
    public void update(@NonNull VacancyUpdateDto dto) {

    }

    @Override
    public List<VacancyDto> getAll() {
        return null;
    }

    @Override
    public VacancyDto get(@NonNull Long aLong) {
        return null;
    }
}
