package com.dynamicdudes.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class LoanApplicant {
	
	@NotNull(message="is Required")
	@Size(min=1,message="is Required")
	private String firstName;
	
	
	@NotNull(message="is Required")
	@Size(min=1,message="is Required")
	private String lastName;
	
	@NotNull(message="is Required")
	@Size(min=1,message="is Required")
	private String midName; 
	
	
	private String dob;
	private String maritalStatus;
	private String loanPurpose;
	private String desc;
	private String addrOne;
	private String addrTwo;
	private String city;
	private String state;
	private String email;
	private String empName;
	private String designation;
	private String eAddrOne; 
	private String eAddrTwo;
	private String eCity;
	private String eState;
	
	private Integer ssnNumber;
	private Integer homePhone; 
	private Integer officePhone;
	private Integer  mobile;
	private Integer  pincode;
	private Integer years;
	private Integer  months;
	private Integer  ePincode;
	private Double loanAmt;
	private Double annualSal;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMidName() {
		return midName;
	}
	public void setMidName(String midName) {
		this.midName = midName;
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
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String geteAddrOne() {
		return eAddrOne;
	}
	public void seteAddrOne(String eAddrOne) {
		this.eAddrOne = eAddrOne;
	}
	public String geteAddrTwo() {
		return eAddrTwo;
	}
	public void seteAddrTwo(String eAddrTwo) {
		this.eAddrTwo = eAddrTwo;
	}
	public String geteCity() {
		return eCity;
	}
	public void seteCity(String eCity) {
		this.eCity = eCity;
	}
	public String geteState() {
		return eState;
	}
	public void seteState(String eState) {
		this.eState = eState;
	}
	public Integer getSsnNumber() {
		return ssnNumber;
	}
	public void setSsnNumber(Integer ssnNumber) {
		this.ssnNumber = ssnNumber;
	}
	public Integer getHomePhone() {
		return homePhone;
	}
	public void setHomePhone(Integer homePhone) {
		this.homePhone = homePhone;
	}
	public Integer getOfficePhone() {
		return officePhone;
	}
	public void setOfficePhone(Integer officePhone) {
		this.officePhone = officePhone;
	}
	public Integer getMobile() {
		return mobile;
	}
	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
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
	public Integer getePincode() {
		return ePincode;
	}
	public void setePincode(Integer ePincode) {
		this.ePincode = ePincode;
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
