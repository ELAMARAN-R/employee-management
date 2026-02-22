package com.example.employeemanagement.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.employeemanagement.entity.Employee;
import com.example.employeemanagement.exception.ResourceNotFoundException;
import com.example.employeemanagement.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	private final EmployeeRepository employeeRepository;
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	@Override
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	@Override
	public Page<Employee> getAllEmployees(Pageable pageable){
		return employeeRepository.findAll(pageable);
	}
	@Override
	public Employee getEmployeeById(Long id) {
		return employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee Not found with this ID " +id));
	}
	@Override 
	public Employee updateEmployee(Long id,Employee employee) {
		Employee existingEmployee = getEmployeeById(id);
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setEmail(employee.getEmail());
		existingEmployee.setSalary(employee.getSalary());
		existingEmployee.setDepartment(employee.getDepartment());
		existingEmployee.setDateOfJoining(employee.getDateOfJoining());
		existingEmployee.setStatus(employee.getStatus());
		return employeeRepository.save(existingEmployee);
	}
	@Override
	public void deleteEmployee(Long id) {
		Employee employee = getEmployeeById(id);
		employeeRepository.delete(employee);
	}
}
