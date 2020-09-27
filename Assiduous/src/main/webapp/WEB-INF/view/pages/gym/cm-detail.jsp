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
						style="border-radius: 0px !important; background-color: #090696;">Course
						Mapping Form</button>

				</div>
			</div>

		</div>

		<div class="row">
			<div class="col-xl-12 col-md-12">
				<div class="ms-panel ms-panel-fh"
					style="border-bottom: 3px solid #f99d09; border-top: 3px solid #f99d09;">
					<div class="ms-panel-header"
						style="position: relative; padding: 0.7rem; border-bottom: 1px solid rgba(0, 0, 0, 0.1); color: #090696;">
						<h6 style="font-weight: bold;">Course Mapping Form</h6>
					</div>
					<div class="ms-panel-body"
						style="position: relative; padding: 1.5rem;">
						<form:form action="update-cm.htm" method="post" commandName="cm"
							modelAttribute="cm" cssClass="needs-validation clearfix">
							<div class="form-row">
								<div class="col-md-3 mb-3">
									<label for="validationCustom22">Course Name</label>
									<div class="input-group">
										<form:hidden path="id" />
										<form:select path="courseDto.id" class="form-control"
											id="courseId">
											<option>Select Course</option>
											<c:forEach items="${courses}" var="course">
												<c:if test="${course.id eq cm.courseDto.id }">
													<option value="${course.id}" selected="selected">${course.name}-
														${course.code}</option>
												</c:if>
												<c:if test="${course.id ne cm.courseDto.id }">
													<option value="${course.id}">${course.name}-
														${course.code}</option>
												</c:if>
											</c:forEach>
										</form:select>
										<div class="invalid-feedback">Please bank name.</div>
									</div>
								</div>
								<div class="col-md-3 mb-3">
									<label for="validationCustom12">Branch Name *</label>
									<div class="input-group">
										<form:select path="branchDto.id" class="form-control"
											id="branchId">
											<option>Select Branch</option>
											<c:forEach items="${branches}" var="branch">
												<c:if test="${branch.id eq cm.branchDto.id }">
													<option value="${branch.id}" selected="selected">${branch.name}-
														${branch.code}</option>
												</c:if>
												<c:if test="${branch.id ne cm.branchDto.id }">
													<option value="${branch.id}">${branch.name}-
														${branch.code}</option>
												</c:if>
											</c:forEach>
										</form:select>
									</div>
								</div>
								<div class="col-md-3 mb-3">
									<label for="validationCustom24">Price*</label>
									<div class="input-group">
										<form:input class="form-control" path="price" id="price" />
										<div class="invalid-feedback">price</div>
									</div>
								</div>
								<div class="col-md-3 mb-3">
									<label for="validationCustom24">Duration*</label>
									<div class="input-group">
										<form:input class="form-control" path="duration" id="duration" />
										<div class="invalid-feedback">duration</div>
									</div>
								</div>
							</div>
							<div class="new" style="display: inline-flex;">
								<div class="col-md-1 mb-3">
									<div class="input-group">
										<a href="courseMapping.htm"><button
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
</script>