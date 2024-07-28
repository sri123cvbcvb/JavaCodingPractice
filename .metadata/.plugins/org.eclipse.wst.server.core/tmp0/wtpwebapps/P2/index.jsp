<!--
author: W3layouts
author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
<head>
<title>Catchy Carz a classified ads Category Flat Bootstrap Responsive Website Template | Home :: w3layouts</title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Catchy Carz Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //for-mobile-apps -->
<link href="asset1/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link rel="stylesheet" type="text/css" href="asset1/css/zoomslider.css" />
<link rel="stylesheet" type="text/css" href="asset1/css/style.css" />
<link rel="stylesheet" type="text/css" href="asset1/css/component.css" />
<script type="text/javascript" src="asset1/js/modernizr-2.6.2.min.js"></script>
<!--/web-fonts-->
	<link href='//fonts.googleapis.com/css?family=Open+Sans:400,600,600italic,300,300italic,700,400italic' rel='stylesheet' type='text/css'>
	<link href='//fonts.googleapis.com/css?family=Wallpoet' rel='stylesheet' type='text/css'>
	<link href='//fonts.googleapis.com/css?family=Ubuntu:400,500,700,300' rel='stylesheet' type='text/css'>
	  <script src="https://www.google.com/recaptcha/api.js" async defer></script>
<!--//web-fonts-->
</head>
<style>
.video-container {
    height: 700px;
    width: 1300px;
    position: relative;
   
}

.video-container video {
  width: 100%;
  height: 100%;
  position: absolute;
  object-fit: cover;
  z-index: 0;
}

/* Just styling the content of the div, the *magic* in the previous rules */
.video-container .agileits-logo {
  z-index: 1;
  position: relative;
  text-align: center;
  color: #dc0000;
  padding: 10px;
}
.error {
            color: red;
        }
.dim-overlay {
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    background-color: rgba(0, 0, 0, 0.5); /* Adjust the opacity to control the dim effect */
}

</style> 
<body>
<!--/banner-section-->
<div class="video-container">
    <video autoplay muted loop>
           <source src="video/car.mp4" type="video/mp4">    </video>
	<!-- <div id="demo-1" data-zs-src='["asset1/images/2.jpg", "asset1/images/1.jpg", "asset1/images/3.jpg"]' data-zs-overlay="dots"> -->
		<div class="demo-inner-content">
		   <div class="header-top">
		    <!-- /header-left -->
		          <div class="header-left">
				  <!-- /sidebar -->
				        <div id="sidebar"> 
						     <h4 class="menu">Menu</h4>
						          <ul>
							           <li><a href="#" class="men" data-toggle="modal" data-target="#myModa3" onclick="passValue('USER'); toggleRegisterLink();">USER </a></li>
							           <li><a href="#" data-toggle="modal" data-target="#myModa3" onclick="passValue('ADMIN'); toggleRegisterLink();">ADMIN</a></li>
							           <li><a href="#" data-toggle="modal" data-target="#myModa3" onclick="passValue('DATA PREPROCESSING'); toggleRegisterLink();">DATA PREPROCESSING</a><li>
							           <li><a href="#" data-toggle="modal" data-target="#myModa3" onclick="passValue('FORECASTING'); toggleRegisterLink();">FORECASTING</a></li>
							           <li><a href="#" data-toggle="modal" data-target="#myModa3" onclick="passValue('DATA CENTER'); toggleRegisterLink();">DATA CENTER</a><li>
							      </ul>
							   
						  
						   <div id="sidebar-btn">
							   <span></span>
							   <span></span>
							   <span></span>
						   </div>
					   </div>

							 <script>
								  var sidebarbtn = document.getElementById('sidebar-btn');
									var sidebar = document.getElementById('sidebar');
								   sidebarbtn.addEventListener('click', function () {
								  if(sidebar.classList.contains('visible')){
										sidebar.classList.remove('visible'); 
								   }else {
										sidebar.className = 'visible';
									}
								  });
								</script>
					    
					</div>
				 
						<div class="clearfix"></div>
					</div>
					<div class="clearfix"></div>
		    <!--banner-info-->
			<div class="banner-info">
			  <h1><a href="index.html">ROAD <span class="logo-sub">ACCIDENT</span> PREDICTION</a></h1>
			    <h2><span>COME LOOK </span> <span>AT THE SELECTION! </span></h2>
				<p>Eye it – try it – Predict it!</p>
			 
			</div>
				<!--//banner-info-->	
		</div>
		<div class="dim-overlay"></div>
