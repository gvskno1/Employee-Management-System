package com.saikumar.employeemanagement.model;

public class FullTimeEmployee extends Employee{
	
	protected double bonus;
	

	public FullTimeEmployee(int id, String name, double baseSalary, double bonus) {
		super(id, name, baseSalary);
		this.bonus = bonus;
	}
	
	@Override 
	public double calculateSalary() {
		double totalSalary = baseSalary + bonus;
		
		return totalSalary;
		
}
}