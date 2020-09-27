
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
						style="border-radius: 0px !important; background-color: #090696;">Bank
						Form</button>

				</div>
			</div>

		</div>

		<div class="row">
			<div class="col-xl-12 col-md-12">
				<div class="ms-panel ms-panel-fh"
					style="border-bottom: 3px solid #f99d09; border-top: 3px solid #f99d09;">
					<div class="ms-panel-header"
						style="position: relative; padding: 0.7rem; border-bottom: 1px solid rgba(0, 0, 0, 0.1); color: #090696;">
						<h6 style="font-weight: bold;">Bank Form</h6>
					</div>
					<div class="ms-panel-body"
						style="position: relative; padding: 1.5rem;">
						<form class="needs-validation clearfix" novalidate method="post"
							action="saveBank.htm">
							<div class="form-row">
								<div class="col-md-4 mb-3">
									<label for="validationCustom22">Bank Name</label>
									<div class="input-group">
										<input type='text' class="form-control" name="name" id="name" />
										<div class="invalid-feedback">Please bank name.</div>
									</div>
								</div>
								<div class="col-md-4 mb-3">
									<label for="validationCustom12">Branch Name *</label>
									<div class="input-group">
										<input type='text' class="form-control" name="branchName"
											id="branchName" />

									</div>
								</div>
								<div class="col-md-4 mb-3">
									<label for="validationCustom24">Account No.*</label>
									<div class="input-group">
										<input type='text' class="form-control" name="AccNo"
											id="AccNo" />
										<div class="invalid-feedback">AccNo</div>
									</div>
								</div>
								<div class="col-md-4 mb-3">
									<label for="validationCustom24">IFSC Code.*</label>
									<div class="input-group">
										<input type='text' class="form-control" name="ifsc" id="ifsc"
											onblur="matchfun('ifsc','[A-Z]{3,4}[0-9]{5,7}');"
											onchange="changecolor('ifsc');" />
										<div class="invalid-feedback">AccNo</div>
									</div>
								</div>
								<div class="col-md-4 mb-3">
									<label for="validationCustom12">A/C Type *</label>
									<div class="input-group">
										<select class="select select2-hidden-accessible" tabindex="-1"
											name="accType" aria-hidden="true" id="accType">
											<option>Select</option>
											<option value="CR">CR</option>
											<option value="DR">DR</option>
										</select>
									</div>
								</div>
								<div class="col-md-4 mb-3">
									<label for="validationCustom24">PAN Number.</label>
									<div class="input-group">
										<input type='text' class="form-control" name="panNo"
											id="panNo"
											onblur="matchfun('panNo','[A-Z]{5}[0-9]{4}[A-Z]{1}');"
											onchange="changecolor('panNo');" />
										<div class="invalid-feedback">panNo</div>
									</div>
								</div>
								<div class="col-md-4 mb-3">
									<label for="validationCustom24">TAN Number.</label>
									<div class="input-group">
										<input type='text' class="form-control" name="tanNo"
											id="tanNo"
											onblur="matchfun('tanNo','[A-Z]{4}[0-9]{5}[A-Z]{1}');"
											onchange="changecolor('tanNo');" />
										<div class="invalid-feedback">tanNo</div>
									</div>
								</div>
								<div class="col-md-4 mb-3">
									<label for="validationCustom24">Address 1.</label>
									<div class="input-group">
										<input type='text' class="form-control" name="address"
											id="address" />
										<div class="invalid-feedback">Address</div>
									</div>
								</div>
								<div class="col-md-4 mb-3">
									<label for="validationCustom24">City.</label>
									<div class="input-group">
										<select class="form-control" name="city" id="city">
											<option value="0">Select City</option>
											<c:forEach items="${city}" var="city">
												<option value="${city.id}">${city.name}-
													${city.code}</option>
											</c:forEach>
										</select>
									</div>
								</div>
								<div class="col-md-4 mb-3">
									<label for="validationCustom24">Pin Code.</label>
									<div class="input-group">
										<input type='text' class="form-control" name="pincode"
											id="pincode" />
										<div class="invalid-feedback">PinCode</div>
									</div>
								</div>

								<div class="col-md-8 mb-3">
									<label for="validationCustom12">Description </label>
									<div class="input-group">
										<div class="input-group">
											<textarea class="summernote edi-css form-control"
												name="description" id="description"
												style="max-height: 39px;"></textarea>
										</div>
									</div>
								</div>

							</div>
							<div class="new" style="display: inline-flex;">
								<div class="col-md-1 mb-3">
									<div class="input-group">
										<a href="bank.htm"><button
												class="btn btn-secondary d-block" type="button"
												style="min-width: 118px; background-color: #960613;">Back</button></a>
									</div>
								</div>
								<div class="col-md-1 mb-3">
									<div class="input-group">
										<a href="menuList.htm"><button
												class="btn btn-secondary d-block" type="submit"
												style="min-width: 118px; background-color: #090696;">Save</button>
										</a>
									</div>
								</div>
								<div class="col-md-1 mb-3">
									<div class="input-group">
										<a href="menuList.htm"><button
												class="btn btn-primary d-block" type="reset"
												style="min-width: 118px;">Reset</button></a>
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

	function matchfun(id, regex) {
		var str = document.getElementById(id).value;
		if (!str.match(regex)) {
			$("#" + id).css("background-color", "red");
			document.getElementById(id).focus();
			return;
		}
	}
	function changecolor(id) {
		var str = document.getElementById(id).value;
		if (str == 0) {
			$("#" + id).css("background-color", "white");
			return;
		}
	}
</script>