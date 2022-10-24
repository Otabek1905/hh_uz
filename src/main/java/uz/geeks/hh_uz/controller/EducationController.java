package uz.geeks.hh_uz.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import uz.geeks.hh_uz.dto.education.EducationCreateDTO;
import uz.geeks.hh_uz.dto.education.EducationDTO;
import uz.geeks.hh_uz.dto.education.EducationUpdateDTO;
import uz.geeks.hh_uz.dto.resume.EmploymentInfoDTO;
import uz.geeks.hh_uz.service.education.EducationService;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/education")
public class EducationController extends ApiController<EducationService>{

    public EducationController(EducationService service) {
        super(service);
    }

    @PostMapping("/createEducation{resumeId}")
    public ResponseEntity<Long> editEducationInfo(@PathVariable Long resumeId, @RequestBody @Valid EducationCreateDTO dto){
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri();
        return ResponseEntity.created(uri).body(service.createEducation(resumeId,dto));
    }


    @PutMapping("/editEducationInfo{resumeId}")
    public ResponseEntity<String> editEducationInfo(@PathVariable Long resumeId, @RequestBody @Valid EducationUpdateDTO dto){
        service.edit(resumeId,dto);
        return ResponseEntity.ok("Education info updated");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteEducation(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.ok("Education deleted");
    }

    @GetMapping("/getAllEducation")
    public ResponseEntity<List<EducationDTO>> getAllEducation(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }








}
