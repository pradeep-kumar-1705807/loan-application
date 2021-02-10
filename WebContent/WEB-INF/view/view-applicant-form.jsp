<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Application</title>
<style>
.error{color:red}
</style>
</head>
<body>

<h1>View Application</h1>
<h3>${loanApplicant.status} </h3>
<h3>${loanApplicant.declineReason} </h3>
<hr>



<form:form action="test-sucessfull" modelAttribute="loanApplicant" method="POST" >
 	<label for="fn">First Name </label>
	<form:input placeholder="First Name" path="firstName" readonly="true" /> 
	<form:errors path="firstName" cssClass="error" /> <br>

	  <label for="mn">Middle Name </label>
	<form:input placeholder="Middle Name" path="midName" readonly="true" />
	
	<br>
	
	 <label for="ln">Last Name </label>
	<form:input placeholder="Last Name" path="lastName" readonly="true"/>
	<form:errors path="lastName" cssClass="error" /> <br>
	
	<br>
	
	<label for="birthday">Date of Birth </label>
	<form:input type = "date" path="dob" readonly="true"/>
	<form:errors path="dob" cssClass="error" /> <br>
	
	<label for="marriage">Marital Status </label>
	  <form:select path="maritalStatus" disabled="true">
	    <form:option value="Single" label="Single" />
	    <form:option value="Married" label="Married"/>
	    <form:option value="Separated" label="Separated"/>
	    <form:option value="Divorced" label="Divorced"/>
	    <form:option value="Widowed" label="Widowed"/>
	  </form:select>
	  
	  <form:errors path="maritalStatus" cssClass="error" readonly="true"/>
	  
	  <br>
	  
	 <label for="ssn">SSN Number </label>
	 <form:input placeholder="SSN Number" path="ssnNumber" readonly="true"/>
	 <form:errors path="ssnNumber" cssClass="error" />
	 <br>
	 
	 <label for="lamt">Loan Amount</label>
	 <form:input placeholder="Loan Amount" path="loanAmt" readonly="true"/>
	 <form:errors path="loanAmt" cssClass="error" />
	 <br>
	 
	   <label for="lpurpose">Loan Purpose</label>
	  <form:select path="loanPurpose" disabled="true">
	  	<form:option value="Debt" label="Debt"/>
	    <form:option value="Education Loan" label="Education Loan"/>
	    <form:option value="Personal Loan" label="Personal Loan"/>
	    <form:option value="Home Loan" label="Home Loan"/>
	  </form:select>
	  
	  <form:errors path="loanPurpose" cssClass="error" />
	  <br>
	  
	  <label for="description">Description</label>
	 <form:textarea path="desc" rows="4" cols="50" readonly="true"></form:textarea><br>
	 
	 <label for="address">Address</label><br>
	 
	 <label for="addressline1"  >Address Line 1</label>
	 <form:input placeholder="Address Line 1" path="addrOne" readonly="true"/> 
	 <form:errors path="addrOne" cssClass="error" />
	 
	 <br>
	 
	 <label for="addressline2">Address Line 2</label>
	 <form:input placeholder="Address Line 2" path="addrTwo" readonly="true"/> <br>
	 
	 <label for="cty">City</label>
	 <form:input placeholder="City" path="city" readonly="true"/> 
	 <form:errors path="city" cssClass="error" />
	 <br>
	 
	 <label for="stt">State</label>
	 <form:input placeholder="State" path="state" readonly="true"/> 
	 <form:errors path="state" cssClass="error" />
	 <br>
	 
	 <label for="pcode">Postal Code</label>
	 <form:input placeholder="Postal Code" path="postalcode" readonly="true"/> 
	 <form:errors path="postalcode" cssClass="error" />
	 <br>
	 
	 <label for="contact">Contact Information</label><br>
	 
	 <label for="home">Home Phone</label>
	 <form:input placeholder="123456" path="homePhone" readonly="true"/> 
	 <form:errors path="homePhone" cssClass="error" />
	 <br>
	 
	 
	 <label for="office">Office Phone</label>
	 <form:input placeholder="123456" path="officePhone" readonly="true"/>
	 <form:errors path="officePhone" cssClass="error" />
	  <br>
	 
	 <label for="mobi">Mobile</label>
	 <form:input placeholder="123456" path="mobile" readonly="true"/> 
	 <form:errors path="mobile" cssClass="error" />
	 <br>
	 
	 <label for="mail">Email Address</label>
	 <form:input placeholder="test@test.com" path="email" readonly="true"/>
     <form:errors path="email" cssClass="error" />
	 <br>
	 --
	  <label for="empdetails">Employment Details</label><br>
	 
	 <label for="ename">Employer Name</label>
	 <form:input placeholder="name" path="employeeName" readonly="true"/> 
	  <form:errors path="employeeName" cssClass="error" />
	 <br>
	 
	 <label for="salary">Annual Salary</label>
	 <form:input placeholder="123456" path="annualSal" readonly="true"/> 
	 <form:errors path="annualSal" cssClass="error" />
	 
	 <br>
	 
	 <label for="empaddress">Address</label><br>
	 
	 <label for="eaddressline1">Address Line 1</label>
	 <form:input placeholder="Address Line 1" path="employeeAddressOne" readonly="true"/>
	 <form:errors path="employeeAddressOne" cssClass="error" />
	  
	 
	 <br>
	 
	 <label for="eaddressline2">Address Line 2</label>
	 <form:input placeholder="Address Line 2" path="employeeAddressTwo" readonly="true"/> 
	 
	 <br>
	 
	 <label for="ecity">City</label>
	 <form:input placeholder="City" path="employeeCity" readonly="true" /> 
	 <form:errors path="employeeCity" cssClass="error" />
	 <br>
	 
	 <label for="estate">State</label>
	 <form:input placeholder="State" path="employeeState" readonly="true" /> 
	 <form:errors path="employeeState" cssClass="error" />
	 <br>
	 
	 <label for="epincode">Postal Code</label>
	 <form:input placeholder="Postal Code" path="employeePostalcode" readonly="true"/> 
	  <form:errors path="employeePostalcode" cssClass="error" />
	 
	 <br>
	 
	
	 Designation <form:input placeholder="Designation" path="designation" readonly="true"/> 
	  <form:errors path="designation" cssClass="error" />
	 <br>
	 
	 <label for="exp">Experience</label>
	 <form:input placeholder="Years" path="years" readonly="true"/> 
	   <form:errors path="years" cssClass="error" />
	 
	 <form:input placeholder="Months" path="months" readonly="true"/> 
	 <form:errors path="months" cssClass="error" />
	 
	 <br><br> 
	 <!--  <button onclick="location.href = 'www.google.com';" id="myButton"  >Back</button>-->
	 <a href="/loan-processing-system/"> <input type="button" value="Back"/></a>



</form:form>


</body>
</html>