package uz.geeks.hh_uz.service.langAndSkill;

import lombok.NonNull;
import org.springframework.stereotype.Service;
import uz.geeks.hh_uz.domains.Language;
import uz.geeks.hh_uz.domains.Resume;
import uz.geeks.hh_uz.dto.language.LanguageCreateDTO;
import uz.geeks.hh_uz.dto.language.LanguageDTO;
import uz.geeks.hh_uz.dto.language.LanguageUpdateDTO;
import uz.geeks.hh_uz.mappers.LanguageMapper;
import uz.geeks.hh_uz.repository.LanguageRepository;
import uz.geeks.hh_uz.repository.ResumeRepository;
import uz.geeks.hh_uz.service.base.AbstractService;
import uz.geeks.hh_uz.service.base.GenericCrudService;
import uz.geeks.hh_uz.utils.BaseUtils;

import java.time.LocalDate;
import java.util.List;

@Service
public class LanguageService extends AbstractService<LanguageRepository, LanguageMapper>
        implements GenericCrudService<Long, LanguageDTO, LanguageCreateDTO, LanguageUpdateDTO> {

    private final ResumeRepository resumeRepository;

    public LanguageService(LanguageRepository repository, LanguageMapper mapper, BaseUtils utils, ResumeRepository resumeRepository) {
        super(repository, mapper, utils);
        this.resumeRepository = resumeRepository;
    }

    @Override
    public Long create(@NonNull LanguageCreateDTO dto) {
        return null;
    }

    @Override
    public void delete(@NonNull Long aLong) {

    }

    @Override
    public void update(@NonNull LanguageUpdateDTO dto) {

    }

    @Override
    public List<LanguageDTO> getAll() {
        return null;
    }

    @Override
    public LanguageDTO get(@NonNull Long aLong) {
        return null;
    }

    public Long createLanguage(Long resumeId, LanguageCreateDTO dto) {
        Resume resume = resumeRepository.findById(resumeId).orElseThrow(() -> new RuntimeException("resume not found"));
        Language language = mapper.fromCreateDto(dto);
        language.setResume(resume);
        repository.save(language);
        return language.getId();
    }

    public void edit(Long resumeId, LanguageUpdateDTO dto) {
        resumeRepository.findById(resumeId).orElseThrow(() -> new RuntimeException("resume not found"));
        Language language = mapper.fromUpdateDto(dto);
        language.getAuditable().setUpdatedAt(LocalDate.now());
        repository.save(language);
    }
}
