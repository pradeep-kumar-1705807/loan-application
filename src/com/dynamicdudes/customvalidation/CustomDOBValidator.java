package com.dynamicdudes.customvalidation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CustomDOBValidator implements ConstraintValidator<CustomDOB,String>
{
	
	@Override
	public boolean isValid(String dateOfBirth, 
			ConstraintValidatorContext theConstraintValidatorContext) 
	{
		
		if(dateOfBirth != null)
		{   
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
		try 
		{
			formatter.parse(dateOfBirth);
			System.out.print(dateOfBirth.toString());
			
		}
		catch(Exception e)
		{
			System.out.print("Error");
			e.printStackTrace();
			return false;
		}
		}
		
		
		return true;
	}

}
