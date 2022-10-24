package uz.geeks.hh_uz.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import uz.geeks.hh_uz.service.vacancy.VacancyService;

import javax.validation.Valid;
import java.net.URI;

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


}
