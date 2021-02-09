<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

     <div id="wrapper"> 
           <div id="header">
           <h1>ABC Bank Pvt Ltd</h1>
           <h2>Loan Applicant</h2>
           </div>
     </div>
     <div id="content">
        <div id="content">
          <table>
              <tr> 
                    <th>Application Id</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
              </tr>
              <c:forEach var="tempLoanApplicant" items="${loanApplicants}">
              <c:url var="updateLink" value="view-form">
              <c:param name="loanApplicationId" value="${tempLoanApplicant.applicationId}" />
              </c:url>
              
                   <tr> 
                    <th><a href="${updateLink}">${tempLoanApplicant.applicationId}</a></th>
                    <th>${tempLoanApplicant.firstName}</th>
                    <th>${tempLoanApplicant.lastName}</th>
                    <th>${tempLoanApplicant.email}</th>
              </tr>
              </c:forEach>
          </table>
        </div>
     </div>

</body>
</html>