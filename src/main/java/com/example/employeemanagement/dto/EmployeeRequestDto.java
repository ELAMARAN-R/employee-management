package com.example.employeemanagement.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class EmployeeRequestDto {
	@NotBlank(message = "First name is Required")
	private String firstName;
	@NotBlank(message = "Last name is Required")
	private String lastName;
	@Email(message = "Invalid Email Format")
	@NotBlank(message = "Email is Required")
	private String email;
	@NotNull(message = "Salary is Required")
	@Positive(message = "Salary must be Positive")
	private Double salary;
	@NotNull(message = "Department is Required")
	private String department;
	@NotNull(message = "Date of Joining is Required")
	private LocalDate dateOfJoining;
	@NotNull(message = "Status is Required")
	private String status;
	public EmployeeRequestDto() {
		
	}
	public EmployeeRequestDto(String firstName,String lastName,String email,
			Double salary,String department,LocalDate dateOfJoining,String status) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.salary = salary;
		this.department = department;
		this.dateOfJoining = dateOfJoining;
		this.status = status;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public Double getSalary() {
		return salary;
	}
	public String getDepartment() {
		return department;
	}
	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}
	public String getStatus() {
		return status;
	}
}
