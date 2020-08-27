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
					<a href="user-form.htm"><button type="button"
							class="btn btn-primary"
							style="border-radius: 0px !important; background-color: #4a274f;">Add
							User</button></a>
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
									<th>Name</th>
									<th>Email</th>
									<th>Phone</th>
									<th>Role</th>
									<th>City</th>
									<th>Branch</th>
									<th>Pincode</th>
									<th class="text-center">Action</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${users}" var="user">
									<tr>
										<td style="text-align: center;">${user.first_name} ${user.last_name}</td>
										<td style="text-align: center;">${user.email}</td>
										<td style="text-align: center;">${user.mob}</td>
										<td style="text-align: center;">${user.role}</td>
										<td style="text-align: center;">${user.address.city.name}</td>
										<td style="text-align: center;">${user.address.pincode}</td>
										<td style="text-align: center;">${user.branch.name}</td>
										<td class="text-center">
											<div class="dropdown dropdown-action">
												<a href="user-details.htm?id=${user.id}"
													class="ms-btn-icon-outline btn-pill btn-primary"
													style="color: #090696; border-color: #090696; border-radius: 25px; background-color: transparent; border: 1px solid;">
													<i class="fa fa-edit"></i>
												</a>
												<a href="delete-user.htm?id=${user.id}"
													class="ms-btn-icon-outline btn-pill btn-primary"
													style="color: #090696; border-color: #090696; border-radius: 25px; background-color: transparent; border: 1px solid;">
													<i class="fa fa-trash"></i>
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