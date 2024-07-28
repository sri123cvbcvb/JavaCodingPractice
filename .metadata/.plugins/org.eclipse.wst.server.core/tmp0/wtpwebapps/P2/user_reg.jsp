<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!--
	Author: W3layouts
	Author URL: http://w3layouts.com
	License: Creative Commons Attribution 3.0 Unported
	License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html lang="en">
<head>
	<!-- Meta tags -->
	<title>USER DETAILS UPDATE</title>
	<meta name="keywords" content="General Application Form Responsive widget, Flat Web Templates, Android Compatible web template, 
	Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	<!-- stylesheets -->
	<link rel="stylesheet" href="asset7/css/style.css" type="text/css" media="all">
	
	<!-- google fonts  -->
	<link href="//fonts.googleapis.com/css?family=Alegreya+Sans:100,100i,300,300i,400,400i,500,500i,700,700i,800,800i,900,900i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese" rel="stylesheet">
<script>
	function showMessage() {
	    var myvalue = new URLSearchParams(window.location.search).get('email');
	    console.log(myvalue);
	    document.getElementById("myInput").value = myvalue;
	}
	</script>
	
</head>
<style>
	button:hover{
	background-color: white;
	
	}
	img {
  animation: bounce 2s infinite;
}

@keyframes bounce {
  0% {
    transform: translateY(0);
  }
  50% {
    transform: translateY(-20px);
  }
  100% {
    transform: translateY(0);
  }
}
	
	</style>
<body onload="showMessage()">
	<div class="w3ls-banner">
	<div class="heading">
		<h1>ADD MORE DETAILS</h1>
	</div>
	<div class="back">
	<h3 style=" margin-left: 927px">Click To View Register Status</h3><br><br>
	<img style="width:50px;margin-left: 1000px" src="images/arr.png" href="#top" />
				<button  style=" margin-left: 1000px; padding: 7px 7px; border-radius: 5px; background-color:#007cc0; color:white; border-color:#007cc0; cursor: pointer;" onclick="view()">VIEW</button>	
			    </div>
		<div style=" margin-top: -107px;" class="container">
			<div class="heading">
				<h2>Please Enter Your Details</h2>
				<p>Fill the application form below and submit.</p>
			</div>
			<div class="agile-form">
				<form action="Us_register" method="post"  enctype="multipart/form-data" role="form">
					<ul class="field-list">
						<li class="name">
							<label class="form-label"> Name <span class="form-required"> * </span></label>
							<div class="form-input add">
								
									<input type="text" name="name" placeholder="Name" required>
								
								
							</div>
						</li>
						<li> 
							<label class="form-label"> E-Mail Address <span class="form-required"> * </span></label>
							<div class="form-input">
								<input type="email" id="myInput" name="email" placeholder="Mail@example.com" readonly="readonly" required>
							
							</div>
						</li>
						<li> 
							<label class="form-label"> Phone Number <span class="form-required"> * </span></label>
							<div class="form-input">
								<input type="text" name="pn" placeholder="Phone Number" required >
							</div>
						</li>
						<li>
							<label class="form-label"> Gender <span class="form-required"> * </span></label>
							<div class="form-input">
								<select class="form-dropdown" name="gender" required>
									<option value="">Gender</option>
									<option value="Male"> Male </option>
									<option value="Female"> Female </option>
									<option value="Transgender"> Transgender </option>
								</select>
							</div>
						</li>
						<li>
							<label class="form-label"> Citizen <span class="form-required"> * </span></label>
							<div class="form-input">
								<select class="form-dropdown" name="citizen" required>
									<option value="">Select Country</option>
									<option value="United states"> United states </option>
									<option value="Afghanisthan"> Afghanistan </option>
									<option value="China"> China </option>
									<option value="Indonesia"> Indonesia </option>
									<option value="India"> India </option>
									<option value="England"> England </option>
									<option value="Others"> Others </option>
								</select>
							</div>
						</li>
						
						<li> 
							<label class="form-label">
							   Address
							   <span class="form-required"> * </span>
							</label>
							<div class="form-input">
								<input type="text" name="ad" placeholder="address" required >
							</div>
						</li>
						
						<li> 
							<label class="form-label">
							   Aadhaar number
							   <span class="form-required"> * </span>
							</label>
							<div class="form-input">
								<input type="text" name="aa" placeholder="Aadhaar number" required >
							</div>
						</li>
						<li> 
							<label class="form-label">
							   Profile Picture
							   <span class="form-required"> * </span>
							</label>
							<div class="form-input">
								<input  type="file" id="fileselect" name="file1" multiple="multiple" />
								<div id="filedrag"></div>
							</div>
						</li>
						<li> 
							<label class="form-label">
							   License Proof
							   <span class="form-required"> * </span>
							</label>
							<div class="form-input">
								<input  type="file" id="fileselect" name="file2" multiple="multiple" />
								<div id="filedrag"></div>
							</div>
						</li>
					</ul>
					<div class="submit_btn">
						<input type="submit" value="Submit">
					</div>
				</form>
				<div class="back">
				<button  style="padding: 7px 7px; border-radius: 5px; background-color:#007cc0; color:white; border-color:#007cc0; cursor: pointer;" onclick="back()">BACK</button>	
			    </div>
			</div>
		</div>
		
	</div>
	<script>
	function back(){
		var email = document.getElementById("myInput").value;
		 console.log(email);
		window.location.replace("user_home.jsp?p="+email);
	}
	function view(){
		var email = document.getElementById("myInput").value;
		 console.log(email);
		window.location.replace("user_view_reg.jsp?email="+email);
	}
	</script>
</body>
</html>