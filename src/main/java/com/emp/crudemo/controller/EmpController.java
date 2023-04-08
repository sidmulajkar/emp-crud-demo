package com.emp.crudemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.emp.crudemo.entities.Employee;

@Controller
public class EmpController {
	
//	For main page indexing using the GetMapping protocol
	@GetMapping("/")
	public String home() {
		
		
		return "index";
	}
	
	@GetMapping("/addemp")
	public String addEmpForm() {
		return "addemp";
	}
	
	@PostMapping("/registeremp")
	public String empRegister(@ModelAttribute Employee e) {
		
		System.out.println(e);
		
		return "addemp";
	
	}
}
