package com.xworkz.internet;

public class AirtelInternet implements Internet{
	private String vendor;
	private int costPerMonth;

	@Override
	public void connect() {
		System.out.println("connecting using airtel");
		
	}

}
