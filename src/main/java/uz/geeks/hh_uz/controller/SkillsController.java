package uz.geeks.hh_uz.controller;

import org.springframework.web.bind.annotation.*;
import uz.geeks.hh_uz.dto.skills.SkillCreateDTO;
import uz.geeks.hh_uz.dto.skills.SkillUpdateDTO;
import uz.geeks.hh_uz.service.langAndSkill.SkillService;

import javax.validation.Valid;

@RestController
@RequestMapping("/skills")
public class SkillsController extends ApiController<SkillService> {

    public SkillsController(SkillService service) {
        super(service);
    }

    @PostMapping("/createSkills{resumeId}")
    public void createLanguage(@PathVariable Long resumeId, @RequestBody @Valid SkillCreateDTO dto){
        service.createSkill(resumeId,dto);
    }


    @PutMapping("/editSkillInfo{resumeId}")
    public void editLanguageInfo(@PathVariable Long resumeId, @RequestBody @Valid SkillUpdateDTO dto){
        service.edit(resumeId,dto);
    }

}
