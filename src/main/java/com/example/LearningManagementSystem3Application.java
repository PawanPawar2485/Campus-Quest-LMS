package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication(scanBasePackages = "com.example.lms")
@EntityScan(basePackages = "com.example.lms.entity")
@EnableJpaRepositories(basePackages = "com.example.lms.repository")
public class LearningManagementSystem3Application {

	public static void main(String[] args) {
		SpringApplication.run(LearningManagementSystem3Application.class, args);
	}

}
