package com.xworkz.internet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JioInternet implements Internet{
	private String vendor;
	private int cost;

	@Override
	public void connect() {
		System.out.println("Connecting using jio");
		
	}

}
