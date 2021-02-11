package com.dynamicdudes.customvalidation;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CustomDOBValidator implements ConstraintValidator<CustomDOB,String>
{
	private String dob;
	
	public void initilize(CustomDOB customDOB)
	{
		dob =  customDOB.value();
	}
	@Override
	public boolean isValid(String dob, 
			ConstraintValidatorContext theConstraintValidatorContext) 
	{
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
		try 
		{
			Date date = formatter.parse(dob);
            
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
		
		return true;
	}

}
