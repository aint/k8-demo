package com.github.aint.svc3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@SpringBootApplication
public class Svc3Application {

    @GetMapping
    public String rootApi() {
        log.info("Inside SRV_3");
        return "svc3_value";
    }

	public static void main(String[] args) {
		SpringApplication.run(Svc3Application.class, args);
	}

}
