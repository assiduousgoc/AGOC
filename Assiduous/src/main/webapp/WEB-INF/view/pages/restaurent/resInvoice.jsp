 <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="container" style="margin-left: 265px;" >
	
	<div class="page_title">
		<span class="title_icon"><span class="money_2"></span></span>
		<h3>Invoice</h3>
		
	</div>
	<!-- <div class="switch_bar">
		<ul>
			<li>
			<a href="#"><span class="stats_icon current_work_sl"></span><span class="label">Analytics</span></a>
			</li>
			<li class="dropdown"><a href="#" data-toggle="dropdown" class="dropdown-toggle"><span class="stats_icon user_sl"><span class="alert_notify orange">30</span></span><span class="label"> Users</span></a>
			<div class="notification_list dropdown-menu blue_d">
				<div class="white_lin nlist_block">
					<ul>
						<li>
						<div class="nlist_thumb">
							<img src="images/photo_60x60.jpg" width="40" height="40" alt="img">
						</div>
						<div class="list_inf">
							<a href="#">Cras erat diam, consequat quis tincidunt nec, eleifend.</a>
						</div>
						</li>
						<li>
						<div class="nlist_thumb">
							<img src="images/photo_60x60.jpg" width="40" height="40" alt="img">
						</div>
						<div class="list_inf">
							<a href="#">Cras erat diam, consequat quis tincidunt nec, eleifend.</a>
						</div>
						</li>
						<li>
						<div class="nlist_thumb">
							<img src="images/photo_60x60.jpg" width="40" height="40" alt="img">
						</div>
						<div class="list_inf">
							<a href="#">Cras erat diam, consequat quis tincidunt nec, eleifend.</a>
						</div>
						</li>
					</ul>
					<span class="btn_24_blue"><a href="#">View All</a></span>
				</div>
			</div>
			</li>
			<li><a href="#"><span class="stats_icon administrative_docs_sl"></span><span class="label">Content</span></a></li>
			<li><a href="#"><span class="stats_icon finished_work_sl"><span class="alert_notify blue">30</span></span><span class="label">Task List</span></a></li>
			<li><a href="#"><span class="stats_icon config_sl"></span><span class="label">Settings</span></a></li>
			<li><a href="#"><span class="stats_icon archives_sl"></span><span class="label">Archive</span></a></li>
			<li><a href="#"><span class="stats_icon address_sl"></span><span class="label">Contact</span></a></li>
			<li><a href="#"><span class="stats_icon folder_sl"></span><span class="label">Media</span></a></li>
			<li><a href="#"><span class="stats_icon category_sl"></span><span class="label">Explorer</span></a></li>
			<li><a href="#"><span class="stats_icon calendar_sl"><span class="alert_notify orange">30</span></span><span class="label">Events</span></a></li>
			<li><a href="#"><span class="stats_icon lightbulb_sl"></span><span class="label">Support</span></a></li>
			<li><a href="#"><span class="stats_icon bank_sl"><span class="alert_notify blue">30</span></span><span class="label">Order List</span></a></li>
		</ul>
	</div> -->
	<div id="content">
		<div class="grid_container">
			<div class="grid_12">
				<div class="widget_wrap">
					<div class="widget_top">
						<span class="h_icon list"></span>
						<h6>Invoice for Monthly bill</h6>
					</div>
					<div class="widget_content">
						<div class=" page_content">
							<div class="invoice_container">
								<div class="invoice_action_bar">
									<div class="btn_30_light">
										<a href="#" title="Pay Now" class="confirm"><span class="icon zone_money_co"></span></a>
									</div>
									<div class="btn_30_light">
										<a href="#" title="Print"><span class="icon printer_co"></span></a>
									</div>
									<div class="btn_30_light">
										<a href="#" title="Download .pdf"><span class="icon drive_disk_co"></span></a>
									</div>
								</div>
								<div class="grid_6 invoice_num">
									<span>Invoice# 01010</span>
								</div>
								<div class="grid_6 invoice_date">
									Date: 12/01/2012
								</div>
								<span class="clear"></span>
								<div class="grid_12 invoice_title">
									<h5>Invoice Title or Subject </h5>
								</div>
								<div class="grid_6 invoice_to">
									<ul>
										<li>
										<strong><span>From</span></strong>
										<span>Westilo Technology Limited</span>
										<span>139, Shantibug 2nd floor,</span>
										<span>Dhaka.</span>
										</li>
									</ul>
								</div>
								<div class="grid_6 invoice_from">
									<ul>
										<li>
										<strong><span>To</span></strong>
										<span>Trenza Softwares</span>
										<span>Shahid Slenina Parven Sharak</span>
										<span>Dhaka.</span>
										</li>
									</ul>
								</div>
								<span class="clear"></span>
								<div class="grid_12 invoice_details">
									<div class="invoice_tbl">
										<table>
										<thead>
										<tr class=" gray_sai">
											<th>
												SI#
											</th>
											<th>
												Order ID
											</th>
											<th>
												Date
											</th>
											<th>
												Details
											</th>
											<th>
												Qty
											</th>
											<th>
												Unit Price
											</th>
											<th>
												Total
											</th>
										</tr>
										</thead>
										<tbody>
										<tr>
											<td>
												1
											</td>
											<td>
												#DMC 01245
											</td>
											<td>
												12/5/2012
											</td>
											<td class="left_align">
												5GB Dedicated Hosting
											</td>
											<td>
												1
											</td>
											<td>
												$250
											</td>
											<td>
												$250
											</td>
										</tr>
										<tr>
											<td>
												2
											</td>
											<td>
												#DMC 01246
											</td>
											<td>
												15/5/2012
											</td>
											<td class="left_align">
												20GB Mail server
											</td>
											<td>
												2
											</td>
											<td>
												$450
											</td>
											<td>
												$900
											</td>
										</tr>
										<tr>
											<td>
												3
											</td>
											<td>
												#DMC 01248
											</td>
											<td>
												19/5/2012
											</td>
											<td class="left_align">
												Domain Registration
											</td>
											<td>
												5
											</td>
											<td>
												$10
											</td>
											<td>
												$50
											</td>
										</tr>
										<tr>
											<td colspan="6" class="grand_total">
												Grand Total:
											</td>
											<td>
												$1200
											</td>
										</tr>
										</tbody>
										</table>
									</div>
									<p class="amount_word">
										Amounts in word: <span>Twelve Hundred Dollar Only.</span>
									</p>
									<blockquote class="quote_blue">
										<p>
											Cras erat diam, consequat quis tincidunt nec, eleifend a turpis. Aliquam ultrices feugiat metus, ut imperdiet erat mollis at. Curabitur mattis risus sagittis nibh lobortis vel.
										</p>
									</blockquote>
									<h5 class="notes">Notes:</h5>
									<p>
										Etiam convallis sodales elementum. Suspendisse interdum, nisi vitae pellentesque eleifend, justo nulla dictum lectus, consectetur elementum metus turpis quis mi. Integer non ante vel magna elementum aliquam. Aenean turpis turpis, porttitor eget ultrices quis, ornare eu sem. Duis luctus augue at nunc pharetra ac tristique diam fermentum. Aliquam lacinia neque in quam tincidunt bibendum non id libero.
									</p>
								</div>
								<span class="clear"></span>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<span class="clear"></span>
	</div>
</div>
