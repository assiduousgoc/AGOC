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
		<h3>Item </h3>
		
	</div>
	
	<div id="content">
	
		<div class="grid_container">
		
		<div class="grid_12 full_block">
				<div class="widget_wrap tabby">
					<div class="widget_top">
						<span class="h_icon list"></span>
						<h6>Item</h6>
						<div id="widget_tab">
							<ul>
								<li><a href="#tab1" class="active_tab"><span class="alert_notify pink">30</span>Store Items</a></li>
								<li><a href="#tab2">Inventory<span class="alert_notify orange">30</span></a></li>
								<li><a href="#tab3">Categories<span class="alert_notify pink">20</span></a></li>
								<li><a href="#tab4">Suppliers<span class="alert_notify orange">50</span></a></li>
								
							</ul>
						</div>
					</div>
					<div class="widget_content">
						<div id="tab1">
							<div class="widget_top" style="text-align: end;">
								
								<div class="btn_30_light">
									<a href="#" class="tipTop" original-title="Import Item"><span class="icon doc_excel_csv_co"></span></a>
									</div>
								<div class="btn_30_light">
									<a href="#" class="tipTop" original-title="Add Item"><span class="icon add_co"></span></a>
									</div>
									<!-- 
									<div class="btn_30_light">
									<a href="#" class="tipTop" original-title="Add Item"><span class="icon magnifier_zoom_in_co"></span></a>
									</div> -->
									<div class="btn_30_light">
									<a href="#" class="tipTop" original-title="Print Sales"><span class="icon printer_co"></span></a>
									</div>
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
								 Name
							</th>
							<th>
								 Description
							</th>
							<th>
								 Tax
							</th>
							<!-- <th>Type</th> -->
							<th>Default Qty.</th>
							<th>Price</th>
							<th>StockCode</th>
							<th>
								 Category
							</th>
							 <th>
								 Supplier
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
								<a href="#">01</a>
							</td>
							<td>
								<a href="#" class="">Apple </a>
							</td>
							<td>
								<a href="#" class="">Golden Delicious </a>
							</td>
							
							<td>
								<a href="#" class="">GST</a>
							</td>
							<td >
								2
							</td>
							<td class="center">
								<span >$1.99</span>
							</td>
							<td class="center">
								 A
							</td>
							<td class="center">
								Food
							</td>
							<td class="center">
								Yumbox Packaged Goods
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						
						
						</tbody>
						
						</table>
							
						</div>
						<div id="tab2">
							<div class="widget_top" style="text-align: end;">
									<div class="btn_30_light">
									<a href="#" class="tipTop" original-title="Add Inventory"><span class="icon add_co"></span></a>
									</div>
									<div class="btn_30_light">
									<a href="#" class="tipTop" original-title="Print Sales"><span class="icon printer_co"></span></a>
									</div>
								<div class="btn_30_light">
									<a href="#" class="tipTop" original-title="Export Csv"><span class="icon doc_excel_table_co"></span></a>
								</div>
								<div class="btn_30_light">
									<a href="#" class="tipTop" original-title="Export Pdf"><span class="icon doc_pdf_co"></span></a>
								</div>
								
							</div>
							<table class="display" id="action_tbl2">
						<thead>
						<tr>
							<th class="center">
								<input name="checkbox" type="checkbox" value="" class="checkall">
							</th>
							<th>
								 Id
							</th>
							<th>
								Name
							</th>
							<th>
								 Supplier
							</th>
							<th>
								Location
							</th>
							<th>
								Qty
							</th>
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
								<a href="#">01</a>
							</td>
							<td>
								<a href="#" class="t-complete">Robo 3d Printer</a>
							</td>
							<td class="sdate center">
								Elecsys Electronic Distibution
							</td>
							<td class="center">
									New Delhi
							</td>
							<td class="center">
									34
							</td>
							<td class="center sdate">
							<span class="badge_style b_done">Done</span>
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span>
								<span><a class="action-icons c-suspend" href="#" title="Transfer Stock">Delete</a></span>
								<span><a class="action-icons c-approve" href="#" title="Stock History">Done</a></span>
							</td>
						</tr>
						<tr>
							<td class="center tr_select ">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">01</a>
							</td>
							<td>
								<a href="#" class="t-complete">Robo 3d Printer</a>
							</td>
							<td class="sdate center">
								Elecsys Electronic Distibution
							</td>
							<td class="center">
									New Delhi
							</td>
							<td class="center">
									34
							</td>
							<td class="center sdate">
							<span class="badge_style b_done">Done</span>
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span>
								<span><a class="action-icons c-suspend" href="#" title="Transfer Stock">Delete</a></span>
								<span><a class="action-icons c-approve" href="#" title="Stock History">Done</a></span>
							</td>
						</tr>
						<tr>
							<td class="center tr_select ">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">01</a>
							</td>
							<td>
								<a href="#" class="t-complete">Robo 3d Printer</a>
							</td>
							<td class="sdate center">
								Elecsys Electronic Distibution
							</td>
							<td class="center">
									New Delhi
							</td>
							<td class="center">
									34
							</td>
							<td class="center sdate">
							<span class="badge_style b_done">Done</span>
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span>
								<span><a class="action-icons c-suspend" href="#" title="Transfer Stock">Delete</a></span>
								<span><a class="action-icons c-approve" href="#" title="Stock History">Done</a></span>
							</td>
						</tr>
						<tr>
							<td class="center tr_select ">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">01</a>
							</td>
							<td>
								<a href="#" class="t-complete">Robo 3d Printer</a>
							</td>
							<td class="sdate center">
								Elecsys Electronic Distibution
							</td>
							<td class="center">
									New Delhi
							</td>
							<td class="center">
									34
							</td>
							<td class="center sdate">
							<span class="badge_style b_done">Done</span>
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span>
								<span><a class="action-icons c-suspend" href="#" title="Transfer Stock">Delete</a></span>
								<span><a class="action-icons c-approve" href="#" title="Stock History">Done</a></span>
							</td>
						</tr>
						<tr>
							<td class="center tr_select ">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">01</a>
							</td>
							<td>
								<a href="#" class="t-complete">Robo 3d Printer</a>
							</td>
							<td class="sdate center">
								Elecsys Electronic Distibution
							</td>
							<td class="center">
									New Delhi
							</td>
							<td class="center">
									34
							</td>
							<td class="center sdate">
							<span class="badge_style b_done">Done</span>
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span>
								<span><a class="action-icons c-suspend" href="#" title="Transfer Stock">Delete</a></span>
								<span><a class="action-icons c-approve" href="#" title="Stock History">Done</a></span>
							</td>
						</tr>
						<tr>
							<td class="center tr_select ">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">01</a>
							</td>
							<td>
								<a href="#" class="t-complete">Robo 3d Printer</a>
							</td>
							<td class="sdate center">
								Elecsys Electronic Distibution
							</td>
							<td class="center">
									New Delhi
							</td>
							<td class="center">
									34
							</td>
							<td class="center sdate">
							<span class="badge_style b_done">Done</span>
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span>
								<span><a class="action-icons c-suspend" href="#" title="Transfer Stock">Delete</a></span>
								<span><a class="action-icons c-approve" href="#" title="Stock History">Done</a></span>
							</td>
						</tr>
						<tr>
							<td class="center tr_select ">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">01</a>
							</td>
							<td>
								<a href="#" class="t-complete">Robo 3d Printer</a>
							</td>
							<td class="sdate center">
								Elecsys Electronic Distibution
							</td>
							<td class="center">
									New Delhi
							</td>
							<td class="center">
									34
							</td>
							<td class="center sdate">
							<span class="badge_style b_done">Done</span>
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span>
								<span><a class="action-icons c-suspend" href="#" title="Transfer Stock">Delete</a></span>
								<span><a class="action-icons c-approve" href="#" title="Stock History">Done</a></span>
							</td>
						</tr>
						</tbody>
						
						</table>
							
							
						</div>
						<div id="tab3">
							<div class="widget_top" style="text-align: end;">
							
								<div class="btn_30_light">
									<a href="#" class="tipTop" original-title="Add Category"><span class="icon add_co"></span></a>
									</div>
									<div class="btn_30_light">
									<a href="#" class="tipTop" original-title="Print Sales"><span class="icon printer_co"></span></a>
									</div>
								<div class="btn_30_light">
									<a href="#" class="tipTop" original-title="Export Csv"><span class="icon doc_excel_table_co"></span></a>
								</div>
								<div class="btn_30_light">
									<a href="#" class="tipTop" original-title="Export Pdf"><span class="icon doc_pdf_co"></span></a>
								</div>
							</div>
						
					    <table class="display" id="action_tbl3">
						<thead>
						<tr>
							<th class="center">
								<input name="checkbox" type="checkbox" value="" class="checkall">
							</th>
							<th>
								 Id
							</th>
							<th>
								Name
							</th>
							<th>
								#Items
							</th>
							<th>
								Serial No.
							</th>
							<th>
								Status
							</th>
							<th>
								Completed Date
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
								<a href="#">04</a>
							</td>
							<td>
								<a href="#" class="t-complete">	Clothing</a>
							</td>
							<td class="sdate center">
									3
							</td>
							<td class="center">
									3
							</td>
							<td class="center">
								<span class="badge_style b_done">Done</span>
							</td>
							<td class="sdate center">
								 1st FEB 2012
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span>
								<span><a class="action-icons c-delete" href="#" title="delete">Delete</a></span>
							<!-- 	<span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span> -->
							</td>
						</tr>
						
						
						</tbody>
					    </table>
						</div>
						<div id="tab4">
							<div class="widget_top" style="text-align: end;">
								<!-- <div class="form_input" style="padding: 5px 5px;">
										<button type="button" class="btn_small btn_blue"><span>Add GST</span></button>
										<button type="button" class="btn_small btn_blue"><span>Adv. Search</span></button>
									</div> -->
									<div class="btn_30_light">
									<a href="#" class="tipTopL" original-title="Add Supplier"><span class="icon add_co"></span></a>
									</div>
									<!-- <div class="btn_30_light">
									<a href="#" class="tipTopL" original-title="Adv. Search"><span class="icon magnifier_zoom_in_co"></span></a>
									</div> -->
									<div class="btn_30_light">
									<a href="#" class="tipTop" original-title="Print Sales"><span class="icon printer_co"></span></a>
									</div>
								<div class="btn_30_light">
									<a href="#" class="tipTopL" original-title="Export to Excel"><span class="icon doc_excel_csv_co"></span></a>
								</div>
								<div class="btn_30_light">
									<a href="#" class="tipTopL" original-title="Export to Pdf"><span class="icon doc_pdf_co"></span></a>
								</div>
							</div>
							<table class="display" id="action_tbl4">
						<thead>
						<tr>
							<th class="center">
								<input name="checkbox" type="checkbox" value="" class="checkall">
							</th>
							<th>
								 Id
							</th>
							<th>
								Name
							</th>
							<th>
								#Items
							</th>
							<th>
								Item Name
							</th>
							<th>
								Status
							</th>
							<th>
								Completed Date
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
								<a href="#">04</a>
							</td>
							<td>
								<a href="#" class="t-complete">	Clothing</a>
							</td>
							<td class="sdate center">
									3
							</td>
							<td class="center">
									Apple
							</td>
							<td class="center">
								<span class="badge_style b_done">Done</span>
							</td>
							<td class="sdate center">
								 1st FEB 2012
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span>
								<span><a class="action-icons c-delete" href="#" title="delete">Delete</a></span>
							<!-- 	<span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span> -->
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