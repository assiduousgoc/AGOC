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
						style="border-radius: 0px !important; background-color: #4a274f;">Branch</button>

				</div>
			</div>

		</div>


		<div class="row">
			<div class="col-xl-12 col-md-12">
				<div class="ms-panel ms-panel-fh"
					style="border-bottom: 3px solid #f99d09; border-top: 3px solid #f99d09;">
					<div class="ms-panel-header"
						style="position: relative; padding: 0.7rem; border-bottom: 1px solid rgba(0, 0, 0, 0.1); color: #090696;">
						<h6 style="font-weight: bold;">Branch Detail</h6>
					</div>
					<div class="ms-panel-body"
						style="position: relative; padding: 1.5rem;">
						<form:form action="update-branch.htm" method="post"
							commandName="branch" modelAttribute="branch"
							cssClass="needs-validation clearfix">
							<div class="form-row">
								<div class="col-md-6 mb-3">
									<label for="validationCustom22">Branch Code</label>
									<div class="input-group">
										<form:hidden path="id" />
										<form:hidden path="addressDto.id" />
										<form:input path="code" cssClass="form-control" />
										<div class="invalid-feedback">Enter Code.</div>
									</div>
								</div>

								<div class="col-md-6 mb-3">
									<label for="validationCustom24">Branch Name </label>
									<div class="input-group">
										<form:input path="name" cssClass="form-control" />
										<div class="invalid-feedback">Enter Name</div>
									</div>
								</div>
								
								<div class="col-md-6 mb-3">
									<label for="validationCustom24">Email </label>
									<div class="input-group">
										<form:input path="email" cssClass="form-control" />
										<div class="invalid-feedback">Email</div>
									</div>
								</div>
								<div class="col-md-6 mb-3">
									<label for="validationCustom24">Phone </label>
									<div class="input-group">
										<form:input path="phone" cssClass="form-control" />
										<div class="invalid-feedback">Phone</div>
									</div>
								</div>
								<div class="col-md-6 mb-3">
									<label for="validationCustom24">Address 1 </label>
									<div class="input-group">
										<form:input path="addressDto.line1" cssClass="form-control" />
										<div class="invalid-feedback">Address 1</div>
									</div>
								</div>
								<div class="col-md-6 mb-3">
									<label for="validationCustom24">Address 2 </label>
									<div class="input-group">
										<form:input path="addressDto.line2" cssClass="form-control" />
										<div class="invalid-feedback">Enter Name</div>
									</div>
								</div>
								<div class="col-md-6 mb-3">
									<label for="validationCustom24">Pincode </label>
									<div class="input-group">
										<form:input path="addressDto.pincode" cssClass="form-control" />
										<div class="invalid-feedback">Pincode</div>
									</div>
								</div>
								<div class="col-md-6 mb-3">
									<label for="validationCustom25">City</label>
									<div class="input-group">
										<form:select path="addressDto.cityDto.id" cssClass="form-control">
											<c:forEach items="${cities}" var="city">
												<c:if test="${city.id eq gym.addressDto.cityDto.id}">
													<option value="${city.id}" selected="selected">${city.name}</option>
												</c:if>
												<c:if test="${city.id ne gym.addressDto.cityDto.id}">
													<form:option value="${city.id}">${city.name}</form:option>
												</c:if>
											</c:forEach>
										</form:select>
									</div>
								</div>
								<div class="col-md-6 mb-3">
									<label for="validationCustom25">Gym</label>
									<div class="input-group">
										<form:select path="gymDto.id" cssClass="form-control">
											<c:forEach items="${gyms}" var="gym">
												<c:if test="${gym.id eq branch.gymDto.id}">
													<option value="${gym.id}" selected="selected">${gym.name}</option>
												</c:if>
												<c:if test="${gym.id ne branch.gymDto.id}">
													<form:option value="${gym.id}">${gym.name}</form:option>
												</c:if>
											</c:forEach>
										</form:select>
									</div>
								</div>
								<div class="col-md-6 mb-3">
									<label for="validationCustom25">Location</label>
									<div class="input-group">
										<form:select path="locDto.id" cssClass="form-control">
											<c:forEach items="${locations}" var="loc">
												<c:if test="${loc.id eq gym.locDto.id}">
													<option value="${loc.id}" selected="selected">${loc.name}</option>
												</c:if>
												<c:if test="${loc.id ne city.locDto.id}">
													<form:option value="${loc.id}">${loc.name}</form:option>
												</c:if>
											</c:forEach>
										</form:select>
									</div>
								</div>

							</div>
							<div class="new" style="display: inline-flex;">
								<div class="col-md-1 mb-3">
									<div class="input-group">
										<a href="branches.htm"><button
												class="btn btn-secondary d-block" type="button"
												style="min-width: 118px; background-color: #960613;">Back</button></a>
									</div>
								</div>
								<div class="col-md-1 mb-3">
									<div class="input-group">
										<a><button class="btn btn-secondary d-block" type="submit"
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
</script>