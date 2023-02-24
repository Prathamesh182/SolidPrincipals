package com.aurionpro.test;

import com.aurionpro.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employees = new Employee(101, "Prathamesh", 51000);

		employees.printSalarySlip();
	}

}
