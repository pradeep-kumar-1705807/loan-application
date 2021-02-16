<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="<c:url value="/resources/css/table.css" />" rel="stylesheet"/>
<title>View Applicants</title>
<style>
#header {
	text-align: center;
}

/* table {
	border-collapse: collapse;
	border-spacing: 0;
	width: 100%;
	border: 1px solid #ddd;
}

th, td {
	border: 1px solid black;
	text-align: left;
	padding: 16px;
}

tr:nth-child(even) {
	background-color: #f2f2f2;
} */
</style>
</head>
<body>

	<div id="wrapper">
		<div id="header">
			<h1>ABC Bank Pvt Ltd</h1>
			<h2>Loan Applicant</h2>
		</div>
	</div>
	<!-- <form:form action="search" method="GET">
                Search Loan Applicant: <input type="text" name="theSearchName" />
                
                <input type="submit" value="Search" class="add-button" />
     </form:form>
     <br><br> -->



	<div style="overflow-x: auto;" id="content">
		<div id="content">
			<table class="styled-table">
			  <thead>
				<tr>
					<th>Application Id</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Status</th>
				</tr>
				</thead>
				<c:forEach var="tempLoanApplicant" items="${loanApplicants}">
					<c:url var="updateLink" value="view-form">
						<c:param name="loanApplicationId"
							value="${tempLoanApplicant.applicationId}" />
					</c:url>
					<tbody>
					<tr >
						<th><a href="${updateLink}">${tempLoanApplicant.applicationId}</a></th>
						<th>${tempLoanApplicant.firstName}</th>
						<th>${tempLoanApplicant.lastName}</th>
						<th>${tempLoanApplicant.email}</th>
						<th>${tempLoanApplicant.status}</th>
					</tr>
					</tbody>
				</c:forEach>
			</table>
		</div>
	</div>

</body>
</html>
