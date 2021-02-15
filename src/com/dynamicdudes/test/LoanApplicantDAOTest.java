package com.dynamicdudes.test;



import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.dynamicdudes.dao.LoanApplicantDAO;
import com.dynamicdudes.dao.LoanApplicantDAOImpl;
import com.dynamicdudes.model.LoanApplicant;



 
class LoanApplicantDAOTest {
	ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("file:WebContent/WEB-INF/spring.xml");;
	LoanApplicantDAO loanApplicantDAO = (LoanApplicantDAO) context.getBean("loanApplicantDAOImpl",LoanApplicantDAOImpl.class);
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void testUniqueSsnNumber()  {
	
		
		if(loanApplicantDAO != null)
		{
			assertNotNull( loanApplicantDAO.isSsnAlreadyPresent(12765L) );
			assertNotNull( loanApplicantDAO.isSsnAlreadyPresent(127659L) );
			assertNotNull( loanApplicantDAO.isSsnAlreadyPresent(127659L) );
			
			assertNull( loanApplicantDAO.isSsnAlreadyPresent(237659L) );
		//	assertNull( loanApplicantDAO.isSsnAlreadyPresent(Long.parseLong("")) );
			assertNull( loanApplicantDAO.isSsnAlreadyPresent(null) );
			
			
			assertNull( loanApplicantDAO.isSsnAlreadyPresent(-927659L) );
			assertNull( loanApplicantDAO.isSsnAlreadyPresent(-157659L) );
			
			//assertNotNull( loanApplicantDAO.getLoanApplicantById(12) );
			
			
		}
		
		
	}
	@Test

	void testGetApplicantById()
	{
		
		assertNull( loanApplicantDAO.getLoanApplicantById(12) );
		//assertNull( loanApplicantDAO.getLoanApplicantById(Integer.parseInt(null)) );
		assertNull( loanApplicantDAO.getLoanApplicantById(Integer.parseInt("")) );
		
		
		assertNotNull( loanApplicantDAO.getLoanApplicantById(14) );
		assertNotNull( loanApplicantDAO.getLoanApplicantById(15) );
		assertNotNull( loanApplicantDAO.getLoanApplicantById(80) );
	}
	
	@Test
	void testGetApplicants()
	{
		
		List<LoanApplicant>  loanApplicants = loanApplicantDAO.getLoanApplicants();
		assertNotNull( loanApplicants );
		
		
	}
	
	
}
