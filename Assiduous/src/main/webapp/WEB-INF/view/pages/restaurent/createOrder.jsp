 <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div id="content">

<div class="widget_content" style="margin-top: 0px !important;">
						<form action="#" method="post" class="form_container">
							<!-- <div class="elem_extend"> -->
							<div class="">
								<ul>
								
									<li>
									<fieldset style="background-color: #FFFF">
										<legend>Transaction Details</legend>
										<ul>
										<li> 
										<div class="form_grid_12 multiline">
										<div class="form_input">
										 <div class="list_left">
											<div class="form_grid_12">
											<div  class="form_input">
											<div class="form_grid_4 alpha">
														Select Item:
													
													</div>
											<div class="form_grid_6">
														<select data-placeholder="Choose a Supplier.." class="chzn-select full" name="Field109" tabindex="20">
															<option value=""></option>
															<option value="1">Apple</option>
															<option value="2">Watermillon</option>
															
														</select>
													</div>
											
											</div><br>
											</div>
											<br>
											<div class="form_grid_12">
											<div  class="form_input">
											<div class="form_grid_4 alpha">
													No. Of Qty.
													</div>
											<div class="form_grid_6">
														<input name="filed30" type="text" class="qty" value="0"/>
													</div>
											
											</div><br>
											</div>
										 </div>
										 <div class="list_right">
										 <div class="form_grid_12">
											<div  class="form_input">
											<div class="form_grid_4 alpha">
														Process DT:
													
													</div>
											<div class="form_grid_6">
														2020-10-04 06:27:59
													</div>
											
											</div><br>
											</div>
											<div class="form_grid_12">
											<div  class="form_input">
											<div class="form_grid_4 alpha">
														User:
													
													</div>
											<div class="form_grid_6">
														 staff
													</div>
											
											</div><br>
											</div>
										 <div class="form_grid_12">
											<div  class="form_input">
											<div class="form_grid_4 alpha">
														Device:
													
													</div>
											<div class="form_grid_6">
														 Admin Dash
													</div>
											
											</div><br>
											</div>
											<div class="form_grid_12">
											<div  class="form_input">
											<div class="form_grid_4 alpha">
														Location:
													
													</div>
											<div class="form_grid_6">
														 Admin Dash
													</div>
											
											</div><br>
											</div>
											
											<!-- <div class="form_grid_12">
											<div  class="form_input">
											<div class="form_grid_4 alpha">
														Invoice Date: 
													
													</div>
											<div class="form_grid_6">
														<input name="filed30" type="text" class="datepicker" value="10/04/2020"/>
													</div>
											
											</div><br>
											</div> -->
											<!-- <div class="form_grid_12">
											<div  class="form_input">
											<div class="form_grid_4 alpha">
														Due Date: 
													
													</div>
											<div class="form_grid_6">
														<input name="filed30" type="text" class="datepicker" value="10/04/2020"/>
													</div>
											
											</div>
											</div><br> -->
											
											
										 </div>
										 </div>
										 </div>
										 </li>
										</ul>
									</fieldset>
								</li>
								</ul>
							</div>
							<ul style="text-align: end; margin-top: -21px; height: 43px;">
								<li>
								<div class="form_grid_12" style="margin-top: -6px;">
									<div class="form_input">
									
										<button type="submit" class="btn_small btn_blue"><span>Save</span></button>
										
									</div>
								</div>
								</li>
							</ul>
						</form>
