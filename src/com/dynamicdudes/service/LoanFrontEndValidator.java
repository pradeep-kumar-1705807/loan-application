package com.dynamicdudes.service;

import com.dynamicdudes.model.LoanApplicant;

public interface LoanFrontEndValidator {
     public void experience(LoanApplicant loanApplicant) ;

	public void checkSalary(LoanApplicant loanApplicant) ;

	public void generateScore(LoanApplicant loanApplicant) ;

	public void age(LoanApplicant loanApplicant) ;

}
