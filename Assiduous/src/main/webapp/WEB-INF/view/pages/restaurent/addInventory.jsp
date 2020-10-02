 <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div id="">
		<div class="">
			<div class="grid_12 full_block" style="width: -webkit-fill-available;">
				<div class="">
					<div class="widget_top">
						<span class="h_icon list"></span>
						<h6>Add Stock </h6>
						<!-- <div id="widget_tab">
							<ul>
								<li><a href="#tab1" class="active_tab">Edit/Post Content</a></li>
								<li><a href="#tab2">Preview</a></li>
							</ul>
						</div> -->
					</div>
			<div class="widget_content" style="margin-top: -13px">
						<div id="tab1">
							
							<form action="#" method="post" class="form_container left_label field_set">
								
								<fieldset>
									<legend>Stock</legend>
									<ul>
										<li>
										<div class="form_grid_12">
											<label class="field_title">Select Item <span class="label_intro">This is a Item</span></label>
											<div class="form_input">
												<select data-placeholder="Your Favorite Football Team" style=" width:300px" class="chzn-select" tabindex="13">
													<option value=""></option>
													<optgroup label="NFC EAST">
													<option>Dallas Cowboys</option>
													<option>New York Giants</option>
													<option>Philadelphia Eagles</option>
													<option>Washington Redskins</option>
													</optgroup>
													<optgroup label="NFC NORTH">
													
													</optgroup>
												</select>
											</div>
										</div>
										</li>
										<li>
										<div class="form_grid_12">
											<label class="field_title">Select Location <span class="label_intro">This is a Location</span></label>
											<div class="form_input">
												<select data-placeholder="Select prefere Location" style=" width:300px" class="chzn-select" tabindex="13">
													<option value=""></option>
													<optgroup label="NFC EAST">
													<option>Dallas Cowboys</option>
													<option>New York Giants</option>
													<option>Philadelphia Eagles</option>
													<option>Washington Redskins</option>
													</optgroup>
													<optgroup label="NFC NORTH">
													
													</optgroup>
												</select>
											</div>
										</div>
										</li>
										<li>
										<div class="form_grid_12">
											<label class="field_title">Quantity <span class="label_intro">This is a Quantity</span></label>
											<div class="form_input">
													<div class="">
														<input name="firstname" type="text"/>
														<span class=" label_intro">Quantity</span>
													</div>
													<span class="clear"></span>
												</div>

										</div>
										</li>
										
									</ul>
								</fieldset>
								<ul>
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
		</div>
		