package uz.geeks.hh_uz.controller;

import org.jboss.jandex.VoidType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import uz.geeks.hh_uz.dto.vacancy.VacancyCreateDto;
import uz.geeks.hh_uz.dto.vacancy.VacancyDto;
import uz.geeks.hh_uz.dto.vacancy.VacancyUpdateDto;
import uz.geeks.hh_uz.service.vacancy.VacancyService;

import javax.sound.midi.VoiceStatus;
import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class VacancyController extends ApiController<VacancyService> {

    public VacancyController(VacancyService service) {
        super(service);
    }

    @PostMapping(value = API + V1 + "/vacancy/create")
    public ResponseEntity<Long> create(@Valid @RequestBody VacancyCreateDto dto) {
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri();
        return ResponseEntity.created(uri).body(service.create(dto));
    }

    @PostMapping(value = API + V1 + "/vacancy/update")
    public ResponseEntity<Void> updateVacancy(@Valid @RequestBody VacancyUpdateDto updateDto) {
        service.update(updateDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(value = API + V1 + "/vacancy/delete/{id}")
    public ResponseEntity<Long> deleteVacancy(@Valid @PathVariable(name = "id") Long vacancyId) {
        service.delete(vacancyId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(value = API + V1 + "/vacancy/get/{id}")
    public ResponseEntity<VacancyDto> getVacancy(@Valid @PathVariable(name = "id", required = true) Long vacancyId) {
        return ResponseEntity.ok(service.get(vacancyId));
    }

    @GetMapping(value = API + V1 + "/vacancy/getAll")
    public ResponseEntity<List<VacancyDto>> getAllVacancy() {
        return ResponseEntity.ok(service.getAll());
    }

}
