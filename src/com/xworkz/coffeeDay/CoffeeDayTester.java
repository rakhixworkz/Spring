package com.xworkz.coffeeDay;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.coffeeDay.entity.CoffeeDayEntity;
import com.xworkz.coffeeDay.service.CoffeeDayService;

public class CoffeeDayTester {

	public static void main(String[] args) {
		CoffeeDayEntity entity=new CoffeeDayEntity("Bangalore,karnataka","Rakhi kumari",LocalDate.of(2022,10,04), LocalDateTime.now(),LocalDateTime.now());
		ApplicationContext container=new ClassPathXmlApplicationContext("Database.xml");
		CoffeeDayService service=container.getBean(CoffeeDayService.class);
	}

}
