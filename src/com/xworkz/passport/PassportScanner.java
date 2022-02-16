package com.xworkz.passport;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import com.xworkz.passport.constants.BloodGroup;
import com.xworkz.passport.constants.Gender;
import com.xworkz.passport.constants.PassportPersonnelType;
import com.xworkz.passport.constants.VerifiedDocument;
import com.xworkz.passport.entity.PassportEntity;
import com.xworkz.passport.repository.PassportRepository;
import com.xworkz.passport.repository.PassportRepositoryImpl;
import com.xworkz.passport.service.PassportService;
import com.xworkz.passport.service.PassportServiceImpl;

public class PassportScanner {

	public static void main(String[] args) {
		PassportEntity entity = new PassportEntity
				( "Passport authority of india", LocalDateTime.of(2022,4,5,13,43,37), LocalDateTime.of(2035,5,6,12,12), Gender.Male,
				"A3119585", "Bangalore,karnataka", "Rakhi kumari", false, PassportPersonnelType.Diplomatic, LocalDateTime.now(),
				BloodGroup.B_Positive, VerifiedDocument.DRIVING_LICENCE);
		PassportRepository repo=new PassportRepositoryImpl();
		PassportService service=new PassportServiceImpl(repo);
		service.saveAndValidate(entity);

	}

}
