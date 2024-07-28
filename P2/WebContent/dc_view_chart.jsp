<!--author: W3layouts
author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
<head>
<style>
input {
    margin-top: 1rem;
}

input::file-selector-button {
    font-weight: bold;
    color: dodgerblue;
    padding: 0.5em;
    border: thin solid grey;
    border-radius: 3px;
}
.form-label{
margin-top: 1rem;

}
</style>
<title>ocean registration</title>
<!-- metatags-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Sports Camp Registration Form a Flat Responsive Widget,Login form widgets, Sign up Web 	forms , Login signup Responsive web form,Flat Pricing table,Flat Drop downs,Registration Forms,News letter Forms,Elements" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Meta tag Keywords -->
<!-- css files -->
<link rel="stylesheet" href="assets11/css/jquery-ui.css"/>
<link href="assets11/css/style.css" rel="stylesheet" type="text/css" media="all"/><!--stylesheet-css-->
<link href="//fonts.googleapis.com/css?family=Josefin+Sans:100,100i,300,300i,400,400i,600,600i,700,700i" rel="stylesheet">
	<link href="//fonts.googleapis.com/css?family=PT+Sans:400,400i,700,700i" rel="stylesheet">

<!-- //css files -->

<script>
	function func(){
		document.getElementById("fid").value = Math.floor(Math.random() * 10000)+ 123;
		document.getElementById("fid1").value = Math.floor(Math.random() * 1000000)+ 1234;
		document.getElementById("fkeys").value = Math.random().toString(36).substring(2, 15) + Math.random().toString(36).substring(2, 15);}
	</script>
	<style>
	.back:hover{
background-color:white;
color:black;
transition: 0.5s linear;
}

.back{
margin-top: -190px; 
margin-bottom: 20px;
/* margin-left: 520px; */ 
padding: 7px 7px; 
border-radius: 5px; 
background:rgba(199, 65, 132, 0); 
color:white; 
border:1px solid #fff; 
cursor: pointer;
}
	
	</style>
</head>
<body onload="func()">
	<h1> ACCIDENT DETAILS</h1>
<div class="w3l-main">
	<div class="w3l-from">
		<form action="barchart.jsp" method="post" >	
			
		
			
			<div class="w3l-user">
				<label class="head">CHART<span class="w3l-star"> * </span></label>	
					<select class="form-control" name="gen" required="required">
						<option>-Select-</option>
						<option value="OverAll">OverAll</option>
						
						<!-- <option value="Artificial Neural Networks">Artificial Neural Networks</option>
						<option value="Decision Tree">Decision Tree</option> -->
					</select>
			</div>
				<div class="clear"></div>
					
			
						
					
			
			
			<br>
			<div class="btn">
					<input type="submit" name="submit" value="Submit"/>
				</div>
						
				<div class="clear"></div>
		<!--  		<form action="analyst_home.html">
<div class="btn">
					<input type="submit" name="submit" value="Submit"/>
				</div>
						
				<div class="clear"></div>
</form>
			-->
			
		</form>
		<button class="back" onclick="back()">Back</button>
	</div>
</div>
	
	<!-- Default-JavaScript --> <script type="text/javascript" src="assets11/js/jquery-2.1.4.min.js"></script>

<!-- Calendar -->
<script src="assets6/js/jquery-ui.js"></script>
	<script>
		$(function() {
		$( "#datepicker,#datepicker1" ).datepicker();
		});
		function back(){
			window.location.replace("dc_home.jsp");
		}
	</script>
<!-- //Calendar -->

</body>
</html>