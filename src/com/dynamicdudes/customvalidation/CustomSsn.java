package com.dynamicdudes.customvalidation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;



@Constraint(validatedBy = CustomSsnConstraintValidator.class)
@Target( { ElementType.METHOD,ElementType.FIELD } )
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomSsn {
	
	//define default course code
	
		public String value() default "";
		
		//define default error message
		
		public String message() default "ssn must be unique";
		
		//define default group
		public Class<?>[] groups() default {};

		//define default
		public Class<? extends Payload>[] payload() default {};

}
