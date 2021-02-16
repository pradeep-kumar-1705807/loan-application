package com.dynamicdudes.helper;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class AgeGenerator implements AgeGeneration {
	


		  public  int getAge(String date) 
		    { 
			  	int age;
		        
			  	
			  	LocalDate today = LocalDate.now();
			  
			  	
		        LocalDate dob
		            = LocalDate.parse(date); 
		        
		        Period period = Period.between(dob, today);
		        
		        age = period.getYears();
		        //System.out.print("............."+age+"..........");
		        return age;
		        
		        	       
		    }

	}

