<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>  

<html lang="en">

<head>
		<meta charset="utf-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
	    <link rel="shortcut icon" type="image/x-icon" href="assets/images/favicon.ico">
		<link href="https://fonts.googleapis.com/css?family=Fira+Sans:400,500,600,700" rel="stylesheet">
    	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
		
		<link href="<c:url value='/static/restaurent/css/reset.css' />"  rel="stylesheet"></link>
		<link href="<c:url value='/static/restaurent/css/layout.css' />"  rel="stylesheet"></link>
		<link href="<c:url value='/static/restaurent/css/themes.css' />"  rel="stylesheet"></link>
		<link href="<c:url value='/static/restaurent/css/typography.css' />"  rel="stylesheet"></link>
		<link href="<c:url value='/static/restaurent/css/styles.css' />"  rel="stylesheet"></link>
		<link href="<c:url value='/static/restaurent/css/shCore.css' />"  rel="stylesheet"></link>
		<link href="<c:url value='/static/restaurent/css/bootstrap.css' />"  rel="stylesheet"></link>
		<link href="<c:url value='/static/restaurent/css/jquery.jqplot.css' />"  rel="stylesheet"></link>
		<link href="<c:url value='/static/restaurent/css/jquery-ui-1.8.18.custom.css' />"  rel="stylesheet"></link>
		<link href="<c:url value='/static/restaurent/css/data-table.css' />"  rel="stylesheet"></link>
		<link href="<c:url value='/static/restaurent/css/form.css' />"  rel="stylesheet"></link>
		<link href="<c:url value='/static/restaurent/css/ui-elements.css' />"  rel="stylesheet"></link>
		<link href="<c:url value='/static/restaurent/css/wizard.css' />"  rel="stylesheet"></link>
		<link href="<c:url value='/static/restaurent/css/sprite.css' />"  rel="stylesheet"></link>
		<link href="<c:url value='/static/restaurent/css/gradient.css' />"  rel="stylesheet"></link>
		
		<%-- <link href="<c:url value='/static/restaurent/' />"  rel="stylesheet"></link> --%>
	

 
</head>
 
<body id="theme-default" class="full_block">
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
	 <div>
		<header id="header" class="blue_lin" style="position: fixed;width: 100%;">
			<tiles:insertAttribute name="header"/>
		</header>
	
		<section id="sidemenu">
			<tiles:insertAttribute name="menu" />
		</section>
			
		<section id="site-content" style="margin-top: 62px;">
			<tiles:insertAttribute name="body" />
		</section>
		
		<footer id="footer">
			<tiles:insertAttribute name="footer" />
		</footer>
</div>

