package com.dynamicdudes.model;


import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


import com.dynamicdudes.customvalidation.CustomSsn;
import com.dynamicdudes.customvalidation.FutureDate;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
public class LoanApplicant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "application_id")
	private int applicationId;

	@NotNull(message = "is Required")
	@Size(max = 255, message = "255 character limit")
	@Column(name = "first_name")
	@Pattern(regexp="^[a-zA-Z ]*$",message="must only be alphabets")
	private String firstName;

	@Size(max = 255, message = "255 character limit")
	@Pattern(regexp="^[a-zA-Z]*$",message="must only be alphabets")
	@Column(name = "middle_name")
	private String midName;

	@NotNull(message = "is Required")
	@Size(max = 255, message = "255 character limit")
	@Pattern(regexp="^[a-zA-Z ]*$",message="must only be alphabets")
	@Column(name = "last_name")
	private String lastName;

	@NotNull(message = "is Required")
	@Column(name = "date_of_birth")
	@FutureDate
	@Pattern(regexp = "^((19|2[0-9])[0-9]{2})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$",message="date must be yyyy-mm-dd format Ex:1992-01-05")
	private String dob;

	@NotNull(message = "is Required")
	@Column(name = "marital_status")
	private String maritalStatus;

	@NotNull(message = "is Required")
	@Column(name = "loan_purpose")
	private String loanPurpose;

	@Column(name = "description")
	@NotNull(message = "is Required")
	private String desc;

	@NotNull(message = "is Required")
	@Size(max = 255, message = "255 character limit")
	@Column(name = "address_line1")
	private String addrOne;

	@Size(max = 255, message = "255 character limit")
	@Column(name = "address_line2")
	private String addrTwo;

	@NotNull(message = "is Required")
	@Size(max = 255, message = "255 character limit")
	@Column(name = "city")
	@Pattern(regexp="^[a-zA-Z ]*$",message="must only be alphabet")
	private String city;

	@NotNull(message = "is Required")
	@Size(max = 255, message = "255 character limit")
	@Column(name = "state")
	@Pattern(regexp="^[a-zA-Z ]*$",message="must only be alphabet")
	private String state;

	@Email
	@NotNull(message = "is Required")
	@Size(max = 255, message = "255 character limit")
	@Column(name = "email_address")
	
	private String email;

	@NotNull(message = "is Required")
	@Size(max = 255, message = "255 character limit")
	@Column(name = "employee_name")
	@Pattern(regexp="^[a-zA-Z]*$",message="must only be alphabets")
	private String employeeName;

	@Column(name = "designation")
	private String designation;

	@NotNull(message = "is Required")
	@Size(max = 255, message = "255 character limit")
	@Column(name = "employee_addressline1")
	private String employeeAddressOne;

	@Size(max = 255, message = "255 character limit")
	@Column(name = "employee_addressline2")
	private String employeeAddressTwo;

	@NotNull(message = "is Required")
	@Size(max = 255, message = "255 character limit")
	@Column(name = "employee_city")
	@Pattern(regexp="^[a-zA-Z ]*$",message="must only be alphabets")
	private String employeeCity;

	@NotNull(message = "is Required")
	@Size(max = 255, message = "255 character limit")
	@Column(name = "employee_state")
	@Pattern(regexp="^[a-zA-Z ]*$",message="must only be alphabets")
	private String employeeState;

	@NotNull(message = "is Required")
	@Pattern(regexp="^[0-9]{5}$",message="must be a valid 5-digit")
	@CustomSsn(message="must be unique")
	@Column(name = "ssn")
	private String ssnNumber;

	@NotNull(message = "is Required")
	@Pattern(regexp="^[0-9]{10}$",message="must only be numeric and 10-digit value")
	@Column(name = "home_phone")
	
	private String homePhone;


	@Column(name = "office_phone")
	@Pattern(regexp="^[0-9]{10}$",message="must only be numeric and 10-digit value")
	private String officePhone;

	@NotNull(message = "is Required")
	
	@Column(name = "mobile_number")
	@Pattern(regexp="^[0-9]{10}$",message="must only be numeric and 10-digit value")
	private String mobile;

	@NotNull(message = "is Required")
	@Column(name = "postal_code")
	@Pattern(regexp="^[0-9]{5}$",message="must only be numeric and 5-digit value")
	private String postalcode;

	@NotNull(message = "is Required")
	@Size(max = 2, message = "must be a valid year")
	@Column(name = "experience_years")
	@Pattern(regexp="^([0-9]*)$",message="must be a valid year")
	private String years;

	
	@Column(name = "experience_months")
	@Pattern(regexp="^(0?[1-9]|1[012])$",message="must be a valid month")
	private String months;

	@NotNull(message = "is Required")
	@Column(name = "employee_postalcode")
	@Pattern(regexp="^[0-9]{5}$",message="must only be numeric and 5-digit value")
	private String employeePostalcode;

	@NotNull(message = "is Required")
	@Column(name = "loan_amount")
	@Pattern(regexp="^[+-]?([0-9]*[.])?[0-9]+$",message="enter valid loan amount")
	private String loanAmt;

	@NotNull(message = "is Required")
	@Column(name = "annual_salary")
	@Pattern(regexp="^[+-]?([0-9]*[.])?[0-9]+$",message="enter valid salary ")
	private String annualSal;

	@Column(name = "score")
	private Integer score;

	@Column(name = "decline_reason")
	private String declineReason;

	@Column(name = "application_status")
	private String status;

	@Override
	public String toString() {
		return "LoanApplicant [applicationId=" + applicationId + ", firstName=" + firstName + ", midName=" + midName
				+ ", lastName=" + lastName + ", dob=" + dob + ", maritalStatus=" + maritalStatus + ", loanPurpose="
				+ loanPurpose + ", desc=" + desc + ", addrOne=" + addrOne + ", addrTwo=" + addrTwo + ", city=" + city
				+ ", state=" + state + ", email=" + email + ", employeeName=" + employeeName + ", designation="
				+ designation + ", employeeAddressOne=" + employeeAddressOne + ", employeeAddressTwo="
				+ employeeAddressTwo + ", employeeCity=" + employeeCity + ", employeeState=" + employeeState
				+ ", ssnNumber=" + ssnNumber + ", homePhone=" + homePhone + ", officePhone=" + officePhone + ", mobile="
				+ mobile + ", postalcode=" + postalcode + ", years=" + years + ", months=" + months
				+ ", employeePostalcode=" + employeePostalcode + ", loanAmt=" + loanAmt + ", annualSal=" + annualSal
				+ "]";
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMidName() {
		return midName;
	}

	public void setMidName(String midName) {
		this.midName = midName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getLoanPurpose() {
		return loanPurpose;
	}

	public void setLoanPurpose(String loanPurpose) {
		this.loanPurpose = loanPurpose;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getAddrOne() {
		return addrOne;
	}

	public void setAddrOne(String addrOne) {
		this.addrOne = addrOne;
	}

	public String getAddrTwo() {
		return addrTwo;
	}

	public void setAddrTwo(String addrTwo) {
		this.addrTwo = addrTwo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmployeeAddressOne() {
		return employeeAddressOne;
	}

	public void setEmployeeAddressOne(String employeeAddressOne) {
		this.employeeAddressOne = employeeAddressOne;
	}

	public String getEmployeeAddressTwo() {
		return employeeAddressTwo;
	}

	public void setEmployeeAddressTwo(String employeeAddressTwo) {
		this.employeeAddressTwo = employeeAddressTwo;
	}

	public String getEmployeeCity() {
		return employeeCity;
	}

	public void setEmployeeCity(String employeeCity) {
		this.employeeCity = employeeCity;
	}

	public String getEmployeeState() {
		return employeeState;
	}

	public void setEmployeeState(String employeeState) {
		this.employeeState = employeeState;
	}

	public String getSsnNumber() {
		return ssnNumber;
	}

	public void setSsnNumber(String ssnNumber) {
		this.ssnNumber = ssnNumber;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getOfficePhone() {
		return officePhone;
	}

	public void setOfficePhone(String officePhone) {
		this.officePhone = officePhone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	public String  getYears() {
		return years;
	}

	public void setYears(String years) {
		this.years = years;
	}

	public String getMonths() {
		return months;
	}

	public void setMonths(String months) {
		this.months = months;
	}

	public String getEmployeePostalcode() {
		return employeePostalcode;
	}

	public void setEmployeePostalcode(String employeePostalcode) {
		this.employeePostalcode = employeePostalcode;
	}

	public String getLoanAmt() {
		return loanAmt;
	}

	public void setLoanAmt(String loanAmt) {
		this.loanAmt = loanAmt;
	}

	public String getAnnualSal() {
		return annualSal;
	}

	public void setAnnualSal(String annualSal) {
		this.annualSal = annualSal;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public String getDeclineReason() {
		return declineReason;
	}

	public void setDeclineReason(String declineReason) {
		this.declineReason = declineReason;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

	

}
