package com.dynamicdudes.test;



import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
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


 
class LoanApplicantDAOTest {
	


	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void testUniqueSsnNumber()  {
	
		
		ClassPathXmlApplicationContext context =  
				new ClassPathXmlApplicationContext("file:WebContent/WEB-INF/spring.xml");
		
		LoanApplicantDAO loanApplicantDAO = (LoanApplicantDAO) context.getBean("loanApplicantDAOImpl",LoanApplicantDAOImpl.class);
		
		if(loanApplicantDAO != null)
		{
			assertNotNull( loanApplicantDAO.isSsnAlreadyPresent(12765L) );
			assertNotNull( loanApplicantDAO.isSsnAlreadyPresent(127659L) );
			assertNotNull( loanApplicantDAO.isSsnAlreadyPresent(127659L) );
			
			assertNull( loanApplicantDAO.isSsnAlreadyPresent(237659L) );
			assertNull( loanApplicantDAO.isSsnAlreadyPresent(4357659L) );
			
			assertNull( loanApplicantDAO.isSsnAlreadyPresent(-927659L) );
			assertNull( loanApplicantDAO.isSsnAlreadyPresent(-157659L) );
			
			
		}
		
	}

}
