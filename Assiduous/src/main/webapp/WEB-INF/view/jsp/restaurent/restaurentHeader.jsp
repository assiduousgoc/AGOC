<%-- <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    session=request.getSession(true);

    if(session.getAttribute("user")==null)
    {
        response.sendRedirect("/OM");
    }
%>
<!-- Header start -->
		<div class="headerR" style="border-bottom: 2px solid #ffff;">
            <div class="header-left">
                <a href="index.html" class="logo" style="color: #ffff;font-weight: bold;font-family: auto;font-size: 16px;">
                    <img src="${pageContext.request.contextPath}/static/hospital/assets/img/CompanyLogo.jpg" width="35" height="35" alt="" style="margin-top: -5px;"> &nbsp;Assiduous Restaurant Management System
                </a>
            </div>
           <a id="mobile_btn" class="mobile_btn float-left" href="#sidebar"><i class="fa fa-bars"></i></a>
            
            <ul class="nav user-menu float-right">
                <li class="nav-item dropdown d-none d-sm-block">
                    <a href="#" class="dropdown-toggle nav-link" data-toggle="dropdown"><i class="fa fa-bell-o"></i> <span class="badge badge-pill bg-danger float-right">3</span></a>
                    <div class="dropdown-menu notifications">
                        <div class="topnav-dropdown-header">
                            <span>Notifications</span>
                        </div>
                        <div class="drop-scroll">
                            <ul class="notification-list">
                                <li class="notification-message">
                                    <a href="activities.html">
                                        <div class="media">
											<span class="avatar">
												<img alt="John Doe" src="${pageContext.request.contextPath}/static/hospital/assets/img/user.jpg" class="img-fluid">
											</span>
											<div class="media-body">
												<p class="noti-details"><span class="noti-title">John Doe</span> added new task <span class="noti-title">Patient appointment booking</span></p>
												<p class="noti-time"><span class="notification-time">4 mins ago</span></p>
											</div>
                                        </div>
                                    </a>
                                </li>
                                <li class="notification-message">
                                    <a href="activities.html">
                                        <div class="media">
											<span class="avatar">V</span>
											<div class="media-body">
												<p class="noti-details"><span class="noti-title">Tarah Shropshire</span> changed the task name <span class="noti-title">Appointment booking with payment gateway</span></p>
												<p class="noti-time"><span class="notification-time">6 mins ago</span></p>
											</div>
                                        </div>
                                    </a>
                                </li>
                                <li class="notification-message">
                                    <a href="activities.html">
                                        <div class="media">
											<span class="avatar">L</span>
											<div class="media-body">
												<p class="noti-details"><span class="noti-title">Misty Tison</span> added <span class="noti-title">Domenic Houston</span> and <span class="noti-title">Claire Mapes</span> to project <span class="noti-title">Doctor available module</span></p>
												<p class="noti-time"><span class="notification-time">8 mins ago</span></p>
											</div>
                                        </div>
                                    </a>
                                </li>
                                <li class="notification-message">
                                    <a href="activities.html">
                                        <div class="media">
											<span class="avatar">G</span>
											<div class="media-body">
												<p class="noti-details"><span class="noti-title">Rolland Webber</span> completed task <span class="noti-title">Patient and Doctor video conferencing</span></p>
												<p class="noti-time"><span class="notification-time">12 mins ago</span></p>
											</div>
                                        </div>
                                    </a>
                                </li>
                                <li class="notification-message">
                                    <a href="activities.html">
                                        <div class="media">
											<span class="avatar">V</span>
											<div class="media-body">
												<p class="noti-details"><span class="noti-title">Bernardo Galaviz</span> added new task <span class="noti-title">Private chat module</span></p>
												<p class="noti-time"><span class="notification-time">2 days ago</span></p>
											</div>
                                        </div>
                                    </a>
                                </li>
                            </ul>
                        </div>
                        <div class="topnav-dropdown-footer">
                            <a href="activities.html">View all Notifications</a>
                        </div>
                    </div>
                </li>
                <li class="nav-item dropdown d-none d-sm-block">
                    <a href="javascript:void(0);" id="open_msg_box" class="hasnotifications nav-link"><i class="fa fa-comment-o"></i> <span class="badge badge-pill bg-danger float-right">8</span></a>
                </li>
                <li class="nav-item dropdown has-arrow">
                    <a href="#" class="dropdown-toggle nav-link user-link" data-toggle="dropdown">
                        <span class="user-img">
							<img class="rounded-circle" src="${pageContext.request.contextPath}/static/hospital/assets/img/user.jpg" width="24" alt="Admin">
							<span class="status online"></span>
						</span>
						<span>Admin</span>
                    </a>
					<div class="dropdown-menu">
						<a class="dropdown-item" href="profile.html">My Profile</a>
						<a class="dropdown-item" href="edit-profile.html">Edit Profile</a>
						<a class="dropdown-item" href="settings.html">Settings</a>
						<a class="dropdown-item" href="logout.htm">Logout</a>
					</div>
                </li>
            </ul>
            <div class="dropdown mobile-user-menu float-right">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><i class="fa fa-ellipsis-v"></i></a>
                <div class="dropdown-menu dropdown-menu-right">
                    <a class="dropdown-item" href="profile.html">My Profile</a>
                    <a class="dropdown-item" href="edit-profile.html">Edit Profile</a>
                    <a class="dropdown-item" href="settings.html">Settings</a>
                    <a class="dropdown-item" href="login.html">Logout</a>
                </div>
            </div>
        </div>
		<!-- Header end --> --%>
		
		<div class="header_left" >
			<div class="logo">
				 <img src="${pageContext.request.contextPath}/static/hospital/assets/img/CompanyLogo.jpg" width="35" height="35" alt="" style="width: 36px;margin-top: 7px; border-radius: 50%;height: 36px;border: 5px solid #f79753;"> &nbsp;
			</div>
			<div id="responsive_mnu">
				<a href="#responsive_menu" class="fg-button" id="hierarchybreadcrumb"><span class="responsive_icon"></span>Menu</a>
				<div id="responsive_menu" class="hidden">
					<ul>
						<li><a href="#"> Dashboard</a>
						<ul>
							<li><a href="dashboard.html">Dashboard Main</a></li>
							<li><a href="dashboard-01.html">Dashboard 01</a></li>
							<li><a href="dashboard-02.html">Dashboard 02</a></li>
							<li><a href="dashboard-03.html">Dashboard 03</a></li>
							<li><a href="dashboard-04.html">Dashboard 04</a></li>
						</ul>
						</li>
						<li><a href="#"> Forms</a>
						<ul>
							<li><a href="form-elements.html">All Forms Elements</a></li>
							<li><a href="left-label-form.html">Left Label Form</a></li>
							<li><a href="top-label-form.html">Top Label Form</a></li>
							<li><a href="form-xtras.html">Additional Forms (3)</a></li>
							<li><a href="form-validation.html">Form Validation</a></li>
							<li><a href="signup-form.html">Signup Form</a></li>
							<li><a href="content-post.html">Content Post Form</a></li>
							<li><a href="wizard.html">wizard</a></li>
						</ul>
						</li>
						<li><a href="table.html"> Tables</a></li>
						<li><a href="ui-elements.html">User Interface Elements</a></li>
						<li><a href="buttons-icons.html">Butons And Icons</a></li>
						<li><a href="widgets.html">All Widgets</a></li>
						<li><a href="#">Pages</a>
						<ul>
							<li><a href="post-preview.html">Content</a></li>
							<li><a href="login-01.html" target="_blank">Login 01</a></li>
							<li><a href="login-02.html" target="_blank">Login 02</a></li>
							<li><a href="login-03.html" target="_blank">Login 03</a></li>
							<li><a href="forgot-pass.html" target="_blank">Forgot Password</a></li>
						</ul>
						</li>
						<li><a href="typography.html">Typography</a></li>
						<li><a href="#">Grid</a>
						<ul>
							<li><a href="content-grid.html">Content Grid</a></li>
							<li><a href="form-grid.html">Form Grid</a></li>
						</ul>
						</li>
						<li><a href="chart.html">Chart/Graph</a></li>
						<li><a href="gallery.html">Gallery</a></li>
						<li><a href="calendar.html">Calendar</a></li>
						<li><a href="file-manager.html">File Manager</a></li>
						<li><a href="#">Error Pages</a>
						<ul>
							<li><a href="403.html" target="_blank">403</a></li>
							<li><a href="404.html" target="_blank">404</a></li>
							<li><a href="505.html" target="_blank">405</a></li>
							<li><a href="500.html" target="_blank">500</a></li>
							<li><a href="503.html" target="_blank">503</a></li>
						</ul>
						</li>
						<li><a href="invoice.html">Invoice</a></li>
						<li><a href="#">Email Templates</a>
						<ul>
							<li><a href="email-templates/forgot-pass-email-template.html" target="_blank">Forgot Password</a></li>
							<li><a href="email-templates/registration-confirmation-email-template.html" target="_blank">Registaion Confirmation</a></li>
						</ul>
						</li>
					</ul>
				</div>
			</div>
		</div>
		<div class="header_right">
			<div id="top_notification">
				<ul>
					<li class="dropdown">
					<a href="#" data-toggle="dropdown" class="dropdown-toggle alert"><span class="icon"></span><span class="alert_notify orange">30</span></a>
					<div class="notification_list dropdown-menu pull-left blue_d">
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
									<a href="#">Donec neque leo, ullamcorper eget aliquet sit amet.</a>
								</div>
								</li>
								<li>
								<div class="nlist_thumb">
									<img src="images/photo_60x60.jpg" width="40" height="40" alt="img">
								</div>
								<div class="list_inf">
									<a href="#">Nam euismod dolor ac lacus facilisis imperdiet.</a>
								</div>
								</li>
							</ul>
							<span class="btn_24_blue"><a href="#">View All</a></span>
						</div>
					</div>
					</li>
					<li class="inbox dropdown">
					<a href="#" data-toggle="dropdown" class="dropdown-toggle"><span class="icon"></span><span class="alert_notify blue">30</span></a>
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
									<a href="#">Donec neque leo, ullamcorper eget aliquet sit amet.</a>
								</div>
								</li>
								<li>
								<div class="nlist_thumb">
									<img src="images/photo_60x60.jpg" width="40" height="40" alt="img">
								</div>
								<div class="list_inf">
									<a href="#">Nam euismod dolor ac lacus facilisis imperdiet.</a>
								</div>
								</li>
							</ul>
							<span class="btn_24_blue"><a href="#">View All</a></span>
						</div>
					</div>
					</li>
				</ul>
			</div>
			<div id="user_nav">
				<ul>
					<li class="user_thumb"><a href="#"><span class="icon"><img src="images/user_thumb.png" width="30" height="30" alt="User"></span></a></li>
					<li class="user_info"><span class="user_name">Administrator</span><span><a href="#">Profile</a> &#124; <a href="#">Settings</a> &#124; <a href="#">Help&#63;</a></span></li>
					<li class="logout"><a href="logout.htm"><span class="icon"  style="border-radius: 50px;"></span>Logout</a></li>
				</ul>
			</div>
		</div>