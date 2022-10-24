package uz.geeks.hh_uz.controller;

import org.springframework.web.bind.annotation.*;
import uz.geeks.hh_uz.dto.education.EducationCreateDTO;
import uz.geeks.hh_uz.dto.education.EducationUpdateDTO;
import uz.geeks.hh_uz.dto.language.LanguageCreateDTO;
import uz.geeks.hh_uz.dto.language.LanguageUpdateDTO;
import uz.geeks.hh_uz.service.langAndSkill.LanguageService;

import javax.validation.Valid;

@RestController
@RequestMapping("/language")
public class LanguageController extends ApiController<LanguageService> {


    public LanguageController(LanguageService service) {
        super(service);
    }


    @PostMapping("/createLanguage{resumeId}")
    public void createLanguage(@PathVariable Long resumeId, @RequestBody @Valid LanguageCreateDTO dto){
        service.createLanguage(resumeId,dto);
    }


    @PutMapping("/editLanguageInfo{resumeId}")
    public void editLanguageInfo(@PathVariable Long resumeId, @RequestBody @Valid LanguageUpdateDTO dto){
        service.edit(resumeId,dto);
    }



}
