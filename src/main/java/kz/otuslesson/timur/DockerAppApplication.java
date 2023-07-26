package kz.otuslesson.timur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/health")
public class DockerAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(DockerAppApplication.class, args);
    }

    @GetMapping("")
    public StatusDto getHealth() {
        return new StatusDto("OK");
    }
}
