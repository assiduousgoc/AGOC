<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title><tiles:getAsString name="title" /></title>

	  <link href="<c:url value='/static/new_css/new-index.css' />" rel="stylesheet"></link>
	  <link href="<c:url value='/static/css/base.css' />" rel="stylesheet"></link>
	  
	<script type="text/javascript" src="<c:url value='/static/js/google-analytics.js'/>"></script>
	<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.8/jquery.min.js"></script>
	<script type="text/javascript" src="<c:url value='/static/js/jquery.themepunch.tools.min661d.js'/>"></script>
	<script type="text/javascript" src="<c:url value='/static/js/jquery.themepunch.revolution.min661d.js'/>"></script>
	<link href="<c:url value='/static/css/settings661d.css' />" rel="stylesheet"></link>
  	<link href="<c:url value='/static/css/stylefd2e.css' />" rel="stylesheet"></link>
  	<link href="<c:url value='/static/css/style2.css' />" rel="stylesheet"></link>



<%-- <link rel="shortcut icon" href="${pageContext.request.contextPath}/static/img/favicon.png" type="image/x-icon"> --%>
<link rel="icon" href="${pageContext.request.contextPath}/static/img/favicon.png" type="image/x-icon">
<!-- Responsive -->
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">


</head>
 
<body>
<%-- <%
    session=request.getSession(false);
    if(session.getAttribute("user")==null)
    {
        response.sendRedirect("redirect:/");
    }

%> --%>

<a href=tel:060019-87297 class=call_div><i class="fa fa-phone"></i> Call Us</a>
<a href="https://api.whatsapp.com/send?phone=15551234567">Send Message</a>
			<tiles:insertAttribute name="header" />
		<%-- <section id="sidemenu">
			<tiles:insertAttribute name="menu" />
		</section>
		 --%>
		<!-- <section id="site-content"> -->
			<tiles:insertAttribute name="body" />
		<!-- </section> -->

		<footer >
			<tiles:insertAttribute name="footer" />
		</footer>

<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.8/jquery.min.js"></script>
<script type="text/javascript" src="<c:url value='/static/js/jquery.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/js/bootstrap.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/js/jquery.cookie.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/js/menuzord.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/js/wow.min.js'/>"></script>
<script type="text/javascript" src="<c:url value='/static/js/site-custom.js'/>"></script>
<script type=text/javascript>jQuery(document).ready(function(){jQuery(".tp-banner").show().revolution({dottedOverlay:"none",delay:16000,startwidth:1170,startheight:200,hideThumbs:200,thumbWidth:100,thumbHeight:50,thumbAmount:5,navigationType:"bullet",navigationArrows:"solo",navigationStyle:"preview4",touchenabled:"on",onHoverStop:"on",swipe_velocity:0.7,swipe_min_touches:1,swipe_max_touches:1,drag_block_vertical:false,parallax:"mouse",parallaxBgFreeze:"on",parallaxLevels:[7,4,3,2,5,4,3,2,1,0],keyboardNavigation:"off",navigationHAlign:"center",navigationVAlign:"bottom",navigationHOffset:0,navigationVOffset:20,soloArrowLeftHalign:"left",soloArrowLeftValign:"center",soloArrowLeftHOffset:20,soloArrowLeftVOffset:0,soloArrowRightHalign:"right",soloArrowRightValign:"center",soloArrowRightHOffset:20,soloArrowRightVOffset:0,shadow:0,fullWidth:"on",fullScreen:"on",spinner:"spinner4",stopLoop:"off",stopAfterLoops:-1,stopAtSlide:-1,shuffle:"off",autoHeight:"off",forceFullWidth:"off",hideThumbsOnMobile:"off",hideNavDelayOnMobile:1500,hideBulletsOnMobile:"off",hideArrowsOnMobile:"off",hideThumbsUnderResolution:0,hideSliderAtLimit:0,hideCaptionAtLimit:0,hideAllCaptionAtLilmit:0,startWithSlide:0,videoJsPath:"rs-plugin/videojs/",fullScreenOffsetContainer:""})});</script>
<script type=text/javascript>function scrolls(a){jQuery(".megamenu").hide();jQuery("html, body").animate({scrollTop:jQuery("."+a).offset().top},4000)};</script></body>
<!-- GetButton.io widget -->
<script type="text/javascript">
    (function () {
        var options = {
            whatsapp: "+916001987297", // WhatsApp number
            call: "+916001987297", // Call phone number
            call_to_action: "Message us", // Call to action
            button_color: "#FF6550", // Color of button
            position: "left", // Position may be 'right' or 'left'
            order: "whatsapp,call", // Order of buttons
        };
        var proto = document.location.protocol, host = "getbutton.io", url = proto + "//static." + host;
        var s = document.createElement('script'); s.type = 'text/javascript'; s.async = true; s.src = url + '/widget-send-button/js/init.js';
        s.onload = function () { WhWidgetSendButton.init(host, proto, options); };
        var x = document.getElementsByTagName('script')[0]; x.parentNode.insertBefore(s, x);
    })();
</script>
<!-- /GetButton.io widget -->
</body>
</html>