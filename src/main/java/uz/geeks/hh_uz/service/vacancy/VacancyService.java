package uz.geeks.hh_uz.service.vacancy;

import lombok.NonNull;
import org.springframework.stereotype.Service;
import uz.geeks.hh_uz.domains.Vacancy;
import uz.geeks.hh_uz.dto.vacancy.VacancyCreateDto;
import uz.geeks.hh_uz.dto.vacancy.VacancyDto;
import uz.geeks.hh_uz.dto.vacancy.VacancyUpdateDto;
import uz.geeks.hh_uz.mappers.VacancyMapper;
import uz.geeks.hh_uz.repository.VacancyRepository;
import uz.geeks.hh_uz.security.SessionUser;
import uz.geeks.hh_uz.service.base.AbstractService;
import uz.geeks.hh_uz.service.base.GenericCrudService;
import uz.geeks.hh_uz.utils.BaseUtils;

import java.util.List;

@Service
public class VacancyService extends AbstractService<VacancyRepository, VacancyMapper>
        implements GenericCrudService<Long, VacancyDto, VacancyCreateDto, VacancyUpdateDto> {
    private final SessionUser sessionUser;

    public VacancyService(VacancyRepository repository, VacancyMapper mapper, BaseUtils utils, SessionUser sessionUser) {
        super(repository, mapper, utils);
        this.sessionUser = sessionUser;
    }

    @Override
    public Long create(@NonNull VacancyCreateDto dto) {
        Vacancy vacancy = mapper.fromCreateDto(dto);
        vacancy.getAuditable().setCreatedBy(sessionUser.getDbUser().getId());
        repository.save(vacancy);
        return vacancy.getId();
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
