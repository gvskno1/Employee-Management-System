package com.saikumar.employeemanagement.app;

import com.saikumar.employeemanagement.model.ContractEmployee;
import com.saikumar.employeemanagement.model.FullTimeEmployee;
import com.saikumar.employeemanagement.service.EmployeeService;

public class EmployeeApp {

	public static void main(String[] args) {
		
		EmployeeService service = new EmployeeService();

        // Create employees
        FullTimeEmployee emp1 =
                new FullTimeEmployee(1, "Sai", 50000, 10000);

        ContractEmployee emp2 =
                new ContractEmployee(2, "Raj", 1200, 40);

        // Add employees
        service.addEmployee(emp1);
        service.addEmployee(emp2);

        // Show all employees
        System.out.println("=== All Employees ===");
        service.showAllEmployees();

        // Show salary details
        System.out.println("\n=== Salary Details ===");
        service.showSalaryDetails();
	}

}
