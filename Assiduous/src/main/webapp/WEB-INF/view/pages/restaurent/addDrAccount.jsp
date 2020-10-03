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
						<h6>Add DR. Account </h6>
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
									<legend>Dr. Account</legend>
									<ul>
										<li>
										<div class="form_grid_12">
										<div class="form_input">
													<div class="form_grid_6 alpha">
														<input name="acName" id="acName" type="text"/>
														<span class=" label_intro">A/C Name *</span>
													</div>
													<div class="form_grid_6">
														<input name="description" id="description" type="text"/>
														<span class=" label_intro">Description</span>
													</div>
													<!-- <div class="form_grid_3 ">
														<select data-placeholder="Choose a Category..." class="chzn-select full" name="Field109" tabindex="20">
															<option value=""></option>
															<option value="United States">United States</option>
															<option value="United Kingdom">United Kingdom</option>
															
														</select>
														<span class=" label_intro">Category</span>
													</div>
													<div class="form_grid_1" style="margin-top: -8px; margin-left: -3px;">
														<div class="btn_30_light">
															<a href="#" class="tipTop confirm_dialog_import" original-title="Add New Category"><span class="icon add_co"></span></a>
															</div>
													</div> -->
													
													<span class="clear"></span>
												</div>
									
										</div>
										</li>
										<li>
										<div class="form_grid_12">
										<div class="form_input">
											<div class="form_grid_6 alpha">
														<input name=mob id="mob" type="text"/>
														<span class=" label_intro">Mobile Number *</span>
													</div>
													<div class="form_grid_6">
														<input name="email" id="email" type="text"/>
														<span class=" label_intro">Email</span>
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
		