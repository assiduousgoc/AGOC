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
						style="border-radius: 0px !important; background-color: #090696;">Bank Form
						</button>

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
									<form:hidden path="id" />
									<form:input path="bankName" cssClass="form-control" />
									<div class="invalid-feedback">Please bank name.
										</div>
									</div>
								</div>
								<div class="col-md-4 mb-3">
									<label for="validationCustom12">Branch Name *</label>
									<div class="input-group">
									<form:input path="branchName"  cssClass="form-control" />
										<%-- <select class="form-control" name="branchName" id="branchName">
											<option value="0">Select Branch</option>
											<c:forEach items="${branches}" var="branch">
												<option value="${branch.id}">${branch.name}-
													${branch.code}</option>
											</c:forEach>
										</select> --%>
									</div>
								</div>
								<div class="col-md-4 mb-3">
									<label for="validationCustom24">Account No.*</label>
									<div class="input-group">
									<form:input path="accountNo"  cssClass="form-control" />
										<div class="invalid-feedback">AccNo</div>
									</div>
								</div>
								<div class="col-md-4 mb-3">
									<label for="validationCustom24">IFSC Code.*</label>
									<div class="input-group">
									<form:input path="ifscCode"  cssClass="form-control" />
										<div class="invalid-feedback">IFSC Code</div>
									</div>
								</div>
								<div class="col-md-4 mb-3">
								<label for="validationCustom12">A/C Type *</label>
									<div class="input-group">
									<form:select path="id" cssClass="form-control">
									<c:forEach items="${accountType}" var="type">
									<option value="${type}" selected="selected">${type}</option>
									</c:forEach>
										<%-- 	<option value="${accountType }" selected="selected">${accountType }</option> --%>
										</form:select>
									</div>
                                </div>
                                <div class="col-md-4 mb-3">
									<label for="validationCustom24">PAN Number.</label>
									<div class="input-group">
										<form:input path="panNo"  cssClass="form-control" />
										<div class="invalid-feedback">panNo</div>
									</div>
								</div>
								<div class="col-md-4 mb-3">
									<label for="validationCustom24">TAN Number.</label>
									<div class="input-group">
										<form:input path="tanNo"  cssClass="form-control" />
										<div class="invalid-feedback">tanNo</div>
									</div>
								</div>
								<div class="col-md-4 mb-3">
									<label for="validationCustom24">Address 1.</label>
									<div class="input-group">
										<form:input path="addressDto.line1"  cssClass="form-control" />
										<div class="invalid-feedback">Address</div>
									</div>
								</div>
								<div class="col-md-4 mb-3">
									<label for="validationCustom24">City.</label>
									<div class="input-group">
										<form:select path="addressDto.cityDto.id" cssClass="form-control">
										<c:forEach items="${address.city}" var="city">
												<c:if test="${address.id eq address.cityDto.id}">
													<option value="${address.city.id}" selected="selected">${address.city.name}</option>
												</c:if>
												<c:if test="${city.id ne address.cityDto.id}">
													<form:option value="${address.city.id}">${address.city.name}</form:option>
												</c:if>
											</c:forEach>
										
										
										<c:forEach items="${city}" var="city">
												<option value="${city.id}">${city.name}-
													${city.code}</option>
											</c:forEach>
										</form:select>
									</div>
								</div>
								<div class="col-md-4 mb-3">
									<label for="validationCustom24">Pin Code.</label>
									<div class="input-group">
										<form:input path="addressDto.pincode"  cssClass="form-control" />
										<div class="invalid-feedback">PinCode</div>
									</div>
								</div>
								<div class="col-md-4 mb-3">
									<label for="validationCustom12">Gym *</label>
									<div class="input-group">
										<select class="form-control" name="Gym" id="Gym">
											<option value="0">Select Gym</option>
											<c:forEach items="${gym}" var="gym">
												<option value="${gym.id}">${gym.name}-
													${gym.code}</option>
											</c:forEach>
										</select>
									</div>
								</div>
								
								<%-- <div class="col-md-4 mb-3">
									<label for="validationCustom12">Address *</label>
									<div class="input-group">
										<select class="form-control" name="address" id="address">
											<option value="0">Select Address</option>
											<c:forEach items="${gym}" var="gym">
												<option value="${gym.address.id}">${gym.address.address_line1}-
													${gym.address.city.name}-${gym.address.pincode}</option>
											</c:forEach>
										</select>
									</div>
								</div> --%>
								<div class="col-md-4 mb-3">
								<label for="validationCustom12">Status *</label>
									<div class="input-group">
										<select class="select select2-hidden-accessible" tabindex="-1" name="status" aria-hidden="true">
											<option>Select</option>
											<option value="1">Active</option>
											<option value="0">In Active</option>
										</select>
									</div>
                                </div>
								<div class="col-md-8 mb-3">
									<label for="validationCustom12">Description </label>
									<div class="input-group">
										<div class="input-group">
											<textarea class="summernote edi-css form-control"
												name="description" id="description" style="max-height: 39px;"></textarea>
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
</script>