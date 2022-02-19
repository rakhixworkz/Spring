package com.xworkz.customer;
import org.springframework.stereotype.Component;

@Component
public abstract class HomeAddress extends AbstractAddress implements Address {
	@Override
	public void displayDetails() {
		System.out.println("Home Adddress");
		System.out.println("Street =" +street);
		System.out.println("DoorNo =" +doorNo);
		System.out.println("City =" +city);

	}

}
