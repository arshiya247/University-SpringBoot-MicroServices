package com.arshiya.DownloadFileApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DownloadFileApplication {

	public static void main(String[] args) {
		SpringApplication.run(DownloadFileApplication.class, args);
	}

}
