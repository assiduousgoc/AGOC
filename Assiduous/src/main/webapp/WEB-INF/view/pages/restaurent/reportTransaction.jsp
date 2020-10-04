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
		<h3>Report Transaction Details </h3>
		
	</div>
	
	<div id="content">
	
		<div class="grid_container">
		
		<div class="grid_12 full_block">
			<div class="widget_wrap">
					
					<div class="widget_content">
						<div id="tab1">
							<div class="widget_top" style="text-align: end;">
								<div class="btn_30_light">
									<a href="#" class="tipTop" original-title="Print"><span class="icon printer_co"></span></a>
									</div>
								<div class="btn_30_light">
									<a href="#" class="tipTop" original-title="Export excel"><span class="icon doc_excel_csv_co"></span></a>
								</div>
								<div class="btn_30_light">
									<a href="#" class="tipTop" original-title="Export pdf"><span class="icon doc_pdf_co"></span></a>
								</div>
							</div>
							<table class="display" id="action_tbl">
						<thead>
						<tr>
							<th class="center">
								<input name="checkbox" type="checkbox" value="" class="checkall">
							</th>
							<th>
								 Ref
							</th>
							<th>
								Time
							</th>
							<th>
								User
							</th>
							<th>
								Tax
							</th>
							<!-- <th>Type</th> -->
							<th>Total</th>
							<th>Details</th>
							<th>Action</th>

							
						</tr>
						</thead>
						<tbody>
						<tr>
							<td class="center tr_select ">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a class="center">1601708400000-0-3329</a>
							</td>
							<td class="center">
								3/10/20 12:30:00	
							</td>
							<td class="center">
								staff
							</td>
							
							<td class="center">
								$9.45
							</td>
							<td  class="center">
								$0.00
							</td>
							<td class="center">
								<div class="btn_30_blue">
								<a href="#" id="transactionDetails.htm" class="btn btn-sm btn-primary confirm_dialog_transaction"  style="border-radius: 0px !important;"><span class="">Details</span></a>
							</div>
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
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