<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="actionsBox" class="actionsBox">
	<div id="actionsBoxMenu" class="menu">
		<span id="cntBoxMenu">0</span> <a class="button box_action">Archive</a>
		<a class="button box_action">Delete</a> <a id="toggleBoxMenu"
			class="open"></a> <a id="closeBoxMenu" class="button t_close">X</a>
	</div>
	<div class="submenu">
		<a class="first box_action">Move...</a> <a class="box_action">Mark
			as read</a> <a class="box_action">Mark as unread</a> <a
			class="last box_action">Spam</a>
	</div>
</div>

<div id="container" style="margin-left: 265px;">

	<div class="page_title">
		<span class="title_icon"><span class="computer_imac"></span></span>
		<h3>Dashboard</h3>

	</div>
	<div class="switch_bar">
		<ul>
			<li><a href="#"><span class="stats_icon current_work_sl"></span><span
					class="label">Analytics</span></a></li>
			<li class="dropdown"><a href="#" data-toggle="dropdown"
				class="dropdown-toggle"><span class="stats_icon user_sl"><span
						class="alert_notify orange">30</span></span><span class="label">
						Users</span></a>
				<div class="notification_list dropdown-menu blue_d">
					<div class="white_lin nlist_block">
						<ul>
							<li>
								<div class="nlist_thumb">
									<img src="images/photo_60x60.jpg" width="40" height="40"
										alt="img">
								</div>
								<div class="list_inf">
									<a href="#">Cras erat diam, consequat quis tincidunt nec,
										eleifend.</a>
								</div>
							</li>
							<li>
								<div class="nlist_thumb">
									<img src="images/photo_60x60.jpg" width="40" height="40"
										alt="img">
								</div>
								<div class="list_inf">
									<a href="#">Donec neque leo, ullamcorper eget aliquet sit
										amet.</a>
								</div>
							</li>
							<li>
								<div class="nlist_thumb">
									<img src="images/photo_60x60.jpg" width="40" height="40"
										alt="img">
								</div>
								<div class="list_inf">
									<a href="#">Nam euismod dolor ac lacus facilisis imperdiet.</a>
								</div>
							</li>
						</ul>
						<span class="btn_24_blue"><a href="#">View All</a></span>
					</div>
				</div></li>
			<li><a href="#"><span
					class="stats_icon administrative_docs_sl"></span><span
					class="label">Content</span></a></li>
			<li><a href="#"><span class="stats_icon finished_work_sl"><span
						class="alert_notify blue">30</span></span><span class="label">Task
						List</span></a></li>
			<li><a href="#"><span class="stats_icon config_sl"></span><span
					class="label">Settings</span></a></li>
			<li><a href="#"><span class="stats_icon archives_sl"></span><span
					class="label">Archive</span></a></li>
			<li><a href="#"><span class="stats_icon address_sl"></span><span
					class="label">Contact</span></a></li>
			<li><a href="#"><span class="stats_icon folder_sl"></span><span
					class="label">Media</span></a></li>
			<li><a href="#"><span class="stats_icon category_sl"></span><span
					class="label">Explorer</span></a></li>
			<li><a href="#"><span class="stats_icon calendar_sl"><span
						class="alert_notify orange">30</span></span><span class="label">Events</span></a></li>
			<li><a href="#"><span class="stats_icon lightbulb_sl"></span><span
					class="label">Support</span></a></li>
			<li><a href="#"><span class="stats_icon bank_sl"><span
						class="alert_notify blue">30</span></span><span class="label">Order
						List</span></a></li>
		</ul>
	</div>
	<div id="content">
		<div class="grid_container">
			<div class="grid_12 full_block"></div>
			<span class="clear"></span> <span class="clear"></span>
			<div class="grid_12">
				<div class="widget_wrap">
					<div class="widget_top">
						<span class="h_icon list_images"></span>
						<h6>Task List</h6>
					</div>
					<div class="widget_content">

						<table class="display" id="action_tbl">
							<thead>
								<tr>
									<th class="center"><input name="checkbox" type="checkbox"
										value="" class="checkall"></th>
									<th>Id</th>
									<th>Task</th>
									<th>Dead Line</th>
									<th>Priority</th>
									<th>Status</th>
									<th>Complete Date</th>
									<th>Action</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td class="center tr_select "><input name="checkbox"
										type="checkbox" value=""></td>
									<td><a href="#">01</a></td>
									<td><a href="#" class="t-complete">Pellentesque ut
											massa ut ligula ... </a></td>
									<td class="sdate center">1st FEB 2012</td>
									<td class="center"><span class="badge_style b_high">High</span>
									</td>
									<td class="center"><span class="badge_style b_done">Done</span>
									</td>
									<td class="center sdate">3rd FEB 2012</td>
									<td class="center"><span><a
											class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a
											class="action-icons c-delete" href="#" title="delete">Delete</a></span><span><a
											class="action-icons c-approve" href="#" title="Approve">Done</a></span>
									</td>
								</tr>
								<tr>
									<td class="center tr_select "><input name="checkbox"
										type="checkbox" value=""></td>
									<td><a href="#">02</a></td>
									<td><a href="#" class="t-complete">Nulla non ante dui,
											sit amet ... </a></td>
									<td class="sdate center">1st FEB 2012</td>
									<td class="center"><span class="badge_style b_low">Low</span>
									</td>
									<td class="center"><span class="badge_style b_done">Done</span>
									</td>
									<td class="center sdate">3rd FEB 2012</td>
									<td class="center"><span><a
											class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a
											class="action-icons c-delete" href="#" title="delete">Delete</a></span><span><a
											class="action-icons c-approve" href="#" title="Approve">Done</a></span>
									</td>
								</tr>
								<tr>
									<td class="center tr_select "><input name="checkbox"
										type="checkbox" value=""></td>
									<td><a href="#">03</a></td>
									<td><a href="#" class="t-complete">Aliquam eu
											pellentesque... </a></td>
									<td class="sdate center">1st FEB 2012</td>
									<td class="center"><span class="badge_style b_medium">Medium</span>
									</td>
									<td class="center"><span class="badge_style b_done">Done</span>
									</td>
									<td class="center sdate">3rd FEB 2012</td>
									<td class="center"><span><a
											class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a
											class="action-icons c-delete" href="#" title="delete">Delete</a></span><span><a
											class="action-icons c-approve" href="#" title="Approve">Done</a></span>
									</td>
								</tr>
								<tr>
									<td class="center tr_select"><input name="checkbox"
										type="checkbox" value=""></td>
									<td><a href="#">04</a></td>
									<td><a href="#">Maecenas egestas alique... </a></td>
									<td class="sdate center">1st FEB 2012</td>
									<td class="center"><span class="badge_style b_high">High</span>
									</td>
									<td class="center"><span class="badge_style b_pending">Pending</span>
									</td>
									<td class="center sdate">-</td>
									<td class="center"><span><a
											class="action-icons c-edit" href="#" title="Edit">Edit</a></span><span><a
											class="action-icons c-delete" href="#" title="delete">Delete</a></span><span><a
											class="action-icons c-approve" href="#" title="Approve">Done</a></span>
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