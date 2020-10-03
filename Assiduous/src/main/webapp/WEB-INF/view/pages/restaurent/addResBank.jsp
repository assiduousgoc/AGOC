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
						<h6>Add Bank</h6>
					</div>
					<div class="widget_content" style="margin-top: 0px !important;">
						<form action="#" method="post" class="form_container">
							<!-- <div class="elem_extend"> -->
							<div class="elem_extend">
								<ul>
								
									<li>
									<fieldset style="background-color: #FFFF">
										<legend>Bank Information</legend>
										<ul>
											<li>
											<div class="form_grid_12">
												<div class="form_input">
													<div class="form_grid_4 alpha">
														<input name="bankName" id="bankName" type="text"/>
														<span class=" label_intro">Bank Name</span>
													</div>
													<div class="form_grid_4 ">
														<input name="branchName" id="branchName" type="text"/>
														<span class=" label_intro">Branch Name</span>
													</div>
													<div class="form_grid_4 ">
														<input name="accNo" id="accNo" type="text"/>
														<span class=" label_intro">Account Number</span>
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
											<div class="form_grid_12 multiline">
												<div class="form_input">
													<div class="form_grid_4 alpha">
														<input type='text' class="form-control" name="ifsc" id="ifsc"
																	onblur="matchfun('ifsc','[A-Z]{3,4}[0-9]{5,7}');"
																	onchange="changecolor('ifsc');" />
														<span class=" label_intro">IFSC Code</span>
													</div>
													<div class="form_grid_3 ">
														<select data-placeholder="Choose a Acc.Type..." class="chzn-select full" name="Field109" tabindex="20">
															<option value=""></option>
															<option value="cr">CR </option>
															<option value="dr">DR</option>
															
														</select>
														<span class=" label_intro">A/C Type *</span>
													</div>
													<div class="form_grid_1" style="margin-top: -8px; margin-left: 15px;">
														<div class="btn_30_light">
															<a href="#" class="tipTop confirm_dialog_import" original-title="Add New ACC Type"><span class="icon add_co"></span></a>
															</div>
													</div>
													<div class="form_grid_4 alpha">
														<input type='text' class="form-control" name="panNo"
															id="panNo"
															onblur="matchfun('panNo','[A-Z]{5}[0-9]{4}[A-Z]{1}');"
															onchange="changecolor('panNo');" />
														<span class=" label_intro">PAN Number</span>
													</div>
													
													<!-- <div class="form_grid_3 ">
														<select data-placeholder="Choose a Offer Type.." class="chzn-select full" name="Field109" tabindex="20">
															<option value=""></option>
															<option value="United States">United States</option>
															<option value="United Kingdom">United Kingdom</option>
															
														</select>
														<span class=" label_intro">Offer Type.</span>
													</div>
													<div class="form_grid_1" style="margin-top: -8px; margin-left: -3px;">
														<div class="btn_30_light">
															<a href="#" class="tipTop confirm_dialog_import" original-title="Add New Offer"><span class="icon add_co"></span></a>
															</div>
													</div> -->
													<span class="clear"></span>
												</div>
											</div>
											</li>
											<li>
											<div class="form_grid_12">
												<div class="form_input">
													<div class="form_grid_4 alpha">
														<input type='text' class="form-control" name="tanNo"
															id="tanNo"
															onblur="matchfun('tanNo','[A-Z]{4}[0-9]{5}[A-Z]{1}');"
															onchange="changecolor('tanNo');" />
														<span class=" label_intro">TAN Number</span>
													</div>
													
													<div class="form_grid_4">
														<input type='text' class="form-control" name="address" id="address" />
														<span class=" label_intro">Address </span>
													</div>
													<div class="form_grid_3 ">
														<select data-placeholder="Choose a City..." class="chzn-select full" name="Field109" tabindex="20">
															<option value=""></option>
															<option value="cr">New Delhi </option>
															<option value="dr">Bihar</option>
															
														</select>
														<span class=" label_intro">City *</span>
													</div>
													<div class="form_grid_1" style="margin-top: -8px; margin-left: 0px;">
														<div class="btn_30_light">
															<a href="#" class="tipTop confirm_dialog_import" original-title="Add New City"><span class="icon add_co"></span></a>
															</div>
													</div>
													<span class="clear"></span>
												</div>
												
											</div>
											</li>
											<li>
											<div class="form_grid_12">
												<div class="form_input">
												<div class="form_grid_4 alpha">
													<input type='text' class="form-control" name="pincode" id="pincode" />
														<span class=" label_intro">Pin Code</span>
													</div>
													<div class="form_grid_4">
													<textarea class="summernote edi-css form-control"	name="description" id="description"	style="max-height: 39px;"></textarea>
														<span class=" label_intro">Description</span>
													</div>
													<div class="form_grid_4 alpha">
														<input name="mrp" type="file"/>
														<span class=" label_intro">Image Attachment</span>
													</div>
													<span class="clear"></span>
												</div>
												
											</div>
											</li>
											<!-- <li>
											<div class="form_grid_12 multiline">
												<div class="form_input">
													<div class="form_grid_4 alpha">
														<input name="mrp" type="file"/>
														<span class=" label_intro">Image Attachment</span>
													</div>
													<div class="form_grid_3 ">
														<select data-placeholder="Choose a Tax Slab..." class="chzn-select full" name="Field109" tabindex="20">
															<option value=""></option>
															<option value="1">GST       </option>
															<option value="0">IGST    </option>
															<option value="0">VAT    </option>
														</select>
														<span class=" label_intro">Tax Slab</span>
													</div>
													<div class="form_grid_1" style="margin-top: -8px; margin-left: -3px;">
														<div class="btn_30_light">
															<a href="#" class="tipTop confirm_dialog_import" original-title="Add New Tax"><span class="icon add_co"></span></a>
															</div>
													</div>
													<div class="form_grid_3 ">
														<select data-placeholder="Choose a Supplier.." class="chzn-select full" name="Field109" tabindex="20">
															<option value=""></option>
															<option value="United States">United States</option>
															<option value="United Kingdom">United Kingdom</option>
															
														</select>
														<span class=" label_intro">Supplier.</span>
													</div>
													<div class="form_grid_1" style="margin-top: -8px; margin-left: -3px;">
														<div class="btn_30_light">
															<a href="#" class="tipTop confirm_dialog_import" original-title="Add New Supplier"><span class="icon add_co"></span></a>
															</div>
													</div>
													<span class="clear"></span>
												</div>
											</div>
											</li>
											<li>
										
											
											</li> -->
										</ul>
									</fieldset>
									</li>
								</ul>
							</div>
							<ul style="text-align: center; margin-top: -14px">
								<li>
								<div class="form_grid_12">
									<div class="form_input">
									
										<button type="button" class="btn_small btn_orange no" data-dismiss="modal"><span>Cancel</span></button>
										<button type="submit" class="btn_small btn_blue"><span>Submit</span></button>
										<button type="reset" class="btn_small btn_blue"><span>Reset</span></button>
										
									</div>
								</div>
								</li>
							</ul>
						</form>
					</div>
				</div>
			</div>
		</div>
		<span class="clear"></span>
	</div>