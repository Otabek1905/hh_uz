package uz.geeks.hh_uz.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import uz.geeks.hh_uz.dto.skills.SkillCreateDTO;
import uz.geeks.hh_uz.dto.skills.SkillUpdateDTO;
import uz.geeks.hh_uz.service.langAndSkill.SkillService;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/skills")
public class SkillsController extends ApiController<SkillService> {

    public SkillsController(SkillService service) {
        super(service);
    }

    @PostMapping("/createSkills{resumeId}")
    public ResponseEntity<Long> createLanguage(@PathVariable Long resumeId, @RequestBody @Valid SkillCreateDTO dto){
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri();
        return ResponseEntity.created(uri).body( service.createSkill(resumeId,dto));
    }


    @PutMapping("/editSkillInfo{resumeId}")
    public ResponseEntity<String> editLanguageInfo(@PathVariable Long resumeId, @RequestBody @Valid SkillUpdateDTO dto){
        service.edit(resumeId,dto);
        return ResponseEntity.ok("Language info edited");
    }

}
