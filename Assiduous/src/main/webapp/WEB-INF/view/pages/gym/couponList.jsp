 <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

 <div class="page-wrapper">
   <div class="content">
   <div class="row">
               <div class="col-lg-12">
                    <div class="card-box" style="border-bottom: 3px solid #4a274f;">
							<a href="generateCoupon.htm"> <button type="button" class="btn btn-primary" style="border-radius: 0px !important;background-color: #4a274f;">Generate Coupon Code</button></a>
							<!-- <button type="button" class="btn btn-primary" style="border-radius: 0px !important;background-color: #4a274f;">Customer Details</button>
							<button type="button" class="btn btn-primary" style="border-radius: 0px !important;background-color: #4a274f;">Customer Grid</button> -->
							</div>
                    </div>
                    
                </div>
      <!-- <div class="row">
               <div class="col-lg-12">
                    <div class="card-box" style="">
							<button type="button" class="btn" style="border-radius: 0px !important;background-color: #009efb;color: white;">Monday</button>
							<button type="button" class="btn" style="border-radius: 0px !important;background-color: #009efb;color: white;">Tuesday</button>
							<button type="button" class="btn" style="border-radius: 0px !important;background-color: #009efb;color: white;">Wednesday</button>
							<button type="button" class="btn" style="border-radius: 0px !important;background-color: #009efb;color: white;">Thursday</button>
							<button type="button" class="btn" style="border-radius: 0px !important;background-color: #009efb;color: white;">Friday</button>
							<button type="button" class="btn" style="border-radius: 0px !important;background-color: #009efb;color: white;">Saturday</button>
							<button type="button" class="btn" style="border-radius: 0px !important;background-color: #009efb;color: white;">Sunday</button>
							<button type="button" class="btn btn-primary" style="border-radius: 0px !important;background-color: #4a274f;">Customer Details</button>
							<button type="button" class="btn btn-primary" style="border-radius: 0px !important;background-color: #4a274f;">Customer Grid</button>
							</div>
                    </div>
                    
                </div>  -->          
     <div class="row">
                    <div class="col-lg-12">
                     <div class="card-box" style="border-bottom: 3px solid #4a274f;">
						<div class="table-responsive">
						<!--  <ul class="nav nav-tabs nav-custom " role="tablist">
                                        <li role="presentation" class="active">
                                            <a href="#mon" aria-controls="mon" role="tab" data-toggle="tab">
                                                <strong>Monday</strong>
                                            </a>
                                        </li>
                                        <li role="presentation">
                                            <a href="#tue" aria-controls="tue" role="tab" data-toggle="tab">
                                                <strong>Tuesday</strong>
                                            </a>
                                        </li>
                                        <li role="presentation">
                                            <a href="#wed" aria-controls="wed" role="tab" data-toggle="tab">
                                                <strong>Wednesday</strong>
                                            </a>
                                        </li>
                                        <li role="presentation">
                                            <a href="#thu" aria-controls="thu" role="tab" data-toggle="tab">
                                                <strong>Thursday</strong>
                                            </a>
                                        </li>
                                        <li role="presentation">
                                            <a href="#fri" aria-controls="fri" role="tab" data-toggle="tab">
                                                <strong>Friday</strong>
                                            </a>
                                        </li>
                                        <li role="presentation">
                                            <a href="#sat" aria-controls="sat" role="tab" data-toggle="tab">
                                                <strong>Saturday</strong>
                                            </a>
                                        </li>
                                        <li role="presentation">
                                            <a href="#sun" aria-controls="sun" role="tab" data-toggle="tab">
                                                <strong>Sunday</strong>
                                            </a>
                                        </li>
                                    </ul> -->
                            <table id="example" class="table table-striped table-bordered dt-responsive nowrap" cellspacing="0" width="100%">
                                <thead style="background-color: #4a274f;color: cornsilk;font-family: auto;text-align: center;">
                                    <tr>
                                    	<th>Coupon Name</th>
                                        <th>Duration</th>
                                        <th>Description</th>
                                        <th>Code</th>
                                        
                                        <th class="text-center">Action</th>
                                    </tr>
                                </thead>
                                <tbody>
                                <tr>
                                        <td style="text-align: center;">Aerobics</td>
                                        <td><h2  style="text-align: center;">3 Months</h2></td>
                                        <td style="text-align: center;">Lorem Ipsum is simply dummy text of the printing and typesetting industry.</td>
                                       <td style="text-align: center;"><span style="color:red;">AVX753</span></td>
                                        <td class="text-center">
                                            <div class="dropdown dropdown-action">
                                            <button type="button" class="ms-btn-icon-outline btn-pill btn-primary" style="color: #4a274f;border-color: #4a274f;border-radius: 25px; background-color: transparent;border: 1px solid;"><i class="fa fa-edit"></i></button>
                                            <!-- <button type="button" class="ms-btn-icon-outline btn-pill btn-primary" style="color: #4a274f;border-color: #4a274f;border-radius: 25px; background-color: transparent;border: 1px solid;"><i class="fa fa-trash"></i></button> -->
                                            <button type="button" class="ms-btn-icon-outline btn-pill btn-primary" style="color: #4a274f;border-color: #4a274f;border-radius: 25px; background-color: transparent;border: 1px solid;"><i class="fa fa-eye"></i></button>
                                           </div>
                                        </td>
                                    </tr>
                                   
                                </tbody>
                            </table>
						</div>
						</div>
                    </div>
                </div>
           </div>
    </div>
    <script type="text/javascript" src="<c:url value='/static/hospital/assets/js/jquery-3.2.1.min.js'/>"></script>
    
    <script type="text/javascript">
	$(document).ready(function() {
	    $('#example').DataTable();
	} );
    </script>