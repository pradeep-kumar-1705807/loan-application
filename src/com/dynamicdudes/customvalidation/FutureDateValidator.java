package com.dynamicdudes.customvalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import java.time.LocalDate;
import java.util.Date;

public class FutureDateValidator implements ConstraintValidator<FutureDate, String> {

	@Override
	public boolean isValid(String date, ConstraintValidatorContext arg1) {
		if (date == null) {
			return false;
		}
		LocalDate d1 = LocalDate.parse(date);
		LocalDate d2 = LocalDate.now();
		if (d1.isAfter(d2)) {
			return false;
		}

		return true;

	}
}