package com.emp.crudemo.controller;

import java.util.List;

import com.emp.crudemo.entities.Employee;
import com.emp.crudemo.services.empService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



//import jakarta.servlet.http.HttpSession;

@Controller
public class EmpController {
	
	@Autowired
	private empService service;
	
//	For main page indexing using the GetMapping protocol
	@GetMapping("/")
	public String home(Model m) {
		
		List<Employee> emp = service.getAllEmployee();
		m.addAttribute("emp", emp);
		return "index";
	}
	
	@GetMapping("/addemp")
	public String addEmpForm() {
		return "addemp";
	}
	
	@PostMapping("/register")
	public String empRegister(@ModelAttribute Employee e) {
		
//		System.out.println(e);
		service.addEmployees(e);
		
//		for displaying the alert status for emp added
//		session.setAttribute("msg", "Employee Added Successfully");
		return "redirect:/";
	
	}
	
	@GetMapping("/edit/{id}")
	public String editEmp(@PathVariable int id, Model m) {
		
		Employee e= service.getEmpById(id);
		
		m.addAttribute("emp", e);
		
		return "edit";
		
	}
	
	@PostMapping("/updateemp")
	public String updateEmp(@ModelAttribute Employee e) {
		
		service.addEmployees(e);
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteEmp(@PathVariable int id) {
		
		service.deleteEmp(id);
		return "redirect:/";
	}
	
	
}
