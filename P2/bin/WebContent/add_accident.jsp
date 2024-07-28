<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html lang="en">
<head>
<title>ADD ACCIDENT DATA</title>
	<!-- Meta tags -->
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="keywords" content="Talent Application Form Responsive Widget, Audio and Video players, Login Form Web Template, Flat Pricing Tables, Flat Drop-Downs, Sign-Up Web Templates, Flat Web Templates, Login Sign-up Responsive Web Template, Smartphone Compatible Web Template, Free Web Designs for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design" />
		<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
	<!-- Meta tags -->
	<!--stylesheets-->
<link href="asset9/css/style.css" rel='stylesheet' type='text/css' media="all">
<!--//style sheet end here-->
<!-- Calendar -->
<link rel="stylesheet" href="asset9/css/jquery-ui.css" />
<!-- //Calendar -->

<link href="//fonts.googleapis.com/css?family=Roboto:300,400,500,700" rel="stylesheet">
</head>
<body>
     <h1 class="header-w3ls">
ADD ACCIDENT DATA</h1>
<div class="appointment-w3">
    <form action="Add_accident" method="post">
<div class="personal">
<h2></h2>
  					<div class="form-left-w3l">
					<p>TIME</p>
						<input type="text" name="time" id="timeInput" placeholder="Enter time (hh:mm:ss)" required="">
					  <!--  <span id="timeValidationMessage"></span> -->
					</div>
				
    <script>
        const timePattern = /^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]$/;
        const timeInput = document.getElementById('timeInput');

        timeInput.addEventListener('input', validateTime);

        function validateTime() {
            if (timePattern.test(timeInput.value)) {
                // Split the time into hours, minutes, and seconds
                const [hours, minutes, seconds] = timeInput.value.split(':');
                const hoursInt = parseInt(hours);
                const minutesInt = parseInt(minutes);
                const secondsInt = parseInt(seconds);

                // Check if hours, minutes, and seconds are within valid range
                if (hoursInt >= 0 && hoursInt <= 24 && minutesInt >= 0 && minutesInt <= 59 && secondsInt >= 0 && secondsInt <= 59) {
                    timeInput.setCustomValidity(''); // Valid input, clear the custom validation message
                    timeInput.style.color="green";
                } else {
                    timeInput.setCustomValidity('Invalid time format. Please enter a valid time (hh:mm:ss).');
                    timeInput.style.color="red";
                }
            } else {
                timeInput.setCustomValidity('Invalid time format. Please enter time in the format hh:mm:ss.');
                timeInput.style.color="red";           
            }
        }
    </script>
					   <div class="form-right-w3ls ">
					<p>DAY</p>
						<input  id="dateInput" name="day" type="text" placeholder="mm/dd/yyyy" required="">
						 <div class="clear"></div>
					</div>
					<script>
        const datePattern = /^(0[1-9]|[1-2][0-9]|3[0-1])\/(0[1-9]|1[0-2])\/\d{2}$/;
        const dateInput = document.getElementById('dateInput');

        dateInput.addEventListener('input', validateDate);

        function validateDate() {
            if (datePattern.test(dateInput.value)) {
                // Split the date into day, month, and year
                const [day, month, year] = dateInput.value.split('/');
                const dayInt = parseInt(day);
                const monthInt = parseInt(month);
                const yearInt = parseInt(year);

                // Check if day, month, and year are within valid range
                if (dayInt >= 1 && dayInt <= 31 && monthInt >= 1 && monthInt <= 12 && yearInt >= 0 && yearInt <= 99) {
                    dateInput.setCustomValidity(''); // Valid input, clear the custom validation message
                    dateInput.style.color="green";
                } else {
                    dateInput.setCustomValidity('Invalid date format. Please enter a valid date (dd/mm/yy).');
                    dateInput.style.color="red";
                }
            } else {
                dateInput.setCustomValidity('Invalid date format. Please enter date in the format dd/mm/yy.');
            }
        }
    </script>
		   <div class="form-left-w3l">
			<p>AGE</p>
				   <input type="text"  name="age" placeholder="age" required="">
			</div>
          	<div class="form-right-w3ls">
													<p>WEATHER</p>
					<select name="weather" class="form-control buttom">
												<option value="">
												Please select</option>
													<option value="Normal">Normal</option>
													<option value="Raining">Raining</option>
													<option value="Raining and Windy">Raining and Windy</option>
													<option value="Cloudy">Cloudy</option>
													<option value="Windy">Windy</option>
													<option value="Snow">Snow</option>
													<option value="Fog or mist">Fog or mist</option>
													<option value="Unknown">Unknown</option>
													<option value="Other">Other</option>
												</select>

		   </div>
		    <div class="clear"></div>
