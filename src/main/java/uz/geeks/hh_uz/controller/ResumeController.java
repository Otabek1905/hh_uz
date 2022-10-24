package uz.geeks.hh_uz.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.geeks.hh_uz.domains.Resume;
import uz.geeks.hh_uz.dto.resume.*;
import uz.geeks.hh_uz.service.resume.ResumeService;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/resume")
public class ResumeController extends ApiController<ResumeService>{

    public ResumeController(ResumeService service) {
        super(service);
    }

    @PostMapping("/create")
    public Long createResume(@RequestBody @Valid ResumeCreateDTO dto){
        return service.create(dto);
    }

    @GetMapping("/delete/{id}")
    public void deleteResume(@PathVariable Long id){
         service.delete(id);
    }

    @GetMapping("/getAll")
    public List<ResumeDTO> getAllResumes(){
        return service.getAll();
    }

    @GetMapping("/getOne/{id}")
    public ResumeDTO getOne(@PathVariable Long id){
        return service.get(id);
    }

    @PutMapping("/editPersonalInfo{resumeId}")
    public void editPersonalInfo(@PathVariable Long resumeId,@RequestBody @Valid PersonalInfoUpdateDTO dto){
        service.editPersonalInfo(resumeId,dto);
    }

    @PutMapping("/editWorkInfo{resumeId}")
    public void editEmploymentInfoEdit(@PathVariable Long resumeId,@RequestBody @Valid EmploymentInfoDTO dto){
        service.editEmploymentInfo(resumeId,dto);
    }


























}
