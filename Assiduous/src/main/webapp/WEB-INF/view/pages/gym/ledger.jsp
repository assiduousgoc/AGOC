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
						style="border-radius: 0px !important; background-color: #090696;">Ledger</button>

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
						<form:form commandName="led" modelAttribute="led"
							cssClass="needs-validation clearfix">
							<div class="form-row">
								<div class="col-md-3 mb-3">
									<label for="validationCustom22">Invoice No.</label>
									<div class="input-group">
										<form:hidden path="id" />
										<form:input path="invoiceNo" cssClass="form-control"
											disabled="disabled" />
									</div>
								</div>
								<div class="col-md-3 mb-3">
									<label for="validationCustom22">CR. Account</label>
									<div class="input-group">
										<form:input path="crAc.code" cssClass="form-control"
											disabled="disabled" />
									</div>
									<div class="input-group">
										<form:input path="crAc.name" cssClass="form-control"
											disabled="disabled" />
									</div>
								</div>
								<div class="col-md-3 mb-3">
									<label for="validationCustom22">DR. Account</label>
									<div class="input-group">
										<form:input path="drAc.code" cssClass="form-control"
											disabled="disabled" />
									</div>
									<div class="input-group">
										<form:input path="drAc.name" cssClass="form-control"
											disabled="disabled" />
									</div>
								</div>
								<div class="col-md-3 mb-3">
									<label for="validationCustom22">Bank Detail</label>
									<div class="input-group">
										<form:input path="bankDto.code" cssClass="form-control"
											disabled="disabled" />
									</div>
									<div class="input-group">
										<form:input path="bankDto.name" cssClass="form-control"
											disabled="disabled" />
									</div>
								</div>
								<div class="col-md-3 mb-3">
									<label for="validationCustom22">ITransaction</label>
									<div class="input-group">
										<form:input path="type" cssClass="form-control"
											disabled="disabled" />
									</div>
								</div>
								<div class="col-md-3 mb-3">
									<label for="validationCustom22">Amount</label>
									<div class="input-group">
										<form:input path="amount" cssClass="form-control"
											disabled="disabled" />
									</div>
								</div>
								<div class="col-md-3 mb-3">
									<label for="validationCustom22">Narration</label>
									<div class="input-group">
										<form:input path="narration" cssClass="form-control"
											disabled="disabled" />
									</div>
								</div>

								<div class="col-md-3 mb-3">
									<label for="validationCustom24">Date</label>
									<div class="input-group">
										<form:input class="form-control" path="txnDate" />
									</div>
								</div>
								<div class="col-md-3 mb-3">
									<label for="validationCustom24">Branch Detail</label>
									<div class="input-group">
										<form:input class="form-control" path="branchDto.code" />
										<form:input class="form-control" path="branchDto.name" />
									</div>
								</div>
							</div>
							<div class="new" style="display: inline-flex;">
								<div class="col-md-1 mb-3">
									<div class="input-group">
										<a href="ledgers.htm"><button
												class="btn btn-secondary d-block" type="button"
												style="min-width: 118px; background-color: #960613;">Back</button></a>
									</div>
								</div>
								<div class="col-md-1 mb-3">
									<div class="input-group">
										<a href="invoice.htm?id=${led.id}"><button
												class="btn btn-secondary d-block" type="button"
												style="min-width: 118px; background-color: #960613;">Print</button></a>
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