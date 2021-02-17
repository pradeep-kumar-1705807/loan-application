package com.dynamicdudes.controller;


import java.util.List;

import javax.validation.Valid;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dynamicdudes.helper.AgeGeneration;
import com.dynamicdudes.helper.RandomScoreGenerator;
import com.dynamicdudes.model.LoanApplicant;
import com.dynamicdudes.service.LoanApplicantService;
import com.dynamicdudes.service.LoanFrontEndValidator;

@Controller
public class HomeController {
	
	
	
	
	@Autowired
	LoanApplicantService loanApplicantService;
	
	@Autowired
	LoanFrontEndValidator loanFrontEndValidator;
	
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
		
	}
	
	
	@RequestMapping("/")
	public String showPage()
	{
		return "Home";
	}
	
	@RequestMapping("/search")
	public String search(@RequestParam(name="theSearchText",required=false) String theSearchText, Model theModel)
	{
		List<LoanApplicant> loanApplicants = loanApplicantService.searchLoanApplicants(theSearchText);
		
		theModel.addAttribute("loanApplicants",loanApplicants);
		
		
		return "view-searched-applicants";
	}
	
	@RequestMapping("/showform")
	public String showNewForm(Model model)
	{
		LoanApplicant loanApplication = new LoanApplicant();
		model.addAttribute("loan", loanApplication);
		return "new-form";
	}
	
	@RequestMapping("/view")
	public String showApplicants(Model theModel)
	{
		List<LoanApplicant> loanApplicants = loanApplicantService.getLoanApplicants();
		
		theModel.addAttribute("loanApplicants",loanApplicants);
		
		
		return "view-applicants";
	}
	
	@RequestMapping("/view-form")
	public String showApplicantForm(@RequestParam("loanApplicationId") int 
			applicationId, Model theModel)
	{
		System.out.println(applicationId);
		LoanApplicant loanApplicant = loanApplicantService.getLoanApplicantById(applicationId);
		
		theModel.addAttribute("loanApplicant",loanApplicant);
		
		return "view-applicant-form";
	}
	
	
	@RequestMapping("/processForm2")
	public String processForm2(@Valid @ModelAttribute("loan") LoanApplicant loanApplicant , 
			BindingResult theBindingResult)
	{
		
		if(theBindingResult.hasErrors())
		{
			
			return "new-form";
		}
		else 
		{
					
			loanFrontEndValidator.validation(loanApplicant);
			
			loanApplicantService.saveLoanApplicant(loanApplicant);
			
			
			return "submitted";
		}
	}

		
	
}
