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
						style="border-radius: 0px !important; background-color: #4a274f;">Trainee</button>

				</div>
			</div>

		</div>


		<div class="row">
			<div class="col-xl-12 col-md-12">
				<div class="ms-panel ms-panel-fh"
					style="border-bottom: 3px solid #f99d09; border-top: 3px solid #f99d09;">
					<div class="ms-panel-header"
						style="position: relative; padding: 0.7rem; border-bottom: 1px solid rgba(0, 0, 0, 0.1); color: #090696;">
						<h6 style="font-weight: bold;">Trainee Detail</h6>
					</div>
					<div class="ms-panel-body"
						style="position: relative; padding: 1.5rem;">
						<form:form action="update-trainee.htm" method="post"
							commandName="trainee" modelAttribute="trainee"
							cssClass="needs-validation clearfix">
							<div class="form-row">
								<div class="col-md-3 mb-3">
									<label for="validationCustom24">First Name </label>
									<div class="input-group">
										<form:hidden path="id" />
										<form:hidden path="addressDto.id" />
										<form:input path="firstName" cssClass="form-control" />
										<div class="invalid-feedback">Enter Name</div>
									</div>
								</div>
								<div class="col-md-3 mb-3">
									<label for="validationCustom24">Last Name </label>
									<div class="input-group">
										<form:input path="lastName" cssClass="form-control" />
										<div class="invalid-feedback">Enter Name</div>
									</div>
								</div>
								<div class="col-md-3 mb-3">
									<label for="validationCustom24">Email </label>
									<div class="input-group">
										<form:input path="email" cssClass="form-control" />
										<div class="invalid-feedback">Email</div>
									</div>
								</div>
								<div class="col-md-3 mb-3">
									<label for="validationCustom24">Mob. </label>
									<div class="input-group">
										<form:input path="mob" cssClass="form-control" />
										<div class="invalid-feedback">Mob.</div>
									</div>
								</div>
								<div class="col-md-3 mb-3">
									<label for="validationCustom24">Address 1 </label>
									<div class="input-group">
										<form:input path="addressDto.line1" cssClass="form-control" />
										<div class="invalid-feedback">Address 1</div>
									</div>
								</div>
								<div class="col-md-3 mb-3">
									<label for="validationCustom24">Address 2 </label>
									<div class="input-group">
										<form:input path="addressDto.line2" cssClass="form-control" />
										<div class="invalid-feedback">Enter Name</div>
									</div>
								</div>
								<div class="col-md-3 mb-3">
									<label for="validationCustom24">Pincode </label>
									<div class="input-group">
										<form:input path="addressDto.pincode" cssClass="form-control" />
										<div class="invalid-feedback">Pincode</div>
									</div>
								</div>
								<div class="col-md-3 mb-3">
									<label for="validationCustom24">DOJ </label>
									<div class="input-group">
										<form:input path="doj" value="${formatted_doj}"
											cssClass="form-control" />
										<div class="invalid-feedback">dd/MM/yyyy</div>
									</div>
								</div>
								<div class="col-md-3 mb-3">
									<label for="validationCustom24">Due Date </label>
									<div class="input-group">
										<form:input path="dueDate" value="${formatted_due}"
											cssClass="form-control" />
										<div class="invalid-feedback">dd/MM/yyyy</div>
									</div>
								</div>
								<div class="col-md-3 mb-3">
									<label for="validationCustom24">Discount </label>
									<div class="input-group">
										<form:input path="discount" cssClass="form-control" />
										<div class="invalid-feedback">Discount</div>
									</div>
								</div>
								<div class="col-md-3 mb-3">
									<label for="validationCustom25">City</label>
									<div class="input-group">
										<form:select path="addressDto.cityDto.id"
											cssClass="form-control">
											<c:forEach items="${cities}" var="city">
												<c:if test="${trainee.addressDto.cityDto.id eq  city.id}">
													<form:option value="${city.id}"
														cssStyle="selected:selected">${city.name}</form:option>
												</c:if>
												<c:if test="${trainee.addressDto.cityDto.id ne  city.id}">
													<form:option value="${city.id}">${city.name}</form:option>
												</c:if>
											</c:forEach>
										</form:select>
									</div>
								</div>
								<div class="col-md-3 mb-3">
									<label for="validationCustom25">Subs. Type</label>
									<div class="input-group">
										<form:select path="subscriptionType" cssClass="form-control">
											<c:if test="${trainee.subscriptionType ==  'M'}">
												<form:option value="M" cssStyle="selected:selected">Monthly</form:option>
												<form:option value="QTR">Quarterly</form:option>
												<form:option value="HY">Half Yearly</form:option>
												<form:option value="YR">Yearly</form:option>
											</c:if>
											<c:if test="${trainee.subscriptionType ==  'QTR'}">
												<form:option value="M">Monthly</form:option>
												<form:option value="QTR" cssStyle="selected:selected">Quarterly</form:option>
												<form:option value="HY">Half Yearly</form:option>
												<form:option value="YR">Yearly</form:option>
											</c:if>
											<c:if test="${trainee.subscriptionType ==  'HY'}">
												<form:option value="M">Monthly</form:option>
												<form:option value="QTR">Quarterly</form:option>
												<form:option value="HY" cssStyle="selected:selected">Half Yearly</form:option>
												<form:option value="YR">Yearly</form:option>
											</c:if>
											<c:if test="${trainee.subscriptionType ==  'YR'}">
												<form:option value="M">Monthly</form:option>
												<form:option value="QTR">Quarterly</form:option>
												<form:option value="HY">Half Yearly</form:option>
												<form:option value="YR" cssStyle="selected:selected">Yearly</form:option>
											</c:if>
										</form:select>
									</div>
								</div>
								<div class="col-md-3 mb-3">
									<label for="validationCustom25">Gender</label>
									<div class="input-group">
										<form:select path="gender" cssClass="form-control">
											<c:if test="${trainee.gender == 'M' }">
												<form:option value="M" cssStyle="selected:selected">Male</form:option>
												<form:option value="F">Female</form:option>
												<form:option value="T">Transgender</form:option>
												<form:option value="O">Other</form:option>
											</c:if>
											<c:if test="${trainee.gender == 'F' }">
												<form:option value="M">Male</form:option>
												<form:option value="F" cssStyle="selected:selected">Female</form:option>
												<form:option value="T">Transgender</form:option>
												<form:option value="O">Other</form:option>
											</c:if>
											<c:if test="${trainee.gender == 'T' }">
												<form:option value="M">Male</form:option>
												<form:option value="F">Female</form:option>
												<form:option value="T" cssStyle="selected:selected">Transgender</form:option>
												<form:option value="O">Other</form:option>
											</c:if>
											<c:if test="${trainee.gender == 'O' }">
												<form:option value="M">Male</form:option>
												<form:option value="F">Female</form:option>
												<form:option value="T">Transgender</form:option>
												<form:option value="O" cssStyle="selected:selected">Other</form:option>
											</c:if>
										</form:select>
									</div>
								</div>
								<div class="col-md-3 mb-3">
									<label for="validationCustom25">Branch</label>
									<div class="input-group">
										<form:select path="branchDto.id" cssClass="form-control">
											<c:forEach items="${branches}" var="branche">
												<c:if test="${trainee.branchDto.id eq branch.id }">
													<form:option value="${branche.id}"
														cssStyle="selected:selected">${branche.name}</form:option>
												</c:if>
												<c:if test="${trainee.branchDto.id ne branch.id }">
													<form:option value="${branche.id}">${branche.name}</form:option>
												</c:if>
											</c:forEach>
										</form:select>
									</div>
								</div>
								<div class="col-md-6 mb-3">
									<label for="validationCustom25">Courses</label>
									<div class="input-group">
										<form:select path="cs" cssClass="form-control" multiple="true">
											<c:forEach items="${courses}" var="course">
												<c:forEach items="${trainee.coursesDto}" var="c">
													<c:if test="${c.id == course.id}">
														<c:set value="true" var="flg">
														</c:set>
													</c:if>
												</c:forEach>
												<c:if test="${flg}">
													<form:option value="${course.id}"
														cssStyle="selected:selected">${course.name}</form:option>
												</c:if>
												<c:if test="${!flg}">
													<form:option value="${course.id}">${course.name}</form:option>
												</c:if>
											</c:forEach>
										</form:select>
									</div>
								</div>

								<div class="new" style="display: inline-flex;">
									<div class="col-md-1 mb-3">
										<div class="input-group">
											<a href="trainees.htm"><button
													class="btn btn-secondary d-block" type="button"
													style="min-width: 118px; background-color: #960613;">Back</button></a>
										</div>
									</div>
									<div class="col-md-1 mb-3">
										<div class="input-group">
											<a><button class="btn btn-secondary d-block"
													type="submit"
													style="min-width: 118px; background-color: #090696;">Save</button>
											</a>
										</div>
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