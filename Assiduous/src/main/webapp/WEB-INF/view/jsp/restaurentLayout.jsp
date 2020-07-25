<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>  

<html lang="en">

<head>
		<meta charset="utf-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
	    <link rel="shortcut icon" type="image/x-icon" href="assets/img/favicon.ico">
		<link href="https://fonts.googleapis.com/css?family=Fira+Sans:400,500,600,700" rel="stylesheet">
    	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
		
		<link href="<c:url value='/static/hospital/assets/css/bootstrap.min.css' />"  rel="stylesheet"></link>
		<link href="<c:url value='/static/hospital/assets/css/font-awesome.min.css' />"  rel="stylesheet"></link>
		<link href="<c:url value='/static/hospital/assets/css/fullcalendar.min.css' />"  rel="stylesheet"></link>
		<link href="<c:url value='/static/hospital/assets/css/dataTables.bootstrap4.min.css' />"  rel="stylesheet"></link>
		<link href="<c:url value='/static/hospital/assets/css/select2.min.css' />"  rel="stylesheet"></link>
		<link href="<c:url value='/static/hospital/assets/css/bootstrap-datetimepicker.min.css' />"  rel="stylesheet"></link>
		<link href="<c:url value='/static/hospital/assets/plugins/morris/morris.css' />"  rel="stylesheet"></link>
		<link href="<c:url value='/static/restaurent/style.css' />"  rel="stylesheet"></link>
	

 
</head>
 
<body>
<%-- <%
    session=request.getSession(true);
System.out.println("-------------->"+session.getAttribute("user"));
    if(session.getAttribute("user")==null)
    {
        response.sendRedirect("redirect:/");
    }
%> --%>
<!-- Loading starts -->
		<!-- <div id="loading-wrapper">
			<div class='spinner-wrapper'>
				<div class='spinner'>
					<div class='inner'></div>
				</div>
				<div class='spinner'>
					<div class='inner'></div>
				</div>
				<div class='spinner'>
					<div class='inner'></div>
				</div>
				<div class='spinner'>
					<div class='inner'></div>
				</div>
				<div class='spinner'>
					<div class='inner'></div>
				</div>
				<div class='spinner'>
					<div class='inner'></div>
				</div>
			</div>
		</div> -->
	 <div class="main-wrapper">
		<header id="header">
			<tiles:insertAttribute name="header"/>
		</header>
	
		<section id="sidemenu">
			<tiles:insertAttribute name="menu" />
		</section>
			
		<section id="site-content">
			<tiles:insertAttribute name="body" />
		</section>
		
		<footer id="footer">
			<tiles:insertAttribute name="footer" />
		</footer>
</div>

<script type="text/javascript" src="<c:url value='/static/hospital/assets/js/jquery-3.2.1.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/hospital/assets/js/popper.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/hospital/assets/js/bootstrap.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/hospital/assets/js/jquery.dataTables.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/hospital/assets/js/dataTables.bootstrap4.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/hospital/assets/js/jquery.slimscroll.js'/>"></script>
<%-- <script type="text/javascript" src="<c:url value='/static/hospital/assets/js/slidemenu.html'/>"></script>  --%>
<script type="text/javascript" src="<c:url value='/static/hospital/assets/js/select2.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/hospital/assets/js/moment.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/hospital/assets/js/bootstrap-datetimepicker.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/hospital/assets/js/Chart.bundle.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/hospital/assets/js/app.js'/>"></script>
</body>
</html>