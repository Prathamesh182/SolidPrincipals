package com.aurionpro.model;

public class Tax  {
	public double CalculateTax(Employee employees) {
		if(employees.getSalary()*12<500000) {
			return 0.0;
			
		}
		return employees.getSalary()*0.2;
	}

}
