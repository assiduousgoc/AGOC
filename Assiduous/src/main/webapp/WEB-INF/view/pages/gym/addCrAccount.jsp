
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
						style="border-radius: 0px !important; background-color: #090696;">Cr Account Form
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
						<h6 style="font-weight: bold;">Course Mapping Form</h6>
					</div>
					<div class="ms-panel-body"
						style="position: relative; padding: 1.5rem;">
						<form class="needs-validation clearfix" novalidate method="post" action="saveCrAccount.htm">
							<div class="form-row">
								<div class="col-md-3 mb-3">
									<label for="validationCustom22">A/C Name</label>
									<div class="input-group">
										<input type='text' class="form-control" name="accName" id="accName" />
										<div class="invalid-feedback">Please Account name.
										</div>
									</div>
								</div>
							
								<div class="col-md-3 mb-3">
									<label for="validationCustom24">Email*</label>
									<div class="input-group">
										<input type='text' class="form-control" name="crEmail" id="crEmail" />
										<div class="invalid-feedback">email</div>
									</div>
								</div>
								<div class="col-md-3 mb-3">
									<label for="validationCustom24">Mobile No*</label>
									<div class="input-group">
										<input type='text' class="form-control" name="crMNo" id="crMNo" />
										<div class="invalid-feedback">Mobile No</div>
									</div>
								</div>
								
								
								<div class="col-md-3 mb-3">
								<label for="validationCustom12">Status *</label>
									<div class="input-group">
										<select class="select select2-hidden-accessible" tabindex="-1" name="status" aria-hidden="true">
											<option>Select</option>
											<option value="1">Active</option>
											<option value="0">In Active</option>
										</select>
									</div>
                                </div>
								<div class="col-md-12 mb-3">
									<label for="validationCustom12">Description </label>
									<div class="input-group">
										<div class="input-group">
											<textarea class="summernote edi-css form-control"
												name="description" id="description" style="height: 39px;"></textarea>
										</div>
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