<div class="grid_12 full_block" style="width:100%">
		<div class="widget_wrap tabby" style="background: #ffff; !important;    margin-top: 0px;">
					<div class="widget_top">
						<!-- <span class="h_icon list"></span>
						<h6>Transaction Details</h6> -->
						<div id="widget_tab">
							<ul>
								<li><a href="#tab1" class="active_tab">Dtails</a></li>
								<li><a href="#tab2">Items</a></li>
								<li><a href="#tab3">Payments</a></li>
								<li><a href="#tab4">Options</a></li>
							</ul>
						</div>
					</div>
					<div class="widget_content">
						<div id="tab1">
							
							<div class="user_list">
								<div class="user_block">
									<div class="info_block">
										<!-- <div class="widget_thumb">
											<img src="images/user-thumb1.png" width="40" height="40" alt="User">
										</div> -->
										<ul class="list_info" style="margin-top: -27px;">
										<li><h1 style="margin-left: -21px;">Sale Totals:</h1></li>
											<li><span>Subtotal: <i><a href="#">$8.59</a></i></span></li>
											<li><span>GST (10%):<i>$0.86</i></span></li>
											<li><span>Total:<i><b>$9.45 </b></i></span></li>
										</ul>
									</div>
									<!-- <ul class="action_list">
										<li><a class="p_edit" href="#">Edit</a></li>
										<li><a class="p_del" href="#">Delete</a></li>
										<li><a class="p_reject" href="#">Suspend</a></li>
										<li class="right"><a class="p_approve" href="#">Approve</a></li>
									</ul> -->
								</div>
								
								
							</div>
							
						</div>
						<div id="tab2">
						
						<div class="">
								<div class="">
									<div class="widget_wrap">
					<div class="widget_top" style=" margin-top: -18px">
						<span class="h_icon shopping_cart_3"></span>
						<h6>Items</h6>
						
					</div>
					<div class="widget_content" style="text-align: end;">
					<!-- <div class="btn_30_light">
									<a href="#" id="" class="tipTop confirm_dialog_" original-title="Add Item"><span class="icon add_co"></span></a>
						</div> -->
						<table class="wtbl_list">
						<thead>
						<tr>
							<th>
								Qty
							</th>
							<th>
								 Name
							</th>
							<th>
								 Unit
							</th>
							<th>
								 Tax
							</th>
							<th>Price</th>
							<th>Action</th>
						</tr>
						</thead>
						<tbody>
						<tr class="tr_even">
							<td>
								 1
							</td>
							<td>
								Energy Drink
							</td>
							<td>
								$3.45
							</td>
							<td>
								$0.31 (GST 10%)
							</td>
							
							<td>
								$3.45
							</td>
							<td class="center">
								<span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						
						</tbody>
						</table>
					</div>
				</div>
				
			</div>
						
				</div>		
							
				</div>
						<div id="tab3">
							<div class="">
								<div class="">
									<div class="widget_wrap">
					<div class="widget_top" style=" margin-top: -18px">
						<span class="h_icon shopping_cart_3"></span>
						<h6>Payments</h6>
						
					</div>
					<div class="widget_content" style="text-align: end;">
					<!-- <div class="btn_30_light">
									<a href="#" id="" class="tipTop confirm_dialog_" original-title="Add Item"><span class="icon add_co"></span></a>
						</div> -->
						<table class="wtbl_list">
						<thead>
						<tr>
							<th>
								Method
							</th>
							<th>
								 Amount
							</th>
							<th>
								 Date
							</th>
							<th>
								 Action
							</th>
						</tr>
						</thead>
						<tbody>
						<tr class="tr_even">
							<td>
								Cash
							</td>
							<td>
								$123.00
							</td>
							<td>
								15/10/20
							</td>
							<td class="center">
								<span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						
						</tbody>
						</table>
					</div>
				</div>
				
			</div>
						
				</div>	
						</div>
						<div id="tab4">
							
							<div class="user_list">
								<div class="user_block">
								<div class="btn_30_light">
								<a href="#" title=".classname" style="border-radius: 0px !important;"><span class="icon blueprint_co"></span><span class="btn_link">Generate Invoice</span></a>
								</div>
								<div class="btn_30_orange">
								<a href="#" title=".classname"><span class="icon email_open_image_co"></span><span class="btn_link">Email Invoice</span></a>
							</div>
							<div class="btn_30_blue">
								<a href="#" title=".classname"><span class="icon page_white_text_co"></span><span class="btn_link">History</span></a>
							</div>
								</div>
							</div>
						</div>
						
						
						</div>
				</div>
			</div>
			<span class="clear"></span>	
		</div>
		<span class="clear"></span>
	</div>