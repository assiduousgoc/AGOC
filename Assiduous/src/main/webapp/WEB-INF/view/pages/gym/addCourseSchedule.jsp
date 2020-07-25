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
							<button type="button" class="btn btn-primary" style="border-radius: 0px !important;background-color: #090696;">Course Schedule</button>
							
					</div>
                </div>
                    
     </div>
     
 
                          
                
                
 <div class="row">
<div class="col-xl-12 col-md-12">
          <div class="ms-panel ms-panel-fh" style="border-bottom: 3px solid #f99d09;border-top: 3px solid #f99d09;">
            <div class="ms-panel-header" style="position: relative;padding: 0.7rem;border-bottom: 1px solid rgba(0,0,0,0.1);color: #090696;">
              <h6 style="font-weight: bold;">Class Schedule Form</h6>
            </div>
            <div class="ms-panel-body" style="position: relative;padding: 1.5rem;">
              <form class="needs-validation clearfix" novalidate>
                <div class="form-row">
                  <div class="col-md-4 mb-3">
                    <label for="validationCustom22">Day</label>
                    <div class="input-group">
                     <select class="form-control" name="day" id="day">
			               <option value>Select Day</option>
			                 <option value="1">Monday</option>
			                   <option value="2">Tuesday</option>
			                   <option value="3">Wednesday</option>
			                   <option value="4">Thursday</option>
			                   <option value="5">Friday</option>
			                   <option value="6">Saturday</option>
			                   <option value="7">Sunday</option>
			          </select>                                             
                      <div class="invalid-feedback">
                        Please select a Catagory.
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
                    <label for="validationCustom24">From</label>
                    <div class="input-group">
                       <input type='text' class="form-control" name="time_from" id="from" />
                      <div class="invalid-feedback">
                        From
                      </div>
                    </div>
                  </div>
                  <div class="col-md-4 mb-3">
                    <label for="validationCustom25">To</label>
                    <div class="input-group">
                      <input type='text' class="form-control" name="time_to" id="to" />
                      <div class="invalid-feedback">
                        To
                      </div>
                    </div>
                  </div>
                  <div class="col-md-4 mb-3">
                    <label for="validationCustom12">Courses *</label>
                    <div class="input-group">
                     <select class="form-control" name="course" id="courses">
                                                            <option value>Select Course</option>
                                                            <option value="yoga">Yoga</option>
                                                            <option value="fitness">Fitness</option>
                                                            <option value="body_bulid">Body Building</option>
                                                            <option value="aerobics">Aerobics</option>
                                                            <option value="flexibility">Flexibility</option>
                                                        </select>
                    </div>
                  </div>
                  <div class="col-md-4 mb-3">
                    <label for="validationCustom12">Room *</label>
                      <div class="input-group">
                      <select class="form-control" name="rooms" id="rooms">
                                                            <option value="">Select Room</option>
                                                            <option value="1">Room-A</option>
                                                            <option value="2">Room-B</option>
                                                            <option value="3">Room-C</option>
                                                            <option value="4">Room-D</option>
                                                            <option value="5">Room-E</option>
                                                        </select>
                     </div>
                  </div>
                  <div class="col-md-4 mb-3">
                    <label for="validationCustom12">Trainers *</label>
                      <div class="input-group">
                      <select class="form-control" name="trainers" id="traines">
                                                            <option value>Select Trainer</option>
                                                            <option value="1">Alexande Bergunov</option>
                                                            <option value="2">Alex Krasnov</option>
                                                            <option value="3">AAmanda Bale</option>
                                                            <option value="4">Jane Austin</option>
                                                            <option value="5">Rachel Adams</option>
                                                        </select>
                     </div>
                  </div>
                  <div class="col-md-12 mb-3">
                    <label for="validationCustom12">Description </label>
                      <div class="input-group">
                     <div class="input-group">
                      <textarea class="summernote edi-css form-control" name="content"></textarea>
                       </div>
                     </div>
                  </div>
                 
                </div>
                 <div class="new" style="display: inline-flex;">
                 <div class="col-md-1 mb-3">
                   <div class="input-group">
                       <a href="courseSchedule.htm"><button class="btn btn-secondary d-block" type="button" style="min-width: 118px;background-color: #960613;">Back</button></a> 
                    </div>
                  </div>
                  <div class="col-md-1 mb-3">
                   <div class="input-group">
                       <a href="menuList.htm"><button class="btn btn-secondary d-block" type="submit" style="min-width: 118px;background-color: #090696;">Save</button>
                  </a> 
                    </div>
                  </div>
                <div class="col-md-1 mb-3">
                   <div class="input-group">
                       <a href="menuList.htm"><button class="btn btn-primary d-block" type="reset" style="min-width: 118px;">Reset</button></a> 
                    </div>
                  </div>
                  
                  
                </div>
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