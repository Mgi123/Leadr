
<%@page import="in.leadr.leadrapplication.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<html>
<head>
<title>User Dashboard</title>
<%@include file="./common/jsp/head.jsp"%>
</head>
<body>


	<%@include file="./common/jsp/sidebar.jsp"%>
	<div id="main">
		<%@include file="./common/jsp/navbar.jsp"%>
		<%@include file="./common/jsp/count-card.jsp"%>
		<div class="pe-2 ps-2">
			<p class="fs-2 text-white box-heading">Add New Lead</p>
		</div>
		<hr class="divide">
		<div class="main-container">
			<div class="p-2">
				<%
				try {
					String userMsg = (String) session.getAttribute("userMsg");
					if (userMsg != null) {
				%>
				<div class='alert alert-success alert-dismissible fade show'>
					<%=userMsg%>
				</div>
				<%
				session.removeAttribute("userMsg");
				}
				} catch (Exception e) {
				e.printStackTrace();
				}
				%>
			</div>
			<form action="addNewLead" method="post">
				<div class="row p-3">
					<div class="col-6 d-flex flex-column text-white">
						<label class="fs-5 mb-2 mt-3">Name</label> <input
							class="form-control" type="text" name="name"
							placeholder="Lead Name" required />
					</div>
					<div class="col-6 d-flex flex-column text-white">
						<label class="fs-5 mb-2 mt-3">Mobile </label> <input
							class="form-control" type="tel" name="mobile" maxlength="10"
							placeholder="Lead Mobile" required />
					</div>
					<div class="col-6 d-flex flex-column text-white">
						<label class="fs-5 mb-2 mt-3">Source </label> <input
							class="form-control" type="text" name="source"
							placeholder="Lead Source" required />
					</div>
					<div class="col-6 d-flex flex-column text-white">
						<label class="fs-5 mb-2 mt-3">Education </label> <input
							class="form-control" type="text" name="education"
							placeholder="Lead Education" required />
					</div>
					<div class="col-6 d-flex flex-column text-white">
						<label class="fs-5 mb-2 mt-3">Experience </label> <input
							class="form-control" type="text" name="experience"
							placeholder="Lead Experience" required />
					</div>
					<div class="col-6 d-flex flex-column text-white">
						<label class="fs-5 mb-2 mt-3">Salary in LPA</label> <input
							class="form-control" type="number" name="salary"
							placeholder="Lead Salary" required />
					</div>
					<div class="col-6 d-flex flex-column text-white">
						<label class="fs-5 mb-2 mt-3">Current Owner Email</label> <select
							class="form-control" name="currentOwner" required>
							<option selected disabled>--Select--</option>
							<%--		<%for(String x : lst1){%>
							<option><%=x %></option>
							<%}%> --%>
						</select>
					</div>
					<div class="col-6 d-flex flex-column text-white">
						<label class="fs-5 mb-2 mt-3">Status</label> <select
							class="form-control" name="status" required>
							<option selected disabled>--Select--</option>
							<option value="New">New</option>
							<option value="Not Interested">Not Interested</option>
							<option value="In Conversation">In Conversation</option>
							<option value="Follow Up">Follow Up</option>
							<option value="DNP">DNP</option>
							<option value="Not Working">Not Working</option>
							<option value="Not Reachable">Not Reachable</option>
							<option value="Mobile Switched Off">Mobile Switched Off</option>
							<option value="Already Enrolled">Already Enrolled</option>
						</select>
					</div>
					<div class="col-6 d-flex flex-column text-white">
						<label class="fs-5 mb-2 mt-3">Email </label> <input
							class="form-control" type="email" name="email"
							placeholder="Lead Email" required />
					</div>
					<div class="col-6 d-flex flex-column text-white">
						<label class="fs-5 mb-2 mt-3">Notes </label> <input
							class="form-control" type="text" name="address"
							placeholder="Lead Notes" required />
					</div>
					<div class="col-12 mt-4 w-100 d-flex justify-content-center">
						<button type="submit" class="submit-btn w-50 fw-bold pt-2 pb-2">Add
							Lead</button>
					</div>
				</div>
			</form>
		</div>
	</div>
	<%@include file="./common/jsp/footer.jsp"%>
</body>
</html>