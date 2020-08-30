
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
					<button type="button" class="btn btn-primary"
						style="border-radius: 0px !important; background-color: #4a274f;">Trainer </button>

				</div>
			</div>

		</div>

		<div class="row">
			<div class="col-xl-12 col-md-12">
				<div class="ms-panel ms-panel-fh"
					style="border-bottom: 3px solid #f99d09; border-top: 3px solid #f99d09;">
					<div class="ms-panel-header"
						style="position: relative; padding: 0.7rem; border-bottom: 1px solid rgba(0, 0, 0, 0.1); color: #090696;">
						<h6 style="font-weight: bold;">Trainer Create Form</h6>
					</div>
					<div class="ms-panel-body"
						style="position: relative; padding: 1.5rem;">
						<form class="needs-validation clearfix" novalidate
							action="saveTrainer.htm" method="post">
							<div class="form-row">
								<div class="col-md-6 mb-3">
									<label for="validationCustom22">First Name</label>
									<div class="input-group">
										<input type='text' class="form-control" name="first_name"
											id="first_name" />
										<div class="invalid-feedback">First Name</div>
									</div>
								</div>
								<div class="col-md-6 mb-3">
									<label for="validationCustom22">Last Name</label>
									<div class="input-group">
										<input type='text' class="form-control" name="last_name"
											id="last_name" />
										<div class="invalid-feedback">Last Name</div>
									</div>
								</div>
							</div>
							<div class="form-row">
								<div clasemails="col-md-6 mb-3">
									<label for="validationCustom22">Email</label>
									<div class="input-group">
										<input type='text' class="form-control" name="email"
											id="email" />
										<div class="invalid-feedback">Email</div>
									</div>
								</div>
								<div class="col-md-6 mb-3">
									<label for="validationCustom22">Password</label>
									<div class="input-group">
										<input type="password" class="form-control" name="password"
											id="password" />
										<div class="invalid-feedback">Last Name</div>
									</div>
								</div>
							</div>
							
							<div class="form-row">
								<div class="col-md-6 mb-3">
									<label for="validationCustom22">Mob.</label>
									<div class="input-group">
										<input type='text' class="form-control" name="mob"
											id="mob" />
										<div class="invalid-feedback">Mob.</div>
									</div>
								</div>
								<div class="col-md-6 mb-3">
									<label for="validationCustom22">Address 1</label>
									<div class="input-group">
										<input type='text' class="form-control" name="address_line1"
											id="address_line1" />
										<div class="invalid-feedback">Address 1</div>
									</div>
								</div>
							</div>
							
							<div class="form-row">
								<div class="col-md-6 mb-3">
									<label for="validationCustom22">Address 2</label>
									<div class="input-group">
										<input type='text' class="form-control" name="address_line2"
											id="address_line2" />
										<div class="invalid-feedback">Address 2</div>
									</div>
								</div>
								<div class="col-md-6 mb-3">
									<label for="validationCustom22">Pincode</label>
									<div class="input-group">
										<input type='text' class="form-control" name="pincode"
											id="pincode" />
										<div class="invalid-feedback">Pincode</div>
									</div>
								</div>
							</div>
							
							<div class="form-row">
								<div class="col-md-6 mb-3">
									<label for="validationCustom22">City</label>
									<div class="input-group">
										<select class="form-control" name="city" id="city">
											<c:forEach items="${cities}" var="city">
												<option value="${city.id}">${city.name} - ${city.code}</option>
											</c:forEach>
										</select>
										
									</div>
								</div>
								
							</div>
							
							
							<div class="new" style="display: inline-flex;">
								<div class="col-md-1 mb-3">
									<div class="input-group">
										<a href="trainerList.htm"><button
												class="btn btn-secondary d-block" type="button"
												style="min-width: 118px; background-color: #960613;">Back</button></a>
									</div>
								</div>
								<div class="col-md-1 mb-3">
									<div class="input-group">
										<a href="#"><button class="btn btn-secondary d-block"
												type="submit"
												style="min-width: 118px; background-color: #090696;">Save</button>
										</a>
									</div>
								</div>
								<div class="col-md-1 mb-3">
									<div class="input-group">
										<a href="#"><button class="btn btn-primary d-block"
												type="reset" style="min-width: 118px;">Reset</button></a>
									</div>
								</div>


							</div>
						</form>

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