</div>
<!-- discounts-->
		
			<!-- //discounts-->
			<!-- //login-->
				<div class="modal ab fade" id="myModa3" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
				<div class="modal-dialog sign" role="document">
					<div class="modal-content about">
						<div class="modal-header one">
							<button type="button" class="close sg" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>	
								<div class="discount one">
									<h3 id="head">hai</h3><!-- <h3>login</h3> -->
									
								</div>							
						</div>
						 <div class="modal-body about">
								<div class="login-top sign-top one">
								 <form >
								 <div id="adminInfo" style="display: none;"></div>
								 <label for="recipient-name" class="col-form-label">ROLE</label>
                            <select class="form-control" id="module" name="module" >
                <option class="form-control" value="">SELECT</option>
                <option class="form-control" value="USER">USER</option>
                <option class="form-control" value="ADMIN">ADMIN</option>
                <option class="form-control" value="DATA PREPROCESSING">DATA PREPROCESSING</option>
                <option class="form-control" value="FORECASTING">FORECASTING</option>
                <option class="form-control" value="DATA CENTER">DATA CENTER</option>
            </select>
									 <input type="text" id="un" name="name" class="name active" placeholder="Your Name" required=""> 
									<input type="text" id="em" name="email "class="email" placeholder="Email" required="">
									<input type="password" id= "pass" name="password" class="password" placeholder="Password" required="">		
									<!-- <input type="checkbox" id="brand1" value="" required="required">
									<label for="brand1"><span></span> Remember me?</label> -->
									<div class="login-bottom one">
									<ul>
										<div class="g-recaptcha" data-sitekey="6LeD5eclAAAAAGHLQC3RkAzCf8IDfwe1BwoKrk_c" data-callback="verifyCaptcha" id="captcha" required=""></div>
                                     <div id="g-recaptcha-error"></div><br>
					  					<li>
										
										<!--   <a href="#" onclick="validateForm(event)"    class="form-control">LOGIN</a> -->
										 <input type="submit" onclick="validateForm(event)" value="SIGN UP">
										</li>
										
										<li>
											<div style="margin-left:100px;" class="tag"><a href="#"  id="registerLink" data-toggle="modal" data-target="#myModal2"><span class="glyphicon glyphicon-log-in"></span> Sign Up</a></div>
										</li>
										
									<div class="clearfix"></div>
									<div id="errorDiv"></div>
								</ul>
								</div>	
								</form>
								
							</div>
							
							
						 </div>
						
								
					</div>
				</div>
			</div>
			<!-- //login-->
				<!-- //sign-up-->
				<div class="modal ab fade" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
				<div class="modal-dialog sign" role="document">
					<div class="modal-content about">
						<div class="modal-header one">
							<button type="button" class="close sg" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>	
								<div class="discount one">
									<h3>Sign Up</h3>
									
								</div>							
						</div>
						 <div class="modal-body about">
								<div class="login-top sign-top one">
								 <form action="Us_reg" method="post">
									<input type="text" name="uname" class="name active" placeholder="Your Name" required="">
									<input type="text" name="email" class="email" placeholder="Email" required="">
									<input type="password" name="pass" class="password" placeholder="Password" required="">	
									<input type="password" name="cpass" class="password" placeholder="Password" required="">	
									<input type="checkbox" id="brand1" value="">
									<label for="brand1"><span></span> Remember me?</label>
									<div class="login-bottom one">
									<ul>
										<li>
											<a href="#">Forgot password?</a>
										</li>
										<li>
										
										  <input type="submit" value="SIGN UP">
										
										</li>
									<div class="clearfix"></div>
								</ul>
								</div>	
								</form>
								
							</div>
							
							
						 </div>
						
								
					</div>
				</div>
			</div>
			<!-- //sign-up-->
				<!-- /location-->
				<div class="modal ab fade" id="myModal4" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
				<div class="modal-dialog sign" role="document">
					<div class="modal-content about">
						<div class="modal-header one">
							<button type="button" class="close sg" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>	
								<div class="discount one">
									<h3>Please Tell Us Your City</h3>
									
								</div>							
						</div>
						 <div class="modal-body about">
								<div class="login-top sign-top location">
								 <form action="#" method="post">
				                      <select id="country12" onchange="change_country(this.value)" class="frm-field required">
														<option value="null"> Select City</option>
														<option value="city">Amsterdam</option>
														<option value="city">Bahrain</option>
														<option value="city">Cannes</option>
														<option value="city">Dublin</option>
														<option value="city">Edinburgh</option>
														<option value="city">Florence</option>
														<option value="city">Georgia</option>
														<option value="city">Hungary</option>
														<option value="city">Hong Kong</option>
														<option value="city">Johannesburg</option>
														<option value="city">Kiev</option>
														<option value="city">London</option>
														<option value="city">Others...</option>
										</select>
								</form>
							     </div>
							
							
						 </div>

								
					</div>
				</div>
			</div>
			<!-- //location-->
