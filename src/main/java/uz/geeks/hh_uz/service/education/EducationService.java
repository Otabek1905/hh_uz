package uz.geeks.hh_uz.service.education;

import lombok.NonNull;
import org.springframework.stereotype.Service;
import uz.geeks.hh_uz.domains.Education;
import uz.geeks.hh_uz.domains.Resume;
import uz.geeks.hh_uz.dto.education.EducationCreateDTO;
import uz.geeks.hh_uz.dto.education.EducationDTO;
import uz.geeks.hh_uz.dto.education.EducationUpdateDTO;
import uz.geeks.hh_uz.mappers.EducationMapper;
import uz.geeks.hh_uz.repository.EducationRepository;
import uz.geeks.hh_uz.repository.ResumeRepository;
import uz.geeks.hh_uz.service.base.AbstractService;
import uz.geeks.hh_uz.service.base.GenericCrudService;
import uz.geeks.hh_uz.utils.BaseUtils;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service

public class EducationService extends AbstractService<EducationRepository, EducationMapper>
        implements GenericCrudService<Long, EducationDTO, EducationCreateDTO, EducationUpdateDTO> {
    public EducationService(EducationRepository repository, EducationMapper mapper, BaseUtils utils, ResumeRepository resumeRepository) {
        super(repository, mapper, utils);
        this.resumeRepository = resumeRepository;
    }

    private final ResumeRepository resumeRepository;

    @Override
    public Long create(@NonNull EducationCreateDTO dto) {
        return null;
    }

    @Override
    public void delete(@NonNull Long id) {
        repository.deleteById(id);
    }

    @Override
    public void update(@NonNull EducationUpdateDTO dto) {

    }

    @Override
    public List<EducationDTO> getAll() {
        List<Education> educationList = repository.findAll();
        return mapper.toDto(educationList);
    }

    @Override
    public EducationDTO get(@NonNull Long aLong) {
        return null;
    }

    public void edit(Long resumeId, EducationUpdateDTO dto) {
        resumeRepository.findById(resumeId).orElseThrow(() -> new RuntimeException("resume not found"));
        repository.findById(dto.getId()).orElseThrow(() -> new RuntimeException("education not found"));
        Education education1 = mapper.fromUpdateDto(dto);

        education1.getAuditable().setUpdatedAt(new Date());
        repository.save(education1);
    }

    public void createEducation(Long resumeId, EducationCreateDTO dto) {
        Resume resume = resumeRepository.findById(resumeId).orElseThrow(() -> new RuntimeException("resume not found"));
        Education education = mapper.fromCreateDto(dto);
        repository.save(education);
    }
}
