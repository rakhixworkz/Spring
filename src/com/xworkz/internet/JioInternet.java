package com.xworkz.internet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JioInternet implements Internet{
	@Autowired

	@Override
	public void connect() {
		System.out.println("Connecting using jio");
		
	}

}
