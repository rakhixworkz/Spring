package com.xworkz.ipl;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.xworkz.ipl.entity.IplEntity;
import com.xworkz.ipl.service.IplService;

public class IplTester {

	public static void main(String[] args) {
		IplEntity entity=new IplEntity("Kolkata night riders","shreyas lyer","mpl",LocalDate.of(2002,03,06),12000000l);
		ApplicationContext container=new ClassPathXmlApplicationContext("database.xml");
		IplService service=container.getBean(IplService.class);
		service.saveAndValidate(entity);


	}

}
