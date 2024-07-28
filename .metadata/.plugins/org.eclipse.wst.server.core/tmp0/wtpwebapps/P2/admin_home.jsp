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
<html lang="zxx">

<head>
    <title>ADMIN HOME</title>
    <!-- Meta tag Keywords -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="UTF-8" />
    <meta name="keywords" content="Repay Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
    <script>
        addEventListener("load", function() {
            setTimeout(hideURLbar, 0);
        }, false);

        function hideURLbar() {
            window.scrollTo(0, 1);
        }

    </script>
    <!-- //Meta tag Keywords -->
    <!-- Custom-Files -->
    <link rel="stylesheet" href="asset3/css/bootstrap.css">
    <!-- Bootstrap-Core-CSS -->
    <link rel="stylesheet" href="asset3/css/style.css" type="text/css" media="all" />
    <link rel="stylesheet" href="asset3/css/slider.css" type="text/css" media="all" />
    <!-- Style-CSS -->
    <!-- font-awesome-icons -->
    <link href="asset3/css/font-awesome.css" rel="stylesheet">
    <!-- //font-awesome-icons -->
    <!-- /Fonts -->
    <link href="//fonts.googleapis.com/css?family=Catamaran:100,200,300,400,500,600,700,800" rel="stylesheet">

    <!-- //Fonts -->
</head>
<style>


 

.drop-text:hover {
  background: red;
}

.drop-text .badge {
  position: absolute;
  top: -3px;
  right: -5px;
  padding: 5px 10px;
  border-radius: 50%;
  background-color: red;
  color: white;
}
/* .badge{
  display: none;
} */


