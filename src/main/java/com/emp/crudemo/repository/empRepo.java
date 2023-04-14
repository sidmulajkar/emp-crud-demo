package com.emp.crudemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emp.crudemo.entities.Employee;

@Repository
public interface empRepo extends JpaRepository<Employee, Integer> {
	
}
