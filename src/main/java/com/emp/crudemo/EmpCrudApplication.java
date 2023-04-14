package com.emp.crudemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @ComponentScan(basePackages = {"com.emp.crudemo.controller"})

//@SpringBootApplication(scanBasePackages = {"controller" , "entities", "repository", "services"})
public class EmpCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpCrudApplication.class, args);
	}

}
