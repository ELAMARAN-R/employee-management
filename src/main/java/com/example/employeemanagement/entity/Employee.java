package com.example.employeemanagement.entity;
import jakarta.persistence.*;
import java.time.*;
@Entity
@Table(name = "employees_data")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String firstName;
	@Column(nullable = false)
	private String lastName;
	@Column(unique = true, nullable = false)
	private String email;
	@Column(nullable = false)
	private Double salary;
	@Column(nullable = false)
	private String department;
	@Column(nullable = false)
	private LocalDate dateOfJoining;
	@Column(nullable = false)
	private String status;
	public Employee(){
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Employee(long id, String firstName, String lastName, String email, Double salary, String department,
			LocalDate dateOfJoining, String status) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.salary = salary;
		this.department = department;
		this.dateOfJoining = dateOfJoining;
		this.status = status;
	}
	
}
	