<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
						<form:form action="update-bank.htm" method="post"
							commandName="bank" modelAttribute="bank"
							cssClass="needs-validation clearfix">
							<div class="form-row">
								<div class="col-md-4 mb-3">
									<label for="validationCustom22">Bank Name</label>
									<div class="input-group">
										<form:hidden path="id" id="id" />
										<form:hidden path="gymDto.id" id="gym-id" />
										<form:hidden path="addressDto.id" id="addid" />
										<form:input path="bankName" id="bankName"
											cssClass="form-control" />
										<div class="invalid-feedback">Please bank name.</div>
									</div>
								</div>
								<div class="col-md-4 mb-3">
									<label for="validationCustom12">Branch Name *</label>
									<div class="input-group">
										<form:input path="branchName" id="branchName"
											cssClass="form-control" />
									</div>
								</div>
								<div class="col-md-4 mb-3">
									<label for="validationCustom24">Account No.*</label>
									<div class="input-group">
										<form:input path="accountNo" id="accountNo"
											cssClass="form-control" />
										<div class="invalid-feedback">AccNo</div>
									</div>
								</div>
								<div class="col-md-4 mb-3">
									<label for="validationCustom24">IFSC Code.*</label>
									<div class="input-group">
										<form:input path="ifscCode" id="ifscCode"
											cssClass="form-control"
											onblur="matchfun('ifsc','[A-Z]{3,4}[0-9]{5,7}');"
											onchange="changecolor('ifsc');" />
										<div class="invalid-feedback">AccNo</div>
									</div>
								</div>
								<div class="col-md-4 mb-3">
									<label for="validationCustom12">A/C Type *</label>
									<div class="input-group">
										<form:select path="accountType" id="accountType"
											class="select select2-hidden-accessible" tabindex="-1">
											<option value="CR">CR</option>
											<option value="DR">DR</option>
										</form:select>
									</div>
								</div>
								<div class="col-md-4 mb-3">
									<label for="validationCustom24">PAN Number.</label>
									<div class="input-group">
										<form:input path="panNo" id="panNo" cssClass="form-control"
											onblur="matchfun('panNo','[A-Z]{5}[0-9]{4}[A-Z]{1}');"
											onchange="changecolor('panNo');" />

										<div class="invalid-feedback">panNo</div>
									</div>
								</div>
								<div class="col-md-4 mb-3">
									<label for="validationCustom24">TAN Number.</label>
									<div class="input-group">
										<form:input path="tanNo" id="tanNo" cssClass="form-control"
											onblur="matchfun('tanNo','[A-Z]{4}[0-9]{5}[A-Z]{1}');"
											onchange="changecolor('tanNo');" />
										<div class="invalid-feedback">tanNo</div>
									</div>
								</div>
								<div class="col-md-4 mb-3">
									<label for="validationCustom24">Address 1.</label>
									<div class="input-group">
										<form:input path="addressDto.line1" id="line1"
											cssClass="form-control" />
										<div class="invalid-feedback">Address</div>
									</div>
								</div>
								<div class="col-md-4 mb-3">
									<label for="validationCustom24">Address 2.</label>
									<div class="input-group">
										<form:input path="addressDto.line2" id="line2"
											cssClass="form-control" />
										<div class="invalid-feedback">Address</div>
									</div>
								</div>
								<div class="col-md-4 mb-3">
									<label for="validationCustom24">City.</label>
									<div class="input-group">
										<form:select class="form-control" path="addressDto.cityDto.id"
											id="city">
											<option value="0">Select City</option>
											<c:forEach items="${city}" var="city">
												<c:if test="${city.id eq bank.addressDto.cityDto.id }">
													<option value="${city.id}" selected="selected">${city.name}-
														${city.code}</option>
												</c:if>
												<c:if test="${city.id ne bank.addressDto.cityDto.id }">
													<option value="${city.id}">${city.name}-
														${city.code}</option>
												</c:if>
											</c:forEach>
										</form:select>
									</div>
								</div>
								<div class="col-md-4 mb-3">
									<label for="validationCustom24">Pin Code.</label>
									<div class="input-group">
										<form:input path="addressDto.pincode" id="pincode"
											cssClass="form-control" />
										<div class="invalid-feedback">PinCode</div>
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



							</div>
						</form:form>

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