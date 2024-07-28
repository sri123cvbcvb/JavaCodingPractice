<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page isELIgnored="false"%>
<%@ page import = "java.io.*,java.util.*,java.sql.*,java.text.SimpleDateFormat"%>
<%@ page import = "connection.DB"%>

<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
<head>
<title>USER DETAILS</title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Music Profile Widget Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //for-mobile-apps -->
<link href="asset8/css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- js -->
<script src="asset8/js/jquery-1.11.1.min.js"></script>
<!-- //js -->
<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
</head>
<style>
h3{
color: white;
padding: 10px 10px;
}
.back:hover{
background-color:white;
color:black;
transition: 0.5s linear;
}

.back{
margin-top: -150px; 
margin-left: 730px; 
padding: 7px 7px; 
border-radius: 5px; 
background-color:#007cc0; 
color:white; 
border-color:#007cc0; 
cursor: pointer;
}
.home{
margin-top: -250px; 
margin-left: 75 0px; 
padding: 7px 7px; 
border-radius: 5px; 
background-color:#007cc0; 
color:white; 
border-color:#007cc0; 
cursor: pointer;
}
.home:hover{
background-color:white;
color:black;
transition: 0.5s linear;
}
</style>
<body>
<!-- main -->
<%
String email = request.getParameter("email");
String name = null;
/* String email = null; */
String pn = null;
String gen = null;
String ci = null;
String ad = null;
String aa = null;
String f1 = null;
%>
 <%
					       try{
							 	
								 Connection con1=DB.getConnection();  
					             Statement stmt1 = con1.createStatement();  
					             ResultSet rs1 = stmt1.executeQuery("select * from uc where email ='"+email+"' ");  
							  
							 		while(rs1.next())
							  		{
							 		name = rs1.getString("uname");	
							 		pn = rs1.getString("pn");
							 		gen = rs1.getString("gen");
							 		ci = rs1.getString("ci");
							 		ad = rs1.getString("ad");
							 		aa = rs1.getString("aa");
							 		/* name = rs1.getString("uname");
							 		name = rs1.getString("uname"); */
					                /* type = rs1.getString("type");
					                System.out.println(type); */
							  		}
					       }catch(Exception e)
						    {
						    		System.out.println(e);
						    }
					       
					       %>


<div class="audio-main w3ls">
	<h1>USER DETAILS</h1>
	<button class="back"  onclick="back()">BACK</button>	
	<button class="home" style="" onclick="home()">HOME</button>
	
	<div style=" margin-top: -100px;" class="audio-record-list">
	<div class="profile">
			 <div class="profile-top wthree">
				 <div class="pic-sec">
					 <div class="pic">
						<!--  <img src="asset8/images/t3.jpg" alt=""/> -->
						 <img data-enlargable src="viewimg1.jsp?email1=<%=email%>"" width="130" height="120" />
					 </div>
					 <div class="pic_info">
						 <h2><%=name %></h2>
						 <h3><a href="#"><%=email %></a></h3>
					 </div>
					 <div class="clear"></div>
				 </div>
				 <div class="media">
					 <h3>Phone Number : +91 <%=pn %></h3>
					  <h3>Gender : <%=gen %></h3>
					   <h3>Citizen : <%=ci %></h3>
					    <h3>Address : <%=ad %></h3>
					     <h3>Aadhaar : <%=aa %></h3>
					 <div class="clear"></div>
				 </div><br>
				 
			 </div>
		 </div>
					<!-- <div id="jquery_jplayer_1" class="jp-jplayer"></div>
						<div id="jp_container_1" class="jp-audio" role="application" aria-label="media player">
							<div class="jp-type-playlist">
								<div class="jp-gui jp-interface">
									<div class="jp-controls">	
										<button class="jp-play" role="button" tabindex="0">play</button>
									</div>
									<div class="jp-progress">
										<div class="jp-seek-bar">
											<div class="jp-play-bar"></div>
										</div>
									</div>
									<div class="jp-volume-controls">
										<button class="jp-mute" role="button" tabindex="0">mute</button>
										<button class="jp-volume-max" role="button" tabindex="0">max volume</button>
										<div class="jp-volume-bar">
											<div class="jp-volume-bar-value"></div>
										</div>
									</div>
									<div class="jp-time-holder">
										<div class="jp-current-time" role="timer" aria-label="time">&nbsp;</div>
										<div class="jp-duration" role="timer" aria-label="duration">&nbsp;</div>
									</div>
									
								</div>
								<div class="jp-playlist">
									<ul>
										<li>&nbsp;</li>
									</ul>
								</div>
								<div class="jp-no-solution">
									<span>Update Required</span>
									To play the media you will need to either update your browser to a recent version or update your <a href="http://get.adobe.com/flashplayer/" target="_blank">Flash plugin</a>.
								</div>
							</div>
						</div> -->
	</div>
	<div class="footer agile">
		<!-- <div class="copy-right">
			<p> &copy; 2016 Music Profile Widget. All Rights Reserved | Design by  <a href="http://w3layouts.com/"> W3layouts</a></p>
		</div> -->
	</div>
</div>
<!-- //main -->
<!-- script for play-list -->
<link href="asset8/css/jplayer.blue.monday.min.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="asset8/js/jquery.jplayer.min.js"></script>
<script type="text/javascript" src="asset8/js/jplayer.playlist.min.js"></script>
<script type="text/javascript">
//<![CDATA[
$(document).ready(function(){

	new jPlayerPlaylist({
		jPlayer: "#jquery_jplayer_1",
		cssSelectorAncestor: "#jp_container_1"
	}, [
		
		{
			title:"Hidden",
			mp3:"http://www.jplayer.org/audio/mp3/Miaow-02-Hidden.mp3",
			oga:"http://www.jplayer.org/audio/ogg/Miaow-02-Hidden.ogg"
		},
		{
			title:"Lismore",
			mp3:"http://www.jplayer.org/audio/mp3/Miaow-04-Lismore.mp3",
			oga:"http://www.jplayer.org/audio/ogg/Miaow-04-Lismore.ogg"
		},
		{
			title:"The Separation",
			mp3:"http://www.jplayer.org/audio/mp3/Miaow-05-The-separation.mp3",
			oga:"http://www.jplayer.org/audio/ogg/Miaow-05-The-separation.ogg"
		},
		{
			title:"Thin Ice",
			mp3:"http://www.jplayer.org/audio/mp3/Miaow-10-Thin-ice.mp3",
			oga:"http://www.jplayer.org/audio/ogg/Miaow-10-Thin-ice.ogg"
		}
	], {
		swfPath: "../../dist/jplayer",
		supplied: "oga, mp3",
		wmode: "window",
		useStateClassSkin: true,
		autoBlur: false,
		smoothPlayBar: true,
		keyEnabled: true
	});
});
//]]>
</script>
<script >
function back(){
	var email = '<%=email%>';
	window.location.replace("user_view_reg.jsp?email="+email);
	
	
}
function home(){
	var email = '<%=email%>';
	window.location.replace("user_home.jsp?p="+email);
	
	
}


</script>
<!-- //script for play-list -->

</body>
</html>