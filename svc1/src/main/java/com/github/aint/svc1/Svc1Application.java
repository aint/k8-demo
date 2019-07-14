package com.github.aint.svc1;

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
public class Svc1Application {

    private final RestTemplate restTemplate;

    @GetMapping
    public String rootApi() {
        log.info("Inside SVC_1");
        return restTemplate.getForObject("http://localhost:8082/", String.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(Svc1Application.class, args);
	}

}
