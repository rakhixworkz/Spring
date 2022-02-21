package com.xworkz.internet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ChromeBrowser implements Browser{
	@Value("v21.45")
	private String name;
	@Value("Firefox-browser")
	private String version;
	@Autowired
	@Qualifier("jioInternet")
	Internet internet;
	@Autowired
	@Qualifier("airtelInternet")
	Internet internet1;
	public ChromeBrowser() {
		System.out.println("created chrome implentation");
	}
	public void surf() {

		this.internet.connect();
		this.internet1.connect();

	}
	public void display() {
		System.out.println("name of browser =" +name);
		System.out.println("version of browser="+version);
	}

}
