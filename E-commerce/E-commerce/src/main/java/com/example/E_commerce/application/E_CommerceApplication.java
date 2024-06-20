package com.example.E_commerce.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = {"com.example"})
@EnableMongoRepositories(basePackages = "com.example.E_commerce.repository")
public class E_CommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(E_CommerceApplication.class, args);
	}
}