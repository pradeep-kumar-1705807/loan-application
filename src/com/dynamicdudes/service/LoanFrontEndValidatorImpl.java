package com.dynamicdudes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dynamicdudes.helper.AgeGeneration;
import com.dynamicdudes.helper.RandomScoreGenerator;
import com.dynamicdudes.model.LoanApplicant;

@Component
public class LoanFrontEndValidatorImpl implements LoanFrontEndValidator {

	@Autowired
	RandomScoreGenerator randomScoreGenerator;

	@Autowired
	AgeGeneration ageGenerator;
	
	

	public boolean checkExperience(LoanApplicant loanApplicant) {

		if (loanApplicant.getYears() == 0 && loanApplicant.getMonths() < 6) {
			return false;
		}

		return true;

	}

	public boolean checkSalary(LoanApplicant loanApplicant) {

		if (loanApplicant.getAnnualSal() < 10000) {
			return false;
		}
		return true;

	}

	public boolean checkScore(LoanApplicant loanApplicant) {

		int randomscore = randomScoreGenerator.getRandomScore();
		loanApplicant.setScore(randomscore);

		System.out.println("RandomScore=" + randomscore);
		if (randomscore < 400) {
			return false;
		}

		return true;

	}

	public boolean checkAge(LoanApplicant loanApplicant) {
		
		int age = ageGenerator.getAge(loanApplicant.getDob());
		System.out.println("Printing age" + age);
		if (age < 18 || age > 65) {
			return false;
		}
		return true;

	}

	public void validation(LoanApplicant loanApplicant) {

		boolean isExperienceValid = this.checkExperience(loanApplicant);
		boolean isAgeValid = this.checkAge(loanApplicant);
		boolean isScoreValid = this.checkScore(loanApplicant);
		boolean isSalaryValid = this.checkSalary(loanApplicant);

		if (isExperienceValid == false || isAgeValid == false || isScoreValid == false || isSalaryValid == false) 
		{
			loanApplicant.setStatus("Declined");

			if ( !isExperienceValid ) 
			{
				loanApplicant.setDeclineReason("Experience less than 6 months! Sorry! Try again later");
				
			} 
			else if ( !isSalaryValid ) 
			{
				loanApplicant.setDeclineReason("Salary less than minimum limit! Sorry!");
			} 
			 
			else if ( !isAgeValid ) 
			{
				loanApplicant.setDeclineReason("Not in the age limits! Sorry!");

			}
			else if ( !isScoreValid ) 
			{
				loanApplicant.setDeclineReason("Score less than minimum limit! Sorry!");

			}

		}
		else 
		{
		
		loanApplicant.setStatus("Approved");
		}

	}

}
