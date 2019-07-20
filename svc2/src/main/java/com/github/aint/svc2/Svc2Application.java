package com.github.aint.svc2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@SpringBootApplication
@RequiredArgsConstructor
public class Svc2Application {

    private final RestTemplate restTemplate;

    @GetMapping
    public String rootApi() {
        log.info("Inside SVC_2");
        return restTemplate.getForObject("http://localhost:8083/", String.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(Svc2Application.class, args);
	}

}
