package com.xworkz.ipl.service;

import com.xworkz.ipl.entity.IplEntity;
import com.xworkz.ipl.repository.IplRepository;

public class IplServiceImpl implements IplService{
	private IplRepository repo;
	public IplServiceImpl(IplRepository repo) {
		System.out.println("Inside IPL service implementation");
		this.repo=repo;
	}

	@Override
	public boolean saveAndValidate(IplEntity entity) {
		boolean valid=true;
		if (entity.getTeamName()!=null && entity.getTeamName().length()>5 && entity.getTeamName().length()<25) {
			valid=true;
			
		} else {
			System.out.println("Invalid TeamName");
			valid=false;
			return valid;

		}
		if (entity.getSponsor()!=null) {
			valid=true;
			
		} else {
			System.out.println("Invalid");
			valid=false;
			return valid;

		}
		if (entity.getCaptain()!=null) {
			valid=true;
			
		} else {
			System.out.println("Invalid captain name");
			valid=false;
			return valid;
		}
		if (entity.getBudget()!=0 ) {
			valid=false;
			
		} else {
			System.out.println("Invalid Budget");
			valid=false;
			return valid;
		}
		return false;
	}




}
