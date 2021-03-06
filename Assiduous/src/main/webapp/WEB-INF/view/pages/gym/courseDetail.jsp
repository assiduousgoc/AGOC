
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
						style="border-radius: 0px !important; background-color: #4a274f;">Course
						Schedule</button>

				</div>
			</div>

		</div>

		<div class="row">
			<div class="col-xl-12 col-md-12">
				<div class="ms-panel ms-panel-fh"
					style="border-bottom: 3px solid #f99d09; border-top: 3px solid #f99d09;">
					<div class="ms-panel-header"
						style="position: relative; padding: 0.7rem; border-bottom: 1px solid rgba(0, 0, 0, 0.1); color: #090696;">
						<h6 style="font-weight: bold;">Course Detail</h6>
					</div>
					<div class="ms-panel-body"
						style="position: relative; padding: 1.5rem;">
						<form class="needs-validation clearfix" novalidate
							action="update.htm" method="post" enctype="multipart/form-data">
							<div class="form-row">
								<div class="col-md-6 mb-3">
									<label for="validationCustom22">Course Name</label>
									<div class="input-group">
										<input type='text' class="form-control" name="coursename"
											id="coursename" value="${course.name}" />
										<div class="invalid-feedback">Please Enter Course.</div>
									</div>
								</div>

								<%-- <div class="col-md-6 mb-3">
									<label for="validationCustom24">Course Duration </label>
									<div class="input-group">
										<input type='text' class="form-control" name="courseDuration"
											id="courseDuration" value="${course.duration}" />
										<div class="invalid-feedback">Course Duration</div>
									</div>
								</div> 
								<div class="col-md-6 mb-3">
									<label for="validationCustom25">Course Price</label>
									<div class="input-group">
										<input type='number' class="form-control" name="coursePrice"
											id="coursePrice" value="${course.price}" />
										<div class="invalid-feedback">course Price</div>
									</div>
								</div>--%>
								<div class="col-md-6 mb-3">
									<label for="validationCustom12">Courses *</label>
									<div class="input-group">
										<input type="hidden" name="id" id="id" value="${course.id}">
										<input type="hidden" name="courseCode" id="courseCode" value="${course.code}">
										<input type="text" id="courseCode" name="courseCode"
											value="${course.code}" disabled="disabled">
									</div>
								</div>

								<div class="col-md-12 mb-3">
									<label for="validationCustom12">Description </label>
									<div class="input-group">
										<div class="input-group">
											<input type='text' class="summernote edi-css form-control"
												name="description" id="description"
												value="${course.description}" />
										</div>
									</div>
								</div>

							</div>
							<div class="new" style="display: inline-flex;">
								<div class="col-md-1 mb-3">
									<div class="input-group">
										<a href="courseList.htm"><button
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