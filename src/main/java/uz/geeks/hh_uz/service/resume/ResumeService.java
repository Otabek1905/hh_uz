package uz.geeks.hh_uz.service.resume;

import lombok.NonNull;
import org.springframework.stereotype.Service;
import uz.geeks.hh_uz.domains.Auditable;
import uz.geeks.hh_uz.domains.Resume;
import uz.geeks.hh_uz.dto.resume.*;
import uz.geeks.hh_uz.mappers.ResumeMapper;
import uz.geeks.hh_uz.repository.EducationRepository;
import uz.geeks.hh_uz.repository.ResumeRepository;
import uz.geeks.hh_uz.service.base.AbstractService;
import uz.geeks.hh_uz.service.base.GenericCrudService;
import uz.geeks.hh_uz.utils.BaseUtils;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class ResumeService extends AbstractService<ResumeRepository, ResumeMapper>
        implements GenericCrudService<Long, ResumeDTO, ResumeCreateDTO, ResumeUpdateDTO> {



    public ResumeService(ResumeRepository repository, ResumeMapper mapper, BaseUtils utils, EducationRepository educationRepository) {
        super(repository, mapper, utils);
    }

    @Override
    public Long create(@NonNull ResumeCreateDTO dto) {

        Resume resume = mapper.fromCreateDto(dto);
        resume.setAuditable(Auditable.builder().createdAt(new Date()).build());



        // TODO: 22/10/22 work on auditable, you have to take user id

        // TODO: 22/10/22 if education, experience... cannot save resume id you have to unlock commits

//        for (Education education : resume.getEducations()) {
//            education.setResume(resume);
//        }
//if
//        for (Experience experience : resume.getExperiences()) {
//            experience.setResume(resume);
//        }

        // TODO: 22/10/22 if education, experience... cannot be saved automatically to database you have to save all

        repository.save(resume);

        return resume.getId();
    }

    @Override
    public void delete(@NonNull Long id) {
        repository.deleteById(id);
    }

    @Override
    public void update(@NonNull ResumeUpdateDTO dto) {

    }

    @Override
    public List<ResumeDTO> getAll() {
        List<Resume> resumeList = repository.findAll();
        return mapper.toDto(resumeList);
    }

    @Override
    public ResumeDTO get(@NonNull Long id) {
        Resume resume = repository.findById(id).orElseThrow(() -> new RuntimeException("resume not found"));
        return mapper.toDto(resume);
    }

    public void editPersonalInfo(@NonNull Long resumeId, @NonNull PersonalInfoUpdateDTO dto) {

        Resume resume = repository.findById(resumeId).orElseThrow(() -> new RuntimeException("resume not found"));
        resume.setCity(dto.getCity());
        resume.setEmail(dto.getEmail());
        resume.setFullName(dto.getFullName());
        resume.setPhoneNumber(dto.getPhoneNumber());
        resume.getAuditable().setUpdatedAt(new Date());
        repository.save(resume);
    }

    public void editEmploymentInfo(Long resumeId, EmploymentInfoDTO dto) {

        Resume resume = repository.findById(resumeId).orElseThrow(() -> new RuntimeException("resume not found"));
        resume.setEmployment(dto.getEmployment());
        resume.setSalary(dto.getSalary());
        resume.setAboutMe(dto.getAboutMe());
        resume.setJobTitle(dto.getJobTitle());
        resume.getAuditable().setUpdatedAt(new Date());

        repository.save(resume);

    }


}
