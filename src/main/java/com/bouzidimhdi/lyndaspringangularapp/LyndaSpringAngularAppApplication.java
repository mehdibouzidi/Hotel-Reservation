package com.bouzidimhdi.lyndaspringangularapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class LyndaSpringAngularAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(LyndaSpringAngularAppApplication.class, args);
	}
}
