
package com.dynamicdudes.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.dynamicdudes.model.LoanApplicant;


@Component
@Repository
public class LoanApplicantDAOImpl implements LoanApplicantDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void saveLoanApplicant(LoanApplicant loanApplicant) {
		
		Session currentSession ;
		try {
	   		currentSession =  sessionFactory.getCurrentSession();
	   		}
	   		catch (HibernateException mye) 
	   		{
	   			currentSession = sessionFactory.openSession();
	   		}
		
		currentSession.save(loanApplicant);
		
	}

	@Override
	public List<LoanApplicant> getLoanApplicants() {
		
		Session currentSession ;
		try {
	   		currentSession =  sessionFactory.getCurrentSession();
	   		}
	   		catch (HibernateException mye) 
	   		{
	   			currentSession = sessionFactory.openSession();
	   		}
		
		Query<LoanApplicant> query = currentSession
				.createQuery("from LoanApplicant",LoanApplicant.class);
		
		return query.getResultList();
	}

	@Override
	public LoanApplicant getLoanApplicantById(Integer applicationId) {
		
       Session currentSession ;
       try {
   		currentSession =  sessionFactory.getCurrentSession();
   		}
   		catch (HibernateException mye) 
   		{
   			currentSession = sessionFactory.openSession();
   		}
		
		return currentSession.get(LoanApplicant.class, applicationId);
	}

	@Override
	public LoanApplicant isSsnAlreadyPresent(Long ssnNumber) {
		
		
		LoanApplicant loanApplicant = null;
		String ssn = ssnNumber.toString();
		Query<LoanApplicant> query;
		
		Session currentSession;
		try {
		currentSession =  sessionFactory.getCurrentSession();
		}
		catch (HibernateException mye) 
		{
			currentSession = sessionFactory.openSession();
		}
		try {
		
		query  = currentSession.createQuery("from LoanApplicant l where l.ssnNumber = :ssn",LoanApplicant.class);
		query.setParameter("ssn",ssn);
		loanApplicant =  query.getSingleResult();
//		if(loanApplicant != null) {
//
//			System.out.println("......... LOAN APPLICANT BY SSN .........." + loanApplicant.toString());
//		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
		
		return loanApplicant;
	}

	@Override
	public List<LoanApplicant> searchLoanApplicants(String theSearchText) {
		
		Session currentSession ;
		try {
	   		currentSession =  sessionFactory.getCurrentSession();
	   		}
	   		catch (HibernateException mye) 
	   		{
	   			currentSession = sessionFactory.openSession();
	   		}
		
		Query<LoanApplicant> query = null;
		
		
		
		
		 if (theSearchText != null && theSearchText.trim().length() > 0) {

	            // search for firstName or lastName ... case insensitive
	            query = currentSession.createQuery("from LoanApplicant where lower(firstName) like :theName or lower(lastName) like :theName", 
	            		LoanApplicant.class);
	            query.setParameter("theName", "%" + theSearchText.toLowerCase() + "%");

	        }
	        else {
	            // theSearchName is empty ... so just get all LoanApplicant
	            query =currentSession.createQuery("from LoanApplicant", LoanApplicant.class);            
	        }
		
		return query.getResultList();
		
		
	}

}