<!--//banner-section-->
	<!--/featured_section-->
	
	<!--//featured_section-->
	<!--/select-cars-agile-->
	<div class="select-cars-agile">
	   <div class="container">
	         <div class="grid cars-main">
			  <div class="col-md-7 slide-show-w3l">
			     <!--//screen-gallery-->
				 <h3 class="tittle top">NEW CARS</h3>
				 <h6 class="sub">Great Prices. Great Vehicles. Great Service.</h6>
							<div class="car-view-slider">
					          <ul id="flexiselDemo">
							 <li>
								 <a href="upcoming.html"><img src="asset1/images/n2.jpg" alt=""/>
								  <div class="caption">
										<h3><a href="upcoming.html">Ford Mustang GT 500</a></h3>
										<span>Catchy Carz</span>
										
									</div>
								 </a>
								
							 </li>
							 <li>
								 <a href="upcoming.html"><img src="images/n1.jpeg" alt=""/>
								 <div class="caption">
										<h3><a href="upcoming.html">Acura TLX</a></h3>
										<span>Catchy Carz</span>
										
									</div>
								 </a>
							 </li>
							 <li>
								 <a href="upcoming.html"><img src="asset1/images/n3.jpg" alt=""/>
								  <div class="caption">
										<h3><a href="upcoming.html"> McLaren MP4-12c</a></h3>
										<span>Catchy Carz</span>
										
									</div>
								 </a>
							 </li>
							 <li>
								 <a href="upcoming.html"><img src="asset1/images/n4.jpg" alt=""/>
									<div class="caption">
										<h3><a href="upcoming.html">BMW Z4</a></h3>
									<span>Catchy Carz</span>
										
									</div>
								 </a>
							 </li>
							</ul>
						</div>
						<!--//screen-gallery-->

					</div>
					<div class="col-md-5 new-car-used">
					  <h3 class="tittle top">USED CARS</h3>
					  <h6 class="sub">Used Cars at Shocking Prices.</h6>
					  <div class="used-one">
					     <figure class="effect-zoe">
							 <a href="used.html"><img src="asset1/images/used_car.jpg" alt="Used Car"></a>
							<figcaption>
								<h4>CATCHY <span>CARZ</span></h4>
								<p class="icon-links">
									<a href="#"><i class="glyphicon glyphicon-heart-empty"></i></a>
									<a href="#"><i class="glyphicon glyphicon-eye-open"></i></a>
									<a href="#"><i class="glyphicon glyphicon-paperclip"></i></a>
								</p>
							<p class="description">Lorem Ipsum is simply dummy text of the printing and typesetting industry.</p>
							</figcaption>			
						</figure>
					  </div>
					  <div class="clearfix"> </div>
					   <div class="used-one second">
					     <figure class="effect-zoe">
							<a href="used.html"><img src="asset1/images/used_car1.jpg" alt="Used Car"></a>
							<figcaption>
								<h4>CATCHY <span>CARZ</span></h4>
								<p class="icon-links">
									<a href="#"><i class="glyphicon glyphicon-heart-empty"></i></a>
									<a href="#"><i class="glyphicon glyphicon-eye-open"></i></a>
									<a href="#"><i class="glyphicon glyphicon-paperclip"></i></a>
								</p>
							<p class="description">Lorem Ipsum is simply dummy text of the printing and typesetting industry.</p>
							</figcaption>			
						</figure>
					  </div>
					</div>
					<div class="clearfix"> </div>
				</div>
	   </div>
	</div>
	<!-- /bottom-banner -->
	<div class="banner-bottom">
	   <div class="container">
          <div class="bottom-form">
			<div class="inner-text">
				
			 <form action="#" method="post">
				<h3>Choose Your Best Car</h3>
					<div class="best-hot">
						<h5>Name</h5>
						<input type="text" class="name active" placeholder="Name" required="">
					</div>
					<div class="best-hot">
						<h5>Email</h5>
						<input type="text" class="email" placeholder="Email" required="">
					</div>
					<div class="section_drop2">
					<h5>City</h5>
						<select id="country6" onchange="change_country(this.value)" class="frm-field required">
														<option value="null"> Select City</option>
														<option value="city">Amsterdam</option>
														<option value="city">Bahrain</option>
														<option value="city">Cannes</option>
														<option value="city">Dublin</option>
														<option value="city">Edinburgh</option>
														<option value="city">Florence</option>
														<option value="city">Georgia</option>
														<option value="city">Hungary</option>
														<option value="city">Hong Kong</option>
														<option value="city">Johannesburg</option>
														<option value="city">Kiev</option>
														<option value="city">London</option>
														<option value="city">Others...</option>
													</select>
												   </div>
					<input type="submit" value="Book Now">
				</form>
			</div>
		</div>
	</div>
