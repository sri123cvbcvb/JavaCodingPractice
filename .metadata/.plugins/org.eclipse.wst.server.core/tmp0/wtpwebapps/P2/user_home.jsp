<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html lang="zxx">
<head>
<title>USER HOME</title>
<!-- Meta-Tags -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Smart Career Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //Meta-Tags -->
<link href="asset2/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" /><!--bootstrap-css-->
<link href="asset2/css/font-awesome.css" rel="stylesheet"> <!--font-awesome-css-->
<link rel="stylesheet" href="asset2/css/flexslider.css" type="text/css" media="screen" /><!--flexslider-css-->
<link href="asset2/css/circles.css" rel="stylesheet" type="text/css" media="all" /><!--skill-circles-->
<link href="asset2/css/style.css" rel="stylesheet" type="text/css" media="all" /><!--style-sheet-->
<link href='css/aos.css' rel='stylesheet prefetch' type="text/css" media="all" />
<!--fonts-->
<link href="//fonts.googleapis.com/css?family=Cabin:400,500,600,700" rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700" rel="stylesheet">
<!--//fonts-->

</head>
<body>
<%
String email = request.getParameter("p");

%>
<!--banner start here-->
<div class="banner" id="home">
<div class="agileinfo-dot">
   <div class="header">
		   <div class="header-main">
			<!--  <div class="header-top-agileits">
		   	 <div class="container">
				<div class="w3l-social" data-aos="fade-right">
					<ul>
						<li><a href="#"><i class="fa fa-facebook"></i></a></li>
						<li><a href="#"><i class="fa fa-twitter"></i></a></li>
						<li><a href="#"><i class="fa fa-google-plus"></i></a></li>
					</ul>
				</div>
				<ul class="agile_forms" data-aos="fade-left">
					<li><a class="active" href="#" data-toggle="modal" data-target="#myModal2"><i class="fa fa-sign-in" aria-hidden="true"></i> Login</a> </li>
					<li><a href="#" data-toggle="modal" data-target="#myModal3"><i class="fa fa-pencil-square-o" aria-hidden="true"></i> Register</a> </li>
				</ul>
				<div class="clearfix"> </div>
				</div>
			</div> -->
		   	 <div class="container">
			<nav class="navbar navbar-default">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
							<span class="sr-only">Toggle navigation</span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
						<h1><a  href="index.jsp">USER</a></h1>
					</div>
					<!-- navbar-header -->
					<div class="collapse navbar-collapse cl-effect-13" id="bs-example-navbar-collapse-1">

						<ul class="nav navbar-nav navbar-right">
							<li><a href="index.jsp" class="active">Home</a></li>
							<li><a href="#" class="" onclick="reg()">REGISTER</a></li>
							<li><a href="#" class="" onclick="req()">REQUIREMENTS</a></li>
							<li><a href="#" class="" onclick="predict()">PREDICTION</a></li>
							<li><a href="#" class="" onclick="down()">DOWNLOAD</a></li>
							<li><a href="index.jsp" class="">LOGOUT</a></li>
						</ul>

					</div>
<script>
 function reg(){
	 var email = '<%= email%>';
	 console.log(email);
	/* var email = document.getElementById("hai2").value; */
	window.location.replace("user_reg.jsp?email="+email);
 }
 function req(){
	 var email = '<%= email%>';
	 console.log(email);
	/* var email = document.getElementById("hai2").value; */
	window.location.replace("user_req.jsp?email="+email);
 }
 function predict(){
	 var email = '<%= email%>';
	 window.location.replace("user_prediction.jsp?email="+email);
 }
 function down(){
	 var email = '<%= email%>';
	 window.location.replace("user_rp_down.jsp?email="+email);
 }
