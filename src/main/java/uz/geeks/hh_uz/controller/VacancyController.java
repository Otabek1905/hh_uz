package uz.geeks.hh_uz.controller;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import uz.geeks.hh_uz.dto.vacancy.VacancyCreateDto;
import uz.geeks.hh_uz.dto.vacancy.VacancyDto;
import uz.geeks.hh_uz.dto.vacancy.VacancyUpdateDto;
import uz.geeks.hh_uz.service.vacancy.VacancyService;


import javax.validation.Valid;
import java.util.List;

@RestController
public class VacancyController extends ApiController<VacancyService> {

    public VacancyController(VacancyService service) {
        super(service);
    }

    @PostMapping(value = API + V1 + "/vacancy/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Long create(@Valid @RequestBody VacancyCreateDto dto) {
        return service.create(dto);
    }

    @PostMapping(value = API + V1 + "/vacancy/update")
    @ResponseStatus(HttpStatus.OK)
    public void updateVacancy(@Valid @RequestBody VacancyUpdateDto updateDto) {
        service.update(updateDto);
    }

    @DeleteMapping(value = API + V1 + "/vacancy/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteVacancy(@Valid @PathVariable(name = "id") Long vacancyId) {
        service.delete(vacancyId);
    }

    @GetMapping(value = API + V1 + "/vacancy/get/{id}")
    @ResponseStatus(HttpStatus.OK)
    public VacancyDto getVacancy(@Valid @PathVariable(name = "id", required = true) Long vacancyId) {
        return service.get(vacancyId);
    }

    @GetMapping(value = API + V1 + "/vacancy/getAll")
    @ResponseStatus(HttpStatus.OK)
    public List<VacancyDto> getAllVacancy() {
        return service.getAll();
    }

}