</div>
	<!-- //bottom-banner -->
	<!-- /slider1 -->
			<div class="slider1">
		<div class="arrival-grids">			 
			 <ul id="flexiselDemo1">
				 <li>
					 <a href="single.html"><img src="asset1/images/f1.jpg" alt=""/>
					  <div class="caption">
							<h3><a href="single.html">Mercedes-Benz C250 CDI</a></h3>
							<span>Catchy Carz</span>
							
						</div>
					 </a>
					
				 </li>
				 <li>
					 <a href="single.html"><img src="asset1/images/f2.jpg" alt=""/>
					 <div class="caption">
							<h3><a href="single.html">Audi A4 2.0 TDI</a></h3>
							<span>Catchy Carz</span>
							
						</div>
					 </a>
				 </li>
				 <li>
					 <a href="single.html"><img src="asset1/images/f3.jpg" alt=""/>
					  <div class="caption">
							<h3><a href="single.html">Ford Mustang GT 500</a></h3>
							<span>Catchy Carz</span>
							
						</div>
					 </a>
				 </li>
				 <li>
					 <a href="single.html"><img src="asset1/images/f4.jpg" alt=""/>
					    <div class="caption">
							<h3><a href="single.html">Ford Mustang GT 350</a></h3>
						<span>Catchy Carz</span>
							
						</div>
					 </a>
				 </li>
				 <li>
					 <a href="single.html"><img src="asset1/images/f7.jpg" alt=""/>
					    <div class="caption">
							<h3><a href="single.html">BMW M4</a></h3>
							<span>Catchy Carz</span>
							
						</div>
					 </a>
				 </li>
				 <li>
					 <a href="single.html"><img src="asset1/images/f5.jpeg" alt=""/>
					 <div class="caption">
							<h3><a href="single.html">Ferrari F430</a></h3>
							<span>Catchy Carz</span>
							
						</div>
					 </a>
				 </li>
				  <li>
					 <a href="single.html"><img src="asset1/images/f8.jpg" alt=""/>
					    <div class="caption">
							<h3><a href="single.html">BMW X4 M Sport</a></h3>
							<span>Catchy Carz</span>
					    </div>
					 </a>
				 </li>
				</ul>
		  </div>
	  </div>
	<!-- //slider -->
	<!-- Services -->
	
		<div class="clearfix"></div>
		<!-- //Services -->
			<!-- footer -->
	<div class="footer">
		<div class="container">
			<div class="footer-grids">
				<div class="col-md-3 footer-grid animated wow slideInLeft" data-wow-delay=".5s">
					<h3>About Us</h3>
					<p>Duis aute irure dolor in reprehenderit in voluptate velit esse.<span>Excepteur sint occaecat cupidatat 
						non proident, sunt in culpa qui officia deserunt mollit.</span></p>
				</div>
				<div class="col-md-3 footer-grid animated wow slideInLeft" data-wow-delay=".6s">
					<h3>Contact Info</h3>
					<ul>
						<li><i class="glyphicon glyphicon-map-marker" aria-hidden="true"></i>1234k Avenue, 4th block, <span>New York City.</span></li>
						<li><i class="glyphicon glyphicon-envelope" aria-hidden="true"></i><a href="mailto:info@example.com">info@example.com</a></li>
						<li><i class="glyphicon glyphicon-earphone" aria-hidden="true"></i>+1234 567 567</li>
					</ul>
				</div>
				<div class="col-md-3 footer-grid animated wow slideInLeft" data-wow-delay=".7s">
					<h3>Flickr Posts</h3>
					<div class="footer-grid-left">
						<a href="single.html"><img src="asset1/images/13.jpg" alt=" " class="img-responsive" /></a>
					</div>
					<div class="footer-grid-left">
						<a href="single.html"><img src="asset1/images/14.jpg" alt=" " class="img-responsive" /></a>
					</div>
					<div class="footer-grid-left">
						<a href="single.html"><img src="asset1/images/15.jpg" alt=" " class="img-responsive" /></a>
					</div>
					<div class="footer-grid-left">
						<a href="single.html"><img src="asset1/images/16.jpg" alt=" " class="img-responsive" /></a>
					</div>
					<div class="footer-grid-left">
						<a href="single.html"><img src="asset1/images/13.jpg" alt=" " class="img-responsive" /></a>
					</div>
					<div class="footer-grid-left">
						<a href="single.html"><img src="asset1/images/14.jpg" alt=" " class="img-responsive" /></a>
					</div>
					<div class="footer-grid-left">
						<a href="single.html"><img src="asset1/images/15.jpg" alt=" " class="img-responsive" /></a>
					</div>
					<div class="footer-grid-left">
						<a href="single.html"><img src="asset1/images/16.jpg" alt=" " class="img-responsive" /></a>
					</div>
					<div class="footer-grid-left">
						<a href="single.html"><img src="asset1/images/13.jpg" alt=" " class="img-responsive" /></a>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="col-md-3 footer-grid animated wow slideInLeft" data-wow-delay=".8s">
					<h3>Blog Posts</h3>
					<div class="footer-grid-sub-grids">
						<div class="footer-grid-sub-grid-left">
							<a href="single.html"><img src="asset1/images/11.jpg" alt=" " class="img-responsive" /></a>
						</div>
						<div class="footer-grid-sub-grid-right">
							<h4><a href="single.html">culpa qui officia deserunt</a></h4>
							<p>Posted On 25/3/2016</p>
						</div>
						<div class="clearfix"> </div>
					</div>
					<div class="footer-grid-sub-grids">
						<div class="footer-grid-sub-grid-left">
							<a href="single.html"><img src="asset1/images/10.jpg" alt=" " class="img-responsive" /></a>
						</div>
						<div class="footer-grid-sub-grid-right">
							<h4><a href="single.html">Quis autem vel eum iure</a></h4>
							<p>Posted On 25/4/2016</p>
						</div>
						<div class="clearfix"> </div>
					</div>
					<div class="footer-grid-sub-grids">
						<div class="footer-grid-sub-grid-left">
							<a href="single.html"><img src="asset1/images/15.jpg" alt=" " class="img-responsive" /></a>
						</div>
						<div class="footer-grid-sub-grid-right">
							<h4><a href="single.html">Quis autem vel eum iure</a></h4>
							<p>Posted On 25/5/2016</p>
						</div>
						<div class="clearfix"> </div>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
			<div class="footer-logo animated wow slideInUp" data-wow-delay=".5s">
				<h2><a href="index.html">Catchy Carz <span>Eye it – try it – buy it!</span></a></h2>
			</div>
			<div class="copy-right animated wow slideInUp" data-wow-delay=".5s">
				<p>&copy 2016 Catchy Carz. All rights reserved | Design by <a href="http://w3layouts.com/">W3layouts</a></p>
			</div>
		</div>
	</div>

