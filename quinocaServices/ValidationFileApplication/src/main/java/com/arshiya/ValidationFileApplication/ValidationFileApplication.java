package com.arshiya.ValidationFileApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ValidationFileApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValidationFileApplication.class, args);
	}

}
