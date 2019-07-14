package com.github.aint.svc1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
@SpringBootApplication
public class Svc1Application {

    @GetMapping
    public String rootApi() {
        log.info("Inside SVC_1");
        return new RestTemplate().getForObject("http://localhost:8082/", String.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(Svc1Application.class, args);
	}

}
