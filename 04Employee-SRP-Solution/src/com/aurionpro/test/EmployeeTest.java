package com.aurionpro.test;

import com.aurionpro.model.Employee;
import com.aurionpro.model.SalarySlipPrinter;
import com.aurionpro.model.Tax;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employees = new Employee(101, "Prathamesh", 51000);

		
		new SalarySlipPrinter().printSalarySlip(employees);
		//System.out.println(new Tax().CalculateTax(employees));
		
	}

}