</style>
<body onload="val();">
<%
String req=null;
int a = 0;
try{
 	
	 Connection con=DB.getConnection();  
    Statement stmt = con.createStatement();  
    ResultSet rs = stmt.executeQuery("select count(*) as count1 from uc where req_st = '"+"finished"+"' "); 
   
    
   
    
		while(rs.next() )
 		{
			req = rs.getString("count1");
			a = Integer.parseInt(req);
 		}
}catch(Exception e)
{
    		System.out.println(e);
    }
 			%>
 	<%if (a == 0){ %>		
 <script>
 
 function val(){
	
		 document.getElementById("hai").style.display = "none";
	 
 }
 </script>	
 <%} %>		
    <!-- mian-content -->
    <div class="main-w3-pvt-header-sec" id="home">

        <!-- header -->
        <header>
            <div class="container">
                <div class="header d-lg-flex justify-content-between align-items-center py-lg-3 px-lg-3">
                    <!-- logo -->
                    <div id="logo">
                        <h1><a href="index.html"><span class="fa fa-recycle mr-2"></span>ADMIN</a></h1>
                    </div>
                    <!-- //logo -->
                    <div class="w3pvt-bg">
                        <!-- nav -->
                        <div class="nav_w3pvt">
                            <nav>
                                <label for="drop" class="toggle">Menu</label>
                                <input type="checkbox" id="drop" />
                                <ul class="menu">
                                    <li class="active"><a href="index.jsp" class="btn read">Home</a></li>
                                    <li><a href="ad_view_us.jsp" class="btn read">USER DETAILS</a></li>
                                    <li><a href="ad_view_req.jsp" class="btn read">STATUS</a></li>
                                    <li>
                                        <!-- First Tier Drop Down -->
                                        
                                        <a href="#" style="height:43.19px; padding-top:-50px;" class="btn read">REPORT </a>
                                        <input type="checkbox" id="drop-2" />
                                        <ul>

                                            <li><a href="ad_upload.jsp" class="drop-text" >UPLOAD</a></li>

                                            <!-- <li><a href="#stats" class="drop-text" >PAY UPDATE</a></li> -->
                                            <li><a href="ad_send_rp.jsp" class="drop-text" >SEND REPORT<div id="hai" class="badge"><%=req %></div></a></li>
                                           
                                        </ul>
                                    </li>
                                    <li><a href="index.jsp" class="btn read">LOGOUT</a></li>
                                </ul>
                            </nav>
                        </div>
                        <!-- //nav -->
                       <!--  <div class="justify-content-center">
                            search
                            <div class="apply-w3-pvt ml-lg-3">
                                <a class="btn read" href="contact.html" role="button">Apply Now</a>
                            </div>
                            //search

                        </div> -->
                    </div>
                </div>
            </div>
        </header>
        <!-- //header -->


        <!-- banner -->
        <section class="banner_w3pvt">
            <div class="csslider infinity" id="slider1">
                <input type="radio" name="slides" checked="checked" id="slides_1" />
                <input type="radio" name="slides" id="slides_2" />
                <input type="radio" name="slides" id="slides_3" />

                <ul>
                   <!--  <li>
                        <div class="banner-top">
                            <div class="overlay">
                                <div class="container">
                                    <div class="banner-info">
                                        <div class="banner-w3ls-inner">
                                            <h4>Invest in your Future</h4>
                                            <h3>Personal Loans</h3>
                                            <p>Integer sit amet mattis quam, sit amet ultricies velit. Praesent ullamcorper dui turpis.</p>

                                            <div class="test-info text-left mt-lg-5 mt-4">
                                                <a href="single.html" class="btn mr-2">Read More</a>
                                                <a href="contact.html" class="btn">Contact Us</a>
                                            </div>
                                        </div>

                                    </div>
                                </div>
                            </div>
                        </div>
                    </li> -->
                   <!--  <li>
                        <div class="banner-top1">
                            <div class="overlay sec">
                                <div class="container">
                                    <div class="banner-info">
                                        <div class="banner-w3ls-inner">
                                            <h4>We Support Your Dream</h4>
                                            <h3>Home Loans</h3>
                                            <p>Integer sit amet mattis quam, sit amet ultricies velit. Praesent ullamcorper dui turpis.</p>
                                            <div class="test-info text-left mt-lg-5 mt-4">
                                                <a href="single.html" class="btn mr-2">Read More</a>
                                                <a href="contact.html" class="btn">Contact Us</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </li> -->
                    <li>
                        <div class="banner-top2">
                            <div class="overlay">
                                <div class="container">
                                    <div class="banner-info">
                                        <div class="banner-w3ls-inner">
                                            <h4>Efficient Website Management</h4>
                                            <h3>Admin</h3>
                                            <p>Admin Makes simplifies tasks related to content management, user administration, analytics, and more.</p>
                                            <!-- <div class="test-info text-left mt-lg-5 mt-4">
                                                <a href="single.html" class="btn mr-2">Read More</a>
                                                <a href="contact.html" class="btn">Contact Us</a>
                                            </div> -->
                                        </div>

                                    </div>
                                </div>
                            </div>
                        </div>
                    </li>

                </ul>
               <!--  <div class="arrows">
                    <label for="slides_1"></label>
                    <label for="slides_2"></label>
                    <label for="slides_3"></label>

                </div> -->
            </div>
        </section>
        <!-- //slider -->
    </div>

    <!-- //banner -->
    <!-- banner bottom -->
    <section class="banner-bottom py-5" id="process">
        <div class="container py-md-5">
            <div class="row bottom-grids text-center">
                <div class="col-md-4 bottom-grid">
                    <span class="fa clr1 fa-star-half-o"></span>
                    <p class="number">1</p>
                    <h4>Dashboard and Analytics</h4>
                    <p class="mt-4">Access an intuitive dashboard with real-time analytics and key performance indicators.</p>
                </div>
                <div class="col-md-4 mt-md-0 mt-5 bottom-grid">
                    <span class="fa clr2 fa fa-money"></span>
                    <p class="number">2</p>
                    <h4>User Administration</h4>
                    <p class="mt-4">Manage user accounts, including registration, login, and password recovery.</p>
                </div>
                <div class="col-md-4 mt-md-0 mt-5 bottom-grid">
                    <span class="fa clr3 fa-credit-card"></span>
                    <p class="number">3</p>
                    <h4>Site Configuration</h4>
                    <p class="mt-4">Implement robust security measures to protect user data and website integrity.</p>
                </div>
                <span class="border-line"></span>
            </div>
        </div>
    </section>
    <!-- //banner bottom -->
    <!-- /features -->
    
    <!-- //features -->

    <!-- products -->
    <section class="products py-5" id="stats">
        <div class="container py-lg-5 py-3">
            <h3 class="title-w3ls mb-sm-5 mb-4 text-center"> Previous Record</h3>
            <div class="row products_grids text-center mt-5">
                <div class="col-lg-3 col-6 grid4">
                    <div class="prodct1">
                        <a href="#">
                            <div class="icon-w3ls f1">
                                <span class="fa fa fa-users"></span>
                            </div>
                            <h4 class="mt-2"> Content Management</h4>
                            <h4 class="mt-2"> <strong>1170</strong></h4>
                        </a>
                    </div>
                </div>
                <div class="col-lg-3 col-6 grid5">
                    <div class="prodct1">
                        <a href="#">
                            <div class="icon-w3ls f2">
                                <span class="fa fa-handshake-o"></span>
                            </div>
                            <h4 class="mt-2">User Administration</h4>
                            <h4 class="mt-2"><strong> 1070</strong></h4>

                        </a>
                    </div>
                </div>
                <div class="col-lg-3 col-6 grid6 mt-md-0 mt-3">
                    <div class="prodct1">
                        <a href="#">
                            <div class="icon-w3ls f3">
                                <span class="fa fa-podcast"></span>
                            </div>
                            <h4 class="mt-2">Dashboard and Analytics</h4>
                            <h4 class="mt-2"> <strong>1270</strong></h4>
                        </a>
                    </div>
                </div>
                <div class="col-lg-3 col-6 grid7 mt-md-0 mt-3">
                    <div class="prodct1">
                        <a href="#">
                            <div class="icon-w3ls f4">
                                <span class="fa fa-credit-card"></span>
                            </div>
                            <h4 class="mt-2">Comment Moderation</h4>
                            <h4 class="mt-2"><strong> 1070</strong></h4>

                        </a>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- //products -->
    <!--/banner-bottom -->
    
    <!-- /full-grid -->

    <!--mid -->
    
    <!-- //mid-->

    <!-- /services -->
   
    <!-- //services -->


    <!-- /news-letter -->
   
    <!-- //news-letter -->
    <!-- /services -->
    <div class="welcome py-5" id="test">
        <div class="container py-xl-5 py-lg-3">
            <div class="row">
                <div class="col-lg-7 welcome-right text-center mt-lg-0 mt-5">
                    <div class="row">
                        <div class="col-sm-4 service-1-w3pvt serve-gd3">
                            <div class="serve-grid test-gd mt-4">
                                <img src="asset3/images/t1.jpg" alt="" class="img-fluid image1">
                                <p class="mt-2">Client1 </p>
                            </div>
                            <div class="serve-grid test-gd mt-4">
                                <img src="asset3/images/t2.jpg" alt="" class="img-fluid image1">
                                <p class="mt-2">Client2 </p>
                            </div>
                            <div class="serve-grid test-gd mt-4">
                                <img src="asset3/images/t3.jpg" alt="" class="img-fluid image1">
                                <p class="mt-2">Client3 </p>
                            </div>
                        </div>

                        <div class="col-sm-4 service-1-w3pvt serve-gd2">
                            <div class="serve-grid test-gd mt-4">
                                <img src="asset3/images/t2.jpg" alt="" class="img-fluid image1">
                                <p class="mt-2">Client4 </p>
                            </div>
                            <div class="serve-grid test-gd mt-4">
                                <img src="asset3/images/t1.jpg" alt="" class="img-fluid image1">
                                <p class="mt-2">Client5 </p>
                            </div>
                        </div>
                        <div class="col-sm-4 service-1-w3pvt serve-gd1">
                            <div class="serve-grid test-gd mt-4">
                                <img src="asset3/images/t4.jpg" alt="" class="img-fluid image1">
                                <p class="mt-2">Client6 </p>
                            </div>
                        </div>

                    </div>
                </div>
                <div class="col-lg-5 welcome-left pl-lg-5">
                    <h4>Words </h4>
                    <h3 class="title-w3ls mt-2 mb-3">From Customer
                        Testimonial</h3>

                    <p class="mt-4 test"><span class="fa fa-quote-left"></span> It provides real-time alerts about potential accident hotspots and risky road conditions, helping me make safer driving decisions.</p>
                </div>

            </div>
        </div>
    </div>
    <!-- //services -->
    <!-- footer -->
   
    <!-- //footer -->
    
</body>

</html>