<script src="asset1/js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="asset1/js/jquery.zoomslider.min.js"></script>
		<script type="text/javascript">
				 $(window).load(function() {			
				  $("#flexiselDemo").flexisel({
					visibleItems:1,
					animationSpeed: 1000,
					autoPlay: true,
					autoPlaySpeed:1000,    		
					pauseOnHover:true,
					enableResponsiveBreakpoints: true,
					responsiveBreakpoints: { 
						portrait: { 
							changePoint:480,
							visibleItems: 1
						}, 
						landscape: { 
							changePoint:640,
							visibleItems: 1
						},
						tablet: { 
							changePoint:768,
							visibleItems: 1
						}
					}
				});
				});
				</script>
						<script type="text/javascript">
				 $(window).load(function() {			
				  $("#flexiselDemo1").flexisel({
					visibleItems: 4,
					animationSpeed: 1000,
					autoPlay: true,
					autoPlaySpeed: 3000,    		
					pauseOnHover:true,
					enableResponsiveBreakpoints: true,
					responsiveBreakpoints: { 
						portrait: { 
							changePoint:480,
							visibleItems: 1
						}, 
						landscape: { 
							changePoint:640,
							visibleItems: 2
						},
						tablet: { 
							changePoint:768,
							visibleItems: 3
						}
					}
				});
				});
				</script>
				<script>
    function toggleRegisterLink() {
        var module = document.getElementById("module").value;
        var registerLink = document.getElementById("registerLink");
        var username = document.getElementById("un");
        var email = document.getElementById("em");
        if (module === "USER") {
            registerLink.style.display = "block";
            username.style.display = "none";
            email.style.display = "block";
        } else if (module === "ADMIN") {
            registerLink.style.display = "none";
            email.style.display = "none";
            username.style.display = "block";
        }
        else if (module === "DATA PREPROCESSING") {
            registerLink.style.display = "none";
            email.style.display = "none";
            username.style.display = "block";
        }
        else if (module === "FORECASTING") {
            registerLink.style.display = "none";
            email.style.display = "none";
            username.style.display = "block";
        }
        else if (module === "DATA CENTER") {
            registerLink.style.display = "none";
            email.style.display = "none";
            username.style.display = "block";
        }
    }
