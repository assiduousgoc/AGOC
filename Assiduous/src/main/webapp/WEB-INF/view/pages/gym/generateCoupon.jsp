<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
              <%-- <form class="needs-validation clearfix" novalidate action="saveCoupon.htm" method="post" enctype="multipart/form-data"> --%>
               <form:form class="needs-validation clearfix"  method="post"	action="${pageContext.request.contextPath}/saveCoupon.htm"  enctype="multipart/form-data">
                <div class="form-row">
                  <div class="col-md-4 mb-3">
                    <label for="validationCustom22">Coupon Name</label>
                    <div class="input-group">
                        <input type='text' class="form-control" name="couponName" id="couponName"  placeholder="Enter Coupon Name"  />
                                                               
                      <div class="invalid-feedback">
                        Please enter Coupon Name.
                      </div>
                    </div>
                  </div>
                <div class="col-md-4 mb-3">
                    <label for="validationCustom24">Start Date</label>
                    <div class="input-group">
                       <input type='text' class="form-control" name="sdate" id="sdate" placeholder="Enter Start Date" />
                      <div class="invalid-feedback">
                        Start Date
                      </div>
                    </div>
                  </div>
                  <div class="col-md-4 mb-3">
                    <label for="validationCustom25">End Date</label>
                    <div class="input-group">
                      <input type='text' class="form-control" name="edate" id="edate" placeholder="Enter End Date" />
                      <div class="invalid-feedback">
                       End Date 
                      </div>
                    </div>
                  </div>
                  <div class="col-md-6 mb-3">
                    <label for="validationCustom12">Description </label>
                      <div class="input-group">
                     <div class="input-group">
                       <input type="text" class="summernote edi-css form-control" name="description" id="description" placeholder="Description"/></div>
                     </div>
                  </div>
                  <div class="col-md-6 mb-3">
                    <label for="validationCustom12">Upload Coupon Image </label>
                      <div class="input-group">
                     <div class="input-group">
                     <input	type="file" name="file" onchange="uploadImage();" id="file"
									accept="image/jpeg, image/png" placeholder="Select Coupon Image"> <input type="hidden"
									id="couponImage" name="couponImage" value="">
                      <!-- <input type="file" id="couponImage" name="couponImage" placeholder="Select Coupon Image"> -->
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
                                                <input type="hidden" id=imagepath name="imagepath">                                
                					</form:form>

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