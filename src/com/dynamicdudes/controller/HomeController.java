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
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dynamicdudes.model.LoanApplicant;
import com.dynamicdudes.model.Student;
import com.dynamicdudes.service.LoanApplicantService;

@Controller
public class HomeController {
	
	
	@Autowired
	LoanApplicantService loanApplicantService;
	
	
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
		
		System.out.println(loanApplicant.getFirstName());
		if(theBindingResult.hasErrors())
		{
			return "new-form";
		}
		else 
		{
			
			loanApplicantService.saveLoanApplicant(loanApplicant);
			
			return "submitted";
		}
	}
}
