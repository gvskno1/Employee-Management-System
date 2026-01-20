package com.saikumar.employeemanagement.model;

public class Employee {
	
	protected int id;
	protected String name;
	protected double baseSalary;
	
	
	public Employee(int id, String name, double baseSalary) {
		this.id = id;
		this.name = name;
		this.baseSalary = baseSalary;
	}
	
	
	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public double getBaseSalary() {
		return baseSalary;
	}



	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}



	public double calculateSalary() {
		return baseSalary;
	}
	
	@Override
	public String toString() {
	    return "Employee [id=" + id +
	           ", name=" + name +
	           ", baseSalary=" + baseSalary + "]";
	}
	
	

}
