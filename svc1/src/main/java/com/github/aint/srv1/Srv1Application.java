package com.github.aint.srv1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Srv1Application {

    @GetMapping
    public String api() {
        return "value";
    }

	public static void main(String[] args) {
		SpringApplication.run(Srv1Application.class, args);
	}

}
