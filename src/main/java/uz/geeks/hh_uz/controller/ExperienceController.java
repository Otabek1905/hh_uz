package uz.geeks.hh_uz.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import uz.geeks.hh_uz.domains.Experience;
import uz.geeks.hh_uz.dto.experience.ExperienceCreateDTO;
import uz.geeks.hh_uz.dto.experience.ExperienceDTO;
import uz.geeks.hh_uz.dto.experience.ExperienceUpdateDTO;
import uz.geeks.hh_uz.service.experience.ExperienceService;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/experience")
public class ExperienceController extends ApiController<ExperienceService>{

    public ExperienceController(ExperienceService service) {
        super(service);
    }

    @PostMapping("/createExperience")
    public ResponseEntity<Long> createExperience(@RequestBody @Valid ExperienceCreateDTO dto){
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri();
        return ResponseEntity.created(uri).body(service.create(dto));
    }

    @PutMapping("/updateExperience")
    public ResponseEntity<String> editExperience(@RequestBody @Valid ExperienceUpdateDTO dto){
        service.update(dto);
        return ResponseEntity.ok("Experience updated");
    }

    @DeleteMapping("/delete{id}")
    public ResponseEntity<String> deleteExperience(@PathVariable Long id){
         service.delete(id);
        return ResponseEntity.ok("Experience deleted");
    }

    @GetMapping("/getAllExperience")
    public ResponseEntity<List<ExperienceDTO>> getAllExperience(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/getOneExperienceByID{id}")
    public ResponseEntity<ExperienceDTO> getOneExperience(@PathVariable Long id){
        return new ResponseEntity<>(service.get(id),HttpStatus.OK);
    }




}
