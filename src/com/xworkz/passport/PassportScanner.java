package com.xworkz.passport;

import java.time.LocalDateTime;

import com.xworkz.passport.entity.PassportEntity;
import com.xworkz.passport.repository.PassportRepository;
import com.xworkz.passport.repository.PassportRepositoryImpl;
import com.xworkz.passport.service.PassportService;
import com.xworkz.passport.service.PassportServiceImpl;

public class PassportScanner {

	public static void main(String[] args) {
		PassportEntity passportEntity=new PassportEntity("Rakhi Kumari",LocalDateTime.now(),LocalDateTime.now(),'M', "1234e6788bg","Bangalore","Rakhi kumari", false,"R","","A+","yhdvb1234");
		PassportRepository repo=new PassportRepositoryImpl();
		PassportService service=new PassportServiceImpl(repo);
		service.saveAndValidate(passportEntity);

	}

}
