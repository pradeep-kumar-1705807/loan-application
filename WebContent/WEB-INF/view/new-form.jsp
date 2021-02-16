<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title style="align:center;">Submit Application</title>
<style>
.error{color:red}
</style>

</head>
<body bgcolor="powderblue">

<form:form action="processForm2" modelAttribute="loan">
<div class="page-wrapper bg-gra-02 p-t-130 p-b-100 font-poppins">
        <div class="wrapper wrapper--w680">
            <div class="card card-4">
                <div class="card-body">
                    <h2 class="title">Submit Your Application</h2>
                        <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                   <label class="label">first name<sup style="color: red;">*</sup></label>
                                    <form:input class="input--style-4" placeholder="" path="firstName" />
                                          <form:errors path="firstName" cssClass="error" /> 
                                </div>
                            </div>
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Middle name</label>
                                    <form:input class="input--style-4" placeholder="" path="midName" />
                                    <form:errors path="midName" cssClass="error" /> 
                                </div>
                            </div>
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Last name<sup style="color: red;">*</sup></label>
                                    <form:input class="input--style-4" placeholder="" path="lastName" />
                                     <form:errors path="lastName" cssClass="error" /> 
                                </div>
                            </div>
                        </div>
                        <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Date of birth <sup style="color: red;">*</sup></label>
                                    <form:input class="input--style-4 js-datepicker" type = "date" path="dob"/>
                                           <form:errors path="dob" cssClass="error" /> </div>
                                    </div>
                                </div>
                                <div class="input-group">
                            <label class="label">Marital Status <sup style="color: red;">*</sup></label>
                            <div class="rs-select2 js-select-simple select--no-search">
                                <form:select path="maritalStatus">
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
                                    <label class="label">SSN Number <sup style="color: red;">*</sup></label>
                                    <form:input class="input--style-4" placeholder="" path="ssnNumber"/>
                                           <form:errors path="ssnNumber" cssClass="error" />  </div>
                                    </div>
                                
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Loan Amount <sup style="color: red;">*</sup></label>
                                    <form:input class="input--style-4" placeholder="" path="loanAmt"/>
                                             <form:errors path="loanAmt" cssClass="error" />  </div>
                                    </div>
                                </div>
                                <div class="input-group">
                            <label class="label">Loan Purpose <sup style="color: red;">*</sup></label>
                            <div class="rs-select2 js-select-simple select--no-search">
                                <form:select path="loanPurpose">
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
                                    <label class="label">Description <sup style="color: red;">*</sup></label>
                                    <form:textarea class="input--style-5" path="desc" rows="7" cols="70"></form:textarea>
                                     </div>
                                    </div>
                                </div>
                               <h3 style="text-align:center;">Address</h3>
                               <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Address 1<sup style="color: red;">*</sup></label>
                                    <form:input class="input--style-4" placeholder="" path="addrOne" /> 
	                                     <form:errors path="addrOne" cssClass="error" />  </div>
                                    </div>
                               
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Address 2</label>
                                    <form:input class="input--style-4" placeholder="" path="addrTwo" />
                                             <form:errors path="addrTwo" cssClass="error" />  </div>
                                    </div>
                                </div>
                                <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">City<sup style="color: red;">*</sup></label>
                                    <form:input class="input--style-4" placeholder="" path="city"/>
                                             <form:errors path="city" cssClass="error" />  </div>
                                    </div>
                               
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">State<sup style="color: red;">*</sup></label>
                                    <form:input class="input--style-4" placeholder="" path="state"/>
                                             <form:errors path="state" cssClass="error" />  </div>
                                    </div>
                                </div>
                                <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Postal Code<sup style="color: red;">*</sup></label>
                                    <form:input class="input--style-4" placeholder="" path="postalcode"/>
                                             <form:errors path="postalcode" cssClass="error" />  </div>
                                    </div>
                                </div>
                               <h3 style="text-align:center;">Contact Information</h3>
                               <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Home Phone<sup style="color: red;">*</sup></label>
                                    <form:input class="input--style-4" placeholder="" path="homePhone" />
                                             <form:errors path="homePhone" cssClass="error" />  </div>
                                    </div>
                                
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Mobile Phone<sup style="color: red;">*</sup></label>
                                    <form:input class="input--style-4" placeholder="" path="mobile"/>
                                             <form:errors path="mobile" cssClass="error" />  </div>
                                    </div>
                                </div>
                                <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Office Phone</label>
                                    <form:input class="input--style-4" placeholder="" path="officePhone"/>
                                             <form:errors path="officePhone" cssClass="error" />  </div>
                                    </div>
                               
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Email<sup style="color: red;">*</sup></label>
                                    <form:input class="input--style-4" placeholder="" path="email"/>
                                             <form:errors path="email" cssClass="error" />  </div>
                                    </div>
                                </div>
                                <h3 style="text-align:center;">Employment Details</h3>
                               <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Employee Name<sup style="color: red;">*</sup></label>
                                    <form:input class="input--style-4" placeholder="Name" path="employeeName" />
                                             <form:errors path="employeeName" cssClass="error" />  </div>
                                    </div>
                              
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Annual Salary<sup style="color: red;">*</sup></label>
                                    <form:input class="input--style-4" placeholder="" path="annualSal"/>
                                             <form:errors path="annualSal" cssClass="error" />  </div>
                                    </div>
                                </div>
                                <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Address 1<sup style="color: red;">*</sup></label>
                                    <form:input class="input--style-4" placeholder="" path="employeeAddressOne" /> 
	                                     <form:errors path="employeeAddressOne" cssClass="error" />  </div>
                                    </div>
                                
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Address 2</label>
                                    <form:input class="input--style-4" placeholder="" path="employeeAddressTwo" />
                                             <form:errors path="employeeAddressTwo" cssClass="error" />  </div>
                                    </div>
                               
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">City<sup style="color: red;">*</sup></label>
                                    <form:input class="input--style-4" placeholder="" path="employeeCity"/>
                                             <form:errors path="employeeCity" cssClass="error" />  </div>
                                    </div>
                                
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">State<sup style="color: red;">*</sup></label>
                                    <form:input class="input--style-4" placeholder="" path="employeeState"/>
                                             <form:errors path="employeeState" cssClass="error" />  </div>
                                    </div>
                                </div>
                                <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Postal Code<sup style="color: red;">*</sup></label>
                                    <form:input class="input--style-4" placeholder="" path="employeePostalcode"/>
                                             <form:errors path="employeePostalcode" cssClass="error" />  </div>
                                    </div>
                                
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Desgination<sup style="color: red;">*</sup></label>
                                    <form:input class="input--style-4" placeholder="" path="designation"/>
                                            <form:errors path="designation" cssClass="error" />  </div>
                                    </div>
                                </div>
                                <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Experience Year<sup style="color: red;">*</sup></label>
                                    
                                    <form:input class="input--style-4" placeholder="" path="years" />
                                    <form:errors path="years" cssClass="error" /> 
                                       </div>
                                    </div>
                                    
                                    <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Month<sup style="color: red;">*</sup></label>
                                    
                                    <form:input class="input--style-4" placeholder="" path="months" />
                                    <form:errors path="months" cssClass="error" />   </div>
                                    </div>
                                
                                </div>
						<div class="row row-space">
							<div class="col-2">
								<div class="p-t-15">
									<input type="submit" class="btn btn--radius-2 btn--blue"
										value="Submit" />
									
								</div>

							</div>

							<div class="col-2">
								<div class="p-t-15">
									<a href="http://localhost:8080/loan-processing-system/" ><input type="button" class="btn btn--radius-2 btn--blue"
										value="Back" /></a>
									
								</div>

							</div>

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
