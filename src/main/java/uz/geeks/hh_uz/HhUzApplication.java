package uz.geeks.hh_uz;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class HhUzApplication {

    public static void main(String[] args) {
        SpringApplication.run(HhUzApplication.class, args);

    }

}
