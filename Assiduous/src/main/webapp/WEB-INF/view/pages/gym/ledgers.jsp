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
					<a href="#"><button type="button" class="btn btn-primary"
							style="border-radius: 0px !important; background-color: #4a274f;">Ledgers</button></a>
				</div>
			</div>

		</div>

		<div class="row">
			<div class="col-lg-12">
				<div class="card-box" style="border-bottom: 3px solid darkorange;">
					<div class="table-responsive">
						<table id="example"
							class="table table-striped table-bordered dt-responsive nowrap"
							cellspacing="0" width="100%">
							<thead
								style="background-color: #4a274f; color: cornsilk; font-family: auto; text-align: center;">
								<tr>
									<th>Trainee Name</th>
									<th>Invoice No.</th>
									<th>A/C No.</th>
									<th>A/C Name</th>
									<th>Amount</th>
									<th>Txn Type</th>
									<th>Txn Date</th>
									<th>Branch Name</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${ledgers}" var="ledger">
									<tr>
										<td style="text-align: center;">${ledger.trainee.code}
											${ledger.trainee.name}</td>
										<td style="text-align: center;"><a
											href="invoice.htm?id=${ledger.id}">${ledger.invoice_no}</a></td>
										<td style="text-align: center;">${ledger.account_no}</td>
										<td style="text-align: center;">${ledger.account_name}</td>
										<td style="text-align: center;">${ledger.amount}</td>
										<td style="text-align: center;">${ledger.txn_type}</td>
										<td style="text-align: center;"><c:set var="txnDate"
												value="${ledger.txn_date}" /> <fmt:parseDate type="date"
												value="${txnDate}" var="tDate" pattern="MM/dd/yyyy"/>
												<fmt:formatDate value="${tDate}" type="date"/>
										<td style="text-align: center;">${ledger.branch.name}</td>

									</tr>
								</c:forEach>
							</tbody>
						</table>
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