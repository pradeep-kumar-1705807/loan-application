<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Submit Application</title>
<style>
.error{color:red}
</style>
</head>
<body>

<h1>Submit New Application</h1>

<hr>

<form:form action="processForm2" modelAttribute="loan">
 	<label for="fn">First Name </label>
	<form:input placeholder="First Name" path="firstName" /> 
	<form:errors path="firstName" cssClass="error" /> <br>

	<!--  <label for="mn">Middle Name </label>
	<form:input placeholder="Middle Name" path="midName" /><br>
	
	<label for="ln">Last Name </label>
	<form:input placeholder="Last Name" path="lastName" /><br>
	
	<label for="birthday">Date of Birth </label>
	<form:input type = "date" path="dob"/><br>
	
	<label for="marriage">Marital Status </label>
	  <form:select path="maritalStatus">
	    <form:option value="Single" label="Single" />
	    <form:option value="Married" label="Married"/>
	    <form:option value="Separated" label="Separated"/>
	    <form:option value="Divorced" label="Divorced"/>
	    <form:option value="Widowed" label="Widowed"/>
	  </form:select><br>
	  
	 <label for="ssn">SSN Number </label>
	 <form:input placeholder="SSN Number" path="ssnNumber"/><br>
	 
	 <label for="lamt">Loan Amount</label>
	 <form:input placeholder="Loan Amount" path="loanAmt"/><br>
	 
	 <label for="lpurpose">Loan Purpose</label>
	  <form:select path="loanPurpose">
	  	<form:option value="Debt" label="Debt"/>
	    <form:option value="Education Loan" label="Education Loan"/>
	    <form:option value="Personal Loan" label="Personal Loan"/>
	    <form:option value="Home Loan" label="Home Loan"/>
	  </form:select><br>
	  
	 <label for="description">Description</label>
	 <form:textarea path="desc" rows="4" cols="50"></form:textarea><br>
	 
	 <label for="address">Address</label><br>
	 
	 <label for="addressline1">Address Line 1</label>
	 <form:input placeholder="Address Line 1" path="addrOne" /> <br>
	 
	 <label for="addressline2">Address Line 2</label>
	 <form:input placeholder="Address Line 2" path="addrTwo" /> <br>
	 
	 <label for="cty">City</label>
	 <form:input placeholder="City" path="city" /> <br>
	 
	 <label for="stt">State</label>
	 <form:input placeholder="State" path="state" /> <br>
	 
	 <label for="pcode">Postal Code</label>
	 <form:input placeholder="Postal Code" path="pincode" /> <br>
	 
	 <label for="contact">Contact Information</label><br>
	 
	 <label for="home">Home Phone</label>
	 <form:input placeholder="123456" path="homePhone" /> <br>
	 
	 <label for="office">Office Phone</label>
	 <form:input placeholder="123456" path="officePhone" /> <br>
	 
	 <label for="mobi">Mobile</label>
	 <form:input placeholder="123456" path="mobile" /> <br>
	 
	 <label for="mail">Email Address</label>
	 <form:input placeholder="test@test.com" path="email" /> <br>
	 
	 <label for="empdetails">Employment Details</label><br>
	 
	 <label for="ename">Employer Name</label>
	 <form:input placeholder="name" path="empName" /> <br>
	 
	 <label for="salary">Annual Salary</label>
	 <form:input placeholder="123456" path="annualSal" /> <br>
	 
	 <label for="empaddress">Address</label><br>
	 
	 <label for="eaddressline1">Address Line 1</label>
	 <form:input placeholder="Address Line 1" path="eAddrOne" /> <br>
	 
	 <label for="eaddressline2">Address Line 2</label>
	 <form:input placeholder="Address Line 2" path="eAddrTwo" /> <br>
	 
	 <label for="ecity">City</label>
	 <form:input placeholder="City" path="eCity" /> <br>
	 
	 <label for="estate">State</label>
	 <form:input placeholder="State" path="eState" /> <br>
	 
	 <label for="epincode">Postal Code</label>
	 <form:input placeholder="Postal Code" path="ePincode" /> <br>
	 
	 <label for="exp">Experience</label>
	 <form:input placeholder="Years" path="years" /> <form:input placeholder="Months" path="months" /> <br><br> -->
	<input type="submit" value="submit"/>



</form:form>

</body>
</html>