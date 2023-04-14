package com.emp.crudemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.crudemo.entities.Employee;
import com.emp.crudemo.repository.empRepo;

@Service
public class empService {
	
	@Autowired
	private empRepo repository;
	
	public void addEmployees(Employee e) {
		
		repository.save(e);
	}
	
	
	public List<Employee> getAllEmployee(){
		return repository.findAll();
		
	}
	
	public Employee getEmpById(int id) {
		
		Optional<Employee> e = repository.findById(id);
		if(e.isPresent()) {
			return e.get();
		}
		return null;
	}
	
	public void deleteEmp(int id) {
		
		repository.deleteById(id);
	}

}
