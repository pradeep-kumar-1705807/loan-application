package com.dynamicdudes.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dynamicdudes.dao.LoanApplicantDAO;
import com.dynamicdudes.model.LoanApplicant;
import com.dynamicdudes.model.Student;

@Component
@Service
public class LoanApplicantServiceImpl implements LoanApplicantService
{
	
	@Autowired
	private LoanApplicantDAO loanApplicantDAO;
	
	
	
	@Override
	@Transactional
	public void saveLoanApplicant(LoanApplicant loanApplicant) {
		
		loanApplicantDAO.saveLoanApplicant(loanApplicant);
	}



	@Override
	@Transactional
	public List<LoanApplicant> getLoanApplicants() {
		
		return loanApplicantDAO.getLoanApplicants();
	}



	@Override
	@Transactional
	public LoanApplicant getLoanApplicantById(int applicationId) {
		
		 return loanApplicantDAO.getLoanApplicantById(applicationId);	
	}

	

}
