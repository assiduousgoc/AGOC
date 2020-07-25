<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<section class="breadcrumb-wrap" style="margin-top: 57px;!important">

</section>

<div id=body-content class=no-margin style="border-bottom: 4px solid #066fb2;">
<div class=container>
<div class=row>

<!-- <div class=col-md-12>
<div class=form_cub style="text-align: center;color: red;font-family: 'square721_btroman';font-weight: bold;font-size: initial;">
 Maheshwar Prasad
<h2>Client Login</h2>
</div>
</div>
</br> -->
<div class=col-md-3>
</div>
<div class=col-md-6>

<form action="dashboard.htm" method="post">
<div class=form_cub>
<h2>Client Login</h2>
<div class=form_my> <span>Service</span>
<select name=quat_services id=lastname required=required onchange=showvalue(this.value)>
<option value>Select Service</option>
<option value="HMS">Hospital Management System</option>
<option value="RMS">Restaurant Management Software</option>
<option value="GMS">Gym Management System</option>
<option value="AMS">Attendance Management System</option>
<option value="OM">OnlineMarts Software</option>
<option value="BS">Balaji Software</option>
<option value="LMS">Laboratory Management System</option>
<option value="HTMS">Hotel Management System</option>

</select>
</div>
<div class=form_my id="name"> <span>User Name</span>
<input type=text name=quat_fullname required id=firstname value>
</div>
<div class=form_my id="emailtab"> <span>Password</span>
<input type=password name=password id=email required value>
</div>

<div class=form_my>
<input type=hidden name=services id="services" value=lead_save>
<input type=submit name=submit id=button value=Login class=submit>
<input type=hidden name=lead_save value=lead_save>

</div>

</div>
</form></div>

<div class=col-md-3></div>
</div>
</div>
</div>
<script type="text/javascript">
$(document).ready(function(){
	  $('#services').css("display", "none");
	  $('#signUp').css("display", "none");
	  $('.img-circle').css("display", "none");
	 
});
function showvalue( value){
	$('#services').val(value);
	if(value ==='OM' || value === 'BS'){
		$('#firstname').val(value);
		$('#email').val(value);
		$('#name').css('display','none')
		$('#emailtab').css('display','none')
	}else{
		$('#firstname').val('');
		$('#email').val('');
		$('#name').css('display','block')
		$('#emailtab').css('display','block')
	}
}

</script>