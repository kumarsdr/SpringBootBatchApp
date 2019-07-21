package com.app;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class SpringBootBatchAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBatchAppApplication.class, args);
		System.out.println("MAIN EXECUTION");
	}

}