</div>
<div class="information">
 <h3> </h3>
				 <div class="form-add-w3ls">	
			<p>EDUCATION</p>
				<input type="text" name="edu" placeholder="education" required="">
		   </div>
		   		  <div class="form-left-w3l">	
			<p>EXPERIENCE</p>
				<input type="text" name="exp" placeholder="experience" required="">
		   </div>
		    
           <div class="form-right-w3ls">
													<p>VEHICLE DRIVER RELETIONSHIP</p>
					<select name="vdr" class="form-control buttom">
												<option value="">
												Please select</option>
													<option value="Employee">Employee</option>
													<option value="Owner">Owner</option>
													<option value="Unknown">Unknown</option>
													<option value="Other">Other</option>
													
												</select>

		   </div>
		   <div class="clear"></div>
		               <div class="form-left-w3l">	
			<p>LANE</p>
				<input type="text" name="lane" placeholder="Lane" required="">
		   </div>
		   		              						<div class="form-right-w3ls">
													<p>LIGHT CONDITION</p>
					<select name="l_c" class="form-control buttom">
												<option value="">
												Please select</option>
													<option value="Daylight">Daylight</option>
													<option value="Darkness - lights lit">Darkness - lights lit</option>
													<option value="Darkness - no lighting">Darkness - no lighting</option>
													<option value="Darkness - lights unlit">Darkness - lights unlit</option>
													
												</select>

		   </div>
		    <div class="clear"></div>
			</div>
<div class="education">	
<h3></h3>		
						<div class="form-left-w3l">
						<p>Gender</p>
					<select name="gender" class="form-control">
					<option value="">Select Gender</option>
						<option value="male">Male</option>
						<option value="female">Female</option>
						<option value="transgender">Others</option>
					</select>
			</div>
				<div class="form-right-w3ls">
				<p>COLLISION</p>
				<input type="text" name="collision" placeholder="collision" required="">
     <!-- <input  id="datepicker1" name="text" type="text" placeholder="mm/dd/yyyy" required=""> -->
	 </div>
				  <div class="clearfix"></div>			
				<div class="form-left-w3l ">
					<p>CAUSE</p>
						<input type="text" name="cause" placeholder="Cause" required="">
				</div>					
				 <div class="form-right-w3ls">
				 <p>LOCATION</p>
			<input type="text" name="loc" placeholder="Location" required="">

					</div>

				  <div class="clear"></div>
<div class="form-left-w3l ">
					<p>SEVERITY</p>
						<select name="severity" class="form-control">
					<option value="">Select Severity</option>
						<option value="1">Non-Fatal</option>
						<option value="2">Fatal</option>
						
					</select>
				</div>
 </div>
 <input type="submit" value="Submit">
</form>
   </div>
   
   <!--  <div class="copy">
    <p>&copy;2017 Talent Application Form. All Rights Reserved | Design by <a href="http://www.W3Layouts.com" target="_blank">W3Layouts</a></p>
</div> -->
		<!-- js -->
  <script type='text/javascript' src='js/jquery-2.2.3.min.js'></script>
<!-- //js -->
<!-- Calendar -->
				<link rel="stylesheet" href="asset9/css/jquery-ui.css" />
				<script src="asset9/js/jquery-ui.js"></script>
				  <script>
						  $(function() {
							$( "#datepicker,#datepicker1,#datepicker2,#datepicker3" ).datepicker();
						  });
				  </script>
			<!-- //Calendar -->
</body>
</html>