</script>
					<div class="w3ls_search">
													<div class="cd-main-header">
														<ul class="cd-header-buttons">
															<li><a class="cd-search-trigger" href="#cd-search"> <span></span></a></li>
														</ul> <!-- cd-header-buttons -->
													</div>
													<div id="cd-search" class="cd-search">
														<form action="#" method="post">
															<input name="Search" type="search" placeholder="Click enter after typing">
														</form>
													</div>
												</div>
					

					<div class="clearfix"> </div>	
				</nav>
		   </div>
		   </div>
<div class="container">
		   <div class="banner-bottom">
		   	   <section class="slider">
				 <div class="flexslider">
					<ul class="slides">
					  <li>
					  	<div class="banner-bottom-text">
					  			<h3>Knowledge is power, and knowledge about road safety can save lives</h3>
						  
					 	</div>
					  </li>
					  <li>
					  	<div class="banner-bottom-text">
					  		<h3>The future of road safety is in data-driven prediction.</h3>
					 	</div>
					  </li>
					  <li>
					  	<div class="banner-bottom-text">
					  			<h3>Let's use technology to make our roads safer</h3>
						  
					 	</div>
					  </li>
					  <li>
					  	<div class="banner-bottom-text">
					  		<h3>No more lives lost to preventable accidents</h3>
					 	</div>
					  </li>			  
				    </ul>
				 </div>
				 <div class="clearfix"> </div>
		      </section>
			<div class="thim-click-to-bottom">
				<a href="#about" class="scroll">
					<i class="fa fa-chevron-down" aria-hidden="true"></i>
				</a>
			</div>
			
		   </div>
		</div>
	</div>
</div>
</div>
<!--banner end here-->
	<!-- Modal2 -->
		<div class="modal fade" id="myModal2" tabindex="-1" role="dialog">
														<div class="modal-dialog">
														<!-- Modal content-->
															<div class="modal-content">
																<div class="modal-header">
																	<button type="button" class="close" data-dismiss="modal">&times;</button>
																	
																	<div class="signin-form profile">
																	<h3 class="agileinfo_sign">Login</h3>	
																			<div class="login-form">
																				<form action="#" method="post">
																					<input type="email" name="email" placeholder="E-mail" required="">
																					<input type="password" name="password" placeholder="Password" required="">
																					<div class="tp">
																						<input type="submit" value="Login">
																					</div>
																				</form>
																			</div>
																			<div class="login-social-grids">
																				<ul>
																					<li><a href="#"><i class="fa fa-facebook"></i></a></li>
																					<li><a href="#"><i class="fa fa-twitter"></i></a></li>
																					<li><a href="#"><i class="fa fa-rss"></i></a></li>
																				</ul>
																			</div>
																			<p><a href="#" data-toggle="modal" data-target="#myModal3" > Don't have an account?</a></p>
																		</div>
																</div>
															</div>
														</div>
													</div>
													<!-- //Modal2 -->	
													<!-- Modal3 -->
													<div class="modal fade" id="myModal3" tabindex="-1" role="dialog">
														<div class="modal-dialog">
														<!-- Modal content-->
															<div class="modal-content">
																<div class="modal-header">
																	<button type="button" class="close" data-dismiss="modal">&times;</button>
																	
																	<div class="signin-form profile">
																	<h3 class="agileinfo_sign">Register</h3>	
																			<div class="login-form">
																				<form action="#" method="post">
																				   <input type="text" name="name" placeholder="Username" required="">
																					<input type="email" name="email" placeholder="Email" required="">
																					<input type="password" name="password" placeholder="Password" required="">
																					<input type="password" name="password" placeholder="Confirm Password" required="">
																					<input type="submit" value="Register">
																				</form>
																			</div>
																			<p><a href="#"> By clicking register, I agree to your terms</a></p>
																		</div>
																</div>
															</div>
														</div>
													</div>
													
		<!-- //Modal3 -->
