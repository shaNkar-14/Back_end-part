package net.javaguides.springboot.model;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "Name")
	private String name;

	@Column(name = "Gender")
	private String Gender;
	
	@Column(name = "Dob")
	private String Dob;
	
	@Column(name = "salary")
	private String Salary;
	
	public Employee(String salary) {
		super();
		Salary = salary;
	}

	public String getSalary() {
		return Salary;
	}

	public void setSalary(String salary) {
		Salary = salary;
	}

	@Column(name= "Department")
	private String Department;
	
	public Employee() {
		
	}
	
	public Employee(long id, String name, String gender, String dob, String department) {
		super();
		this.id = id;
		this.name = name;
		Gender = gender;
		Dob = dob;
		Department = department;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getDob() {
		return Dob;
	}

	public void setDob(String dob) {
		Dob = dob;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

}
