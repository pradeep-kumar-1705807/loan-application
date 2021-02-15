<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Submit Application</title>
<style>
footer {
 background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}
#header {
    padding:5px;
}
#left {
    line-height:30px;
    width:40%;
    float:left;
    padding:5px;	      
}
#address {
    width:55%;
    float:left;
    padding:10px;	 	 
}
#footer {
    clear:both;
    padding:5px;	 	 
}
#mixed {
    clear:both;
    text-align:left;
   padding:5px;	 	 
}
 #d1 {
margin-top: -50px;
} 
#d2 {
margin-top: -80px;
}
#d3 {
margin-top: -70px;
}
#d4 {
margin-top: -70px;
}
#d5 {
margin-top: -70px;
}
#d6 {
margin-top: -70px;
}
#d7 {
margin-top: -70px;
}
/* #d8 {
margin-left: 14px;
} */
.error{color:red}
</style>

</head>
<body bgcolor="powderblue">
<div style="margin-top: 50px; margin-left: 50px">
<h1>Submit New Application</h1>

<hr>

<form:form action="processForm2" modelAttribute="loan">
<div id="left">
		<pre>
 	<!-- <label for="fn">First Name </label> -->
 	First Name:    <form:input placeholder="First Name" path="firstName" />
	<form:errors path="firstName" cssClass="error" /> 
     <!-- <label for="mn">Middle Name </label> -->
	<div id="d1"> &nbsp;  &nbsp; &nbsp; Middle Name:   <form:input placeholder="Middle Name" path="midName" />
	</div>
	<!-- <label for="ln">Last Name </label> -->
	<div id="d2"> &nbsp;  &nbsp; &nbsp; Last Name:     <form:input placeholder="Last Name" path="lastName" />
	<form:errors path="lastName" cssClass="error" /> </div>
	<!-- <label for="birthday">Date of Birth </label> -->
	<div id="d3"> &nbsp;  &nbsp; &nbsp; Date of Birth: <form:input type = "date" path="dob"/>
	<form:errors path="dob" cssClass="error" /> </div>
	<!-- <label for="marriage">Marital Status </label> -->
	 <div id="d4"> &nbsp;  &nbsp; &nbsp; Marital Status: <form:select path="maritalStatus">
	    <form:option value="Single" label="Single" />
	    <form:option value="Married" label="Married"/>
	    <form:option value="Separated" label="Separated"/>
	    <form:option value="Divorced" label="Divorced"/>
	    <form:option value="Widowed" label="Widowed"/>
	  </form:select>
	  <form:errors path="maritalStatus" cssClass="error" /></div>
	  <!-- <label for="ssn">SSN Number </label> -->
	 <div id="d5"> &nbsp;  &nbsp; &nbsp; SSN Number: <form:input placeholder="SSN Number" path="ssnNumber"/>
	 <form:errors path="ssnNumber" cssClass="error" /> </div>
     <!-- <label for="lamt">Loan Amount</label> -->
	 <div id="d6"> &nbsp;  &nbsp; &nbsp; Loan Amount: <form:input placeholder="Loan Amount" path="loanAmt"/>
	 <form:errors path="loanAmt" cssClass="error" /></div>
	 <!-- <label for="lpurpose">Loan Purpose</label> -->
	  <div id="d7"> &nbsp;  &nbsp; &nbsp; Loan Purpose: <form:select path="loanPurpose">
	  	<form:option value="Debt" label="Debt"/>
	    <form:option value="Education Loan" label="Education Loan"/>
	    <form:option value="Personal Loan" label="Personal Loan"/>
	    <form:option value="Home Loan" label="Home Loan"/>
	  </form:select>
	  <form:errors path="loanPurpose" cssClass="error" /> </div>
	  <!-- <label for="description">Description</label> -->
	 Description: <form:textarea path="desc" rows="7" cols="100"></form:textarea><br>
	 </pre>
		</div>
		<div id="address">
		Address
