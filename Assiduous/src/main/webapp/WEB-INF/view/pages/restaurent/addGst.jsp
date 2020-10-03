 <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div id="">
		<div class="">
			<div class="full_block" style="margin-left: 0px !important;margin-right: 0px !important;">
				<div class="">
					<div class="widget_top">
						<span class="h_icon list"></span>
						<h6>Add TAX </h6>
						<!-- <div id="widget_tab">
							<ul>
								<li><a href="#tab1" class="active_tab">Edit/Post Content</a></li>
								<li><a href="#tab2">Preview</a></li>
							</ul>
						</div> -->
					</div>
			<div class="widget_content" style="margin-top: 0px">
						
							<form action="#" method="post" class="form_container">
								<ul>
								
									<li>
								<fieldset style="background-color: #FFFF">
									<legend>TAX Account</legend>
									<ul>
										<li>
										<div class="form_grid_12">
										<div class="form_input">
											<div class="form_grid_6 alpha">
											<input type="text" class="form-control"  id="gstNo"	onblur="matchfun('gstNo', '[0-9]{2}[A-Z]{5}[0-9]{4}[A-Z]{1}[1-9A-Z]{1}Z[0-9A-Z]{1}');"
											onchange="changecolor('gstNo');"  />
														<span class=" label_intro">Tax Name</span>
													</div>
													<div class="form_grid_6">
														<input name="taxper" id="taxper" type="text"/>
														<span class=" label_intro">TAX (%)</span>
													</div>
													<span class="clear"></span>
												</div>
									
										</div>
										</li>
										<li>
										<div class="form_grid_12">
										<div class="form_input">
											<div class="form_grid_12">
														<textarea class="summernote edi-css form-control" id="remark" style="height: 39px;"></textarea>
														<span class=" label_intro">Remarks</span>
													</div>
													<span class="clear"></span>
												</div>
										</div>
										</li>
									</ul>
								</fieldset>
								</li>
								</ul>

								<ul style="text-align: center;">
									<li>
									<div class="form_grid_12">
										<div class="form_input">
											<button type="submit" class="btn_small btn_blue"><span>Save</span></button>
											<button type="reset" class="btn_small btn_orange"><span>Reset</span></button>
											
										</div>
									</div>
									</li>
								</ul>
							</form>
					</div>
			</div>
		</div>
		</div>
		</div>
		