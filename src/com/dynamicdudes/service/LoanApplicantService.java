package com.dynamicdudes.service;

import java.util.List;

import com.dynamicdudes.model.LoanApplicant;

public interface LoanApplicantService {
	
	public void saveLoanApplicant(LoanApplicant loanApplicant);
	
	public List<LoanApplicant> getLoanApplicants();
	
	public LoanApplicant getLoanApplicantById(Integer applicationId);
	
	public boolean isUniqueSSN(Long ssn);
	
	public List<LoanApplicant> searchLoanApplicants(String theSearchtext);
	
	
	

}
