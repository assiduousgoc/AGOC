<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>  
<%@ page import="com.ass.smtfp.model.UserData"%>
<%@ page import="com.ass.smtfp.enums.UserRole"%>
<%@ page import="java.util.*"%>
<%
UserData user = (UserData)request.getSession().getAttribute("user"); 
String role =user.getRole().name();
%>
<!-- Navigation start -->
  <div class="sidebar" id="sidebar">
            <div class="sidebar-inner slimscroll">
                <div id="sidebar-menu" class="sidebar-menu">
                    <ul>
                        <li class="menu-title" style="text-align: center;font-size: x-large;font-family: fantasy;color: cornsilk;margin-left: -43px;">
                         <%
						if (user != null && role.equals("SUPERADMIN")) {
						%>
                        &nbsp; AGMS ( S. ADMIN )
                        <%}else if (user != null && role.equals("ADMIN")) { %>
                         &nbsp; AGMS ( ADMIN )
                        <%}else{ %>
                         &nbsp; AGMS ( TRAINER )
                        <%} %>
                        </li>
                        <li class="active">
                            <a href="gymdashboard.htm"><i class="fa fa-dashboard"></i> Dashboard</a>
                        </li>
                         <%
						if (user != null && role.equals("SUPERADMIN")) {
						%>
						<li class="submenu">
							<a href="#"><i class="fa fa-plus-circle"></i> <span> Master </span> <span class="menu-arrow"></span></a>
							<ul style="display: none; background-color: #ffffff;" >
								<li style="background-color: #6f6d6d;"><a href="gyms.htm" style="color: #fbfbfb;border-bottom: white solid 1px;font-weight: bold;"><i class="fa fa-plus-circle"></i>Gym </a></li>
								<li style="background-color: #6f6d6d;"><a href="branches.htm" style="color: #fbfbfb;border-bottom: white solid 1px;font-weight: bold;"><i class="fa fa-plus-circle"></i>Branch</a></li>
								<li style="background-color: #6f6d6d;"><a href="users.htm" style="color: #fbfbfb;border-bottom: white solid 1px;font-weight: bold;"><i class="fa fa-plus-circle"></i>User</a></li>
							</ul>	
						</li>
						<li class="submenu">
							<a href="#"><i class="fa fa-plus-circle"></i> <span> Location </span> <span class="menu-arrow"></span></a>
							<ul style="display: none; background-color: #ffffff;" >
								<li style="background-color: #6f6d6d;"><a href="countries.htm" style="color: #fbfbfb;border-bottom: white solid 1px;font-weight: bold;"><i class="fa fa-plus-circle"></i>Country</a></li>
								<li style="background-color: #6f6d6d;"><a href="states.htm" style="color: #fbfbfb;border-bottom: white solid 1px;font-weight: bold;"><i class="fa fa-plus-circle"></i>State</a></li>
								<li style="background-color: #6f6d6d;"><a href="cities.htm" style="color: #fbfbfb;border-bottom: white solid 1px;font-weight: bold;"><i class="fa fa-plus-circle"></i>City</a></li>
								<li style="background-color: #6f6d6d;"><a href="locations.htm" style="color: #fbfbfb;border-bottom: white solid 1px;font-weight: bold;"><i class="fa fa-plus-circle"></i>Location</a></li>
							</ul>	
						</li>
						<li>
                            <a href="gymSetting.htm" style="border-bottom: 3px solid #ffff;"><i class="fa fa-gears"></i> Setting</a>
                        </li>
						<%}else if(user != null && role.equals("ADMIN")){ %>
                         <li>
                            <a href="attendance.htm"><i class="fa fa-users"></i> Attendance</a>
                        </li>
                        <li class="submenu">
							<a href="#"><i class="fa fa-plus-circle"></i> <span> Master </span> <span class="menu-arrow"></span></a>
							<ul style="display: none; background-color: #ffffff;" >
								<li style="background-color: #6f6d6d;"><a href="courseList.htm" style="color: #fbfbfb;border-bottom: white solid 1px;font-weight: bold;"><i class="fa fa-plus-circle"></i>Course</a></li>
								<li style="background-color: #6f6d6d;"><a href="roomList.htm" style="color: #fbfbfb;border-bottom: white solid 1px;font-weight: bold;"><i class="fa fa-plus-circle"></i>Rooms </a></li>
								<li style="background-color: #6f6d6d;"><a href="trainerList.htm" style="color: #fbfbfb;border-bottom: white solid 1px;font-weight: bold;"><i class="fa fa-plus-circle"></i>Trainers</a></li>
								<li style="background-color: #6f6d6d;"><a href="courseSchedule.htm" style="color: #fbfbfb;border-bottom: white solid 1px;font-weight: bold;"><i class="fa fa-plus-circle"></i>Course Schedule</a></li>
								<li style="background-color: #6f6d6d;"><a href="branches.htm" style="color: #fbfbfb;border-bottom: white solid 1px;font-weight: bold;"><i class="fa fa-plus-circle"></i>Branch</a></li>
								<li style="background-color: #6f6d6d;"><a href="users.htm" style="color: #fbfbfb;border-bottom: white solid 1px;font-weight: bold;"><i class="fa fa-plus-circle"></i>User</a></li>
							</ul>
						</li>
						<li class="submenu">
							<a href="#"><i class="fa fa-plus-circle"></i> <span> Account </span> <span class="menu-arrow"></span></a>
							<ul style="display: none; background-color: #ffffff;" >
								<li style="background-color: #6f6d6d;"><a href="payments.htm" style="color: #fbfbfb;border-bottom: white solid 1px;font-weight: bold;"><i class="fa fa-plus-circle"></i>Payment</a></li>
								<li style="background-color: #6f6d6d;"><a href="dues.htm" style="color: #fbfbfb;border-bottom: white solid 1px;font-weight: bold;"><i class="fa fa-plus-circle"></i>Dues</a></li>
								<li style="background-color: #6f6d6d;"><a href="ledgers.htm" style="color: #fbfbfb;border-bottom: white solid 1px;font-weight: bold;"><i class="fa fa-plus-circle"></i>Ledger</a></li>
								<li style="background-color: #6f6d6d;"><a href="trainees.htm" style="color: #fbfbfb;border-bottom: white solid 1px;font-weight: bold;"><i class="fa fa-plus-circle"></i>Trainee</a></li>
								
							</ul>
						</li>
						<li class="submenu">
							<a href="#"><i class="fa fa-plus-circle"></i> <span> Location </span> <span class="menu-arrow"></span></a>
							<ul style="display: none; background-color: #ffffff;" >
								<li style="background-color: #6f6d6d;"><a href="locations.htm" style="color: #fbfbfb;border-bottom: white solid 1px;font-weight: bold;"><i class="fa fa-plus-circle"></i>Location</a></li>
							</ul>	
						</li>
						
                        <li>
                            <a href="couponList.htm"><i class="fa fa-cog"></i> Coupons</a>
                        </li>
                        <li class="submenu">
							<a href="#"><i class="fa fa-fw fa-calendar"></i> <span> Events </span> <span class="menu-arrow"></span></a>
							<ul style="display: none; background-color: #ffffff;" >
								<li style="background-color: #6f6d6d;"><a href="#" style="color: #fbfbfb;border-bottom: white solid 1px;font-weight: bold;"><i class="fa fa-plus-circle"></i>Event List </a></li>
								<li style="background-color: #6f6d6d;"><a href="#" style="color: #fbfbfb;border-bottom: white solid 1px;font-weight: bold;"><i class="fa fa-plus-circle"></i>Event Items </a></li>
							</ul>
						</li>
                         <li>
                            <a href="#"><i class="fa fa-cog"></i> Class Calendar</a>
                        </li>
                      
                        <li class="submenu">
							<a href="#"><i class="fa fa-plus-circle"></i> <span> Invoice </span> <span class="menu-arrow"></span></a>
							<ul style="display: none; background-color: #ffffff;" >
								<li style="background-color: #6f6d6d;"><a href="#" style="color: #fbfbfb;border-bottom: white solid 1px;font-weight: bold;"><i class="fa fa-plus-circle"></i>Invoice List </a></li>
								<li style="background-color: #6f6d6d;"><a href="#" style="color: #fbfbfb;border-bottom: white solid 1px;font-weight: bold;"><i class="fa fa-plus-circle"></i>Invoice Detail</a></li>
							</ul>
						</li>
                        <li>
                            <a href="#"><i class="fa fa-suitcase"></i> Club Information</a>
                        </li>
                        <%}else{ %>
                        <li>
                            <a href="attendance.htm"><i class="fa fa-users"></i> Attendance</a>
                        </li>
                        <li class="submenu">
							<a href="#"><i class="fa fa-plus-circle"></i> <span> Master </span> <span class="menu-arrow"></span></a>
							<ul style="display: none; background-color: #ffffff;" >
								<li style="background-color: #6f6d6d;"><a href="courseList.htm" style="color: #fbfbfb;border-bottom: white solid 1px;font-weight: bold;"><i class="fa fa-plus-circle"></i>Course</a></li>
								<li style="background-color: #6f6d6d;"><a href="roomList.htm" style="color: #fbfbfb;border-bottom: white solid 1px;font-weight: bold;"><i class="fa fa-plus-circle"></i>Rooms </a></li>
								<li style="background-color: #6f6d6d;"><a href="courseSchedule.htm" style="color: #fbfbfb;border-bottom: white solid 1px;font-weight: bold;"><i class="fa fa-plus-circle"></i>Course Schedule</a></li>
							</ul>
						</li>
						<li class="submenu">
							<a href="#"><i class="fa fa-plus-circle"></i> <span> Account </span> <span class="menu-arrow"></span></a>
							<ul style="display: none; background-color: #ffffff;" >
								<li style="background-color: #6f6d6d;"><a href="trainees.htm" style="color: #fbfbfb;border-bottom: white solid 1px;font-weight: bold;"><i class="fa fa-plus-circle"></i>Trainee</a></li>
							</ul>
						</li>
                        <%} %>
                    </ul>
                </div>
            </div>
        </div>
			<!-- Navigation end -->