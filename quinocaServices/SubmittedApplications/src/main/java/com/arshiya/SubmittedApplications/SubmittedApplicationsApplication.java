package com.arshiya.SubmittedApplications;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SubmittedApplicationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SubmittedApplicationsApplication.class, args);
	}

}
