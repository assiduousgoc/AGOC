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
							<button type="button" class="btn btn-primary" style="border-radius: 0px !important;background-color: #4a274f;">Customer Entry</button>
							
					</div>
                </div>
                    
     </div>
     
 
                          
                
                
 <div class="row">
<div class="col-xl-12 col-md-12">
          <div class="ms-panel ms-panel-fh" style="border-bottom: 3px solid #f99d09;border-top: 3px solid #f99d09;">
            <div class="ms-panel-header" style="position: relative;padding: 0.7rem;border-bottom: 1px solid rgba(0,0,0,0.1);color: #090696;">
              <h6 style="font-weight: bold;">Coupon Entry Form</h6>
            </div>
            <div class="ms-panel-body" style="position: relative;padding: 1.5rem;">
              <form class="needs-validation clearfix" novalidate>
                <div class="form-row">
                  <div class="col-md-4 mb-3">
                    <label for="validationCustom22">Coupon Name</label>
                    <div class="input-group">
                        <input type='text' class="form-control" name="customerName" id="customerName"  placeholder="Enter Customer Name"  />
                                                               
                      <div class="invalid-feedback">
                        Please enter Coupon Name.
                      </div>
                    </div>
                  </div>
                 <!--  <div class="col-md-6 mb-3">
                    <label for="validationCustom23">Currency</label>
                    <div class="input-group">
                      <select class="form-control" id="validationCustom23" required>
                        <option value="">USD</option>
                        <option value="">Bitcoins</option>
                        <option value="">EURO</option>

                      </select>
                      <div class="invalid-feedback">
                        Please select a Currency
                      </div>
                    </div>
                  </div> -->
                  <div class="col-md-4 mb-3">
                    <label for="validationCustom24">Start Date</label>
                    <div class="input-group">
                       <input type='text' class="form-control" name="email" id="email" placeholder="Enter Email Id" />
                      <div class="invalid-feedback">
                        Email
                      </div>
                    </div>
                  </div>
                  <div class="col-md-4 mb-3">
                    <label for="validationCustom25">End Date</label>
                    <div class="input-group">
                      <input type='text' class="form-control" name="contactNo" id="contactNo" placeholder="Enter Contact No." />
                      <div class="invalid-feedback">
                        Contact Number
                      </div>
                    </div>
                  </div>
                  <div class="col-md-6 mb-3">
                    <label for="validationCustom12">Description </label>
                      <div class="input-group">
                     <div class="input-group">
                       <textarea class="summernote edi-css form-control" name="content" placeholder="Description"></textarea></div>
                     </div>
                  </div>
                  <div class="col-md-6 mb-3">
                    <label for="validationCustom12">Upload Coupon Image </label>
                      <div class="input-group">
                     <div class="input-group">
                      <input type="file" id="customerImage" name="customerImage" placeholder="Select Customer Image">
                       </div>
                     </div>
                  </div>
                 
                </div>
                
                <div class="row">
                 <div class="col-md-offset-3 col-md-12" style="text-align: center;">
                                                        <input type="submit" class="btn btn-primary" value="Save" style="border-radius: 0px;"> &nbsp;
                                                       <a href="couponList.htm"> <input type="button" style="border-radius: 0px;" class="btn btn-danger" value="Back"></a> &nbsp;
                                                        <input type="reset" class="btn btn-default " style="border-radius: 0px;" value="Reset">
                                                    </div>
                                                </div>                                   
                
                <!-- <div class="new" style="display: inline-flex;">
                 <div class="col-md-1 mb-3">
                   <div class="input-group">
                       <a href="courseSchedule.htm"><button class="btn btn-secondary d-block" type="button" style="background-color: #960613;">Back</button></a> 
                    </div>
                  </div>
                  <div class="col-md-1 mb-3">
                   <div class="input-group">
                       <a href="menuList.htm"><button class="btn btn-secondary d-block" type="submit" style="background-color: #090696;">Save</button>
                  </a> 
                    </div>
                  </div>
                <div class="col-md-1 mb-3">
                   <div class="input-group">
                       <a href="menuList.htm"><button class="btn btn-primary d-block" type="reset" style="">Reset</button></a> 
                    </div>
                  </div>
                  
                  
                </div> -->
			</form>

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