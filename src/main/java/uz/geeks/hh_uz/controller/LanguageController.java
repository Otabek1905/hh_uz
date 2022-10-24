package uz.geeks.hh_uz.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import uz.geeks.hh_uz.dto.education.EducationCreateDTO;
import uz.geeks.hh_uz.dto.education.EducationUpdateDTO;
import uz.geeks.hh_uz.dto.language.LanguageCreateDTO;
import uz.geeks.hh_uz.dto.language.LanguageUpdateDTO;
import uz.geeks.hh_uz.service.langAndSkill.LanguageService;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/language")
public class LanguageController extends ApiController<LanguageService> {


    public LanguageController(LanguageService service) {
        super(service);
    }


    @PostMapping("/createLanguage{resumeId}")
    public ResponseEntity<Long> createLanguage(@PathVariable Long resumeId, @RequestBody @Valid LanguageCreateDTO dto){
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri();
        return ResponseEntity.created(uri).body(service.createLanguage(resumeId,dto));
    }


    @PutMapping("/editLanguageInfo{resumeId}")
    public ResponseEntity<String> editLanguageInfo(@PathVariable Long resumeId, @RequestBody @Valid LanguageUpdateDTO dto){
        service.edit(resumeId,dto);
        return ResponseEntity.ok("Language edited");
    }



}
