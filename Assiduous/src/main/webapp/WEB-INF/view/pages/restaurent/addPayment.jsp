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
						<h6>Pay Payment </h6>
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
									<legend>Pay</legend>
									<ul>
									<li>
										<div class="form_grid_12">
										<div class="form_input">
											<div class="form_grid_4 ">
														<select data-placeholder="Choose a Customer..." class="chzn-select full" name="Field109" tabindex="20">
															<option value=""></option>
															<option value="United States">Maheshwar</option>
															<option value="United Kingdom">Deepak</option>
															
														</select>
														<span class=" label_intro">Customer</span>
													</div>
													<div class="form_grid_2" style="margin-top: -8px; margin-left: -3px;">
														<div class="btn_30_light">
															<a href="#" class="tipTop confirm_dialog_import" original-title="Add New Customer"><span class="icon add_co"></span></a>
															</div>
													</div>
													<div class="form_grid_6 ">
														<input type="text" class="form-control"  id="Amount" name="Amount"	/>
														<span class=" label_intro">Amount</span>
													</div>
													<span class="clear"></span>
												</div>
										</div>
										</li>
										<li>
										<div class="form_grid_12">
										<div class="form_input">
											<div class="form_grid_6 alpha">
														<input type="text" class="form-control"  id="accNo" name="accNo"	onblur="matchfun('accNo', '[0-9]{2}[A-Z]{5}[0-9]{4}[A-Z]{1}[1-9A-Z]{1}Z[0-9A-Z]{1}');"
														onchange="changecolor('accNo');"  />
														<span class=" label_intro">Account Number</span>
													</div>
													<div class="form_grid_6 ">
														<input type="text" class="form-control"  id="accName" name="accName"	onblur="matchfun('accName', '[0-9]{2}[A-Z]{5}[0-9]{4}[A-Z]{1}[1-9A-Z]{1}Z[0-9A-Z]{1}');"
														onchange="changecolor('accName');"  />
														<span class=" label_intro">Account Name</span>
													</div>
													<span class="clear"></span>
												</div>
									
										</div>
										</li>
										<li>
										<div class="form_grid_12">
										<div class="form_input">
											<div class="form_grid_12 alpha">
														<textarea class="form-control"  id="narration" name="narration"	onblur="matchfun('narration', '[0-9]{2}[A-Z]{5}[0-9]{4}[A-Z]{1}[1-9A-Z]{1}Z[0-9A-Z]{1}');"
														onchange="changecolor('narration');" ></textarea>
														<span class=" label_intro">Narration</span>
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
		