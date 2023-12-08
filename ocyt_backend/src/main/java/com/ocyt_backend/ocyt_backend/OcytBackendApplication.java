package com.ocyt_backend.ocyt_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.ocyt_backend.ocyt_backend.models")
public class OcytBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(OcytBackendApplication.class, args);
	}

}
