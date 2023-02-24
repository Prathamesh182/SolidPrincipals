package com.aurionpro.test;

import com.aurionpro.model.FestivalType;
import com.aurionpro.model.FixedDeposit;

public class FDTest {

	public static void main(String[] args) {
		FixedDeposit fd = new FixedDeposit(101,"Prathamesh",1000,1,FestivalType.OTHERS);
		System.out.println(fd);
		System.out.println("The Interest for Diwali is:"+fd.CalculateSimpleInterest());
	}

}