<fieldset>
	<!--  <label for="address">Address</label><br> -->
	 <pre>
	 <!-- <label for="addressline1">Address Line 1</label> -->
	 Address Line 1: <form:input placeholder="Address Line 1" path="addrOne" /> 
	 <form:errors path="addrOne" cssClass="error" />
	 <!-- <label for="addressline2">Address Line 2</label> -->
	 Address Line 2: <form:input placeholder="Address Line 2" path="addrTwo" />
	 <!-- <label for="cty">City</label> -->
	&nbsp;City:           <form:input placeholder="City" path="city" /> 
	 <form:errors path="city" cssClass="error" /> 
	 <!--  <label for="stt">State</label> -->
	&nbsp;State:          <form:input placeholder="State" path="state" /> 
	 <form:errors path="state" cssClass="error" />
	 <!--  <label for="pcode">Postal Code</label> -->
	 Postal Code: &nbsp;  <form:input placeholder="Postal Code" path="postalcode" /> 
	 <form:errors path="postalcode" cssClass="error" />
	 </pre>
</fieldset>

<br>
Contact Information
<fieldset>
	 
	 <!-- <label for="contact">Contact Information</label><br> -->
	 <pre>
	 <!-- <label for="home">Home Phone</label> -->
	 Home Phone:      <form:input placeholder="123456" path="homePhone" /> 
	 <form:errors path="homePhone" cssClass="error" />
	 <!-- <label for="office">Office Phone</label> -->
	 Office Phone:    <form:input placeholder="123456" path="officePhone" />
	 <form:errors path="officePhone" cssClass="error" />
	 <!-- <label for="mobi">Mobile</label> -->
	 Mobile:          <form:input placeholder="123456" path="mobile" /> 
	                 
	 <form:errors path="mobile" cssClass="error" />
	 <!-- <label for="mail">Email Address</label> -->
	 Email Address:   <form:input placeholder="test@test.com" path="email" />
     <form:errors path="email" cssClass="error" />
	 </pre>
</fieldset>
</div>
		<div id="footer">
		Employer Details
		<fieldset style="width:95%">
	 <!--  <label for="empdetails">Employment Details</label><br> -->
	 <pre>
	 <div style="float:right;margin-right:190px">
	 <div id="d9">Designation <form:input placeholder="Designation" path="designation" /> 
	  <form:errors path="designation" cssClass="error" /></div>
	 <!-- <label for="exp">Experience</label> -->
	<div id="d8">Experience:  <form:input placeholder="Years" path="years" /><form:errors path="years" cssClass="error" /> <form:input placeholder="Months" path="months" /><form:errors path="months" cssClass="error" />
	 </div> </div>
	 <!-- <label for="ename">Employer Name</label> -->
	 Employer Name: <form:input placeholder="name" path="employeeName" /> 
	  <form:errors path="employeeName" cssClass="error" />
	  
	 <!-- <label for="salary">Annual Salary</label> -->
	 Annual Salary: <form:input placeholder="123456" path="annualSal" /> 
	 <form:errors path="annualSal" cssClass="error" />  
   <b>Address</b>
	 <!-- <label for="eaddressline1">Address Line 1</label> -->
	Address Line 1:  <form:input placeholder="Address Line 1" path="employeeAddressOne" />
	 <form:errors path="employeeAddressOne" cssClass="error" />
<!-- <label for="eaddressline2">Address Line 2</label> -->
	Address Line 2:  <form:input placeholder="Address Line 2" path="employeeAddressTwo" /> 
	<!-- <label for="ecity">City</label> -->
	City:            <form:input placeholder="City" path="employeeCity" /> 
	 <form:errors path="employeeCity" cssClass="error" />
	<!-- <label for="estate">State</label> -->
	State:           <form:input placeholder="State" path="employeeState" /> 
	 <form:errors path="employeeState" cssClass="error" />
	 <!-- <label for="epincode">Postal Code</label> -->
	Postal Code:     <form:input placeholder="Postal Code" path="employeePostalcode" /> 
	  <form:errors path="employeePostalcode" cssClass="error" />
	 </pre>
</fieldset>
<br>
</div>
<br>
	<input type="submit" value="Submit" />
</form:form>
</div>
</body>
</html>
