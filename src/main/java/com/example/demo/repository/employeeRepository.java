package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.employee;

public interface employeeRepository extends JpaRepository<employee, Long> {

}
