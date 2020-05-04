package com.Arshiya.Quinoca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration

@ComponentScan
public class QuinocaApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuinocaApplication.class, args);
		System.out.println("Arshiya");
	}

}
