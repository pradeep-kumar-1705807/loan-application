package com.dynamicdudes.customvalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import java.time.LocalDate;
import java.util.Date;

public class FutureDateValidator implements ConstraintValidator<FutureDate, String> {

	@Override
	public boolean isValid(String date, ConstraintValidatorContext arg1) {
		
		LocalDate givenDate ;
		LocalDate currentDate ; 
		

		if (date == null) {
			return false;
		}
		try {
			givenDate = LocalDate.parse(date);
			currentDate = LocalDate.now();
		}
		catch(Exception e)
		{
			return false;
		}
		
		if ( givenDate.isAfter(currentDate) ) 
		{
			
			return false;
		}

		return true;

	}
}