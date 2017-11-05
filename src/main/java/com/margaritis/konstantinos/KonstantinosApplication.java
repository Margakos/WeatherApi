package com.margaritis.konstantinos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KonstantinosApplication {

	public static void main(String[] args) {

		SpringApplication.run(KonstantinosApplication.class, args);
		Jackson jackson = new Jackson();
		jackson.run();

	}
}
