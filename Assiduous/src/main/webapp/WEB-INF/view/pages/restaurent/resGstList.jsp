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
		<span class="title_icon"><span class="bank_3"></span></span>
		<h3>GST</h3>
		
	</div>
	
	<div id="content">
	
		<div class="grid_container">
		
		<div class="grid_12 full_block">
				<div class="widget_wrap tabby">
					<div class="widget_top">
						<span class="h_icon list"></span>
						<h6>Tabby Widget</h6>
						<div id="widget_tab">
							<ul>
								<li><a href="#tab1" class="active_tab">Statistics</a></li>
								<li><a href="#tab2">Recent Post<span class="alert_notify orange">30</span></a></li>
								<li><a href="#tab3">Recent User</a></li>
							</ul>
						</div>
					</div>
					<div class="widget_content">
						<div id="tab1">
							<div class="widget_top" style="text-align: end;">
								<div class="form_input" style="padding: 5px 5px;">
										<button type="submit" class="btn_small btn_blue"><span>Submit</span></button>
										<button type="reset" class="btn_small btn_blue"><span>Reset</span></button>
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
								 Task
							</th>
							<th>
								 Dead Line
							</th>
							<th>
								 Priority
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
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
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
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
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
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
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
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
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
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
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
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
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
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
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
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
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
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
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
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
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
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
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
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						</tbody>
						<!-- <tfoot>
						<tr>
							<th class="center">
								<input name="checkbox" type="checkbox" value="" class="checkall">
							</th>
							<th>
								 Id
							</th>
							<th>
								 Task
							</th>
							<th>
								 Dead Line
							</th>
							<th>
								 Priority
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
						</tfoot> -->
						</table>
							
						</div>
						<div id="tab2">
							<div class="widget_top" style="text-align: end;">
								<div class="form_input" style="padding: 5px 5px;">
										<button type="submit" class="btn_small btn_blue"><span>Submit</span></button>
										<button type="reset" class="btn_small btn_blue"><span>Reset</span></button>
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
								 Task
							</th>
							<th>
								 Dead Line
							</th>
							<th>
								 Priority
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
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
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
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
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
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
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
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
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
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
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
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
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
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
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
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
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
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
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
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
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
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
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
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						</tbody>
						<!-- <tfoot>
						<tr>
							<th class="center">
								<input name="checkbox" type="checkbox" value="" class="checkall">
							</th>
							<th>
								 Id
							</th>
							<th>
								 Task
							</th>
							<th>
								 Dead Line
							</th>
							<th>
								 Priority
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
						</tfoot> -->
						</table>
							
							
						</div>
						<div id="tab3">
							<div class="widget_top" style="text-align: end;">
								<div class="form_input" style="padding: 5px 5px;">
										<button type="submit" class="btn_small btn_blue"><span>Submit</span></button>
										<button type="reset" class="btn_small btn_blue"><span>Reset</span></button>
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
								 Task
							</th>
							<th>
								 Dead Line
							</th>
							<th>
								 Priority
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
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
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
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
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
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
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
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
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
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
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
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
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
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
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
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
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
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
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
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
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
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
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
								<span><a class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a class="action-icons c-delete" href="#" title="delete">Delete</a></span><span><a class="action-icons c-approve" href="#" title="Approve">Done</a></span>
							</td>
						</tr>
						</tbody>
						<!-- <tfoot>
						<tr>
							<th class="center">
								<input name="checkbox" type="checkbox" value="" class="checkall">
							</th>
							<th>
								 Id
							</th>
							<th>
								 Task
							</th>
							<th>
								 Dead Line
							</th>
							<th>
								 Priority
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
						</tfoot> -->
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