<!--banner bottom-->
<div class="banner-btm-w3layouts" id="about">
	<div class="container">
	<div class="tittle-agileinfo">
		<span>01</span>
		<h2>Real-Time Accident Risk Assessment</h2>
		<p ></p>
	</div>
		<div class="about-main">
		<div class="col-md-4 about-grids" data-aos="zoom-in">
			<i class="fa fa-bookmark-o" aria-hidden="true"></i>
			<h3 class="subheading-agileits-w3layouts">Data-Driven Predictions</h3>
			<p class="para-agileits-w3layouts">Our prediction model is built on vast datasets and employs sophisticated algorithms to analyze historical accident patterns and various influencing factors</p>
		</div>
		<div class="col-md-4 about-grids" data-aos="zoom-in">
			<i class="fa fa-handshake-o" aria-hidden="true"></i>
			<h3 class="subheading-agileits-w3layouts">Accident Hotspot Mapping</h3>
			<p class="para-agileits-w3layouts">This map empowers communities and authorities to take targeted action to prevent accidents and enhance road safety.</p>
		</div>
		<div class="col-md-4 about-grids" data-aos="zoom-in">
			<i class="fa fa-money" aria-hidden="true"></i>
			<h3 class="subheading-agileits-w3layouts">Collaborative Data Sharing</h3>
			<p class="para-agileits-w3layouts">We believe that data-driven safety measures require collaboration among various stakeholders.</p>
		</div>
		<div class="clearfix"> </div>	
		</div>
	</div>
</div>

<!--//banner bottom-->

<!--services -->


<!-- //services -->
<!-- Team -->
<div class="team" id="team">
		<div class="container">
		<div class="tittle-agileinfo">
			<span>02</span>
			<h3>Our marvellous team</h3>
			<p ></p>
		</div>
		</div>
			<div class="agile_team_grids">
				<div class="col-md-3 agile_team_grid" data-aos="zoom-in">
					<div class="view view-sixth">
						<img src="asset2/images/t1.jpg" alt=" " class="img-responsive">
						<div class="mask">
							<h5>Agnese brent</h5>
							<p></p>
							<!-- <div class="w3l-social">
								<ul>
									<li><a href="#"><i class="fa fa-facebook"></i></a></li>
									<li><a href="#"><i class="fa fa-twitter"></i></a></li>
									<li><a href="#"><i class="fa fa-google-plus"></i></a></li>
								</ul>
							</div> -->
						</div>
					</div>
				</div>
				<div class="col-md-3 agile_team_grid" data-aos="zoom-in">
					<div class="view view-sixth">
						<img src="asset2/images/t2.jpg" alt=" " class="img-responsive">
						<div class="mask">
							<h5>Richard Walsh</h5>
							<p></p>
							<!-- <div class="w3l-social">
								<ul>
									<li><a href="#"><i class="fa fa-facebook"></i></a></li>
									<li><a href="#"><i class="fa fa-twitter"></i></a></li>
									<li><a href="#"><i class="fa fa-google-plus"></i></a></li>
								</ul>
							</div> -->
						</div>
					</div>
				</div>
				<div class="col-md-3 agile_team_grid" data-aos="zoom-in">
					<div class="view view-sixth">
						<img src="asset2/images/t3.jpg" alt=" " class="img-responsive">
						<div class="mask">
							<h5>Lisa ortiz</h5>
							<p></p>
							<!-- <div class="w3l-social">
								<ul>
									<li><a href="#"><i class="fa fa-facebook"></i></a></li>
									<li><a href="#"><i class="fa fa-twitter"></i></a></li>
									<li><a href="#"><i class="fa fa-google-plus"></i></a></li>
								</ul>
							</div> -->
						</div>
					</div>
				</div>
				<div class="col-md-3 agile_team_grid" data-aos="zoom-in">
					<div class="view view-sixth">
						<img src="asset2/images/t4.jpg" alt=" " class="img-responsive">
						<div class="mask">
							<h5>Scott flores</h5>
							<p></p>
							<!-- <div class="w3l-social">
								<ul>
									<li><a href="#"><i class="fa fa-facebook"></i></a></li>
									<li><a href="#"><i class="fa fa-twitter"></i></a></li>
									<li><a href="#"><i class="fa fa-google-plus"></i></a></li>
								</ul>
							</div> -->
						</div>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
	</div>
	<!-- //Team -->
