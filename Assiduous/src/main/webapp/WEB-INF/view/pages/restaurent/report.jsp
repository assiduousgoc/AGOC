 <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<style>
.chzn-single{
width:100%;
}
</style>
<div id="container" style="margin-left: 265px;" >
	
	<div class="page_title">
		<span class="stats_icon bank_sl"><span class="bank_3"></span></span>
		<h3>Account </h3>
		
	</div>
	
	<div id="content">
	
		<div class="grid_container">
		
		<div class="grid_12 full_block">
		<div class="widget_content">
						<div id="tab1">
							<form action="#" method="post" class="form_container field_set">
								<fieldset>
									<legend>Reports</legend>
									<ul>
										<li>
										<div class="form_grid_12">
											<div class="form_input">
											<div class="form_grid_2 alpha">
											<select data-placeholder="Select Report" class="chzn-select" tabindex="13">
													 <option value="stats/general">Summary</option>
											        <option value="stats/takings">Takings Count</option>
											        <option value="stats/itemselling">Item Sales</option>
											        <option value="stats/categoryselling">Category Sales</option>
											        <option value="stats/supplyselling">Supplier Sales</option>
											        <option value="stats/stock">Current Stock</option>
											        <option value="stats/devices">Device Takings</option>
											        <option value="stats/locations">Location Takings</option>
											        <option value="stats/users">User Takings</option>
											        <option value="stats/tax">Tax Breakdown</option>
												</select>
												<span class=" label_intro">Select Report</span>
											</div>
											<div class="form_grid_2">
											<select data-placeholder="Select transaction"  class="chzn-select" tabindex="13">
													<option value=""></option>
													<optgroup label="NFC EAST">
													<option>All Sales</option>
													<option>POS Sales</option>
													<option>Invoices</option>
													</optgroup>
													<optgroup label="NFC NORTH">
													
													</optgroup>
												</select>
												<span class=" label_intro">Transactions</span>
											</div>
										
											<div class=" form_grid_2">
													<input name="filed30" type="text" class="datepicker"/>
													<span class=" label_intro">Range From</span>
												</div>
												<div class=" form_grid_2">
													<input name="filed31" type="text" class="datepicker"/>
													<span class=" label_intro">To</span>
												</div>
											
											<div class="form_grid_4" style="margin-top:-8px;">
											<div class="btn_30_light">
											<a href="#" class="tipTop" original-title="Print"><span class="icon printer_co"></span></a>
											</div>
											<div class="btn_30_light">
													<a href="#" class="tipTop" original-title="Export to excel"><span class="icon doc_excel_csv_co"></span></a>
												</div>
											</div>
												<!-- <input name="filed01" type="text" tabindex="1" class="limiter"/>
												<span class="input_instruction green">This is an instruction</span> -->
											</div>
										</div>
										</li>
										
										</ul>
										<br>
									</fieldset>
								</form>
						</div>
		</div>

				<div class="widget_wrap">
					
					<div class="widget_content">
						<div id="tab1">
							
							<table class="display" id="action_tbl">
						<thead>
						<tr>
							<th class="center">
								<input name="checkbox" type="checkbox" value="" class="checkall">
							</th>
							<th>
								 Name
							</th>
							<th>
								# Sold
							</th>
							<th>
								Discounts
							</th>
							<th>
								Tax
							</th>
							<!-- <th>Type</th> -->
							<th>Total</th>
							<th># Refunded</th>
							<th>Total</th>
							<th>
								 Balance
							</th>
							 
							
						</tr>
						</thead>
						<tbody>
						<tr>
							<td class="center tr_select ">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="reportTransaction.htm">Miscellaneous</a>
							</td>
							<td class="center">
								18
							</td>
							<td class="center">
								$0.00
							</td>
							
							<td class="center">
								$1.62
							</td>
							<td  class="center">
								$17.82
							</td>
							<td class="center">
								1
							</td>
							<td class="center">
								$0.00
							</td>
							<td class="center">
							$0.00
							</td>
							
						</tr>
						
						
						</tbody>
						
						</table>
							
						</div>
						</div>
				</div>
			</div>
			<span class="clear"></span>
			
		</div>
		<span class="clear"></span>
	</div>
</div>