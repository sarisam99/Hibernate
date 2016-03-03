package com.sarisam.hinernate.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {

	@Id
	@GeneratedValue
	private int id;
	private String employeeName;
	private  double salary;
	private Date dob;
	//entity
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String employeeName, double salary, Date dob) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.salary = salary;
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + ", salary=" + salary + ", dob=" + dob + "]";
	}
	
	
}
