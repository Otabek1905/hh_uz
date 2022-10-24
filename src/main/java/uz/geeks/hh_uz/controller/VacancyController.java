package uz.geeks.hh_uz.controller;

import org.springframework.web.bind.annotation.RestController;
import uz.geeks.hh_uz.service.vacancy.VacancyService;

@RestController
public class VacancyController extends ApiController<VacancyService> {

    public VacancyController(VacancyService service) {
        super(service);
    }











}
