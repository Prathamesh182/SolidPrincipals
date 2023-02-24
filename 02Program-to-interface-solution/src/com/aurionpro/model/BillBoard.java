package com.aurionpro.model;

public class BillBoard implements Idisplayable {

	@Override
	public void display(String message) {
		System.out.println("On BillBoard : "+message);
	}
	

}
