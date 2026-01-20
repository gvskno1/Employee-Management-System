package com.saikumar.employeemanagement.service;

import java.util.ArrayList;
import java.util.List;

import com.saikumar.employeemanagement.model.Employee;

public class EmployeeService {
	
	private List<Employee> employees = new ArrayList<>();
	
	public void addEmployee( Employee e) {
		employees.add(e);
		
	}
	
	public void showAllEmployees() {
		if (employees.isEmpty()) {
			System.out.println("No employees available");
			return;
			
		}
		for (Employee e :employees) {
			System.out.println(e);
		}
	}
	
	public void showSalaryDetails( ) {
		if (employees.isEmpty()) {
			System.out.println("No employees available");
			return;
			
		}
		for(Employee e: employees) {
			System.out.println("Employee ID: " + e.getId() +
		            ", Name: " + e.getName() +
		            ", Salary: " + e.calculateSalary());
		}
	}
	
	
	

}
