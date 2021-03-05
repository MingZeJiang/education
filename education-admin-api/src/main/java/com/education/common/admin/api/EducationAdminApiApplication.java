package com.education.common.admin.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EducationAdminApiApplication {
	@GetMapping
	public String test(){
		return "suceess";
	}

	public static void main(String[] args) {
		SpringApplication.run(EducationAdminApiApplication.class, args);
	}

}
