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
						<h6>Create Product</h6>
					</div>
					<div class="widget_content" style="margin-top: 0px !important;">
						<form action="#" method="post" class="form_container">
							<div class="elem_extend">
								<ul>
								
									<li>
									<fieldset>
										<legend>Item Information</legend>
										<ul>
											<li>
											<div class="form_grid_12">
												<div class="form_input">
													<div class="form_grid_4 alpha">
														<input name="firstname" type="text"/>
														<span class=" label_intro">Name</span>
													</div>
													<div class="form_grid_4 ">
														<input name="lastname" type="text"/>
														<span class=" label_intro">Description</span>
													</div>
													<div class="form_grid_3 ">
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
													</div>
													
													<span class="clear"></span>
												</div>
											</div>
											</li>
											<li>
											<div class="form_grid_12 multiline">
												<div class="form_input">
													<div class="form_grid_4 alpha">
														<input name="mrp" type="text"/>
														<span class=" label_intro">MRP(Rs.)</span>
													</div>
													<div class="form_grid_3 ">
														<select data-placeholder="Choose a Status..." class="chzn-select full" name="Field109" tabindex="20">
															<option value=""></option>
															<option value="1">Active       </option>
															<option value="0">Inactive    </option>
															
														</select>
														<span class=" label_intro">Status</span>
													</div>
													<div class="form_grid_1" style="margin-top: -8px; margin-left: -3px;">
														<div class="btn_30_light">
															<a href="#" class="tipTop confirm_dialog_import" original-title="Add New Status"><span class="icon add_co"></span></a>
															</div>
													</div>
													<div class="form_grid_3 ">
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
													</div>
													<span class="clear"></span>
												</div>
											</div>
											</li>
											<li>
											<div class="form_grid_12">
												<div class="form_input">
													<div class="form_grid_2 alpha">
														<input name="Pack" type="text" id="pack"/>
														<span class=" label_intro">Pack</span>
													</div>
													<div class="form_grid_2">
														<input name="Pack" type="text" id="scode"/>
														<span class=" label_intro">Stock Code</span>
													</div>
													<div class="form_grid_4">
														<input name="Gift" type="text" id="Gift"/>
														<span class=" label_intro">Gift</span>
													</div>
													<div class="form_grid_4">
														<input name="unitprice" type="text" id="unitprice"/>
														<span class=" label_intro">Unit Price</span>
													</div>
													<span class="clear"></span>
												</div>
												
											</div>
											</li>
											<li>
											<div class="form_grid_12">
												<div class="form_input">
												<div class="form_grid_4 alpha">
													<input name="filed30" type="text" class="datepicker"/>
														<span class=" label_intro">Offer Till Date</span>
													</div>
													<div class="form_grid_4">
													<input name="filed31" type="text" class="datepicker"/>
														<span class=" label_intro">Offer Effective Date</span>
													</div>
													<div class="form_grid_4">
														<input name="offerUnit" type="text" id="offerUnit"/>
														<span class=" label_intro">Offer Unit</span>
													</div>
													<span class="clear"></span>
												</div>
												
											</div>
											</li>
											<li>
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
										
											
											</li>
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