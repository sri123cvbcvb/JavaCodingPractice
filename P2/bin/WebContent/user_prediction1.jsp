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
<link href='css/aos.css' rel='stylesheet prefetch' type="text/css" media="all" /><!--Animation-effects-css-->
<!--fonts-->
<link href="//fonts.googleapis.com/css?family=Cabin:400,500,600,700" rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700" rel="stylesheet">
<!--//fonts-->
<style>
.agileits_w3layouts newsletter {
height: 1500px;
} h3{
height:50px;
} 
.back:hover{
background-color:white;
color:black;
transition: 0.5s linear;
}

.back{
margin-top: -190px; 
margin-bottom: 20px;
margin-left: 520px; 
padding: 7px 7px; 
border-radius: 5px; 
background-color:#007cc0; 
color:white; 
border-color:#007cc0; 
cursor: pointer;
}
</style>
</head>
<body  class="agileits_w3layouts newsletter">
<%
String weatherCondition = (String) request.getAttribute("weatherCondition");
String temperature = ""+request.getAttribute("temperature");
String humidity = ""+request.getAttribute("humidity");
String visibility = ""+request.getAttribute("visibility");
String numAccidents = ""+request.getAttribute("numAccidents");
String riskPrediction =""+request.getAttribute("riskPrediction");

String l1 = ""+request.getAttribute("l1");
String l2 =""+request.getAttribute("l2");
String email = request.getParameter("email");
%>
        <!-- <h3 style="margin-top:0px;">Accident Severity Table</h3> -->
		<div  class="col-md-6 news-right" data-aos="fade-up">
		<h3 style="background-color:black;padding: 10px 20px;text-transform: uppercase;">Accident Severity</h3>
		<div class="h3">
		<h3>WeatherCondition: <span style="color:blue;"><%=weatherCondition %></span></h3>
		<h3>Temperature: <span style="color:blue;"><%=temperature %></span></h3>
		<h3>Humidity: <span style="color:blue;"><%=humidity %></span></h3>
		<h3>Visibility: <span style="color:blue;"><%=visibility %></span></h3>
		<h3>NumAccidents: <span style="color:blue;"><%=numAccidents %></span></h3>
		<%if (riskPrediction.equalsIgnoreCase("low risk")) {%>
		<h3>RiskPrediction: <span style="color:Green;"><%=riskPrediction %></span></h3>
		<%} %>
		<%if (riskPrediction.equalsIgnoreCase("medium risk")) {%>
		<h3>RiskPrediction: <span style="color:yellow;"><%=riskPrediction %></span></h3>
		<%} %>
		<%if (riskPrediction.equalsIgnoreCase("high risk")) {%>
		<h3>RiskPrediction: <span style="color:red;"><%=riskPrediction %></span></h3>
		<%} %>
		<button class="back"  onclick="home()">Back</button>
		</div>
			<!-- <form action="#" method="post">
				<input class="email" type="email" name="Email" placeholder="Email" required="">
				<input type="submit" value="Submit">
			</form> -->
		</div>
		 <div class="clearfix"> </div> 
	
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><!-- //newsletter -->
<!-- map -->
	<div class="map">
		<ul class="faq">
			<li class="item1"><a href="#">Location<span class="glyphicon glyphicon-menu-down"></span></a>
				<ul>
					<li class="subitem1">
					<%
					String apiKey = "AIzaSyD3t4mfJNy9NxxVKT4J_T47soKBgCRUTO4";
				    String mapUrl = "https://www.google.com/maps/embed/v1/place?q=" + l1 + "," + l2 + "&zoom=25&key=" + apiKey; 
					%>
						<iframe src="<%= mapUrl %>" width="600" height="450" frameborder="0" allowfullscreen></iframe>
					</li>										
				</ul>
			</li>
		</ul>
	</div>
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
<script>
var email = '<%=email%>';
function home(){
	<%-- var email = '<%=email%>'; --%>
	window.location.replace("user_home.jsp?p="+email);
	
	
}
</script>
</body>
</html>