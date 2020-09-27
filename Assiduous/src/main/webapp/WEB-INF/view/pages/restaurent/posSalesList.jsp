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
		<h3>POS Sales </h3>
		
	</div>
	
	<div id="content">
	
		<div class="grid_container">
		
		<div class="grid_12 full_block">
				<div class="widget_wrap tabby">
					<div class="widget_top">
						<span class="h_icon list"></span>
						<h6>POS Sales</h6>
						<div id="widget_tab">
							<ul>
								<li><a href="#tab1" class="active_tab"><span class="alert_notify pink">30</span>Store Items</a></li>
								<!-- <li><a href="#tab2">Inventory<span class="alert_notify orange">30</span></a></li>
								<li><a href="#tab3">Categories<span class="alert_notify pink">20</span></a></li>
								<li><a href="#tab4">Suppliers<span class="alert_notify orange">50</span></a></li> -->
								
							</ul>
						</div>
					</div>
					<div class="widget_content">
						<div id="tab1">
							<div class="widget_top" style="text-align: end;">
								
								
								<div class="btn_30_light">
									<a href="#" class="tipTop" original-title="Print Sales"><span class="icon printer_co"></span></a>
									</div>
									<!-- 
									<div class="btn_30_light">
									<a href="#" class="tipTop" original-title="Add Item"><span class="icon magnifier_zoom_in_co"></span></a>
									</div> -->
									
								<div class="btn_30_light">
									<a href="#" class="tipTop" original-title="Export Csv"><span class="icon doc_excel_table_co"></span></a>
								</div>
								<div class="btn_30_light">
									<a href="#" class="tipTop" original-title="Export Pdf"><span class="icon doc_pdf_co"></span></a>
								</div>
							</div>
							<table class="display" id="action_tbl">
						<thead>
						<tr>
							<th class="center">
								<input name="checkbox" type="checkbox" value="" class="checkall">
							</th>
							<th>
								 Id
							</th>
							<th>
								 Ref
							</th>
							<th>
								 User
							</th>
							<th>
								 Device/Location
							</th>
							<!-- <th>Type</th> -->
							<th>#Items</th>
							<th>Sale Time</th>
							<th>Total</th>
							
							 <th>
								 Status
							</th>
							<th>
								 Action
							</th>
						</tr>
						</thead>
						<tbody>
						<tr>
							<td class="center tr_select ">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">1005</a>
							</td>
							<td>
								<a href="#" class="">2635 </a>
							</td>
							<td>
								<a href="#" class="">	admin</a>
							</td>
							
							<td>
								<a href="#" class="">	Register 1 / Sydney</a>
							</td>
							<td >
								2
							</td>
							<td class="sdate center">
								<span >25/9/20 11:14:44</span>
							</td>
							<td class="center">
								$50.00
							</td>
							
							<td class="center">
								<span class="badge_style b_done">Complete</span>
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span>
								<span><a class="action-icons c-delete confirm_dialog" href="#" title="delete c-delete confirm_dialog">Delete</a></span>
								<!-- <span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span> -->
							</td>
						</tr>
						<tr>
							<td class="center tr_select ">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">1006</a>
							</td>
							<td>
								<a href="#" class="">2644 </a>
							</td>
							<td>
								<a href="#" class="">Staff</a>
							</td>
							
							<td>
								<a href="#" class="">Register 1 / Sydney</a>
							</td>
							<td >
								2
							</td>
							<td class="sdate center">
								<span >25/9/20 11:14:44</span>
							</td>
							<td class="center">
								$50.00
							</td>
							
							<td class="center">
								<span class="badge_style b_Pending">Refunded</span>
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span>
								<span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span>
								<!-- <span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span> -->
							</td>
						</tr>
						
						</tbody>
						
						</table>
							
						</div>
					
				</div>
			</div>
			<span class="clear"></span>
			
		</div>
		<span class="clear"></span>
	</div>
</div>