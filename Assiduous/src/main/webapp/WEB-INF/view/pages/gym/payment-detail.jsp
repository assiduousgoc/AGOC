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
						style="border-radius: 0px !important; background-color: #4a274f;">Payment</button>

				</div>
			</div>

		</div>


		<div class="row">
			<div class="col-xl-12 col-md-12">
				<div class="ms-panel ms-panel-fh"
					style="border-bottom: 3px solid #f99d09; border-top: 3px solid #f99d09;">
					<div class="ms-panel-header"
						style="position: relative; padding: 0.7rem; border-bottom: 1px solid rgba(0, 0, 0, 0.1); color: #090696;">
						<h6 style="font-weight: bold;">Payment Detail</h6>
					</div>
					<div class="ms-panel-body"
						style="position: relative; padding: 1.5rem;">
						<form:form commandName="payment" modelAttribute="payment"
							cssClass="needs-validation clearfix">
							<div class="form-row">
								<div class="col-md-6 mb-3">
									<label for="validationCustom22">Trainee Name</label>
									<div class="input-group">
										<form:hidden path="id" />
										<form:input path="traineeDto.name" cssClass="form-control" />
									</div>
								</div>

								<div class="col-md-6 mb-3">
									<label for="validationCustom24">Total Due </label>
									<div class="input-group">
										<form:input path="totalDue" cssClass="form-control" />
									</div>
								</div>

								<div class="col-md-6 mb-3">
									<label for="validationCustom24">Total Received </label>
									<div class="input-group">
										<form:input path="totalReceived" cssClass="form-control" />
									</div>
								</div>
								<div class="col-md-6 mb-3">
									<label for="validationCustom24">Next Due </label>
									<div class="input-group">
										<form:input path="nextDue" cssClass="form-control" />
									</div>
								</div>
								<div class="col-md-6 mb-3">
									<label for="validationCustom24">Due Date</label>
									<div class="input-group">
										<c:set var="due_date" value="${payment.due_date}" />
										<fmt:formatDate type="date" value="${due_date}" />
									</div>
								</div>
								<div class="col-md-6 mb-3">
									<label for="validationCustom24">Discount </label>
									<div class="input-group">
										<form:input path="discount" cssClass="form-control" />
									</div>
								</div>
								<div class="col-md-6 mb-3">
									<label for="validationCustom24">Branch </label>
									<div class="input-group">
										<form:input path="branchDto.name" cssClass="form-control" />
									</div>
								</div>

							</div>
							<div class="new" style="display: inline-flex;">
								<div class="col-md-1 mb-3">
									<div class="input-group">
										<a href="payments.htm"><button
												class="btn btn-secondary d-block" type="button"
												style="min-width: 118px; background-color: #960613;">Back</button></a>
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