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
				<div class="widget_wrap tabby">
					<div class="widget_top">
						<span class="h_icon list"></span>
						<h6>Account</h6>
						<div id="widget_tab">
							<ul>
								<li><a href="#tab1" class="active_tab"><span class="alert_notify pink">30</span>Bank</a></li>
								<li><a href="#tab2">Cr. A/C<span class="alert_notify orange">10</span></a></li>
								<li><a href="#tab3">Dr. A/C<span class="alert_notify pink">20</span></a></li>
								<li><a href="#tab4">GST<span class="alert_notify orange">40</span></a></li>
								<li><a href="#tab5">Payment<span class="alert_notify pink">10</span></a></li>
								<li><a href="#tab6">Dues<span class="alert_notify orange">50</span></a></li>
								<li><a href="#tab7">Ledger<span class="alert_notify pink">30</span></a></li>
							</ul>
						</div>
					</div>
					<div class="widget_content">
						<div id="tab1">
							<div class="widget_top" style="text-align: end;">
								<!-- <div class="form_input" style="padding: 5px 5px;">
										<button type="submit" class="btn_small btn_blue"><span>Add Bank</span></button>
										<button type="reset" class="btn_small btn_blue"><span>Adv. Search</span></button>
									
									
									</div> -->
									
									<div class="btn_30_light">
									<a href="#"><span class="icon add_co basic-modal"></span></a>
									</div>
									<div class="btn_30_light">
									<a href="#"><span class="icon magnifier_zoom_in_co"></span></a>
									</div>
									<div class="btn_30_light">
									<a href="#" class="tipTop" original-title="Print Sales"><span class="icon printer_co"></span></a>
									</div>
								<div class="btn_30_light">
									<a href="#"><span class="icon doc_excel_csv_co"></span></a>
								</div>
								<div class="btn_30_light">
									<a href="#"><span class="icon doc_pdf_co"></span></a>
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
								 Bank Name
							</th>
							<th>
								 Branch Name
							</th>
							<th>
								 A/C No.
							</th>
							<!-- <th>Type</th> -->
							<th>PAN</th>
							<th>TAN</th>
							<th>Address</th>
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
								<a href="#" class="">Axis Bank Ltd. </a>
							</td>
							<td>
								<a href="#" class="">Shalimar Bagh </a>
							</td>
							
							<td>
								<a href="#" class="">12345678</a>
							</td>
							<td class="sdate center">
								HKH83767
							</td>
							<td class="center">
								<span class="badge_style b_high">214325463</span>
							</td>
							<td class="center">
								 Haider Pur Shalimar bagh
							</td>
							<td class="center">
								<span class="badge_style b_done">Done</span>
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						
						<tr>
							<td class="center tr_select ">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">02</a>
							</td>
							<td>
								<a href="#" class="">Axis Bank Ltd. </a>
							</td>
							<td>
								<a href="#" class="">Shalimar Bagh </a>
							</td>
							
							<td>
								<a href="#" class="">12345678</a>
							</td>
							<td class="sdate center">
								HKH83767
							</td>
							<td class="center">
								<span class="badge_style b_high">214325463</span>
							</td>
							<td class="center">
								 Haider Pur Shalimar bagh
							</td>
							<td class="center">
								<span class="badge_style b_done">Done</span>
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						<tr>
							<td class="center tr_select ">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">03</a>
							</td>
							<td>
								<a href="#" class="">Axis Bank Ltd. </a>
							</td>
							<td>
								<a href="#" class="">Shalimar Bagh </a>
							</td>
							
							<td>
								<a href="#" class="">12345678</a>
							</td>
							<td class="sdate center">
								HKH83767
							</td>
							<td class="center">
								<span class="badge_style b_high">214325463</span>
							</td>
							<td class="center">
								 Haider Pur Shalimar bagh
							</td>
							<td class="center">
								<span class="badge_style b_done">Done</span>
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						
						<tr>
							<td class="center tr_select">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">04</a>
							</td>
							<td>
								<a href="#" class="">Axis Bank Ltd. </a>
							</td>
							<td>
								<a href="#" class="">Shalimar Bagh </a>
							</td>
							
							<td>
								<a href="#" class="">12345678</a>
							</td>
							<td class="sdate center">
								HKH83767
							</td>
							<td class="center">
								<span class="badge_style b_high">214325463</span>
							</td>
							<td class="center">
								 Haider Pur Shalimar bagh
							</td>
							<td class="center">
								<span class="badge_style b_done">Done</span>
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						<tr>
							<td class="center tr_select">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">05</a>
							</td>
							<td>
								<a href="#" class="">Axis Bank Ltd. </a>
							</td>
							<td>
								<a href="#" class="">Shalimar Bagh </a>
							</td>
							
							<td>
								<a href="#" class="">12345678</a>
							</td>
							<td class="sdate center">
								HKH83767
							</td>
							<td class="center">
								<span class="badge_style b_high">214325463</span>
							</td>
							<td class="center">
								 Haider Pur Shalimar bagh
							</td>
							<td class="center">
								<span class="badge_style b_done">Done</span>
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						<tr>
							<td class="center tr_select">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">06</a>
							</td>
							<td>
								<a href="#" class="">Axis Bank Ltd. </a>
							</td>
							<td>
								<a href="#" class="">Shalimar Bagh </a>
							</td>
							
							<td>
								<a href="#" class="">12345678</a>
							</td>
							<td class="sdate center">
								HKH83767
							</td>
							<td class="center">
								<span class="badge_style b_high">214325463</span>
							</td>
							<td class="center">
								 Haider Pur Shalimar bagh
							</td>
							<td class="center">
								<span class="badge_style b_done">Done</span>
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						</tbody>
						
						</table>
							
						</div>
						<div id="tab2">
							<div class="widget_top" style="text-align: end;">
							<div class="btn_30_light">
									<a href="#"><span class="icon add_co"></span></a>
									</div>
									<div class="btn_30_light">
									<a href="#"><span class="icon magnifier_zoom_in_co"></span></a>
									</div>
								<div class="btn_30_light">
									<a href="#"><span class="icon doc_excel_csv_co"></span></a>
								</div>
								<div class="btn_30_light">
									<a href="#"><span class="icon doc_pdf_co"></span></a>
								</div>
								<!-- <div class="form_input" style="padding: 5px 5px;">
										<button type="button" class="btn_small btn_orange"><span>Add Cr. A/C</span></button>
										<button type="button" class="btn_small btn_orange"><span>Adv. Search</span></button>
									</div> -->
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
								 A/C Name
							</th>
							<th>
								 Email
							</th>
							<th>
								 Mobile No.
							</th>
							<th>
								 Status
							</th>
							<th>
								 Complete Date
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
								<a href="#" class="t-complete">Pellentesque ut massa ut ligula ... </a>
							</td>
							<td class="sdate center">
								maheshwarprasad@gmail.com
							</td>
							<td class="center">
								<span class="badge_style b_high">9910487665</span>
							</td>
							<td class="center">
								<span class="badge_style b_done">Done</span>
							</td>
							<td class="center sdate">
								 3rd FEB 2012
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						<tr>
							<td class="center tr_select ">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">02</a>
							</td>
							<td>
								<a href="#" class="t-complete">Nulla non ante dui, sit amet ... </a>
							</td>
							<td class="sdate center">
								 1st FEB 2012
							</td>
							<td class="center">
								<span class="badge_style b_low">Low</span>
							</td>
							<td class="center">
								<span class="badge_style b_done">Done</span>
							</td>
							<td class="center sdate">
								 3rd FEB 2012
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						<tr>
							<td class="center tr_select ">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">03</a>
							</td>
							<td>
								<a href="#" class="t-complete">Aliquam eu pellentesque... </a>
							</td>
							<td class="sdate center">
								 1st FEB 2012
							</td>
							<td class="center">
								<span class="badge_style b_medium">Medium</span>
							</td>
							<td class="center">
								<span class="badge_style b_done">Done</span>
							</td>
							<td class="center sdate">
								 3rd FEB 2012
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						
						<tr>
							<td class="center tr_select">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">04</a>
							</td>
							<td>
								<a href="#">Maecenas egestas alique... </a>
							</td>
							<td class="sdate center">
								 1st FEB 2012
							</td>
							<td class="center">
								<span class="badge_style b_high">High</span>
							</td>
							<td class="center">
								<span class="badge_style b_pending">Pending</span>
							</td>
							<td class="center sdate">
								 -
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						<tr>
							<td class="center tr_select">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">04</a>
							</td>
							<td>
								<a href="#">Maecenas egestas alique... </a>
							</td>
							<td class="sdate center">
								 1st FEB 2012
							</td>
							<td class="center">
								<span class="badge_style b_high">High</span>
							</td>
							<td class="center">
								<span class="badge_style b_pending">Pending</span>
							</td>
							<td class="center sdate">
								 -
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						<tr>
							<td class="center tr_select">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">04</a>
							</td>
							<td>
								<a href="#">Maecenas egestas alique... </a>
							</td>
							<td class="sdate center">
								 1st FEB 2012
							</td>
							<td class="center">
								<span class="badge_style b_high">High</span>
							</td>
							<td class="center">
								<span class="badge_style b_pending">Pending</span>
							</td>
							<td class="center sdate">
								 -
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						</tbody>
						
						</table>
							
							
						</div>
						<div id="tab3">
							<div class="widget_top" style="text-align: end;">
							
								<!-- <div class="form_input" style="padding: 5px 5px;">
										<button type="button" class="btn_small btn_gray"><span>Add Dr. A/C</span></button>
										<button type="button" class="btn_small btn_gray"><span>Adv. Search</span></button>
									</div> -->
									<div class="btn_30_light">
									<a href="#"><span class="icon add_co"></span></a>
									</div>
									<div class="btn_30_light">
									<a href="#"><span class="icon magnifier_zoom_in_co"></span></a>
									</div>
								<div class="btn_30_light">
									<a href="#"><span class="icon doc_excel_csv_co"></span></a>
								</div>
								<div class="btn_30_light">
									<a href="#"><span class="icon doc_pdf_co"></span></a>
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
								A/C Name
							</th>
							<th>
								Email
							</th>
							<th>
								 Mobile No.
							</th>
							<th>
								 Status
							</th>
							<th>
								 Complete Date
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
								<a href="#" class="t-complete">Pellentesque ut massa ut ligula ... </a>
							</td>
							<td class="sdate center">
								maheshwarprasad@mpslimited.com
							</td>
							<td class="center">
								<span class="badge_style b_high">883536547665</span>
							</td>
							<td class="center">
								<span class="badge_style b_done">Done</span>
							</td>
							<td class="center sdate">
								 3rd FEB 2012
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						
						<tr>
							<td class="center tr_select">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">04</a>
							</td>
							<td>
								<a href="#">Maecenas egestas alique... </a>
							</td>
							<td class="sdate center">
								 1st FEB 2012
							</td>
							<td class="center">
								<span class="badge_style b_high">High</span>
							</td>
							<td class="center">
								<span class="badge_style b_pending">Pending</span>
							</td>
							<td class="center sdate">
								 -
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						<tr>
							<td class="center tr_select">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">04</a>
							</td>
							<td>
								<a href="#">Maecenas egestas alique... </a>
							</td>
							<td class="sdate center">
								 1st FEB 2012
							</td>
							<td class="center">
								<span class="badge_style b_high">High</span>
							</td>
							<td class="center">
								<span class="badge_style b_pending">Pending</span>
							</td>
							<td class="center sdate">
								 -
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						<tr>
							<td class="center tr_select">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">04</a>
							</td>
							<td>
								<a href="#">Maecenas egestas alique... </a>
							</td>
							<td class="sdate center">
								 1st FEB 2012
							</td>
							<td class="center">
								<span class="badge_style b_high">High</span>
							</td>
							<td class="center">
								<span class="badge_style b_pending">Pending</span>
							</td>
							<td class="center sdate">
								 -
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						<tr>
							<td class="center tr_select">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">04</a>
							</td>
							<td>
								<a href="#">Maecenas egestas alique... </a>
							</td>
							<td class="sdate center">
								 1st FEB 2012
							</td>
							<td class="center">
								<span class="badge_style b_high">High</span>
							</td>
							<td class="center">
								<span class="badge_style b_pending">Pending</span>
							</td>
							<td class="center sdate">
								 -
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						<tr>
							<td class="center tr_select">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">04</a>
							</td>
							<td>
								<a href="#">Maecenas egestas alique... </a>
							</td>
							<td class="sdate center">
								 1st FEB 2012
							</td>
							<td class="center">
								<span class="badge_style b_high">High</span>
							</td>
							<td class="center">
								<span class="badge_style b_pending">Pending</span>
							</td>
							<td class="center sdate">
								 -
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						<tr>
							<td class="center tr_select">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">04</a>
							</td>
							<td>
								<a href="#">Maecenas egestas alique... </a>
							</td>
							<td class="sdate center">
								 1st FEB 2012
							</td>
							<td class="center">
								<span class="badge_style b_high">High</span>
							</td>
							<td class="center">
								<span class="badge_style b_pending">Pending</span>
							</td>
							<td class="center sdate">
								 -
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						<tr>
							<td class="center tr_select">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">04</a>
							</td>
							<td>
								<a href="#">Maecenas egestas alique... </a>
							</td>
							<td class="sdate center">
								 1st FEB 2012
							</td>
							<td class="center">
								<span class="badge_style b_high">High</span>
							</td>
							<td class="center">
								<span class="badge_style b_pending">Pending</span>
							</td>
							<td class="center sdate">
								 -
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
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
									<a href="#" class="tipTopL" original-title="Add Gst"><span class="icon add_co"></span></a>
									</div>
									<div class="btn_30_light">
									<a href="#" class="tipTopL" original-title="Adv. Search"><span class="icon magnifier_zoom_in_co"></span></a>
									</div>
								<div class="btn_30_light">
									<a href="#" class="tipTopL" original-title="Export to Excel"><span class="icon doc_excel_csv_co"></span></a>
								</div>
								<div class="btn_30_light">
									<a href="#" class="tipTopL" original-title="Export to Pdf"><span class="icon doc_pdf_co"></span></a>
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
								 GST No
							</th>
							<th>
								Name
							</th>
							<th>
								 Code
							</th>
							<th>
								 Status
							</th>
							<th>
								 Complete Date
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
								<a href="#" class="t-complete">Pellentesque ut massa ut ligula ... </a>
							</td>
							<td class="sdate center">
								 1st FEB 2012
							</td>
							<td class="center">
								<span class="badge_style b_high">High</span>
							</td>
							<td class="center">
								<span class="badge_style b_done">Done</span>
							</td>
							<td class="center sdate">
								 3rd FEB 2012
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						<tr>
							<td class="center tr_select ">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">02</a>
							</td>
							<td>
								<a href="#" class="t-complete">Nulla non ante dui, sit amet ... </a>
							</td>
							<td class="sdate center">
								 1st FEB 2012
							</td>
							<td class="center">
								<span class="badge_style b_low">Low</span>
							</td>
							<td class="center">
								<span class="badge_style b_done">Done</span>
							</td>
							<td class="center sdate">
								 3rd FEB 2012
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						<tr>
							<td class="center tr_select ">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">03</a>
							</td>
							<td>
								<a href="#" class="t-complete">Aliquam eu pellentesque... </a>
							</td>
							<td class="sdate center">
								 1st FEB 2012
							</td>
							<td class="center">
								<span class="badge_style b_medium">Medium</span>
							</td>
							<td class="center">
								<span class="badge_style b_done">Done</span>
							</td>
							<td class="center sdate">
								 3rd FEB 2012
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						<tr>
							<td class="center tr_select">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">04</a>
							</td>
							<td>
								<a href="#">Maecenas egestas alique... </a>
							</td>
							<td class="sdate center">
								 1st FEB 2012
							</td>
							<td class="center">
								<span class="badge_style b_high">High</span>
							</td>
							<td class="center">
								<span class="badge_style b_pending">Pending</span>
							</td>
							<td class="center sdate">
								 -
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						<tr>
							<td class="center tr_select">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">04</a>
							</td>
							<td>
								<a href="#">Maecenas egestas alique... </a>
							</td>
							<td class="sdate center">
								 1st FEB 2012
							</td>
							<td class="center">
								<span class="badge_style b_high">High</span>
							</td>
							<td class="center">
								<span class="badge_style b_pending">Pending</span>
							</td>
							<td class="center sdate">
								 -
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						<tr>
							<td class="center tr_select">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">04</a>
							</td>
							<td>
								<a href="#">Maecenas egestas alique... </a>
							</td>
							<td class="sdate center">
								 1st FEB 2012
							</td>
							<td class="center">
								<span class="badge_style b_high">High</span>
							</td>
							<td class="center">
								<span class="badge_style b_pending">Pending</span>
							</td>
							<td class="center sdate">
								 -
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						<tr>
							<td class="center tr_select">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">04</a>
							</td>
							<td>
								<a href="#">Maecenas egestas alique... </a>
							</td>
							<td class="sdate center">
								 1st FEB 2012
							</td>
							<td class="center">
								<span class="badge_style b_high">High</span>
							</td>
							<td class="center">
								<span class="badge_style b_pending">Pending</span>
							</td>
							<td class="center sdate">
								 -
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						
						</tbody>
					    </table>
						</div>
						<div id="tab5">
							<div class="widget_top" style="text-align: end;">
								<!-- <div class="form_input" style="padding: 5px 5px;">
										<button type="button" class="btn_small btn_orange"><span>Add Payment</span></button>
										<button type="button" class="btn_small btn_orange"><span>Adv. Search</span></button>
									</div> -->
									<div class="btn_30_light">
									<a href="#"><span class="icon add_co"></span></a>
									</div>
									<div class="btn_30_light">
									<a href="#"><span class="icon magnifier_zoom_in_co"></span></a>
									</div>
								<div class="btn_30_light">
									<a href="#"><span class="icon doc_excel_csv_co"></span></a>
								</div>
								<div class="btn_30_light">
									<a href="#"><span class="icon doc_pdf_co"></span></a>
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
								 Customer Name
							</th>
							<th>
								Method
							</th>
							<th>
								 Amount
							</th>
							<th>
								 Status
							</th>
							<th>
								 Complete Date
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
								<a href="#" class="t-complete">Pellentesque ut massa ut ligula ... </a>
							</td>
							<td class="sdate center">
								<span class="badge_style b_high">Cash</span>
							</td>
							<td class="center">
								$2000
							</td>
							<td class="center">
								<span class="badge_style b_done">Done</span>
							</td>
							<td class="center sdate">
								 3rd FEB 2012
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						<tr>
							<td class="center tr_select ">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">02</a>
							</td>
							<td>
								<a href="#" class="t-complete">Nulla non ante dui, sit amet ... </a>
							</td>
							<td class="sdate center">
								<span class="badge_style b_low"> Cheque</span>
							</td>
							<td class="center">
								$9087
							</td>
							<td class="center">
								<span class="badge_style b_done">Done</span>
							</td>
							<td class="center sdate">
								 3rd FEB 2012
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						<tr>
							<td class="center tr_select ">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">03</a>
							</td>
							<td>
								<a href="#" class="t-complete">Aliquam eu pellentesque... </a>
							</td>
							<td class="sdate center">
								<span class="badge_style b_medium"> UPI</span>
							</td>
							<td class="center">
								$967857
							</td>
							<td class="center">
								<span class="badge_style b_done">Done</span>
							</td>
							<td class="center sdate">
								 3rd FEB 2012
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						<tr>
							<td class="center tr_select">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">04</a>
							</td>
							<td>
								<a href="#">Maecenas egestas alique... </a>
							</td>
							<td class="sdate center">
								 1st FEB 2012
							</td>
							<td class="center">
								<span class="badge_style b_high">High</span>
							</td>
							<td class="center">
								<span class="badge_style b_pending">Pending</span>
							</td>
							<td class="center sdate">
								 -
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						<tr>
							<td class="center tr_select">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">04</a>
							</td>
							<td>
								<a href="#">Maecenas egestas alique... </a>
							</td>
							<td class="sdate center">
								 1st FEB 2012
							</td>
							<td class="center">
								<span class="badge_style b_high">High</span>
							</td>
							<td class="center">
								<span class="badge_style b_pending">Pending</span>
							</td>
							<td class="center sdate">
								 -
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						<tr>
							<td class="center tr_select">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">04</a>
							</td>
							<td>
								<a href="#">Maecenas egestas alique... </a>
							</td>
							<td class="sdate center">
								 1st FEB 2012
							</td>
							<td class="center">
								<span class="badge_style b_high">High</span>
							</td>
							<td class="center">
								<span class="badge_style b_pending">Pending</span>
							</td>
							<td class="center sdate">
								 -
							</td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						
						</tbody>
					    </table>
						</div>
						<div id="tab6">
							<div class="widget_top" style="text-align: end;">
								<!-- <div class="form_input" style="padding: 5px 5px;">
										<button type="button" class="btn_small btn_blue"><span>Add Dues</span></button>
										<button type="button" class="btn_small btn_blue"><span>Adv. Search</span></button>
									</div> -->
									<div class="btn_30_light">
									<a href="#"><span class="icon add_co"></span></a>
									</div>
									<div class="btn_30_light">
									<a href="#"><span class="icon magnifier_zoom_in_co"></span></a>
									</div>
								<div class="btn_30_light">
									<a href="#"><span class="icon doc_excel_csv_co"></span></a>
								</div>
								<div class="btn_30_light">
									<a href="#"><span class="icon doc_pdf_co"></span></a>
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
								 Email
							</th>
							<th>
								 Mobile No.
							</th>
							<th>Payment</th>
							<th>Discount</th>
							<th>Due Date</th>
							<th>Total Pay</th>
							<th>
								 Status
							</th>
							<!-- <th>
								 Complete Date
							</th> -->
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
								<a href="#" class="t-complete">Maheshwar </a>
							</td>
							<td class="sdate center">
								 mp@gmail.com
							</td>
							<td class="center">
								99375647574
							</td>
							<td class="center">
								$89
							</td>
							<td class="center sdate">
								$2
							</td>
							<td class="sdate center">
								 1st FEB 2012
							</td>
							<td>$898776</td>
							<td><span class="badge_style b_success">Success</span></td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						<tr>
							<td class="center tr_select ">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">02</a>
							</td>
							<td>
								<a href="#" class="t-complete">Maheshwar </a>
							</td>
							<td class="sdate center">
								 mp@gmail.com
							</td>
							<td class="center">
								99375647574
							</td>
							<td class="center">
								$89
							</td>
							<td class="center sdate">
								$2
							</td>
							<td class="sdate center">
								 1st FEB 2012
							</td>
							<td>$898776</td>
							<td><span class="badge_style b_done">Done</span></td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						<tr>
							<td class="center tr_select ">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">03</a>
							</td>
							<td>
								<a href="#" class="t-complete">Maheshwar </a>
							</td>
							<td class="sdate center">
								 mp@gmail.com
							</td>
							<td class="center">
								99375647574
							</td>
							<td class="center">
								$89
							</td>
							<td class="center sdate">
								$2
							</td>
							<td class="sdate center">
								 1st FEB 2012
							</td>
							<td>$898776</td>
							<td><span class="badge_style b_pending">Pending</span></td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						<tr>
							<td class="center tr_select ">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">04</a>
							</td>
							<td>
								<a href="#" class="t-complete">Maheshwar </a>
							</td>
							<td class="sdate center">
								 mp@gmail.com
							</td>
							<td class="center">
								99375647574
							</td>
							<td class="center">
								$89
							</td>
							<td class="center sdate">
								$2
							</td>
							<td class="sdate center">
								 1st FEB 2012
							</td>
							<td>$898776</td>
							<td><span class="badge_style b_pending">Pending</span></td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						<tr>
							<td class="center tr_select ">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">05</a>
							</td>
							<td>
								<a href="#" class="t-complete">Maheshwar </a>
							</td>
							<td class="sdate center">
								 mp@gmail.com
							</td>
							<td class="center">
								99375647574
							</td>
							<td class="center">
								$89
							</td>
							<td class="center sdate">
								$2
							</td>
							<td class="sdate center">
								 1st FEB 2012
							</td>
							<td>$898776</td>
							<td><span class="badge_style b_done">Done</span></td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						<tr>
							<td class="center tr_select ">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">06</a>
							</td>
							<td>
								<a href="#" class="t-complete">Maheshwar </a>
							</td>
							<td class="sdate center">
								 mp@gmail.com
							</td>
							<td class="center">
								99375647574
							</td>
							<td class="center">
								$89
							</td>
							<td class="center sdate">
								$2
							</td>
							<td class="sdate center">
								 1st FEB 2012
							</td>
							<td>$898776</td>
							<td><span class="badge_style b_high">High</span></td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						<tr>
							<td class="center tr_select ">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">07</a>
							</td>
							<td>
								<a href="#" class="t-complete">Maheshwar </a>
							</td>
							<td class="sdate center">
								 mp@gmail.com
							</td>
							<td class="center">
								99375647574
							</td>
							<td class="center">
								$89
							</td>
							<td class="center sdate">
								$2
							</td>
							<td class="sdate center">
								 1st FEB 2012
							</td>
							<td>$898776</td>
							<td><span class="badge_style b_high">High</span></td>
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						
						</tbody>
					    </table>
						</div>
						<div id="tab7">
							<div class="widget_top" style="text-align: end;">
							<!-- 	<div class="form_input" style="padding: 5px 5px;">
										<button type="button" class="btn_small btn_gray"><span>Search</span></button>
										<button type="button" class="btn_small btn_gray"><span>Adv. Search</span></button>
									</div> -->
									<div class="btn_30_light">
									<a href="#"><span class="icon add_co"></span></a>
									</div>
									<div class="btn_30_light">
									<a href="#"><span class="icon magnifier_zoom_in_co"></span></a>
									</div>
								<div class="btn_30_light">
									<a href="#"><span class="icon doc_excel_csv_co"></span></a>
								</div>
								<div class="btn_30_light">
									<a href="#"><span class="icon doc_pdf_co"></span></a>
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
							<th>Invoice No.</th>
							<th>A/C No.</th>
							<th>A/C Name</th>
							<th>Amount</th>
							<th>Txn Type</th>
							<th>Txn Date</th>
							<th>Branch Name</th>
							<!-- <th>
								 Status
							</th> -->
							
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
								<a href="#">37436435476</a>
							</td>
							<td>
								<a href="#" class="t-complete">MPNANDAN </a>
							</td>
							<td class="sdate center">
								<a href="#"> #47365476</a>
							</td>
							<td class="sdate center">
								 835265236
							</td>
							<td class="sdate center">
								 Saving 
							</td>
							<td class="sdate center">
								 $8765
							</td>
							
							<td class="sdate center">
								 Cr.
							</td>
							<td class="center">
								 1st FEB 2012
							</td>
							<td class="center">
								Shalimar Bagh
							</td>
							
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						<tr>
							<td class="center tr_select ">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">37436435476</a>
							</td>
							<td>
								<a href="#" class="t-complete">MPNANDAN </a>
							</td>
							<td class="sdate center">
								<a href="#"> #47365476</a>
							</td>
							<td class="sdate center">
								 835265236
							</td>
							<td class="sdate center">
								 Saving 
							</td>
							<td class="sdate center">
								 $8765
							</td>
							
							<td class="sdate center">
								 Cr.
							</td>
							<td class="center">
								 1st FEB 2012
							</td>
							<td class="center">
								Shalimar Bagh
							</td>
							
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						<tr>
							<td class="center tr_select ">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">37436435476</a>
							</td>
							<td>
								<a href="#" class="t-complete">MPNANDAN </a>
							</td>
							<td class="sdate center">
								<a href="#"> #47365476</a>
							</td>
							<td class="sdate center">
								 835265236
							</td>
							<td class="sdate center">
								 Saving 
							</td>
							<td class="sdate center">
								 $8765
							</td>
							
							<td class="sdate center">
								 Cr.
							</td>
							<td class="center">
								 1st FEB 2012
							</td>
							<td class="center">
								Shalimar Bagh
							</td>
							
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						<tr>
							<td class="center tr_select ">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">37436435476</a>
							</td>
							<td>
								<a href="#" class="t-complete">MPNANDAN </a>
							</td>
							<td class="sdate center">
								<a href="#"> #47365476</a>
							</td>
							<td class="sdate center">
								 835265236
							</td>
							<td class="sdate center">
								 Saving 
							</td>
							<td class="sdate center">
								 $8765
							</td>
							
							<td class="sdate center">
								 Cr.
							</td>
							<td class="center">
								 1st FEB 2012
							</td>
							<td class="center">
								Shalimar Bagh
							</td>
							
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						<tr>
							<td class="center tr_select ">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">37436435476</a>
							</td>
							<td>
								<a href="#" class="t-complete">MPNANDAN </a>
							</td>
							<td class="sdate center">
								<a href="#"> #47365476</a>
							</td>
							<td class="sdate center">
								 835265236
							</td>
							<td class="sdate center">
								 Saving 
							</td>
							<td class="sdate center">
								 $8765
							</td>
							
							<td class="sdate center">
								 Cr.
							</td>
							<td class="center">
								 1st FEB 2012
							</td>
							<td class="center">
								Shalimar Bagh
							</td>
							
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						<tr>
							<td class="center tr_select ">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">37436435476</a>
							</td>
							<td>
								<a href="#" class="t-complete">MPNANDAN </a>
							</td>
							<td class="sdate center">
								<a href="#"> #47365476</a>
							</td>
							<td class="sdate center">
								 835265236
							</td>
							<td class="sdate center">
								 Saving 
							</td>
							<td class="sdate center">
								 $8765
							</td>
							
							<td class="sdate center">
								 Cr.
							</td>
							<td class="center">
								 1st FEB 2012
							</td>
							<td class="center">
								Shalimar Bagh
							</td>
							
							<td class="center">
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete confirm_dialog" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						<tr>
							<td class="center tr_select ">
								<input name="checkbox" type="checkbox" value="">
							</td>
							<td>
								<a href="#">37436435476</a>
							</td>
							<td>
								<a href="#" class="t-complete">MPNANDAN </a>
							</td>
							<td class="sdate center">
								<a href="#"> #47365476</a>
							</td>
							<td class="sdate center">
								 835265236
							</td>
							<td class="sdate center">
								 Saving 
							</td>
							<td class="sdate center">
								 $8765
							</td>
							
							<td class="sdate center">
								 Cr.
							</td>
							<td class="center">
								 1st FEB 2012
							</td>
							<td class="center">
								Shalimar Bagh
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