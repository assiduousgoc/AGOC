<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>  
<%@ page import="com.ass.smtfp.model.UserData"%>
<%@ page import="com.ass.smtfp.enums.UserRole"%>
<%@ page import="java.util.*"%>
<%
UserData user = (UserData)request.getSession().getAttribute("user"); 
String role =user.getRole().toString();
%>
<!-- Navigation start -->
  <div class="sidebar" id="sidebar">
            <div class="sidebar-inner slimscroll">
                <div id="sidebar-menu" class="sidebar-menu">
                    <ul>
                        <li class="menu-title" style="text-align: center;font-size: x-large;font-family: fantasy;color: cornsilk;margin-left: -43px;">
                        <%--  <img src="${pageContext.request.contextPath}/static/hospital/assets/img/Logo_Hospital.png" width="35" height="35" alt="" style="margin-top: -5px;"> --%> 
                         <%
						if (user != null && role.equals("SUPERADMIN")) {
						%>
                        &nbsp; AGMS ( SUPER ADMIN )
                        <%}else if (user != null && role.equals("ADMIN")) { %>
                         &nbsp; AGMS ( ADMIN )
                        <%}else{ %>
                         &nbsp; AGMS ( TRAINER )
                        <%} %>
                        </li>
                        <li class="active">
                            <a href="gymdashboard.htm"><i class="fa fa-dashboard"></i> Dashboard</a>
                        </li>
                         <li>
                            <a href="attendance.htm"><i class="fa fa-users"></i> Attendance</a>
                        </li>
						<!-- <li>
                            <a href="doctors.html"><i class="fa fa-sitemap"></i> Menu</a>
                        </li> -->
                        <li class="submenu">
							<a href="#"><i class="fa fa-plus-circle"></i> <span> Course </span> <span class="menu-arrow"></span></a>
							<ul style="display: none; background-color: #ffffff;" >
								<li style="background-color: #6f6d6d;"><a href="courseList.htm" style="color: #fbfbfb;border-bottom: white solid 1px;font-weight: bold;"><i class="fa fa-plus-circle"></i>Course</a></li>
								<li style="background-color: #6f6d6d;"><a href="roomList.htm" style="color: #fbfbfb;border-bottom: white solid 1px;font-weight: bold;"><i class="fa fa-plus-circle"></i>Rooms </a></li>
								<li style="background-color: #6f6d6d;"><a href="trainerList.htm" style="color: #fbfbfb;border-bottom: white solid 1px;font-weight: bold;"><i class="fa fa-plus-circle"></i>Trainers</a></li>
								<li style="background-color: #6f6d6d;"><a href="courseSchedule.htm" style="color: #fbfbfb;border-bottom: white solid 1px;font-weight: bold;"><i class="fa fa-plus-circle"></i>Course Schedule</a></li>
								
								<!-- 							
	<li style="background-color: lavender;"><a href="holidays.html" style="color: #090696;border-bottom: white solid 2px;font-weight: bold;">Holidays</a></li>
								<li style="background-color: lavender;"><a href="attendance.html" style="color: #090696;border-bottom: white solid 2px;font-weight: bold;">Attendance</a></li> -->
							</ul>
						</li>
						 <%
						if (user != null && role.equals("SUPERADMIN")) {
						%>
						<li class="submenu">
							<a href="#"><i class="fa fa-plus-circle"></i> <span> Customers </span> <span class="menu-arrow"></span></a>
							<ul style="display: none; background-color: #ffffff;" >
								<li style="background-color: #6f6d6d;"><a href="gymcustomerList.htm" style="color: #fbfbfb;border-bottom: white solid 1px;font-weight: bold;"><i class="fa fa-plus-circle"></i>Customer List </a></li>
								<li style="background-color: #6f6d6d;"><a href="customersProfile.htm" style="color: #fbfbfb;border-bottom: white solid 1px;font-weight: bold;"><i class="fa fa-plus-circle"></i>Customer Profile</a></li>
								<li style="background-color: #6f6d6d;"><a href="addGymCustomer.htm" style="color: #fbfbfb;border-bottom: white solid 1px;font-weight: bold;"><i class="fa fa-plus-circle"></i>Add Customer </a></li>
								<li style="background-color: #6f6d6d;"><a href="paymentList.htm" style="color: #fbfbfb;border-bottom: white solid 1px;font-weight: bold;"><i class="fa fa-plus-circle"></i>Payments</a></li>
<!-- 								<li style="background-color: lavender;"><a href="holidays.html" style="color: #090696;border-bottom: white solid 2px;font-weight: bold;">Holidays</a></li>
								<li style="background-color: lavender;"><a href="attendance.html" style="color: #090696;border-bottom: white solid 2px;font-weight: bold;">Attendance</a></li> -->
							</ul>	
						</li>
						<%} %>
                        <li>
                            <a href="couponList.htm"><i class="fa fa-cog"></i> Coupons</a>
                        </li>
                        <li class="submenu">
							<a href="#"><i class="fa fa-fw fa-calendar"></i> <span> Events </span> <span class="menu-arrow"></span></a>
							<ul style="display: none; background-color: #ffffff;" >
								<li style="background-color: #6f6d6d;"><a href="#" style="color: #fbfbfb;border-bottom: white solid 1px;font-weight: bold;"><i class="fa fa-plus-circle"></i>Event List </a></li>
								<li style="background-color: #6f6d6d;"><a href="#" style="color: #fbfbfb;border-bottom: white solid 1px;font-weight: bold;"><i class="fa fa-plus-circle"></i>Event Items </a></li>
<!-- 								<li style="background-color: lavender;"><a href="holidays.html" style="color: #090696;border-bottom: white solid 2px;font-weight: bold;">Holidays</a></li>
								<li style="background-color: lavender;"><a href="attendance.html" style="color: #090696;border-bottom: white solid 2px;font-weight: bold;">Attendance</a></li> -->
							</ul>
						</li>
                         <li>
                            <a href="order.htm"><i class="fa fa-cog"></i> Class Calender</a>
                        </li>
                      
                        <li class="submenu">
							<a href="#"><i class="fa fa-plus-circle"></i> <span> Invoice </span> <span class="menu-arrow"></span></a>
							<ul style="display: none; background-color: #ffffff;" >
								<li style="background-color: #6f6d6d;"><a href="#" style="color: #fbfbfb;border-bottom: white solid 1px;font-weight: bold;"><i class="fa fa-plus-circle"></i>Invoice List </a></li>
								<li style="background-color: #6f6d6d;"><a href="#" style="color: #fbfbfb;border-bottom: white solid 1px;font-weight: bold;"><i class="fa fa-plus-circle"></i>Invoice Detail</a></li>
<!-- 							
							</ul>
						</li>
                        <li>
                            <a href="customerList.htm"><i class="fa fa-suitcase"></i> Club Information</a>
                        </li>
                        
						 <li>
                            <a href="gymSetting.htm" style="border-bottom: 3px solid #ffff;"><i class="fa fa-gears"></i> Setting</a>
                        </li>
                      
                    </ul>
                </div>
            </div>
        </div>
			<!-- Navigation end -->