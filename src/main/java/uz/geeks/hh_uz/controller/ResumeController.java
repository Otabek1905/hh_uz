package uz.geeks.hh_uz.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import uz.geeks.hh_uz.domains.Resume;
import uz.geeks.hh_uz.dto.resume.*;
import uz.geeks.hh_uz.service.resume.ResumeService;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;


@RestController
@RequestMapping("/resume")
public class ResumeController extends ApiController<ResumeService>{

    public ResumeController(ResumeService service) {
        super(service);
    }

    @PostMapping("/create")
    public ResponseEntity<Long> createResume(@RequestBody @Valid ResumeCreateDTO dto){
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri();
        return ResponseEntity.created(uri).body(service.create(dto));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteResume(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.ok("Entity deleted");
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<ResumeDTO>>getAllResumes(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/getOne/{id}")
    public ResponseEntity<ResumeDTO> getOne(@PathVariable Long id){
        return new ResponseEntity<>(service.get(id),HttpStatus.OK);
    }

    @PutMapping("/editPersonalInfo{resumeId}")
    public ResponseEntity<String> editPersonalInfo(@PathVariable Long resumeId,@RequestBody @Valid PersonalInfoUpdateDTO dto){
        service.editPersonalInfo(resumeId,dto);
        return ResponseEntity.ok("Personal info updated");
    }

    @PutMapping("/editWorkInfo{resumeId}")
    public ResponseEntity<String> editEmploymentInfoEdit(@PathVariable Long resumeId,@RequestBody @Valid EmploymentInfoDTO dto){
        service.editEmploymentInfo(resumeId,dto);
        return ResponseEntity.ok("Work info updated");
    }


























}
