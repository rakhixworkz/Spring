package com.xworkz.internet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ChromeBrowser implements Browser{
	@Autowired
	private String name;
	private String version;
	Internet internet;

	public ChromeBrowser() {
		System.out.println("created chrome implentation");
	}
	public void surf() {

		this.internet.connect();
	}

}
