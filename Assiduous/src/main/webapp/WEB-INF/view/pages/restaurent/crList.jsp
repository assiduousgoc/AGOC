<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><div class="grid_12">
<script type="text/javascript"  src="<c:url value='/static/restaurent/js/jquery-1.7.1.min.js'/>"></script>								
<script type="text/javascript" src="<c:url value='/static/restaurent/js/TableTools.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/jeditable.jquery.js'/>"></script>

				<div class="widget_wrap">
					<div class="widget_top">
						<span class="h_icon blocks_images"></span>
						<h6>Task List</h6>
					</div>
					<div class="widget_content">
						<h3>Task list with label badge</h3>
						<p>
							 Cras erat diam, consequat quis tincidunt nec, eleifend a turpis. Aliquam ultrices feugiat metus, ut imperdiet erat mollis at. Curabitur mattis risus sagittis nibh lobortis vel.
						</p>
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
						</tbody>
						<tfoot>
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
						</tfoot>
						</table>
					</div>
				</div>
			</div>