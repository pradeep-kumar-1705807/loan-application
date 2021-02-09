package com.dynamicdudes.model;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loanapplicant")
public class LoanApplicant {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="application_id")
	private int applicationId;
	
	
	@NotNull(message="is Required")
	@Size(max=255,message="255 character limit")
	@Column(name="first_name")
	private String firstName;
	
	
	@Size(max=255,message="255 character limit")
	@Column(name="middle_name")
	private String midName;
	
	
	@NotNull(message="is Required")
	@Size(max=255,message="255 character limit")
	@Column(name="last_name")
	private String lastName;
	
	
	 
	
	@NotNull(message="is Required")
	@Column(name="date_of_birth")
	private String dob;
	
	
	
	@NotNull(message="is Required")
	@Column(name="marital_status")
	private String maritalStatus;
	
	
	
	@NotNull(message="is Required")
	@Column(name="loan_purpose")
	private String loanPurpose;
	
	@Column(name="description")
	@NotNull(message="is Required")
	private String desc;
	
	@NotNull(message="is Required")
	@Size(max=255,message="255 character limit")
	@Column(name="address_line1")
	private String addrOne;
	
	@Size(max=255,message="255 character limit")
	@Column(name="address_line2")
	private String addrTwo;
	
	@NotNull(message="is Required")
	@Size(max=255,message="255 character limit")
	@Column(name="city")
	private String city;
	
	@NotNull(message="is Required")
	@Size(max=255,message="255 character limit")
	@Column(name="state")
	private String state;
	
	
	@NotNull(message="is Required")
	@Size(max=255,message="255 character limit")
	@Column(name="email_address")
	@Pattern(regexp="^(.+)@(.+)$", message="enter valid email")
	private String email;
	
	
	@NotNull(message="is Required")
	@Size(max=255,message="255 character limit")
	@Column(name="employee_name")
	private String employeeName;
	
	
	@Column(name="designation")
	
	private String designation;
	
	
	@NotNull(message="is Required")
	@Size(max=255,message="255 character limit")
	@Column(name="employee_addressline1")
	private String employeeAddressOne; 
	
	@Size(max=255,message="255 character limit")
	@Column(name="employee_addressline2")
	private String employeeAddressTwo;
	
	
	@NotNull(message="is Required")
	@Size(max=255,message="255 character limit")
	@Column(name="employee_city")
	private String employeeCity;
	
	
	@NotNull(message="is Required")
	@Size(max=255,message="255 character limit")
	@Column(name="employee_state")
	private String employeeState;
	
	
	@NotNull(message="is Required")
	@Min(0)
	@Column(name="ssn")
	
	private Long ssnNumber;
	
	
	@NotNull(message="is Required")
	@Min(1000000000L)
	@Digits(integer = 10,fraction = 0,message="must valid office Phone of 10 digit")
	@Column(name="home_phone")
	private Long homePhone; 
	
	
	@Min(1000000000L)
	@Digits(integer = 10,fraction = 0,message="must valid mobile of 10 digit")
	@Column(name="office_phone")
	private Long officePhone;
	
	@NotNull(message="is Required")
	@Min(1000000000L)
	@Digits(integer = 10,fraction = 0,message="must valid mobile of 10 digit")
	@Column(name="mobile_number")
	private Long mobile;
	
	
	@NotNull(message="is Required")
	@Min(10000)
	@Digits(integer = 5,fraction = 0,message="must  valid postalcode of 5 digit")
	@Column(name="postal_code")
	private Integer  postalcode;
	
	
	@NotNull(message="is Required")
	@Min(1)
	@Digits(integer = 2,fraction = 0,message="must  valid")
	@Column(name="experience_years")
	private Integer years;
	
	
	
	@Min(0)
	@Max(12)
	@Digits(integer = 2,fraction = 0,message="must  valid month")
	@Column(name="experience_months")
	private Integer  months;
	
	
	@NotNull(message="is Required")
	@Min(10000)
	@Digits(integer = 5,fraction = 0,message="must  valid pincode of 5 digit")
	@Column(name="employee_postalcode")
	private Integer  employeePostalcode;
	
	
	@NotNull(message="is Required")
	@Min(0)
	@Column(name="loan_amount")
	private Double loanAmt;
	
	
	@NotNull(message="is Required")
	@Min(0)
	@Column(name="annual_salary")
	private Double annualSal;

	

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


	public Integer getPostalcode() {
		return postalcode;
	}


	public void setPostalcode(Integer postalcode) {
		this.postalcode = postalcode;
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


	public Integer getEmployeePostalcode() {
		return employeePostalcode;
	}


	public void setEmployeePostalcode(Integer employeePostalcode) {
		this.employeePostalcode = employeePostalcode;
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
