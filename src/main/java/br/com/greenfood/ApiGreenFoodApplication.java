package br.com.greenfood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiGreenFoodApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGreenFoodApplication.class, args);
	}
}
