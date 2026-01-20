package com.saikumar.employeemanagement.model;

public class ContractEmployee extends Employee{
	
	protected double hourlyRate;
	protected int hoursWorked;
	
	public ContractEmployee(int id, String name, double hourlyRate,int hoursWorked) {
		super(id, name, 0);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
		
	}
	
	@Override 
	public double calculateSalary() {
		return hourlyRate * hoursWorked;	
	}
	
	

}
