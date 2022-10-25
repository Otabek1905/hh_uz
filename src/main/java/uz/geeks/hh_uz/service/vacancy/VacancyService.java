package uz.geeks.hh_uz.service.vacancy;

import lombok.NonNull;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import uz.geeks.hh_uz.domains.Vacancy;
import uz.geeks.hh_uz.dto.vacancy.VacancyCreateDto;
import uz.geeks.hh_uz.dto.vacancy.VacancyDto;
import uz.geeks.hh_uz.dto.vacancy.VacancyUpdateDto;
import uz.geeks.hh_uz.exceptions.GenericNotFoundException;
import uz.geeks.hh_uz.mappers.VacancyMapper;
import uz.geeks.hh_uz.repository.VacancyRepository;
import uz.geeks.hh_uz.security.SessionUser;
import uz.geeks.hh_uz.service.base.AbstractService;
import uz.geeks.hh_uz.service.base.GenericCrudService;
import uz.geeks.hh_uz.utils.BaseUtils;

import java.util.List;
import java.util.function.Supplier;

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
        if (repository.existsById(aLong)) {
            repository.deleteById(aLong);
        } else {
            throw getNotFoundException(aLong).get();
        }
    }

    @Override
    public void update(@NonNull VacancyUpdateDto dto) {
        Vacancy vacancy = repository.findById(dto.getId()).orElseThrow(getNotFoundException(dto.getId()));
        vacancy.setTitle(dto.getTitle());
        vacancy.setExperience(dto.getExperience());
        vacancy.setDemands(dto.getDemands());
        vacancy.setOffer(dto.getOffer());
        vacancy.setSalary(dto.getSalary());
        vacancy.setJobType(dto.getJobType());
        vacancy.setJobSchedule(dto.getJobSchedule());
        repository.save(vacancy);
    }

    @Override
    public List<VacancyDto> getAll() {
        return mapper.toDto(repository.findAll());
    }

    @Override
    public VacancyDto get(@NonNull Long aLong) {
        return mapper.toDto(repository.findById(aLong).orElseThrow(getNotFoundException(aLong)));
    }

    private Supplier<GenericNotFoundException> getNotFoundException(Long id) {
        return () -> new GenericNotFoundException("Vacancy not found by id : %s".formatted(id), HttpStatus.NOT_FOUND.value());
    }
}
