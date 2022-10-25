package uz.geeks.hh_uz.service.experience;

import lombok.NonNull;
import org.springframework.stereotype.Service;
import uz.geeks.hh_uz.domains.Experience;
import uz.geeks.hh_uz.dto.experience.ExperienceCreateDTO;
import uz.geeks.hh_uz.dto.experience.ExperienceDTO;
import uz.geeks.hh_uz.dto.experience.ExperienceUpdateDTO;
import uz.geeks.hh_uz.dto.vacancy.VacancyCreateDto;
import uz.geeks.hh_uz.dto.vacancy.VacancyDto;
import uz.geeks.hh_uz.dto.vacancy.VacancyUpdateDto;
import uz.geeks.hh_uz.mappers.ExperienceMapper;
import uz.geeks.hh_uz.mappers.VacancyMapper;
import uz.geeks.hh_uz.repository.ExperienceRepository;
import uz.geeks.hh_uz.repository.VacancyRepository;
import uz.geeks.hh_uz.service.base.AbstractService;
import uz.geeks.hh_uz.service.base.GenericCrudService;
import uz.geeks.hh_uz.utils.BaseUtils;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class ExperienceService extends AbstractService<ExperienceRepository, ExperienceMapper>
        implements GenericCrudService<Long, ExperienceDTO, ExperienceCreateDTO, ExperienceUpdateDTO> {

    public ExperienceService(ExperienceRepository repository, ExperienceMapper mapper, BaseUtils utils) {
        super(repository, mapper, utils);
    }

    @Override
    public Long create(@NonNull ExperienceCreateDTO dto) {
        Experience experience = mapper.fromCreateDto(dto);
        return repository.save(experience).getId();

    }

    @Override
    public void delete(@NonNull Long id) {
        repository.deleteById(id);
    }

    @Override
    public void update(@NonNull ExperienceUpdateDTO dto) {

        repository.findById(dto.getId()).
                orElseThrow(() -> new RuntimeException("Experience not found"));
        Experience experience = mapper.fromUpdateDto(dto);
        experience.getAuditable().setUpdatedAt(LocalDate.now());
        repository.save(experience);
    }

    @Override
    public List<ExperienceDTO> getAll() {
        List<Experience> experienceList = repository.findAll();
        return mapper.toDto(experienceList);
    }

    @Override
    public ExperienceDTO get(@NonNull Long id) {
        Experience experience = repository.findById(id).
                orElseThrow(() -> new RuntimeException("Experience not found"));
        return mapper.toDto(experience);
    }
}
