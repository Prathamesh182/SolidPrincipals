package com.aurionpro.test;

import com.aurionpro.model.Advertisement;
import com.aurionpro.model.BillBoard;
import com.aurionpro.model.Projector;
import com.aurionpro.model.Television;

public class AdvertisementTest {

	public static void main(String[] args) {
		Advertisement add1 = new Advertisement( new BillBoard(),"hello guys");	
		add1.showAdvertisement();
		
		
		Advertisement add2 = new Advertisement(new Projector(),"hello bro");
		add2.showAdvertisement();	
		
		
		Advertisement add3 = new Advertisement(new Television(),"hello everyone");
		add3.showAdvertisement();
		add3.setDisplay(new Television());
		add3.showAdvertisement();
	}

}
