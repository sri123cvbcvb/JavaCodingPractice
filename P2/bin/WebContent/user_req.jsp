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
<title>USER REQUIREMENT UPDATE</title>
<meta name="keywords"
	content="General Application Form Responsive widget, Flat Web Templates, Android Compatible web template, 
	Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- stylesheets -->
<link rel="stylesheet" href="asset7/css/style.css" type="text/css"
	media="all">

<!-- google fonts  -->
<link
	href="//fonts.googleapis.com/css?family=Alegreya+Sans:100,100i,300,300i,400,400i,500,500i,700,700i,800,800i,900,900i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese"
	rel="stylesheet">
<script>
	function showMessage() {
	    var myvalue = new URLSearchParams(window.location.search).get('email');
	    console.log(myvalue);
	    document.getElementById("myInput").value = myvalue;
	}
	</script>

</head>
<style>
button:hover {
	background-color: white;
}

img {
	animation: bounce 2s infinite;
}

@
keyframes bounce { 0% {
	transform: translateY(0);
}
50%
{
transform
:
 
translateY
(-20px);

  
}
100%
{
transform
:
 
translateY
(0);

  
}
}
</style>
<body onload="showMessage()">
	<div class="w3ls-banner">
		<div class="heading">
			<h1>UPDATE REQUIREMENT</h1>
		</div>
		<div class="back">
			<h3 style="margin-left: 927px">Click To View Requirement Status</h3>
			<br>
			<br> <img style="width: 50px; margin-left: 1000px"
				src="images/arr.png" href="#top" />
			<button
				style="margin-left: 1000px; padding: 7px 7px; border-radius: 5px; background-color: #007cc0; color: white; border-color: #007cc0; cursor: pointer;"
				onclick="view()">VIEW</button>
		</div>
		<div style="margin-top: -107px;" class="container">
			<div class="heading">
				<h2>Please Enter Your Details</h2>
				<p>Fill the application form below and submit.</p>
			</div>
			<div class="agile-form">
				<form action="Us_req" method="post" enctype="multipart/form-data"
					role="form">
					<ul class="field-list">
						<!-- <li class="name">
							<label class="form-label"> Name <span class="form-required"> * </span></label>
							<div class="form-input add">
								
									<input type="text" name="name" placeholder="Name" required>
								
								
							</div>
						</li> -->
						<li><label class="form-label"> E-Mail Address <span
								class="form-required"> * </span></label>
							<div class="form-input">
								<input type="email" id="myInput" name="email"
									placeholder="Mail@example.com" readonly="readonly" required>

							</div></li>
						<!-- <li> 
							<label class="form-label"> Phone Number <span class="form-required"> * </span></label>
							<div class="form-input">
								<input type="text" name="pn" placeholder="Phone Number" required >
							</div>
						</li> -->
						<li><label class="form-label"> Year Of Report <span
								class="form-required"> * </span></label>
							<div class="form-input">
								<select class="form-dropdown" name="yor" required>
									<option value="">SELECT</option>
									<option value="2020">2020</option>
									<option value="2021">2021</option>
									<option value="2022">2022</option>
								</select>
							</div></li>
						<li><label class="form-label"> Location <span
								class="form-required"> * </span></label>
							<div class="form-input">
								<select class="form-dropdown" name="lo" required>
									<option value="">Select State</option>
									<option value="Ariyalur">Ariyalur</option>
									<option value="Chengalpattu">Chengalpattu</option>
									<option value="Chennai">Chennai</option>
									<option value="Coimbatore">Coimbatore</option>
									<option value="Cuddalore">Cuddalore</option>
									<option value="Dharmapuri">Dharmapuri</option>
									<option value="Dindigul">Dindigul</option>
									<option value="Erode">Erode</option>
									<option value="Kallakurichi">Kallakurichi</option>
									<option value="Kancheepuram">Kancheepuram</option>
									<option value="Karur">Karur</option>
									<option value="Krishnagiri">Krishnagiri</option>
									<option value="Madurai">Madurai</option>
									<option value="Mayiladuthurai">Mayiladuthurai</option>
									<option value="Nagapattinam">Nagapattinam</option>
									<option value="Namakkal">Namakkal</option>
									<option value="Perambalur">Perambalur</option>
									<option value="Pudukkottai">Pudukkottai</option>
									<option value="Ramanathapuram">Ramanathapuram</option>
									<option value="Ranipet">Ranipet</option>
									<option value="Salem">Salem</option>
									<option value="Sivaganga">Sivaganga</option>
									<option value="Tenkasi">Tenkasi</option>
									<option value="Thanjavur">Thanjavur</option>
									<option value="Theni">Theni</option>
									<option value="Thiruvallur">Thiruvallur</option>
									<option value="Thiruvarur">Thiruvarur</option>
									<option value="Thoothukudi">Thoothukudi</option>
									<option value="Tiruchirappalli">Tiruchirappalli</option>
									<option value="Tirunelveli">Tirunelveli</option>
									<option value="Tirupathur">Tirupathur</option>
									<option value="Tiruppur">Tiruppur</option>
									<option value="Tiruvannamalai">Tiruvannamalai</option>
									<option value="Vellore">Vellore</option>
									<option value="Virudhunagar">Virudhunagar</option>
								</select>
							</div></li>

						<li><label class="form-label"> Report About <span
								class="form-required"> * </span>
						</label>
							<div class="form-input">
								<textarea style="background-color: white;" name="ra" rows="5"
									cols="5"></textarea>
								<!-- <input type="text" name="ad" placeholder="address" required > -->
							</div></li>

						<!-- <li> 
							<label class="form-label">
							   Aadhaar number
							   <span class="form-required"> * </span>
							</label>
							<div class="form-input">
								<input type="text" name="aa" placeholder="Aadhaar number" required >
							</div>
						</li> -->
						<!-- <li> 
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
						</li> -->


					</ul>
					<div class="submit_btn">
						<input type="submit" value="Submit">
					</div>
				</form>
				<div class="back">
					<button
						style="padding: 7px 7px; border-radius: 5px; background-color: #007cc0; color: white; border-color: #007cc0; cursor: pointer;"
						onclick="back()">BACK</button>
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
		window.location.replace("user_view_req.jsp?email="+email);
	}
	</script>
</body>
</html>