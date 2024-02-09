package com.sprinBootmavensonarQube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SprinBootMavenSonarQubeApplication {

	@GetMapping("/message")
	public String getMessage () {

		return "Started the spring boot api application integrated with jenkins to the SonarQube.";
	}

	public static void main(String[] args) {
		SpringApplication.run(SprinBootMavenSonarQubeApplication.class, args);
	}

}