<script type="text/javascript"  src="<c:url value='/static/restaurent/js/jquery-1.7.1.min.js'/>"></script>
<script type="text/javascript"  src="<c:url value='/static/restaurent/js/jquery-ui-1.8.18.custom.min.js'/>"></script>
<script type="text/javascript"  src="<c:url value='/static/restaurent/js/jquery.ui.touch-punch.js'/>"></script>
<script type="text/javascript"  src="<c:url value='/static/restaurent/js/chosen.jquery.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/uniform.jquery.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/bootstrap-dropdown.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/bootstrap-colorpicker.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/sticky.full.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/jquery.noty.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/selectToUISlider.jQuery.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/fg.menu.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/jquery.tagsinput.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/jquery.cleditor.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/jquery.tipsy.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/jquery.peity.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/jquery.simplemodal.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/jquery.jBreadCrumb.1.1.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/jquery.colorbox-min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/jquery.idTabs.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/jquery.multiFieldExtender.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/jquery.confirm.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/elfinder.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/accordion.jquery.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/autogrow.jquery.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/check-all.jquery.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/data-table.jquery.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/ZeroClipboard.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/TableTools.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/jeditable.jquery.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/duallist.jquery.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/easing.jquery.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/full-calendar.jquery.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/input-limiter.jquery.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/inputmask.jquery.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/iphone-style-checkbox.jquery.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/meta-data.jquery.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/quicksand.jquery.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/raty.jquery.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/smart-wizard.jquery.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/stepy.jquery.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/treeview.jquery.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/ui-accordion.jquery.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/vaidation.jquery.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/mosaic.1.0.1.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/jquery.collapse.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/jquery.cookie.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/jquery.autocomplete.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/localdata.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/excanvas.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/jquery.jqplot.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/chart-plugins/jqplot.dateAxisRenderer.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/chart-plugins/jqplot.cursor.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/chart-plugins/jqplot.logAxisRenderer.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/chart-plugins/jqplot.canvasTextRenderer.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/chart-plugins/jqplot.canvasAxisTickRenderer.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/chart-plugins/jqplot.highlighter.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/chart-plugins/jqplot.pieRenderer.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/chart-plugins/jqplot.barRenderer.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/chart-plugins/jqplot.categoryAxisRenderer.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/chart-plugins/jqplot.pointLabels.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/chart-plugins/jqplot.meterGaugeRenderer.min.js'/>"></script>
<script type="text/javascript"  src="<c:url value='/static/restaurent/js/jquery.simplemodal.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/custom-scripts.js'/>"></script>
<%-- <script type="text/javascript" src="<c:url value='/static/restaurent/js/custom-scripts2.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/restaurent/js/custom-scripts3.js'/>"></script> --%>
<script>
	$(function () {
    $.jqplot._noToImageButton = true;
    var prevYear = [["2011-08-01",398], ["2011-08-02",255.25], ["2011-08-03",263.9], ["2011-08-04",154.24],
    ["2011-08-05",210.18], ["2011-08-06",109.73], ["2011-08-07",166.91], ["2011-08-08",330.27], ["2011-08-09",546.6],
    ["2011-08-10",260.5], ["2011-08-11",330.34], ["2011-08-12",464.32], ["2011-08-13",432.13], ["2011-08-14",197.78],
    ["2011-08-15",311.93], ["2011-08-16",650.02], ["2011-08-17",486.13], ["2011-08-18",330.99], ["2011-08-19",504.33],
    ["2011-08-20",773.12], ["2011-08-21",296.5], ["2011-08-22",280.13], ["2011-08-23",428.9], ["2011-08-24",469.75],
    ["2011-08-25",628.07], ["2011-08-26",516.5], ["2011-08-27",405.81], ["2011-08-28",367.5], ["2011-08-29",492.68],
    ["2011-08-30",700.79], ["2011-08-31",588.5], ["2011-09-01",511.83], ["2011-09-02",721.15], ["2011-09-03",649.62],
    ["2011-09-04",653.14], ["2011-09-06",900.31], ["2011-09-07",803.59], ["2011-09-08",851.19], ["2011-09-09",2059.24],
    ["2011-09-10",994.05], ["2011-09-11",742.95], ["2011-09-12",1340.98], ["2011-09-13",839.78], ["2011-09-14",1769.21],
    ["2011-09-15",1559.01], ["2011-09-16",2099.49], ["2011-09-17",1510.22], ["2011-09-18",1691.72],
    ["2011-09-19",1074.45], ["2011-09-20",1529.41], ["2011-09-21",1876.44], ["2011-09-22",1986.02],
    ["2011-09-23",1461.91], ["2011-09-24",1460.3], ["2011-09-25",1392.96], ["2011-09-26",2164.85],
    ["2011-09-27",1746.86], ["2011-09-28",2220.28], ["2011-09-29",2617.91], ["2011-09-30",3236.63]];
    var currYear = [["2011-08-01",796.01], ["2011-08-02",510.5], ["2011-08-03",527.8], ["2011-08-04",308.48],
    ["2011-08-05",420.36], ["2011-08-06",219.47], ["2011-08-07",333.82], ["2011-08-08",660.55], ["2011-08-09",1093.19],
    ["2011-08-10",521], ["2011-08-11",660.68], ["2011-08-12",928.65], ["2011-08-13",864.26], ["2011-08-14",395.55],
    ["2011-08-15",623.86], ["2011-08-16",1300.05], ["2011-08-17",972.25], ["2011-08-18",661.98], ["2011-08-19",1008.67],
    ["2011-08-20",1546.23], ["2011-08-21",593], ["2011-08-22",560.25], ["2011-08-23",857.8], ["2011-08-24",939.5],
    ["2011-08-25",1256.14], ["2011-08-26",1033.01], ["2011-08-27",811.63], ["2011-08-28",735.01], ["2011-08-29",985.35],
    ["2011-08-30",1401.58], ["2011-08-31",1177], ["2011-09-01",1023.66], ["2011-09-02",1442.31], ["2011-09-03",1299.24],
    ["2011-09-04",1306.29], ["2011-09-06",1800.62], ["2011-09-07",1607.18], ["2011-09-08",1702.38],
    ["2011-09-09",4118.48], ["2011-09-10",1988.11], ["2011-09-11",1485.89], ["2011-09-12",2681.97],
    ["2011-09-13",1679.56], ["2011-09-14",3538.43], ["2011-09-15",3118.01], ["2011-09-16",4198.97],
    ["2011-09-17",3020.44], ["2011-09-18",3383.45], ["2011-09-19",2148.91], ["2011-09-20",3058.82],
    ["2011-09-21",3752.88], ["2011-09-22",3972.03], ["2011-09-23",2923.82], ["2011-09-24",2920.59],
    ["2011-09-25",2785.93], ["2011-09-26",4329.7], ["2011-09-27",3493.72], ["2011-09-28",4440.55],
    ["2011-09-29",5235.81], ["2011-09-30",6473.25]];
    var plot1 = $.jqplot("chart1", [prevYear, currYear], {
        seriesColors: ["rgba(78, 135, 194, 0.7)", "rgb(211, 235, 59)"],
        title: 'Monthly Revenue',
        highlighter: {
            show: true,
            sizeAdjust: 1,
            tooltipOffset: 9
        },
        grid: {
            background: 'rgba(57,57,57,0.0)',
            drawBorder: false,
            shadow: false,
            gridLineColor: '#666666',
            gridLineWidth: 2
        },
        legend: {
            show: true,
            placement: 'outside'
        },
        seriesDefaults: {
            rendererOptions: {
                smooth: true,
                animation: {
                    show: true
                }
            },
            showMarker: false
        },
        series: [
            {
                fill: true,
                label: '2010'
            },
            {
                label: '2011'
            }
        ],
        axesDefaults: {
            rendererOptions: {
                baselineWidth: 1.5,
                baselineColor: '#444444',
                drawBaseline: false
            }
        },
        axes: {
            xaxis: {
                renderer: $.jqplot.DateAxisRenderer,
                tickRenderer: $.jqplot.CanvasAxisTickRenderer,
                tickOptions: {
                    formatString: "%b %e",
                    angle: -30,
                    textColor: '#dddddd'
                },
                min: "2011-08-01",
                max: "2011-09-30",
                tickInterval: "7 days",
                drawMajorGridlines: false
            },
            yaxis: {
                renderer: $.jqplot.LogAxisRenderer,
                pad: 0,
                rendererOptions: {
                    minorTicks: 1
                },
                tickOptions: {
                    formatString: "$%'d",
                    showMark: false
                }
            }
        }
    });
});
/*=================
CHART 8
===================*/
$(function(){
  var plot2 = $.jqplot ('chart8', [[3,7,9,1,5,3,8,2,5]], {
      // Give the plot a title.
      title: 'Plot With Options',
      // You can specify options for all axes on the plot at once with
      // the axesDefaults object.  Here, we're using a canvas renderer
      // to draw the axis label which allows rotated text.
      axesDefaults: {
        labelRenderer: $.jqplot.CanvasAxisLabelRenderer
      },
      // Likewise, seriesDefaults specifies default options for all
      // series in a plot.  Options specified in seriesDefaults or
      // axesDefaults can be overridden by individual series or
      // axes options.
      // Here we turn on smoothing for the line.
      seriesDefaults: {
		  shadow: false,   // show shadow or not.
          rendererOptions: {
              smooth: true
          }
      },
      // An axes object holds options for all axes.
      // Allowable axes are xaxis, x2axis, yaxis, y2axis, y3axis, ...
      // Up to 9 y axes are supported.
      axes: {
        // options for each axis are specified in seperate option objects.
        xaxis: {
          label: "X Axis",
          // Turn off "padding".  This will allow data point to lie on the
          // edges of the grid.  Default padding is 1.2 and will keep all
          // points inside the bounds of the grid.
          pad: 0
        },
        yaxis: {
          label: "Y Axis"
        }
      },
		grid: {
         borderColor: '#ccc',     // CSS color spec for border around grid.
        borderWidth: 2.0,           // pixel width of border around grid.
        shadow: false               // draw a shadow for grid.
    }
    });
});
</script>
<div id="basic-modal-content1">

								<%-- <h3>Basic Modal Dialog</h3>
								<p>
									 For this demo, SimpleModal is using this "hidden" data for its content. You can also populate the modal dialog with an AJAX response, standard HTML or DOM element(s).
								</p>
								<p>
									 Examples:
								</p>
								<p>
									<code>$('#basicModalContent').modal(); // jQuery object - this demo</code>
								</p>
								<p>
									<code>$.modal(document.getElementById('basicModalContent')); // DOM</code>
								</p>
								<p>
									<code>$.modal('&lt;p&gt;&lt;b&gt;HTML&lt;/b&gt; elements&lt;/p&gt;'); // HTML</code>
								</p>
								<p>
									<code>$('&lt;div&gt;&lt;/div&gt;').load('page.html').modal(); // AJAX</code>
								</p>
								<div class="btn_24_blue">
									<a href="#" class="simplemodal-close"><span>More details...</span></a>
								</div> --%>
							</div>
</body>
</html>