<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title style="align:center;">Submit Application</title>
<style>
.header{
text-align:center;
}
</style>

</head>
<body bgcolor="powderblue">
<div class="header">
<h1>View Application</h1>

<h3>Score: ${loanApplicant.score} </h3>
<h3>Status: ${loanApplicant.status} </h3>
<h3>${loanApplicant.declineReason} </h3>
</div>
<form:form action="processForm2" modelAttribute="loanApplicant" method="POST">
<div class="page-wrapper bg-gra-02 p-t-130 p-b-100 font-poppins">
        <div class="wrapper wrapper--w680">
            <div class="card card-4">
                <div class="card-body">
                    <h2 class="title">Submit Your Application</h2>
                        <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                   <label class="label">first name</label>
                                    <form:input class="input--style-4" placeholder="First Name" path="firstName" readonly="true" />
                                          <form:errors path="firstName" cssClass="error" /> 
                                </div>
                            </div>
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Middle name</label>
                                    <form:input class="input--style-4" placeholder="Middle Name" path="midName" readonly="true" />
                                    <form:errors path="midName" cssClass="error" /> 
                                </div>
                            </div>
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Last name</label>
                                    <form:input class="input--style-4" placeholder="Last Name" path="lastName" readonly="true"/>
                                     <form:errors path="lastName" cssClass="error" /> 
                                </div>
                            </div>
                        </div>
                        <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Date of birth</label>
                                    <form:input class="input--style-4 js-datepicker" type = "date" path="dob" readonly="true"/>
                                           <form:errors path="dob" cssClass="error" /> </div>
                                    </div>
                                </div>
                                <div class="input-group">
                            <label class="label">Marital Status</label>
                            <div class="rs-select2 js-select-simple select--no-search">
                                <form:select path="maritalStatus" disabled="true">
                                  <form:option value="Single" label="Single" />
                                   <form:option value="Married" label="Married"/>
                                  <form:option value="Separated" label="Separated"/>
                                  <form:option value="Divorced" label="Divorced"/>
                                    <form:option value="Widowed" label="Widowed"/>
                                            </form:select>
                                     <form:errors path="maritalStatus" cssClass="error" />
                                <div class="select-dropdown"></div>
                            </div>
                        </div>
                    
                                 <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">SSN Number</label>
                                    <form:input class="input--style-4" placeholder="SSN Number" path="ssnNumber" readonly="true"/>
                                           <form:errors path="ssnNumber" cssClass="error" />  </div>
                                    </div>
                                </div>
                         
                                <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Loan Amount</label>
                                    <form:input class="input--style-4" placeholder="Loan Amount" path="loanAmt" readonly="true"/>
                                             <form:errors path="loanAmt" cssClass="error" />  </div>
                                    </div>
                                </div>
                                <div class="input-group">
                            <label class="label">Loan Purpose</label>
                            <div class="rs-select2 js-select-simple select--no-search">
                                <form:select path="loanPurpose" disabled="true">
                                  <form:option value="Debt" label="Debt"/>
                                   <form:option value="Education Loan" label="Education Loan"/>
                                     <form:option value="Personal Loan" label="Personal Loan"/>
                                    <form:option value="Home Loan" label="Home Loan"/>
                                           </form:select>
                                    <form:errors path="loanPurpose" cssClass="error" /> 
                                <div class="select-dropdown"></div>
                            </div>
                        </div>
                        <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Description</label>
                                    <form:textarea path="desc" rows="7" cols="70"></form:textarea>
                                     </div>
                                    </div>
                                </div>
                               <h3 style="text-align:center;">Address</h3>
                               <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Address 1</label>
                                    <form:input class="input--style-4" placeholder="Address Line 1" path="addrOne" readonly="true"/> 
	                                     <form:errors path="addrOne" cssClass="error" />  </div>
                                    </div>
                                </div>
                                <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Address 2</label>
                                    <form:input class="input--style-4" placeholder="Address Line 2" path="addrTwo" readonly="true"/>
                                             <form:errors path="addrTwo" cssClass="error" />  </div>
                                    </div>
                                </div>
                                <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">City</label>
                                    <form:input class="input--style-4" placeholder="City" path="city" readonly="true"/>
                                             <form:errors path="city" cssClass="error" />  </div>
                                    </div>
                                </div>
                                <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">State</label>
                                    <form:input class="input--style-4" placeholder="State" path="state" readonly="true"/>
                                             <form:errors path="state" cssClass="error" />  </div>
                                    </div>
                                </div>
                                <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Postal Code</label>
                                    <form:input class="input--style-4" placeholder="Postal Code" path="postalcode" readonly="true"/>
                                             <form:errors path="postalcode" cssClass="error" />  </div>
                                    </div>
                                </div>
                               <h3 style="text-align:center;">Contact Information</h3>
                               <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Home Phone</label>
                                    <form:input class="input--style-4" placeholder="1234567" path="homePhone" readonly="true"/>
                                             <form:errors path="homePhone" cssClass="error" />  </div>
                                    </div>
                                </div>
                                <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Mobile Phone</label>
                                    <form:input class="input--style-4" placeholder="1234567" path="mobile" readonly="true"/>
                                             <form:errors path="mobile" cssClass="error" />  </div>
                                    </div>
                                </div>
                                <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Office Phone</label>
                                    <form:input class="input--style-4" placeholder="1234567" path="officePhone" readonly="true"/>
                                             <form:errors path="officePhone" cssClass="error" />  </div>
                                    </div>
                                </div>
                                <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Email</label>
                                    <form:input class="input--style-4" placeholder="test@test.com" path="email" readonly="true"/>
                                             <form:errors path="email" cssClass="error" />  </div>
                                    </div>
                                </div>
                                <h3 style="text-align:center;">Employment Details</h3>
                               <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Employee Name</label>
                                    <form:input class="input--style-4" placeholder="Name" path="employeeName" readonly="true"/>
                                             <form:errors path="employeeName" cssClass="error" />  </div>
                                    </div>
                                </div>
                                <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Annual Salary</label>
                                    <form:input class="input--style-4" placeholder="1234567" path="annualSal" readonly="true"/>
                                             <form:errors path="annualSal" cssClass="error" />  </div>
                                    </div>
                                </div>
                                <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Address 1</label>
                                    <form:input class="input--style-4" placeholder="Address Line 1" path="employeeAddressOne" readonly="true"/> 
	                                     <form:errors path="employeeAddressOne" cssClass="error" />  </div>
                                    </div>
                                </div>
                                <div class="row row-space"> 
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Address 2</label>
                                    <form:input class="input--style-4" placeholder="Address Line 2" path="employeeAddressTwo" readonly="true"/>
                                             <form:errors path="employeeAddressTwo" cssClass="error" />  </div>
                                    </div>
                               </div>
                                <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">City</label>
                                    <form:input class="input--style-4" placeholder="City" path="employeeCity" readonly="true"/>
                                             <form:errors path="employeeCity" cssClass="error" />  </div>
                                    </div>
                                </div>
                                <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">State</label>
                                    <form:input class="input--style-4" placeholder="State" path="employeeState" readonly="true"/>
                                             <form:errors path="employeeState" cssClass="error" />  </div>
                                    </div>
                                </div>
                                <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Postal Code</label>
                                    <form:input class="input--style-4" placeholder="Postal Code" path="employeePostalcode" readonly="true"/>
                                             <form:errors path="employeePostalcode" cssClass="error" />  </div>
                                    </div>
                                </div>
                                <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Desgination</label>
                                    <form:input class="input--style-4" placeholder="Designation" path="designation" readonly="true"/>
                                            <form:errors path="designation" cssClass="error" />  </div>
                                    </div>
                                </div>
                                <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Experience Year</label>
                                    
                                    <form:input class="input--style-4" placeholder="Years" path="years" readonly="true"/>
                                    <form:errors path="years" cssClass="error" /> 
                                       </div>
                                    </div>
                                    
                                    <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Month</label>
                                    
                                    <form:input class="input--style-4" placeholder="Months" path="months" readonly="true"/>
                                    <form:errors path="months" cssClass="error" />   </div>
                                    </div>
                                
                                </div>
         
    
                        <div class="p-t-15">
                        <a href="view"> <input class="btn btn--radius-2 btn--blue" type="button" value="Back"/></a> <br> <br> <br>
                        <input type="button" class="btn btn--radius-2 btn--blue" value="Print" onclick="window.print()"/>
                           
                        </div>
                        </div>
                    
                </div>
            </div>
        </div>
    </div>

    <!-- Jquery JS-->
    <script src="<c:url value="/resources/vendor/jquery/jquery.min.js" />"></script>
    <script src="<c:url value="/resources/vendor/select2/select2.min.js" />"></script>
    <script src="<c:url value="/resources/vendor/datepicker/moment.min.js" />"></script>
    <script src="<c:url value="/resources/vendor/datepicker/daterangepicker.js" />"></script>
    <script src="<c:url value="/resources/js/global.js" />"></script>
</form:form>
</div>
</body>
<link href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
<link href="<c:url value="/resources/vendor/select2/select2.min.css" />" rel="stylesheet">
<link href="<c:url value="/resources/vendor/mdi-font/css/material-design-iconic-font.min.css" />" rel="stylesheet" media="all">
<link href="<c:url value="/resources/vendor/datepicker/daterangepicker.css" />" rel="stylesheet">
<%-- <script src="<c:url value="/resources/js/jquery.1.10.2.min.js" />"></script>
<script src="<c:url value="/resources/js/global.js" />"></script> --%>
</html>
