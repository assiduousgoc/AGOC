
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
					<h6>Add Category</h6>

				</div>
				<div class="widget_content" style="margin-top: -13px">
					<div id="tab1">

						<form:form action="add-food-type.htm" method="post"
							commandName="food_cat" modelAttribute="food_cat"
							class="form_container left_label field_set">
							<fieldset>
								<legend>Category</legend>
								<ul>

									<li>
										<div class="form_grid_12">
											<label class="field_title">Catetory Name <span
												class="label_intro">This is a Location</span></label>

											<div class="form_input">
												<div class="">
													<form:hidden path="id" id="id"/>
													<form:input path="name" id="name" /> <span
														class=" label_intro">Name</span>
												</div>
												<span class="clear"></span>
											</div>

										</div>
									</li>
									<li>
										<div class="form_grid_12">
											<label class="field_title">Display Order <span
												class="label_intro">This is a Quantity</span></label>
											<div class="form_input">
												<div class="">
													<input name="firstname" type="text" /> <span
														class=" label_intro">Display Orders</span>
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
											<button type="submit" class="btn_small btn_blue">
												<span>Save</span>
											</button>
											<button type="reset" class="btn_small btn_orange">
												<span>Reset</span>
											</button>

										</div>
									</div>
								</li>
							</ul>
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
