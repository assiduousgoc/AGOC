<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="page-wrapper">
	<div class="content">
	
		<div class="row">
			<div class="col-lg-12">
				<div class="card-box" style="border-bottom: 3px solid darkorange; text-align: end;">
						<a href="ledgers.htm"> <button class="btn btn-primary" style="border-radius: 0px !important; background-color: cornflowerblue;">Back</button></a>
						<button class="btn btn-primary" style="border-radius: 0px !important; background-color: #4a274f;">CSV</button>
						<button class="btn btn-primary" style="border-radius: 0px !important; background-color: #4a274f;">PDF</button>
						<button class="btn btn-primary" style="border-radius: 0px !important; background-color: #4a274f;" onclick="PrintMe('printDiv')"><i class="fa fa-print fa-lg" ></i> Print</button>
			</div>
			</div>
			
		</div>

		<div class="row">
			<div class="col-lg-12" id="printDiv">
				<div class="card-box" style="border-bottom: 3px solid darkorange;">
					<div class="panel" >
						<div class="panel-body" >
								<div class="row" style=" width: 100%;margin-left: 0px;">
										<div class="col-md-6 m-b-20">
											<img src="${pageContext.request.contextPath}/static/images/CompanyLogo.jpg" class="m-b-20" alt="" style="width: 69px;border-radius: 50%;height: 69px;border: 5px solid #f79753;">
				 							<ul class="list-unstyled">
												<li>${user.branch.name}</li>
												<li>${user.city} ${user.pincode},</li>
												<li>${user.email}</li>
												<li>GST No:</li>
											</ul>
										</div>
										<div class="col-md-6 m-b-20">
											<div class="invoice-details">
												<h3 class="text-uppercase">Invoice# ${ledger.invoiceNo}</h3>
												<ul class="list-unstyled">
													<li>Date: <span>${ledger.txnDate}</span></li>
													<li>Due date: <span>November 25, 2017</span></li>
												</ul>
											</div>
										</div>
									</div>
									
									<div class="row" style=" width: 100%;margin-left: 0px;">
										<div class="col-md-6 col-lg-9 m-b-20">
											<h5>Invoice to:</h5>
				 							<ul class="list-unstyled">
												<li><h5><strong>Barry Cuda</strong></h5></li>
												<li><span>Global Technologies</span></li>
												<li>5754 Airport Rd</li>
												<li>Coosada, AL, 36020</li>
												<li>United States</li>
												<li>888-777-6655</li>
												<li><a href="#">barrycuda@example.com</a></li>
											</ul>
										</div>
										<div class="col-md-6 col-lg-3 m-b-20">
											<span class="text-muted">Payment Details:</span>
											<ul class="list-unstyled invoice-payment-details">
												<li><h5>Total Due: <span class="text-right">$8,750</span></h5></li>
												<li>Bank name: <span>Profit Bank Europe</span></li>
												<li>Country: <span>United Kingdom</span></li>
												<li>City: <span>London E1 8BF</span></li>
												<li>Address: <span>3 Goodman Street</span></li>
												<li>IBAN: <span>KFH37784028476740</span></li>
												<li>SWIFT code: <span>BPT4E</span></li>
											</ul>
										</div>
									</div>
									
								<div class="table-responsive" >
										<table class="table table-striped table-hover">
											<thead>
												<tr>
													<th>#</th>
													<th>ITEM</th>
													<th class="hidden-xs">DESCRIPTION</th>
													<th>UNIT COST</th>
													<th>QUANTITY</th>
													<th>TOTAL</th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td>1</td>
													<td>Android Application</td>
													<td class="hidden-xs">Lorem ipsum dolor sit amet, consectetur adipiscing elit</td>
													<td>$1000</td>
													<td>2</td>
													<td>$2000</td>
												</tr>
												<tr>
													<td>2</td>
													<td>Ios Application</td>
													<td class="hidden-xs">Lorem ipsum dolor sit amet, consectetur adipiscing elit</td>
													<td>$1750</td>
													<td>1</td>
													<td>$1750</td>
												</tr>
												<tr>
													<td>3</td>
													<td>Codeigniter Project</td>
													<td class="hidden-xs">Lorem ipsum dolor sit amet, consectetur adipiscing elit</td>
													<td>$90</td>
													<td>3</td>
													<td>$270</td>
												</tr>
												<tr>
													<td>4</td>
													<td>Phonegap Project</td>
													<td class="hidden-xs">Lorem ipsum dolor sit amet, consectetur adipiscing elit</td>
													<td>$1200</td>
													<td>2</td>
													<td>$2400</td>
												</tr>
												<tr>
													<td>5</td>
													<td>Website Optimization</td>
													<td class="hidden-xs">Lorem ipsum dolor sit amet, consectetur adipiscing elit</td>
													<td>$200</td>
													<td>2</td>
													<td>$400</td>
												</tr>
											</tbody>
										</table>
									</div>	
									
									<div>
										<div class="row invoice-payment" style=" width: 100%;margin-left: 0px;">
											<div class="col-sm-7 col-lg-8">
											</div>
											<div class="col-sm-5 col-lg-4">
												<div class="m-b-20">
													<h6>Total due</h6>
													<div class="table-responsive no-border">
														<table class="table m-b-0">
															<tbody>
																<tr>
																	<th>Subtotal:</th>
																	<td class="text-right">$7,000</td>
																</tr>
																<tr>
																	<th>Tax: <span class="text-regular">(25%)</span></th>
																	<td class="text-right">$1,750</td>
																</tr>
																<tr>
																	<th>Total:</th>
																	<td class="text-right text-primary"><h5>$8,750</h5></td>
																</tr>
															</tbody>
														</table>
													</div>
												</div>
											</div>
										</div>
										<div class="invoice-info">
											<h5>Other information</h5>
											<p class="text-muted">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus sed dictum ligula, cursus blandit risus. Maecenas eget metus non tellus dignissim aliquam ut a ex. Maecenas sed vehicula dui, ac suscipit lacus. Sed finibus leo vitae lorem interdum, eu scelerisque tellus fermentum. Curabitur sit amet lacinia lorem. Nullam finibus pellentesque libero, eu finibus sapien interdum vel</p>
										</div>
									</div>
									
									
									
						</div>
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
<script type="text/javascript">
   function PrintMe(divId) {
       var printContents = document.getElementById(divId).innerHTML;
       var originalContents = document.body.innerHTML;
       document.body.innerHTML = "<html><head><title></title></head><body>" + printContents + "</body>";
       window.print();
       document.body.innerHTML = originalContents;
   }
</script>