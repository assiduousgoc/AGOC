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
              <h6 style="font-weight: bold;">Customer Entry Form</h6>
            </div>
            <div class="ms-panel-body" style="position: relative;padding: 1.5rem;">
              <form class="needs-validation clearfix" novalidate>
                <div class="form-row">
                  <div class="col-md-4 mb-3">
                    <label for="validationCustom22">Customer Name</label>
                    <div class="input-group">
                        <input type='text' class="form-control" name="customerName" id="customerName"  placeholder="Enter Customer Name"  />
                                                               
                      <div class="invalid-feedback">
                        Please enter Customer Name.
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
                    <label for="validationCustom24">Email</label>
                    <div class="input-group">
                       <input type='text' class="form-control" name="email" id="email" placeholder="Enter Email Id" />
                      <div class="invalid-feedback">
                        Email
                      </div>
                    </div>
                  </div>
                  <div class="col-md-4 mb-3">
                    <label for="validationCustom25">Contact Number</label>
                    <div class="input-group">
                      <input type='text' class="form-control" name="contactNo" id="contactNo" placeholder="Enter Contact No." />
                      <div class="invalid-feedback">
                        Contact Number
                      </div>
                    </div>
                  </div>
                  <div class="col-md-4 mb-3">
                    <label for="validationCustom12">Gender *</label>
                    <div class="input-group">
                      <div class="input-group">
                           <label>
                         <input class="radio_val" type="radio" name="gender" value="male" /> Male
                        </label>
                        <label class="pad-left" style="padding-left: 10px;">
                      <input class="radio_val" type="radio" name="gender" value="female" /> Female
                       </label>
                     <label class="pad-left"  style="padding-left: 10px;">
                      <input class="radio_val" type="radio" name="gender" value="others" /> Other
                       </label>
                     </div>
                    </div>
                  </div>
                  <div class="col-md-8 mb-3">
                    <label for="validationCustom12">Address *</label>
                      <div class="input-group">
                       <input type='text' class="form-control" name="address" id="address" placeholder="Enter Address." />
                      </div>
                  </div>
                   <div class="col-md-4 mb-3">
                    <label for="validationCustom12">City *</label>
                      <div class="input-group">
                       <input type='text' class="form-control" name="city" id="city" placeholder="Enter City" />
                      </div>
                  </div>
                   <div class="col-md-4 mb-3">
                    <label for="validationCustom12">Pin Code *</label>
                      <div class="input-group">
                       <input type='text' class="form-control" name="pincode" id="pincode" placeholder="Enter Pincode." />
                      </div>
                  </div>
                  <div class="col-md-4 mb-3">
                    <label for="validationCustom12">Country *</label>
                      <div class="input-group">
                      <select id="select23" class="form-control js-states select2">
                                                            <optgroup label="Alaskan/Hawaiian Time Zone">
                                                                <option value>Select a country</option>
                                                                <option value="AK">Alaska</option>
                                                                <option value="HI">Hawaii</option>
                                                            </optgroup>
                                                            <optgroup label="Pacific Time Zone">
                                                                <option value="CA">California</option>
                                                                <option value="NV">Nevada</option>
                                                                <option value="OR">Oregon</option>
                                                                <option value="WA">Washington</option>
                                                            </optgroup>
                                                            <optgroup label="Mountain Time Zone">
                                                                <option value="AZ">Arizona</option>
                                                                <option value="CO">Colorado</option>
                                                                <option value="ID">Idaho</option>
                                                                <option value="MT">Montana</option>
                                                                <option value="NE">Nebraska</option>
                                                                <option value="NM">New Mexico</option>
                                                                <option value="ND">
                                                                    North Dakota
                                                                </option>
                                                                <option value="UT">Utah</option>
                                                                <option value="WY">Wyoming</option>
                                                            </optgroup>
                                                            <optgroup label="Central Time Zone">
                                                                <option value="AL">Alabama</option>
                                                                <option value="AR">Arkansas</option>
                                                                <option value="IL">Illinois</option>
                                                                <option value="IA">Iowa</option>
                                                                <option value="KS">Kansas</option>
                                                                <option value="KY">Kentucky</option>
                                                                <option value="LA">Louisiana</option>
                                                                <option value="MN">Minnesota</option>
                                                                <option value="MS">
                                                                    Mississippi
                                                                </option>
                                                                <option value="MO">Missouri</option>
                                                                <option value="OK">Oklahoma</option>
                                                                <option value="SD">
                                                                    South Dakota
                                                                </option>
                                                                <option value="TX">Texas</option>
                                                                <option value="TN">Tennessee</option>
                                                                <option value="WI">Wisconsin</option>
                                                            </optgroup>
                                                            <optgroup label="Eastern Time Zone">
                                                                <option value="CT">
                                                                    Connecticut
                                                                </option>
                                                                <option value="DE">Delaware</option>
                                                                <option value="FL">Florida</option>
                                                                <option value="GA">Georgia</option>
                                                                <option value="IN">Indiana</option>
                                                                <option value="ME">Maine</option>
                                                                <option value="MD">Maryland</option>
                                                                <option value="MA">
                                                                    Massachusetts
                                                                </option>
                                                                <option value="MI">Michigan</option>
                                                                <option value="NH">
                                                                    New Hampshire
                                                                </option>
                                                                <option value="NJ">New Jersey</option>
                                                                <option value="NY">New York</option>
                                                                <option value="NC">
                                                                    North Carolina
                                                                </option>
                                                                <option value="OH">Ohio</option>
                                                                <option value="PA">
                                                                    Pennsylvania
                                                                </option>
                                                                <option value="RI">
                                                                    Rhode Island
                                                                </option>
                                                                <option value="SC">
                                                                    South Carolina
                                                                </option>
                                                                <option value="VT">Vermont</option>
                                                                <option value="VA">Virginia</option>
                                                                <option value="WV">
                                                                    West Virginia
                                                                </option>
                                                            </optgroup>
                                                        </select>
                     </div>
                  </div>
                  <div class="col-md-12 mb-3">
                    <label for="validationCustom12">Upload Customer Image </label>
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
                                                       <a href="gymcustomerList.htm"> <input type="button" style="border-radius: 0px;" class="btn btn-danger" value="Back"></a> &nbsp;
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