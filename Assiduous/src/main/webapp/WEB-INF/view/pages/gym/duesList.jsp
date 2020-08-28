<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="page-wrapper">
	<div class="content">
		<div class="row">
			<div class="col-lg-12">
				<div class="card-box" style="border-bottom: 3px solid darkorange;">
					<a href="#"><button type="button"
							class="btn btn-primary"
							style="border-radius: 0px !important; background-color: #4a274f;">Due List</button></a>
				</div>
			</div>

		</div>

		<div class="row">
			<div class="col-lg-12">
				<div class="card-box" style="border-bottom: 3px solid darkorange;">
					<div class="table-responsive">
						<table id="example"
							class="table table-striped table-bordered dt-responsive nowrap"
							cellspacing="0" width="100%">
							<thead
								style="background-color: #4a274f; color: cornsilk; font-family: auto; text-align: center;">
								<tr>
									<th>Trainee Name</th>
									<th>Email</th>
									<th>Mob No.</th>
									<th>Payment</th>
									<th>Due Date</th>
									<th>Discount</th>
									<th>Total Pay</th>
									<th class="text-center">Payment</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${dues}" var="dues">
									<tr>
										<td style="text-align: center;">${dues.trainee.name}</td>
										<td style="text-align: center;">${dues.email}</td>
										<td style="text-align: center;">${dues.mob}</td>
										<td style="text-align: center;">${dues.payment}</td>
										<td style="text-align: center;"><%-- <c:set var="due_date"
												value="${dues.due_date}" /> <fmt:formatDate type="date"
												value="${due_date}" /> --%>${due_date}</td>
										<td style="text-align: center;">${dues.discount}</td>
										<td style="text-align: center;">${dues.total_pay}</td>
										<td class="text-center">
											<div class="dropdown dropdown-action">
												<a href="payment.htm?id=${dues.id}"
													class="ms-btn-icon-outline btn-pill">
													<i class="fa fa-sign-in"></i>
												</a> 
											</div>
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<script type="text/javascript"
	src="<c:url value='/static/hospital/assets/js/jquery-3.2.1.min.js'/>"></script>

<script type="text/javascript">
	$(document).ready(function() {
		$('#example').DataTable();
	});
</script>