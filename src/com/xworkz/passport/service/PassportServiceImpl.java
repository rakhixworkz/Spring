package com.xworkz.passport.service;

import com.xworkz.passport.entity.PassportEntity;
import com.xworkz.passport.repository.PassportRepository;

public class PassportServiceImpl implements PassportService{
	private PassportRepository repo;
	public PassportServiceImpl(PassportRepository repo) {
		this.repo=repo;
	}
@Override
public boolean saveAndValidate(PassportEntity entity) {
	boolean valid = true;
	if ((entity.getFName() != null && 
		!(entity.getFName().isEmpty()) && 
		entity.getFName().length() > 3&& 
		entity.getFName().length() < 200)) {
		valid = true;

	} else {
		System.out.println("Invalid Name");
		valid = false;
		return valid;
	}if (entity.getGender() != null) {
				valid = true;
	} else {
		System.out.println("Invalid Gender");
		valid = false;
		return valid;
	}if (entity.getIssuedBy() != null && 
		entity.getIssuedBy().length() > 3 && 
		entity.getIssuedBy().length() < 135) {
		valid = true;

	} else {
		System.out.println("Invalid IssuedBy Authority");
		valid = false;
		return valid;
	}if (entity.getPassportNo() != null && 
		entity.getPassportNo().length() == 9 && entity.getPassportNo().toUpperCase().startsWith("A")) {
		valid = true;

	} else {
		System.out.println("Invalid passport number ");
		valid = false;
		return valid;
	}if (entity.getPassportpersonneltype() != null) {
				valid = true;

	} else {
		System.out.println("Invalid Passport type");
		valid = false;
		return valid;
	}if (entity.getBloodgrop()!=null) {
				valid = true;
				
	} else {
		System.out.println("Invalid Blood Group type ");
		valid = false;
		return valid;
	}if (entity.getAddress()!=null &&
		entity.getAddress().length()>10 && 
		entity.getAddress().length()<200) {
		valid = true;	
	} else {
		System.out.println("Invalid Address ");
		valid = false;
		return valid;
	}if (entity.getIssuedAt()!=null) {
			valid = true;
			
	} else {
		System.out.println("Invalid issued date ");
		valid = false;
		return valid;
	}if (entity.getExpiresAt()!=null && 
		entity.getExpiresAt().isAfter(entity.getIssuedAt().plusYears(10))) {
		valid=true;
				
	} else {
		System.out.println("passport expired");
		valid = false;
		return valid;
	}if(valid)repo.save(entity);
	return false;
	}
}



