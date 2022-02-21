package com.xworkz.internet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("internet.xml");
		container.getBean(Browser.class).surf();

	}

}
