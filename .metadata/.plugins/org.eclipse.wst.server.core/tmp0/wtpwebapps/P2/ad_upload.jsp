<!--
	Author: W3layouts
	Author URL: http://w3layouts.com
	License: Creative Commons Attribution 3.0 Unported
	License URL: http://creativecommons.org/licenses/by/3.0/
-->

<!DOCTYPE html>
<html>
<head>
<title>accident report</title>
<meta name="viewport" content="width=device-width, initial-scale=1" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Dragging register form Responsive, Login Form Web Template, Flat Pricing Tables, Flat Drop-Downs, Sign-Up Web Templates, Flat Web Templates, Login Sign-up Responsive Web Template, Smartphone Compatible Web Template, Free Web Designs for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>

<!-- custom css file -->
<link rel="stylesheet" href="assets10/css/style.css">
<!-- //custom css file -->

<!-- google fonts -->
<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300italic,300,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
<!-- //google fonts -->
<style>
.back{
margin-top: -250px; 
margin-left: 75 0px; 
padding: 7px 7px; 
border-radius: 5px; 
background-color:#007cc0; 
color:white; 
border-color:#007cc0; 
cursor: pointer;
}
.back:hover{
background-color:white;
color:black;
transition: 0.5s linear;
}


</style>		
</head>

<body style="background-image: url('images/g7.jpg');background-repeat:no-repeat;background-attachment: fixed;  
  background-size: cover;">
<h1>UPLOAD ACCIDENT DETAILS</h1>
<div class="agile-its">
	<h2></h2>
	<div class="w3layouts">
		<div class="photos-upload-view">
			<form id="upload" action="Ad_upload" method="POST" enctype="multipart/form-data">
				<input type="hidden" id="MAX_FILE_SIZE" name="MAX_FILE_SIZE" value="300000" />
					<div class="agileinfo">
					<!-- <input type="submit" class="choose" value="Browse File...">
					<h3>OR</h3> -->
						<input type="file" id="fileselect" name="fileselect[]" multiple="multiple" />
						<div id="filedrag">Drag And Drop Your Files Here</div>
							
					</div>
						
					<div class="wthree-text">  
						
						<div class="wthreesubmitaits">
							<input style="margin-left:120px;" type="submit" name="submit" value="Submit">
						</div>  
						<div class="clear"> </div>
					</div>
	             	
			</form>
				<button class="back" onclick="back()">BACK</button>		
		</div>
		<div class="clear"></div>
		
	</div>
</div>
<!-- <iframe src="https://www.google.com/maps/embed/v1/place?q=34.094345,77.712216&zoom=14&key=AIzaSyD3t4mfJNy9NxxVKT4J_T47soKBgCRUTO4" width="600" height="450" frameborder="0" allowfullscreen></iframe>
 -->

<!-- js files -->
<script src="assets10/js/filedrag.js"></script>
<script type="text/javascript" src="assets10/js/jquery.min.js"></script>
<!-- //js files -->
<script>
function back(){
	window.location.replace("admin_home.jsp");
	
	
}

</script>
</body>
</html>