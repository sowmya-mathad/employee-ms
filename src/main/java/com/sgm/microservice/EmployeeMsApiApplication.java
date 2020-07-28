package com.sgm.microservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeMsApiApplication {

    private static final Logger LOGGER=LoggerFactory.getLogger(EmployeeMsApiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(EmployeeMsApiApplication.class, args);
	}

}
