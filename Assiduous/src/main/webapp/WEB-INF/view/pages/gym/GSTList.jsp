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
					<a href="addGST.htm"><button type="button"
							class="btn btn-primary"
							style="border-radius: 0px !important; background-color: #4a274f;">Add GST
							</button></a>
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
									<th>GST No</th>
									<th>Gym Name</th>
									<th>Gym Code </th>
									<th>Status</th>
									<th class="text-center">Action</th>
								</tr>
							</thead>
							<tbody>
								<%-- <c:forEach items="${gyms}" var="gym">
									<tr>
										<td style="text-align: center;">${gym.code}</td>
										<td style="text-align: center;">${gym.name}</td>
										<td style="text-align: center;">${gym.licence}</td>
										<td style="text-align: center;">${gym.email}</td>
										<td style="text-align: center;">${gym.phone}</td>
										<td style="text-align: center;">${gym.address.city.name}</td>
										<td style="text-align: center;">${gym.loc.name}</td>
										<td style="text-align: center;">${gym.address.pincode}</td>
										<td style="text-align: center;"><c:if test="${gym.active}">Active</c:if><c:if test="${!gym.active}">Inactive</c:if></td>
										<td class="text-center">
											<div class="dropdown dropdown-action">
												<a href="gym-details.htm?id=${gym.id}"
													class="ms-btn-icon-outline btn-pill btn-primary"
													style="color: #090696; border-color: #090696; border-radius: 25px; background-color: transparent; border: 1px solid;">
													<i class="fa fa-edit"></i>
												</a>
												<a href="delete-gym.htm?id=${gym.id}"
													class="ms-btn-icon-outline btn-pill btn-primary"
													style="color: #090696; border-color: #090696; border-radius: 25px; background-color: transparent; border: 1px solid;">
													<i class="fa fa-trash"></i>
												</a>
												<a href="active-gym.htm?id=${gym.id}"
													class="ms-btn-icon-outline btn-pill btn-primary"
													style="color: #4a274f; border-color: #4a274f; border-radius: 25px; background-color: transparent; border: 1px solid;">
													<i class="fa fa-eye"></i>
												</a>
												<a href="deactive-gym.htm?id=${gym.id}"
													class="ms-btn-icon-outline btn-pill btn-primary"
													style="color: #4a274f; border-color: #4a274f; border-radius: 25px; background-color: transparent; border: 1px solid;">
													<i class="fa fa-eye"></i>
												</a>
											</div>
										</td>
									</tr>
								</c:forEach> --%>
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