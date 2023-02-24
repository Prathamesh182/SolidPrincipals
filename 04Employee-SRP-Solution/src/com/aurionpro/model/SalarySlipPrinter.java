package com.aurionpro.model;

public class SalarySlipPrinter {
	public void printSalarySlip(Employee employees) {
	System.out.println("Employee Id: "+employees.getId());
	System.out.println("Employee name: "+employees.getName());
	System.out.println("Employee salary: "+employees.getSalary());
	System.out.println("Tax : "+new Tax().CalculateTax(employees));
	
}


}
