package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.employee;
import com.example.demo.service.employeeService;

@RestController
public class employeeController {
	
	@Autowired
	private employeeService employeeservice;
	
	@GetMapping("/getAll")
	public List<employee> getAllEmployee() {
		return this.employeeservice.getAllEmployees();
	}
	
	@GetMapping("getOne/{id}")
	public Optional<employee> getOneEmployee(@PathVariable Long id) {
		return this.employeeservice.getOneEmployee(id);
	}
	
	@PostMapping("/putOne")
	public void putEmployee(@RequestBody employee emp) {
		this.employeeservice.putEmployee(emp);
	}

}
