package com.aurionpro.model;

public class Employee {
	private int id;
	private String name;
	private double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double CalculateTax() {
		if(salary*12<500000) {
			return 0.0;
			
		}
		return salary*0.2;
	}
	public void printSalarySlip() {
		System.out.println("Employee Id: "+id);
		System.out.println("Employee name: "+name);
		System.out.println("Employee salary: "+salary);
		System.out.println("Tax: "+CalculateTax());
	}

}
