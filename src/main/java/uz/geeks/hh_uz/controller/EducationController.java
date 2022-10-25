package uz.geeks.hh_uz.controller;

import org.springframework.web.bind.annotation.*;
import uz.geeks.hh_uz.dto.education.EducationCreateDTO;
import uz.geeks.hh_uz.dto.education.EducationDTO;
import uz.geeks.hh_uz.dto.education.EducationUpdateDTO;
import uz.geeks.hh_uz.service.education.EducationService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/education")
public class EducationController extends ApiController<EducationService>{

    public EducationController(EducationService service) {
        super(service);
    }

    @PostMapping("/createEducation{resumeId}")
    public void editEducationInfo(@PathVariable Long resumeId, @RequestBody @Valid EducationCreateDTO dto){
        service.createEducation(resumeId,dto);
    }


    @PutMapping("/editEducationInfo{resumeId}")
    public void editEducationInfo(@PathVariable Long resumeId, @RequestBody @Valid EducationUpdateDTO dto){
        service.edit(resumeId,dto);
    }

    @GetMapping("/delete/{id}")
    public void deleteEducation(@PathVariable Long id){
        service.delete(id);
    }

    @GetMapping("/getAllEducation")
    public List<EducationDTO> getAllEducation(){
        return service.getAll();
    }






}
