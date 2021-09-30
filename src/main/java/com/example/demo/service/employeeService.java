package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.employee;
import com.example.demo.repository.employeeRepository;

@Service
public class employeeService {
	
	@Autowired
	private employeeRepository employeerepository;
	
	public List<employee> getAllEmployees() {
		return employeerepository.findAll();
	}
	
	public void putEmployee(employee emp) {
		employeerepository.save(emp);
	}
	
	public Optional<employee> getOneEmployee(Long id) {
		return employeerepository.findById(id);
	}

	public void deleteEmployee(Long id) {
		this.employeerepository.deleteById(id);
	}
	
	public void deleteAll() {
		this.employeerepository.deleteAll();
	}

}
