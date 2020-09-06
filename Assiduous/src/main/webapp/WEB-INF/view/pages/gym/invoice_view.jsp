<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jspdf/1.3.3/jspdf.min.js"></script>
<script src="https://html2canvas.hertzen.com/dist/html2canvas.js"></script>
<div class="page-wrapper">
	<div class="content">
	
		<div class="row">
			<div class="col-lg-12">
				<div class="card-box" style="border-bottom: 3px solid darkorange; text-align: end;">
						<a href="ledgers.htm?invoice=${invoice}"> <button class="btn btn-primary" style="border-radius: 0px !important; background-color: cornflowerblue;">Back</button></a>
						<!-- <button class="btn btn-primary" style="border-radius: 0px !important; background-color: #4a274f;">CSV</button> -->
						<button class="btn btn-primary" onclick="getPDF('${ledger.invoiceNo}')" id="downloadbtn" style="border-radius: 0px !important; background-color: #4a274f; display: inline-block;">PDF</button>
						<button class="btn btn-primary" style="border-radius: 0px !important; background-color: #4a274f;" onclick="PrintMe('printDiv')"><i class="fa fa-print fa-lg" ></i> Print</button>
			</div>
			</div>
			
		</div>

		<div class="row">
			<div class="col-lg-12 canvas_div_pdf" id="printDiv">
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
												<li><h5><strong>${trainee.firstName}</strong></h5></li>
												<li><span>${trainee.branchDto.name}</span></li>
												<li>${trainee.addressDto.line1} </li>
												<li>${trainee.addressDto.line2}, ${trainee.addressDto.pincode}</li>
												<li>${trainee.addressDto.cityDto.name}</li>
												<li>${trainee.mob}</li>
												<li><a href="#">${trainee.email}</a></li>
											</ul>
										</div>
										<div class="col-md-6 col-lg-3 m-b-20">
											<span class="text-muted">Payment Details:</span>
											<ul class="list-unstyled invoice-payment-details">
												<li><h5>Total Due: <span class="text-right">&#8377; ${ledger.amount}</span></h5></li>
												<li>A/C Name: <span>${ledger.accountName}</span></li>
												<li>A/C No: <span>${ledger.accountNo}</span></li>
												<li>City: <span></span></li>
												<li>Address: <span></span></li>
												<li>IBAN: <span></span></li>
												<li>SWIFT code: <span></span></li>
											</ul>
										</div>
									</div>
									
								<div class="table-responsive" >
										<table class="table table-striped table-hover">
											<thead>
												<tr>
													<th>#</th>
													<th>TRAINEE NAME</th>
													<th class="hidden-xs">BRANCH NAME</th>
													<th>A/C Name</th>
													<th>A/C NO.</th>
													<th>AMOUNT</th>
													<th>TOTAL</th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td>1</td>
													<td>${trainee.firstName} ${trainee.lastName}</td>
													<td class="hidden-xs">${trainee.branchDto.name}</td>
													<td>${ledger.accountName}</td>
													<td>${ledger.accountNo}</td>
													<td>&#8377; ${ledger.amount}</td>
													<td>&#8377; ${ledger.amount}</td>
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
																	<td class="text-right">&#8377; ${ledger.amount}</td>
																</tr>
																<tr>
																	<th>Tax: <span class="text-regular">(25%)</span></th>
																	<td class="text-right">&#8377; ${tax}</td>
																</tr>
																<tr>
																	<th>Total:</th>
																	<td class="text-right text-primary"><h5>&#8377; ${totalAmount}</h5></td>
																</tr>
															</tbody>
														</table>
													</div>
												</div>
											</div>
										</div>
										<div class="invoice-info">
											<h5>NOTICE:</h5>
											<p class="text-muted">A finance charge of 1.5% will be made on unpaid balances after 30 days.</p>
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
   function getPDF(invoiceId){

		var HTML_Width = $(".canvas_div_pdf").width();
		var HTML_Height = $(".canvas_div_pdf").height();
		var top_left_margin = 15;
		var PDF_Width = HTML_Width+(top_left_margin*2);
		var PDF_Height = (PDF_Width*1.5)+(top_left_margin*2);
		var canvas_image_width = HTML_Width;
		var canvas_image_height = HTML_Height;
		
		var totalPDFPages = Math.ceil(HTML_Height/PDF_Height)-1;
		

		html2canvas($(".canvas_div_pdf")[0],{allowTaint:true}).then(function(canvas) {
			canvas.getContext('2d');
			
			console.log(canvas.height+"  "+canvas.width);
			
			
			var imgData = canvas.toDataURL("image/jpeg", 1.0);
			var pdf = new jsPDF('p', 'pt',  [PDF_Width, PDF_Height]);
		    pdf.addImage(imgData, 'JPG', top_left_margin, top_left_margin,canvas_image_width,canvas_image_height);
			
			
			for (var i = 1; i <= totalPDFPages; i++) { 
				pdf.addPage(PDF_Width, PDF_Height);
				pdf.addImage(imgData, 'JPG', top_left_margin, -(PDF_Height*i)+(top_left_margin*4),canvas_image_width,canvas_image_height);
			}
			
		    pdf.save(invoiceId+".pdf");
       });
	};
</script>