 <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

 <div class="page-wrapper">
   <div class="content">
   <div class="row">
               <div class="col-lg-12">
                    <div class="card-box" style="border-bottom: 3px solid darkorange;">
							<a href="addGymCustomer.htm"><button type="button" class="btn btn-primary" style="border-radius: 0px !important;background-color: #4a274f;">Add Customer</button></a>
							<a href="customersProfile.htm"><button type="button" class="btn btn-primary" style="border-radius: 0px !important;background-color: #4a274f;">Customer Details</button></a>
							</div>
                    </div>
                    
                </div>
                
     <div class="row">
                    <div class="col-lg-12">
                     <div class="card-box" style="border-bottom: 3px solid darkorange;">
						<div class="table-responsive">
                            <table id="example" class="table table-striped table-bordered dt-responsive nowrap" cellspacing="0" width="100%">
                                <thead style="background-color: #4a274f;color: cornsilk;font-family: auto;text-align: center;">
                                    <tr>
                                        <th>Customer Name</th>
                                        <th>Trainer Name</th>
                                        <th>Email ID</th>
                                        <th>Contact No.</th>
                                        <th>Payment Due</th>
                                        <!-- <th>Status</th> -->
                                        <th>Total Amount</th>
                                        <th class="text-center">Action</th>
                                    </tr>
                                </thead>
                                <tbody>
                                <tr>
                                         <td style="text-align: center;">Maheshwar Prasad</td>
                                         <td style="text-align: center;">Yoga</td>
                                         <td style="text-align: center;">maheshwarprasad89@gmail.com</td>
                                          <td style="text-align: center;">+91-9910487556</td>
                                         <td style="text-align: center; color:green; font-family:bold">4908</td>
                                         <!-- <td style="text-align: center;"><span class="badge badge-success">Approve</span></td> -->
                                         <td style="text-align: center;color:red;">4908</td>
                                         <td class="text-center">
                                            <div class="dropdown dropdown-action">
                                            <button type="button" class="ms-btn-icon-outline btn-pill btn-primary" style="color: #090696;border-color: #090696;border-radius: 25px; background-color: transparent;border: 1px solid;"><i class="fa fa-edit"></i></button>
                                            <button type="button" class="ms-btn-icon-outline btn-pill btn-primary" style="color: #090696;border-color: #090696;border-radius: 25px; background-color: transparent;border: 1px solid;"><i class="fa fa-trash"></i></button>
                                            <button type="button" class="ms-btn-icon-outline btn-pill btn-primary" style="color: #090696;border-color: #090696;border-radius: 25px; background-color: transparent;border: 1px solid;"><i class="fa fa-send"></i></button>
                                            
                                              
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