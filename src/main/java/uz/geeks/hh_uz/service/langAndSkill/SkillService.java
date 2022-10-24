package uz.geeks.hh_uz.service.langAndSkill;

import lombok.NonNull;
import org.springframework.stereotype.Service;
import uz.geeks.hh_uz.domains.Language;
import uz.geeks.hh_uz.domains.Resume;
import uz.geeks.hh_uz.domains.Skills;
import uz.geeks.hh_uz.dto.skills.SkillCreateDTO;
import uz.geeks.hh_uz.dto.skills.SkillDTO;
import uz.geeks.hh_uz.dto.skills.SkillUpdateDTO;
import uz.geeks.hh_uz.mappers.SkillMapper;
import uz.geeks.hh_uz.repository.ResumeRepository;
import uz.geeks.hh_uz.repository.SkillRepository;
import uz.geeks.hh_uz.service.base.AbstractService;
import uz.geeks.hh_uz.service.base.GenericCrudService;
import uz.geeks.hh_uz.utils.BaseUtils;

import java.time.LocalDate;
import java.util.List;

@Service
public class SkillService extends AbstractService<SkillRepository, SkillMapper>
        implements GenericCrudService<Long, SkillDTO, SkillCreateDTO, SkillUpdateDTO> {
    private final ResumeRepository resumeRepository;
    public SkillService(SkillRepository repository, SkillMapper mapper, BaseUtils utils, ResumeRepository resumeRepository) {
        super(repository, mapper, utils);
        this.resumeRepository = resumeRepository;
    }

    @Override
    public Long create(@NonNull SkillCreateDTO dto) {
        return null;
    }

    @Override
    public void delete(@NonNull Long aLong) {

    }

    @Override
    public void update(@NonNull SkillUpdateDTO dto) {

    }

    @Override
    public List<SkillDTO> getAll() {
        return null;
    }

    @Override
    public SkillDTO get(@NonNull Long aLong) {
        return null;
    }

    public Long createSkill(Long resumeId, SkillCreateDTO dto) {
        Resume resume = resumeRepository.findById(resumeId).orElseThrow(() -> new RuntimeException("resume not found"));
        Skills skills = mapper.fromCreateDto(dto);
        skills.setResume(resume);
        repository.save(skills);
        return skills.getId();
    }

    public void edit(Long resumeId, SkillUpdateDTO dto) {

        resumeRepository.findById(resumeId).orElseThrow(() -> new RuntimeException("resume not found"));
        repository.findById(dto.getId()).orElseThrow(() -> new RuntimeException("skill not found"));
        Skills skills = mapper.fromUpdateDto(dto);
        skills.getAuditable().setUpdatedAt(LocalDate.now());
        repository.save(skills);
    }
}
