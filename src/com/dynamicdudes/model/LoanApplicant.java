package com.dynamicdudes.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class LoanApplicant {
	
	@NotNull(message="is Required")
	@Size(min=1,message="min 1 character Required")
	@Size(max=255,message="255 character limit")
	private String firstName;
	
	
	
	private String midName;
	
	@NotNull(message="is Required")
	@Size(min=1,message="min 1 character Required")
	@Size(max=255,message="255 character limit")
	private String lastName;
	
	
	 
	
	@NotNull(message="is Required")
	
	private String dob;
	
	@NotNull(message="is Required")
	private String maritalStatus;
	
	@NotNull(message="is Required")
	
	private String loanPurpose;
	
	
	private String desc;
	
	@NotNull(message="is Required")
	@Size(min=1,message="min 1 character Required")
	@Size(max=255,message="255 character limit")
	private String addrOne;
	
	
	private String addrTwo;
	
	@NotNull(message="is Required")
	@Size(min=1,message="min 1 character Required")
	@Size(max=255,message="255 character limit")
	private String city;
	
	@NotNull(message="is Required")
	@Size(min=1,message="min 1 character Required")
	@Size(max=255,message="255 character limit")
	private String state;
	
	
	@NotNull(message="is Required")
	private String email;
	
	
	@NotNull(message="is Required")
	private String employeeName;
	
	
	
	private String designation;
	
	
	@NotNull(message="is Required")
	private String employeeAddressOne; 
	
	private String employeeAddressTwo;
	
	
	@NotNull(message="is Required")
	private String employeeCity;
	
	
	@NotNull(message="is Required")
	private String employeeState;
	
	
	@NotNull(message="is Required")
	private Long ssnNumber;
	
	
	@NotNull(message="is Required")
	private Long homePhone; 
	
	
	
	private Long officePhone;
	
	@NotNull(message="is Required")
	private Long mobile;
	
	
	@NotNull(message="is Required")
	private Long  pincode;
	
	
	@NotNull(message="is Required")
	private Integer years;
	
	
	@NotNull(message="is Required")
	private Integer  months;
	
	
	@NotNull(message="is Required")
	private Integer  employeePincode;
	
	
	@NotNull(message="is Required")
	private Double loanAmt;
	
	
	@NotNull(message="is Required")
	private Double annualSal;


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


	public Long getSsnNumber() {
		return ssnNumber;
	}


	public void setSsnNumber(Long ssnNumber) {
		this.ssnNumber = ssnNumber;
	}


	public Long getHomePhone() {
		return homePhone;
	}


	public void setHomePhone(Long homePhone) {
		this.homePhone = homePhone;
	}


	public Long getOfficePhone() {
		return officePhone;
	}


	public void setOfficePhone(Long officePhone) {
		this.officePhone = officePhone;
	}


	public Long getMobile() {
		return mobile;
	}


	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}


	public Long getPincode() {
		return pincode;
	}


	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}


	public Integer getYears() {
		return years;
	}


	public void setYears(Integer years) {
		this.years = years;
	}


	public Integer getMonths() {
		return months;
	}


	public void setMonths(Integer months) {
		this.months = months;
	}


	public Integer getEmployeePincode() {
		return employeePincode;
	}


	public void setEmployeePincode(Integer employeePincode) {
		this.employeePincode = employeePincode;
	}


	public Double getLoanAmt() {
		return loanAmt;
	}


	public void setLoanAmt(Double loanAmt) {
		this.loanAmt = loanAmt;
	}


	public Double getAnnualSal() {
		return annualSal;
	}


	public void setAnnualSal(Double annualSal) {
		this.annualSal = annualSal;
	}
	
	
	

}