<!-- Stats -->
							<!-- <div class="w3ls_agile_circle_progress agile_info_shadow" id="skills">
								<div class="cir_agile_info ">
									  <div class="skill-grids">
											<div class="skills-grid text-center" >
												<div class="circle" id="circles-1"></div>
												<p>A percentage of individual cases that we take yearly, on average.</p>
											</div>
											<div class="skills-grid text-center">
												<div class="circle" id="circles-2"></div>
												<p>A share of commercial/business cases that we process yearly</p>
											</div>
											<div class="skills-grid text-center">
												<div class="circle" id="circles-3"></div>
												
												<p>The number of returning customers, over the period of last 10 years</p>
											</div>
											<div class="skills-grid text-center">
												<div class="circle" id="circles-4"></div>
												<p>A percentage of individual cases that we take yearly, on average.</p>
											</div>
												
								
				
										 <div class="clearfix"></div>
										
								</div>
							</div>
						</div>
 -->
	<!-- //Stats -->

<!-- gallery -->
	
	<!-- //gallery --> 

<!-- testimonials -->
	<div class="testimonials">
		<div class="container">
		<div class="tittle-agileinfo">
			<span>03</span>
			<h3>Customers feedback</h3>
			<p ></p>
		</div>
			<div class="w3_testimonials_grids">
				<div id="slideshow" class="disabled">
					<button class="previous"><b>« Previous</b></button>
					<button class="next"><b>Next »</b></button>
					<div class="strip">
						<div class="slide sticky">
							<div class="col-md-6 agileinfo_team_grid" data-aos="zoom-in">
								<div class="agileinfo_team_grid1">
									<div class="test-top-wthree">
									<img src="asset2/images/t1.jpg" alt="" />
										<div class="test-right-wthree">
											<h6>Federica</h6>
											<p> </p>
										</div>
									<div class="clearfix"> </div>
									</div>
									<div class="test-bottom-w3-agile">
										<i class="fa fa-quote-left" aria-hidden="true"></i>
										<p class="para-agileits-w3layouts">Road accident prediction websites can help to save lives by providing drivers with information about the risk of accidents in their area.</p>
									</div>
								</div>
							</div>
							<div class="col-md-6 agileinfo_team_grid" data-aos="zoom-in">
								<div class="agileinfo_team_grid1">
									<div class="test-top-wthree">
									<img src="asset2/images/t2.jpg" alt="" />
										<div class="test-right-wthree">
											<h6>Liza Brent</h6>
											<p> </p>
										</div>
									<div class="clearfix"> </div>
									</div>
									<div class="test-bottom-w3-agile">
										<i class="fa fa-quote-left" aria-hidden="true"></i>
										<p class="para-agileits-w3layouts">Road accident prediction websites are a valuable tool for law enforcement agencies and city planners who can use the information to identify high-risk areas and implement safety measures.</p>
									</div>
								</div>
							</div>
						</div>
						<div class="slide">
							<div class="col-md-6 agileinfo_team_grid" data-aos="zoom-in">
								<div class="agileinfo_team_grid1">
									<div class="test-top-wthree">
									<img src="asset2/images/t3.jpg" alt="" />
										<div class="test-right-wthree">
											<h6>Leslie gross</h6>
											<p> </p>
										</div>
									<div class="clearfix"> </div>
									</div>
									<div class="test-bottom-w3-agile">
										<i class="fa fa-quote-left" aria-hidden="true"></i>
										<p class="para-agileits-w3layouts">Road accident prediction websites can help drivers to make informed decisions about when and where to travel, and how to drive safely.</p>
									</div>
								</div>
							</div>
							<div class="col-md-6 agileinfo_team_grid" data-aos="zoom-in">
								<div class="agileinfo_team_grid1">
									<div class="test-top-wthree">
									<img src="asset2/images/t4.jpg" alt="" />
										<div class="test-right-wthree">
											<h6>Kimberly Barker</h6>
											<p> </p>
										</div>
									<div class="clearfix"> </div>
									</div>
									<div class="test-bottom-w3-agile">
										<i class="fa fa-quote-left" aria-hidden="true"></i>
										<p class="para-agileits-w3layouts">Road accident prediction websites are a relatively new technology, but they have the potential to make a significant impact on road safety.</p>
									</div>
								</div>
							</div>
						</div>
						
					</div>
				</div>
				
			</div>
		</div>
	</div>
