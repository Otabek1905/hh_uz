package uz.geeks.hh_uz.controller;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import uz.geeks.hh_uz.domains.Experience;
import uz.geeks.hh_uz.dto.experience.ExperienceCreateDTO;
import uz.geeks.hh_uz.dto.experience.ExperienceDTO;
import uz.geeks.hh_uz.dto.experience.ExperienceUpdateDTO;
import uz.geeks.hh_uz.service.experience.ExperienceService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/experience")
public class ExperienceController extends ApiController<ExperienceService>{

    public ExperienceController(ExperienceService service) {
        super(service);
    }

    @PostMapping("/createExperience")
    public Long createExperience(@RequestBody @Valid ExperienceCreateDTO dto){
        return service.create(dto);
    }

    @PutMapping("/updateExperience")
    public void editExperience(@RequestBody @Valid ExperienceUpdateDTO dto){
        service.update(dto);
    }

    @GetMapping("/delete{id}")
    public void deleteExperience(@PathVariable Long id){
         service.delete(id);
    }

    @GetMapping("/getAllExperience")
    public List<ExperienceDTO> getAllExperience(){
        return service.getAll();
    }

    @GetMapping("/getOneExperienceByID{id}")
    public ExperienceDTO getOneExperience(@PathVariable Long id){
        return service.get(id);
    }




}
