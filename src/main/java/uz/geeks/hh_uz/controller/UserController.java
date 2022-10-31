package uz.geeks.hh_uz.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import uz.geeks.hh_uz.dto.user.*;

import uz.geeks.hh_uz.service.user.UserDetailsServiceImpl;

import javax.validation.Valid;


@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@Tag(name="1. User Controller")
public class UserController extends ApiController<UserDetailsServiceImpl> {

    public UserController(UserDetailsServiceImpl service) {
        super(service);
    }


    @PostMapping(value = API + V1 + "/user/signin")
    public ResponseEntity<JwtResponse> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
        return ResponseEntity.ok(service.signIn(loginRequest));
    }

    @PostMapping(value = API + V1 + "/user/refreshtoken")
    public ResponseEntity<TokenRefreshResponse> refreshToken(@Valid @RequestBody TokenRefreshRequest request) {
        return ResponseEntity.ok(service.refreshToken(request));
    }

    @PostMapping(value = API + V1 + "/user/signup")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest) {

        service.create(signUpRequest);

        return ResponseEntity.ok("User registered successfully!");
    }
}
