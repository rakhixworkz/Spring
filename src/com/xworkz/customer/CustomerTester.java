package com.xworkz.customer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerTester {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("customer.xml");
		container.getBean(HomeAddress.class).displayDetails();

	}

}
