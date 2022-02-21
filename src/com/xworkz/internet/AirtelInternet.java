package com.xworkz.internet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AirtelInternet implements Internet{

	private String vendor;
	private int costPerMonth;

	@Override
	public void connect() {
		System.out.println("connecting using airtel");
		
	}
	public void display() {
		System.out.println("vendor="+vendor);
		System.out.println("cost per month="+costPerMonth);
	}

}
