package com.arshiya.InsertionDatabaseApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class InsertionDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsertionDatabaseApplication.class, args);
	}

}
