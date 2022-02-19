package com.xworkz.coffeeDay.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import com.xworkz.coffeeDay.entity.CoffeeDayEntity;
import com.xworkz.coffeeDay.repository.CoffeeDayRepository;

@Component
public class CoffeeDayServiceImpl implements CoffeeDayService{
	@Autowired
	private CoffeeDayRepository coffeeDayRepository;
	
	public CoffeeDayServiceImpl(CoffeeDayRepository coffeeDayRepository) {
		System.out.println("created service implementation");
		this.coffeeDayRepository=coffeeDayRepository;
	}
	@Override
	public boolean saveAndValidate(CoffeeDayEntity entity) {
		boolean valid=true;
		if (entity.getCId()!=0) {
			System.out.println(entity.getCId());
			valid=true;
			
		} else {
			System.out.println("Invalid Id");
			valid=false;
			return valid;

		}
		if (entity.getLocation()!=null && entity.getLocation().length()>5 && entity.getLocation().length()<25) {
			valid=true;
			
		} else {
			System.out.println("location not found");
			valid=false;
			return valid;
		}
		if (entity.getFrenchiseOwner()!=null && entity.getFrenchiseOwner().length()>5 && entity.getFrenchiseOwner().length()<35) {
			valid=true;
		} else {
			System.out.println("Invalid Owner Name");
			valid=false;
			return valid;

		}
		if(valid) {
			this.coffeeDayRepository.save(entity);
		} 
	
		return false;
		
	}
		

}
