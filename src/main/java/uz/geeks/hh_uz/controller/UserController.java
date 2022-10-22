package uz.geeks.hh_uz.controller;

import org.springframework.web.bind.annotation.RestController;
import uz.geeks.hh_uz.service.user.AuthUserService;

@RestController
public class UserController extends ApiController<AuthUserService> {
    public UserController(AuthUserService service) {
        super(service);
    }
}
