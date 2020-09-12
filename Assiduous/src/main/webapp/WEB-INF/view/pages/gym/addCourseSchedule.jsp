
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
						<h6 style="font-weight: bold;">Course Schedule Form</h6>
					</div>
					<div class="ms-panel-body"
						style="position: relative; padding: 1.5rem;">
						<form class="needs-validation clearfix" novalidate method="post" action="saveCourseSchedule.htm">
							<div class="form-row">
								<div class="col-md-4 mb-3">
									<label for="validationCustom22">Day</label>
									<div class="input-group">
										<select class="form-control" name="day" id="day">
											<option value="0">All Day</option>
											<option value="1">Monday</option>
											<option value="2">Tuesday</option>
											<option value="3">Wednesday</option>
											<option value="4">Thursday</option>
											<option value="5">Friday</option>
											<option value="6">Saturday</option>
											<option value="7">Sunday</option>
										</select>
										<div class="invalid-feedback">Please select days.
										</div>
									</div>
								</div>
								
								<div class="col-md-4 mb-3">
									<label for="validationCustom24">Code</label>
									<div class="input-group">
										<input type='text' class="form-control" name="code" id="code" />
										<div class="invalid-feedback">Code</div>
									</div>
								</div>

								<div class="col-md-4 mb-3">
									<label for="validationCustom24">From</label>
									<div class="input-group">
										<input type='text' class="form-control datetimepicker" name="from" id="from" />
										<div class="invalid-feedback">From</div>
									</div>
								</div>
								<div class="col-md-4 mb-3">
									<label for="validationCustom25">To</label>
									<div class="input-group">
										<input type='text' class="form-control datetimepicker" name="to" id="to" />
										<div class="invalid-feedback">To</div>
									</div>
								</div>
								<div class="col-md-4 mb-3">
									<label for="validationCustom12">Courses *</label>
									<div class="input-group">
										<select class="form-control" name="course" id="courses">
											<option value="0">Select Course</option>
											<c:forEach items="${courses}" var="course">
												<option value="${course.id}">${course.name}-
													${course.code}</option>
											</c:forEach>
										</select>
									</div>
								</div>
								<div class="col-md-4 mb-3">
									<label for="validationCustom12">Room *</label>
									<div class="input-group">
										<select class="form-control" name="room" id="room">
											<option value="0">Select Room</option>
											<c:forEach items="${rooms}" var="room">
												<option value="${room.id}">${room.name}-
													${room.code}</option>
											</c:forEach>
										</select>
									</div>
								</div>
								<div class="col-md-4 mb-3">
									<label for="validationCustom12">Trainers *</label>
									<div class="input-group">
										<select class="form-control" name="trainer" id="trainer">
											<option value="0">Select Trainer</option>
											<c:forEach items="${trainers}" var="trainer">
												<option value="${trainer.id}">${trainer.first_name}
													- ${trainer.last_name}</option>
											</c:forEach>
										</select>
									</div>
								</div>
								<div class="col-md-4 mb-3">
								<label for="validationCustom12">Status *</label>
									<div class="input-group">
										<select class="select select2-hidden-accessible" tabindex="-1" name="status" aria-hidden="true">
											<option>Select</option>
											<option value="1">Active</option>
											<option value="0">InActive</option>
										</select>
									</div>
                                </div>
								<div class="col-md-12 mb-3">
									<label for="validationCustom12">Description </label>
									<div class="input-group">
										<div class="input-group">
											<textarea class="summernote edi-css form-control"
												name="description" id="description"></textarea>
										</div>
									</div>
								</div>

							</div>
							<div class="new" style="display: inline-flex;">
								<div class="col-md-1 mb-3">
									<div class="input-group">
										<a href="courseSchedule.htm"><button
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
</script>