package com.dynamicdudes.customvalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.dynamicdudes.service.LoanApplicantService;
import com.dynamicdudes.service.LoanApplicantServiceImpl;


public class CustomSsnConstraintValidator implements ConstraintValidator<CustomSsn,String> {
	@Autowired
	private LoanApplicantService loanApplicantService;
	

	@Override
	public boolean isValid(String ssn, ConstraintValidatorContext arg1) {
		
		Long ssnNumber = null;
		try {
			
		 ssnNumber = Long.parseLong(ssn);
		 
		
		}
		catch(Exception e)
		{
			
			return false;
		}
		if(loanApplicantService != null)
		{
			
			if( loanApplicantService.isUniqueSSN(ssnNumber) == false)
			{
				
				return false;
			}
		}
		
		
		return true;
	}
	

}