</script>
<script>
    function passValue(value) {
        var adminInfo = document.getElementById("adminInfo");
        adminInfo.style.display = "block";
        
        // Update the HTML block with the passed value
        var adminSelect = document.getElementById("module");
        adminSelect.value = value;
        var h = document.getElementById('head').innerHTML = '<span style="color:green;">' + value+ ' LOGIN</span>';

        /* var h = document.getElementById('head').innerHTML = '<span style="color:green;"> </span>'; */
        
       
        /* document.getElementById('g-recaptcha-error').innerHTML = '<span style="color:green;">Captcha Verified Successfully</span>'; */
        // Perform additional actions with the value as needed
        // You can pass it to other functions, use it in conditional statements, etc.
    }
</script>
					<script type="text/javascript" src="asset1/js/jquery.flexisel.js"></script>
<script src="asset1/js/bootstrap.js"></script>
 <script>
        function validateForm(event) {
            event.preventDefault();

            var username = document.getElementById("un").value;
           var email = document.getElementById("em").value; 
            var password = document.getElementById("pass").value;
            var module = document.getElementById("module").value;
           
            var errorDiv = document.getElementById("errorDiv");
            errorDiv.innerHTML = "";

            // Perform login validation based on the selected module
            // For demonstration purposes, let's assume the valid credentials for each module
            if (module === "ADMIN") {
                // Validation for Module 1
                var response = grecaptcha.getResponse();

                
                switch (true) {
                case username === "" :
                	displayError("Username is required.");
                    return;
                case password === "" :
                	displayError("Password is required.");
                    return;
                case username === "" && password === "" :
                	displayError("Username and Password is required.");
                    return;    
                case username === "admin" && password === "admin123" && response.length > 1:
                    document.getElementById('g-recaptcha-error').innerHTML = '<span style="color:green;">Captcha Verified Successfully</span>';
                    displayError("Login successful!");
                    setTimeout(function() {
                        window.location.replace("admin_home.jsp");
                    }, 3000);
                    break;
                  
                case username != "admin" || password != "admin123" :
                	displayError("Invalid username or password.");
                    break;
                  
                case response.length === 0:
                    document.getElementById('g-recaptcha-error').innerHTML = '<span style="color:red;">please verify you are not a robot.</span>';
                    break;
                
                case response.length > 1:
                    document.getElementById('g-recaptcha-error').innerHTML = '<span style="color:green;">Captcha Verified Successfully</span>';
                    break;
                default:
                   displayError("Invalid username or password.");
                   break;
              }
              
                
            } else if (module === "DATA PREPROCESSING") {
                // Validation for Module 2
                
                var response = grecaptcha.getResponse();
                switch (true) {
                case username === "" :
                	displayError("Username is required.");
                    return;
                case password === "" :
                	displayError("Password is required.");
                    return;
                case username === "" && password === "" :
                	displayError("Username and Password is required.");
                    return;
                
                case username === "data preprocessing" && password === "data preprocessing" && response.length > 1:
                    document.getElementById('g-recaptcha-error').innerHTML = '<span style="color:green;">Captcha Verified Successfully</span>';
                    displayError("Login successful!");
                    setTimeout(function() {
                        window.location.replace("dp_home.jsp");
                    }, 3000);
                    break;
                  
                case username != "data preprocessing" || password != "data preprocessing" :
                	displayError("Invalid username or password.");
                    break;
                  
                case response.length === 0:
                    document.getElementById('g-recaptcha-error').innerHTML = '<span style="color:red;">please verify you are not a robot.</span>';
                    break;
                
                case response.length > 1:
                    document.getElementById('g-recaptcha-error').innerHTML = '<span style="color:green;">Captcha Verified Successfully</span>';
                    break;
                default:
                   displayError("Invalid username or password.");
                   break;
              }
                
                
            }
      
            else if (module === "FORECASTING") {
                // Validation for Module 2
               
                var response = grecaptcha.getResponse();
                switch (true) {
                case username === "" :
                	displayError("Username is required.");
                    return;
                case password === "" :
                	displayError("Password is required.");
                    return;
                case username === "" && password === "" :
                	displayError("Username and Password is required.");
                    return;
                
                case username === "forecasting" && password === "forecasting" && response.length > 1:
                    document.getElementById('g-recaptcha-error').innerHTML = '<span style="color:green;">Captcha Verified Successfully</span>';
                    displayError("Login successful!");
                    setTimeout(function() {
                        window.location.replace("fc_home.jsp");
                    }, 3000);
                    break;
                  
                case username != "forecasting" || password != "forecasting" :
                	displayError("Invalid username or password.");
                    break;
                  
                case response.length === 0:
                    document.getElementById('g-recaptcha-error').innerHTML = '<span style="color:red;">please verify you are not a robot.</span>';
                    break;
                
                case response.length > 1:
                    document.getElementById('g-recaptcha-error').innerHTML = '<span style="color:green;">Captcha Verified Successfully</span>';
                    break;
                default:
                   displayError("Invalid username or password.");
                   break;
              }
            
            
            }
        
            else if (module === "DATA CENTER") {
                // Validation for Module 2
               
                var response = grecaptcha.getResponse();
                switch (true) {
                case username === "" :
                	displayError("Username is required.");
                    return;
                case password === "" :
                	displayError("Password is required.");
                    return;
                case username === "" && password === "" :
                	displayError("Username and Password is required.");
                    return;
                
                
                case username === "data center" && password === "data center" && response.length > 1:
                    document.getElementById('g-recaptcha-error').innerHTML = '<span style="color:green;">Captcha Verified Successfully</span>';
                    displayError("Login successful!");
                    setTimeout(function() {
                        window.location.replace("dc_home.jsp");
                    }, 3000);
                    break;
                  
                case username != "data center" || password != "data center" :
                	displayError("Invalid username or password.");
                    break;
                  
                case response.length === 0:
                    document.getElementById('g-recaptcha-error').innerHTML = '<span style="color:red;">please verify you are not a robot.</span>';
                    break;
                
                case response.length > 1:
                    document.getElementById('g-recaptcha-error').innerHTML = '<span style="color:green;">Captcha Verified Successfully</span>';
                    break;
                default:
                   displayError("Invalid username or password.");
                   break;
              }
            
            
            }
            
            else if (module === "USER") {
                // Validation for Module 2
                
                var response = grecaptcha.getResponse();
                switch (true) {
                case email === "" :
                	displayError("Email is required.");
                    return;
                case password === "" :
                	displayError("Password is required.");
                    return;
                case email === "" && password === "" :
                	displayError("email and Password is required.");
                    return;
                case email != null && password != null && response.length > 1:
                    document.getElementById('g-recaptcha-error').innerHTML = '<span style="color:green;">Captcha Verified Successfully</span>';
                    var url = "us_log.jsp"; // Replace with your servlet URL
                    url += "?e1=" + encodeURIComponent(email); // Append the first parameter
                    url += "&p1=" + encodeURIComponent(password); // Append the second parameter

                 // Redirect to the servlet URL with the parameters
                    window.location.href = url;
                    break;
                  
                case response.length === 0:
                    document.getElementById('g-recaptcha-error').innerHTML = '<span style="color:red;">please verify you are not a robot.</span>';
                    break;
                
                case response.length > 1:
                    document.getElementById('g-recaptcha-error').innerHTML = '<span style="color:green;">Captcha Verified Successfully</span>';
                    break;
                default:
                   displayError("Invalid username or password.");
                   break;
              }
            
            
            } 
          
        }

        function displayError(message) {
            var errorDiv = document.getElementById("errorDiv");
            errorDiv.innerHTML = "<p class='error'>" + message + "</p>";
        }
    </script>

</body>
</html>