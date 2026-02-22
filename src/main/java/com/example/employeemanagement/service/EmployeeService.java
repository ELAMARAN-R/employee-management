package com.example.employeemanagement.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.employeemanagement.entity.Employee;

public interface EmployeeService {
	Employee createEmployee(Employee employee);
	Page<Employee> getAllEmployees(Pageable pageable);
	Employee getEmployeeById(Long id);
	Employee updateEmployee(Long id,Employee employee);
	void deleteEmployee(Long id);
}
