package com.aurionpro.test;

import com.aurionpro.model.FixedDeposit;
import com.aurionpro.model.HoliInterest;

public class FDTest {

	public static void main(String[] args) {
		FixedDeposit fd1 = new FixedDeposit(101,"Prathamesh",1000,1,new HoliInterest());
		System.out.println(fd1);
		
	}

}
