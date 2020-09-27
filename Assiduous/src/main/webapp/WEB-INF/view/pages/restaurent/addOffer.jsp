 <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
  <!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script> -->
<style>
.chzn-single{
width:100%;
}
/* #simplemodal-container a.modalCloseImg {
	background:url(/img/x.png) no-repeat; /* adjust url as required */
	width:25px;
	height:29px;
	display:inline;
	z-index:3200;
	position:absolute;
	top:-15px;
	right:-18px;
	cursor:pointer;
} */
</style>
<div id="container" style="margin-left: 265px;" >
	
	<div class="page_title">
		<span class="stats_icon bank_sl"><span class="bank_3"></span></span>
		<h3>Offer</h3>
		
	</div>
	
	<div id="content">
	
		<div class="grid_container">
				
<!-- <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      Modal content
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Modal Header</h4>
        </div>
        <div class="modal-body">
          <p>Some text in the modal.</p>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div> -->
	<div class="grid_4">
				<div class="widget_wrap">
					<div class="widget_top">
						<span class="h_icon list"></span>
						<h6>Modal/Dialog Box</h6>
					</div>
					<div class="widget_content">
						<ul class="modal_elem">
							<li>
							<div id='confirm-dialog'>
								<!-- modal content -->
								<div id='confirm'>
									<div class='header blue_d'>
										<span>Confirm</span>
									</div>
									<div class='message'>
									</div>
									<div class='buttons'>
										<div class='no simplemodal-close btn_30_blue'>
											<a href="#"><span>No</span></a>
										</div>
										<div class='yes btn_30_blue'>
											<a href="#"><span>Yes</span></a>
										</div>
									</div>
								</div>
								<a href='#' class='confirm'>Confirm Dialog</a>
							</div>
							</li>
							<li>
							<!-- modal content -->
							<div id="osx-modal-content">
								<div id="osx-modal-title" class="blue_d">
									 OSX Style Modal Dialog
								</div>
								<div class="close">
									<a href="#" class="simplemodal-close">x</a>
								</div>
								<div id="osx-modal-data">
									<h2>Hello! I'm SimpleModal!</h2>
									<p>
										 SimpleModal is a lightweight jQuery Plugin which provides a powerful interface for modal dialog development. Think of it as a modal dialog framework.
									</p>
									<p>
										 SimpleModal gives you the flexibility to build whatever you can envision, while shielding you from related cross-browser issues inherent with UI development..
									</p>
									<p>
										 As you can see by this example, SimpleModal can be easily configured to behave like an OSX dialog. With a handful options, 2 custom callbacks and some styling, you have a visually appealing dialog that is ready to use!
									</p>
									<div class="btn_24_blue">
										<a href="#" class="simplemodal-close"><span class="icon cross_co"></span><span>Link Button</span></a>
									</div>
									<p>
										<span style="display:block;">(or press ESC or click the overlay)</span>
									</p>
								</div>
							</div>
							<a href='#' id='osx-modal' class='osx'>Demo</a></li>
							<li>
							<%-- <div id="basic-modal-content">
								<h3>Basic Modal Dialog</h3>
								<p>
									 For this demo, SimpleModal is using this "hidden" data for its content. You can also populate the modal dialog with an AJAX response, standard HTML or DOM element(s).
								</p>
								<p>
									 Examples:
								</p>
								<p>
									<code>$('#basicModalContent').modal(); // jQuery object - this demo</code>
								</p>
								<p>
									<code>$.modal(document.getElementById('basicModalContent')); // DOM</code>
								</p>
								<p>
									<code>$.modal('&lt;p&gt;&lt;b&gt;HTML&lt;/b&gt; elements&lt;/p&gt;'); // HTML</code>
								</p>
								<p>
									<code>$('&lt;div&gt;&lt;/div&gt;').load('page.html').modal(); // AJAX</code>
								</p>
								<div class="btn_24_blue">
									<a href="#" class="simplemodal-close"><span>More details...</span></a>
								</div> 
							</div>--%>
							<a href="#" class="basic-modal">Modal Two</a></li>
							<li><a href="#" class="confirm_dialog">Confirm Modal</a></li>
							<li><a class='ajax' href="data/ajax-stepy.html" title="Homer Defined">Colorbox Modal</a></li>
						</ul>
					</div>
				</div>
			</div>		
			
			<span class="clear"></span>
			
		</div>
		<span class="clear"></span>
	</div>
	
</div>