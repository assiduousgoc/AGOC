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
		<link href="<c:url value='/static/hospital/assets/css/style.css' />"  rel="stylesheet"></link>
	

 
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
<script type="text/javascript" src="<c:url value='/static/hospital/assets/js/jquery.slimscroll.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/hospital/assets/js/slidemenu.html'/>"></script>
<script type="text/javascript" src="<c:url value='/static/hospital/assets/js/select2.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/hospital/assets/js/moment.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/hospital/assets/js/bootstrap-datetimepicker.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/hospital/assets/js/Chart.bundle.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/hospital/assets/js/app.js'/>"></script>

<script>
var barChartData = {
		labels: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun'],

		
		datasets: [{
			label: 'Dataset 1',
			backgroundColor: 'rgba(1, 181, 199, 0.5)',
			borderColor: 'rgba(1, 181, 199, 1)',
			borderWidth: 1,
			data: [35, 59, 80, 81, 56, 55, 40]
		}, {
			label: 'Dataset 2',
			backgroundColor: 'rgba(228, 228, 228, 0.5)',
			borderColor: 'rgba(228, 228, 228, 1)',
			borderWidth: 1,
			data: [28, 48, 40, 19, 86, 27, 90]
		}]

	};

	var ctx = document.getElementById('bargraph').getContext('2d');
	window.myBar = new Chart(ctx, {
		type: 'bar',
		data: barChartData,
		options: {
			responsive: true,
			legend: {
				display: false,
			}
		}
	});

var data = {
    labels: [
        "Red",
        "Blue",
        "Yellow"
    ],
    datasets: [
        {
            data: [300, 50, 100],
            backgroundColor: [
                "#FF6384",
                "#36A2EB",
                "#FFCE56"
            ],
            hoverBackgroundColor: [
                "#FF4394",
                "#36A2EB",
                "#FFCE56"
            ]
						
						
        }]
};

var options = { 
	cutoutPercentage:40,
};
  var config = {
			type: 'doughnut',
			data: {
				datasets: [{
					data: [300, 50, 100, 20, 70],
					backgroundColor: [
						"#FF6384",
						"#36A2EB",
						"#01b5c7",
						"#FFCE56",
						"#737AFC"
					],
					label: 'Dataset 1'
				}],
				labels: [
					'Red',
					'Orange',
					'Yellow',
					'Green',
					'Blue'
				]
			},
			options: {
				responsive: true,
				legend: {
					position: 'top',
				},
				animation: {
					animateScale: true,
					animateRotate: true
				}
			}
		};

		window.onload = function() {
			var ctx = document.getElementById('chart-area').getContext('2d');
			window.myDoughnut = new Chart(ctx, config);
		};
	</script>
	<script>
		var lineChartData = {
		  labels: ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"],
		  datasets: [{
			label: "My First dataset",
			backgroundColor: "rgba(1, 181, 199, 0.5)",
			data: [100, 70, 20, 100, 120, 50, 70, 50, 50, 100, 50, 90]
		  }, {
			label: "My Second dataset",
			backgroundColor: "rgba(228, 228, 228, 1)",
			fill: true,
			data: [28, 48, 40, 19, 86, 27, 20, 90, 50, 20, 90, 20]
		  }]
		};
	
		var linectx = document.getElementById('canvas').getContext('2d');
		window.myLine = new Chart(linectx, {
		type: 'line',
		data: lineChartData,
		options: {
			responsive: true,
			legend: {
				display: false,
			},
			tooltips: {
				mode: 'index',
				intersect: false,
			}
		}
		});
		
	</script>
	<script>
		$(document).ready(function(){
    barChart();
    
    $(window).resize(function(){
        barChart();
    });
    
    function barChart(){
        $('.bar-chart').find('.item-progress').each(function(){
            var itemProgress = $(this),
            itemProgressWidth = $(this).parent().width() * ($(this).data('percent') / 100);
            itemProgress.css('width', itemProgressWidth);
        });
    };
});
</script>
</body>
</html>