<!-- //testimonials -->
<!-- newsletter -->

<!-- //newsletter -->
<!-- map -->
	
<!-- //map -->

<!-- contact -->
	
	<!-- //contact -->

<!-- js -->
<script type="text/javascript" src="asset2/js/jquery-2.1.4.min.js"></script>
<!--search-bar-->
		<script src="asset2/js/main.js"></script>	
<!--//search-bar-->
<!-- FlexSlider -->
				  <script defer src="asset2/js/jquery.flexslider.js"></script>
				  <script type="text/javascript">
					$(function(){				 
					});
					$(window).load(function(){
					  $('.flexslider').flexslider({
						animation: "slide",
						start: function(slider){
						  $('body').removeClass('loading');
						}
					  });
					});
				  </script>
<!-- FlexSlider -->
<!-- clients-slider-script -->
				<script src="asset2/js/slideshow.min.js"></script>
				<script src="asset2/js/launcher.js"></script>
<!-- //clients-slider-script -->
<!-- /circle-->
	 <script type="text/javascript" src="asset2/js/circles.js"></script>
					         <script>
								var colors = [
										['#ffffff', '#fd9426'], ['#ffffff', '#fc3158'],['#ffffff', '#53d769'], ['#ffffff', '#147efb']
									];
								for (var i = 1; i <= 7; i++) {
									var child = document.getElementById('circles-' + i),
										percentage = 30 + (i * 10);
										
									Circles.create({
										id:         child.id,
										percentage: percentage,
										radius:     80,
										width:      10,
										number:   	percentage / 1,
										text:       '%',
										colors:     colors[i - 1]
									});
								}
						
				</script>
	<!-- //circle -->
	<!-- for-Map -->
		<script type="text/javascript">
			$(function() {
			
				var menu_ul = $('.faq > li > ul'),
					   menu_a  = $('.faq > li > a');
				
				menu_ul.hide();
			
				menu_a.click(function(e) {
					e.preventDefault();
					if(!$(this).hasClass('active')) {
						menu_a.removeClass('active');
						menu_ul.filter(':visible').slideUp('normal');
						$(this).addClass('active').next().stop(true,true).slideDown('normal');
					} else {
						$(this).removeClass('active');
						$(this).next().stop(true,true).slideUp('normal');
					}
				});
			
			});
		</script>
<!-- //for-Map -->
<script src="asset2/js/jzBox.js"></script>
<!-- start-smoth-scrolling -->
<script type="text/javascript" src="asset2/js/move-top.js"></script>
<script type="text/javascript" src="asset2/js/easing.js"></script>
<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event){		
			event.preventDefault();
			$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
		});
	});
</script>
<!-- start-smoth-scrolling -->
<!-- smooth scrolling -->
	<script type="text/javascript">
		$(document).ready(function() {
		/*
			var defaults = {
			containerID: 'toTop', // fading element id
			containerHoverID: 'toTopHover', // fading element hover id
			scrollSpeed: 1200,
			easingType: 'linear' 
			};
		*/								
		$().UItoTop({ easingType: 'easeOutQuart' });
		});
	</script>
<!-- Animation-effect -->
<script src='js/aos.js'></script>
<script src="asset2/js/aosindex.js"></script>
<!-- //Animation-effect -->
	<a href="#home" class="scroll" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
<!-- //smooth scrolling -->
<script src="asset2/js/bootstrap.js"></script>

</body>
</html>