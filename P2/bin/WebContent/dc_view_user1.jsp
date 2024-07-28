<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page isELIgnored="false"%>
<%@ page import = "java.io.*,java.util.*,java.sql.*,java.text.SimpleDateFormat"%>
<%@ page import = "connection.DB"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View user status</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<style type="text/css">
@import url(https://fonts.googleapis.com/css?family=Open+Sans:400,600);
*, *:before, *:after {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

body {
  background: #105469;
  font-family: 'Open Sans', sans-serif;
}
table {
  background: #012B39;
  border-radius: 0.25em;
  border-collapse: collapse;
  margin: 1em;
  margin-left: auto;  
  margin-right: auto;
  margin-top: 1em;
 
}
th {
  border-bottom: 1px solid #364043;
  color: #E2B842;
  font-size: 0.85em;
  font-weight: 600;
  padding: 0.5em 1em;
  text-align: left;
 
}
td {
  color: #fff;
  font-weight: 400;
   padding: 0.65em 1em; 
   text-align: center ;
   
}
.disabled td {
  color: #4F5F64;
}
tbody tr {
  transition: background 0.25s ease;
}
tbody tr:hover {
  background: #014055;
}
.scrollable-td {
 height: 210px;
    overflow: hidden;
    width: 210px;
 /* Define the desired height for the scrollable area */
  }
  .scrollable-td:hover {
 height: 210px;
    overflow: scroll;
    width: 210px;
 /* Define the desired height for the scrollable area */
  }
  /* Background-color of the odd rows */
.table tr:nth-child(odd) {
    background-color: #323C50;
}

/* Background-color of the even rows */
.table tr:nth-child(even) {
    background-color: #2C3446;
}

.table th {
    background-color: grey;
    color: white;
}

.table td:first-child { color: #FB667A; }

.table tr:hover {
   background-color: #464A52;
-webkit-box-shadow: 0 6px 6px -6px #0E1119;
     -moz-box-shadow: 0 6px 6px -6px #0E1119;
          box-shadow: 0 6px 6px -6px #0E1119;
}

.table td:hover {
  background-color: #FFF842;
  color: #403E10;
  font-weight: bold;
  
  box-shadow: #7F7C21 -1px 1px, #7F7C21 -2px 2px, #7F7C21 -3px 3px, #7F7C21 -4px 4px, #7F7C21 -5px 5px, #7F7C21 -6px 6px;
  transform: translate3d(6px, -6px, 0);
  
  transition-delay: 0s;
    transition-duration: 0.4s;
    transition-property: all;
  transition-timing-function: line;
}

@media (max-width: 800px) {
.table td:nth-child(4),
.table th:nth-child(4) { display: none; }
}
p {
            font-size: 17px;
            align-items: center;
        }
        .box a {
            display: inline-block;
            background-color: #fff;
            padding: 15px;
            border-radius: 3px;
        }
        .modal {
  display: none;
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background-color: rgba(0, 0, 0, 0.5);
  z-index: 9999;
}

.content {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  background: black;
  padding: 20px;
  border-radius: 5px;
}



        .modal:target {
            visibility: visible;
            opacity: 1;
        }
        .box-close {
            position: absolute;
            top: 0;
            right: 15px;
            color: #fe0606;
            text-decoration: none;
            font-size: 30px;
        }
           
</style>
</head>
<body  style="background-image: url('images/b.jpg'); width:100%; height:100%; object-fit: cover;background-repeat:no-repeat;background-attachment: fixed;background-size: cover;">
<h1 style="color: #E2B842;text-align: center;margin-top: 20px;padding-top : 50px;"> CLIENT REQUIREMENT DETAILS</h1>
<a href="#" onclick="back()" class="btn btn-primary" style="margin-left: 20px;">Go Back</a>
<a href="#" onclick="home()" class="btn btn-primary" style="margin-left: 20px;">Home</a>
<%
	              	/* String type = "client"; */
						 String profile = "profile";
						 String lp = "lp";
					    String id =null;
					    String email = request.getParameter("email");
						 %>

<%-- <select style="margin-left:0px;" class="btn btn-primary" id="dropdown" onchange="updateTable()">
					 <option value="null">SELECT</option>
					 <option value="OVERALL">OVERALL</option>
					 <option value="CRITICAL">CRITICAL</option>
                     <option value="HIGH">HIGH</option>
                     <option value="MEDIUM">MEDIUM</option>
                     <option value="LOW">LOW</option>
                </select> --%>
                <div id="popup-box" class="modal">
  <div class="content">
            <!-- <h1 style="color: green;">
                Hello GeeksForGeeks !
            </h1> -->
            <img id="myImage" width="250" style="margin-left:30px;" src="images/load.gif" alt="Default Image">
            <p id="mes" style="margin-left:50px;margin-top:-10px;;color:white;">Please Wait Requesting........</p>
                <p style="margin-left:90px;" id="message"></p><br>
              <!-- <a href="#">accept</a> -->
              <!-- <button id="accept" style="margin-left:150px;" onclick="call1()" class="button">ACCEPT</button>
              <button id="reject" style="margin-left:150px;" onclick="call4()" class="button">REJECT</button> -->
            <%-- <%
            String st =" Requested";
            String qry1 = "update dc set request_st='"+st+"' ";
            Connection con2=DB.getConnection();
    	    int ps1=con2.prepareStatement(qry1).executeUpdate();
            
            %> --%>
            <a href="" onclick="updateRequestStatus()"   class="box-close">×</a>
        </div>
</div>
               <%--  <% String module = request.getParameter("module"); %> --%>
                 <%-- <%if (module == "assist"){ %>  --%>
              <!--  <a href="#" id="openModal"  class="btn btn-primary" style="margin-left: 890px;">Find</a>  -->
              <%-- <%} %> --%> 
                    <%-- <%
                    String email = null;  
         String bud_ty = null;
         Connection conn=DB.getConnection();
         String qry = "select * from dc";
         PreparedStatement ps = conn.prepareStatement(qry);
         ResultSet rs = ps.executeQuery();

%> --%>
<br><br><div class="table-responsive" style="width: 1300px;margin-left: 0px; max-height: 600px;
    overflow-y: scroll;">
<table class="table">
  <thead>
    <tr>
      <th style="text-align:center;">NAME</th>
    <th style="text-align:center;">EMAIL</th>
    <th style="text-align:center;">YEAR OF REPORT</th>
     <th style="text-align:center;width:210px;">LOCATION</th>
    <th style="text-align:center;width:210px;">REPORT ABOUT</th> 
    <th style="text-align:center;width:210px;">REQUIREMENTS STATUS</th>
      </tr>
  </thead>
  <tbody>
  <%-- <%
	              	/* String type = "client"; */
						 String profile = "profile";
						 String lp = "lp";
					    String id =null;
					    String em = null;
						 %> --%>
   	 
		<%		
				try{
				 	
					 Connection con=DB.getConnection();  
		             Statement stmt = con.createStatement();  
		             ResultSet rs = stmt.executeQuery("select * from uc where email ='"+email+"' ");  
				  
				 		while(rs.next())
				  		{
				 			/* em = rs.getString("email"); */
				 			/*  id = rs.getString("id");  */
				 			
				  			%> 
					<%--  <%
					      String type = "";
					      
					      %>
					       <%
					       try{
							 	
								 Connection con1=DB.getConnection();  
					             Statement stmt1 = con1.createStatement();  
					             ResultSet rs1 = stmt1.executeQuery("select type from dc_bug_data where email ='"+em+"' limit 1 ");  
							  
							 		while(rs1.next())
							  		{
					                type = rs1.getString("type");
					                System.out.println(type);
							  		}
					       }catch(Exception e)
						    {
						    		System.out.println(e);
						    }
					       
					       %> --%>
    <tr>
      <td><%=rs.getString("uname")%></td>
      <td><%=rs.getString("email")%></td>
       <td><%=rs.getString("yor")%></td>
      <td><%=rs.getString("lo")%></td>
      <td ><%=rs.getString("ra")%></td>
       <td ><%=rs.getString("req_st")%></td>
    <!--   <td><a href="#" onclick="view()" style="margin-left: 20px;">CLICK</a></td> -->
      <%-- <td><div class="scrollable-td"><%=rs.getString("type")%></div></td> --%>
      <%-- <td><div class="scrollable-td"><%=rs.getString(7)%></div></td>
      <td><div class="scrollable-td"><%=rs.getString(8)%></div></td>
      <td><div class="scrollable-td"><%=rs.getString(9)%></div></td>
      <td><div class="scrollable-td"><%=rs.getString(10)%></div></td>
      <td><div class="scrollable-td"><%=rs.getString(11)%></div></td>
      <td><div class="scrollable-td"><%=rs.getString(12)%></div></td>
      <td><div class="scrollable-td"><%=rs.getString(13)%></div></td>
      <td><div class="scrollable-td"><%=rs.getString(14)%></div></td>
      <td><div class="scrollable-td"><%=rs.getString(15)%></div></td> --%>
    </tr>
    <%
					    }
					    		
					    	}catch(Exception e)
					    {
					    		System.out.println(e);
					    }
  
  %>
 <%-- <input type="hidden" value="<%=module %>" id="module"  name="module">
 <input type="hidden" value="<%=selectedTable %>" id="selectedTable"  name="selectedTable"> --%>
  </tbody>
</table>
</div>
<script>
/* var module = document.getElementById("module").value;

    function updateTable() {
        var dropdown = document.getElementById("dropdown");
        
        var selectedValue = dropdown.options[dropdown.selectedIndex].value;
         console.log(selectedValue);
        
        window.location.replace("prog_view_priority.jsp?table="+selectedValue+ "&&module=" + module);
    } */
    function back(){
    	<%-- var email = '<%=em%>'; --%>
    	window.location.replace("dc_view_user.jsp");
    	
    	
    }
     function home(){
    	<%-- var email = '<%=em%>'; --%>
    	window.location.replace("dc_home.jsp");
    	
    	
    } 
   /*  function head(){
    	var head = document.getElementById("head"); 
    	  var dropdown = document.getElementById("selectedTable").value; 
        console.log(head);
       if(dropdown === "null"){
       	head.innerHTML = 'SELECT THE BUG PRIORITY';
       }
       else if (dropdown === "OVERALL"){
       	head.innerHTML = 'OVERALL BUG DATA';
       }
       else if (dropdown === "CRITICAL"){
       	head.innerHTML = 'CRITICAL BUG DATA';
       }
       else if (dropdown === "HIGH"){
       	head.innerHTML = 'HIGH SEVERITY BUG DATA';
       }
       else if (dropdown === "MEDIUM"){
       	head.innerHTML = 'MEDIUM SEVERITY BUG DATA  ';
       }
       else if (dropdown === "LOW"){
       	head.innerHTML = 'LOW SEVERITY BUG DATA ';
       }
    } */
   /*  function findbut(){	
    	var openModal = document.getElementById("openModal");
    	 var dropdown = document.getElementById("selectedTable").value; 
    	if(module === "assist" && dropdown === "OVERALL"){
    		openModal.style.display = "block";
    		openModal.style.width = "60px";
    		openModal.style.marginleft = "800px";
    	}
    	else {
    		openModal.style.display = "none";
    	}
    } */
    /* 
        var popupLink  = document.querySelectorAll(".popup-link");

        popupLink .forEach(function(link) {
          link.addEventListener("click", function() {
       	   email = this.getAttribute("data-email");
           type = this.getAttribute("data-ln");
       	    console.log("Clicked Accept for email: " + email);
       	    console.log("Clicked Accept for type: " + type);
       	 window.location.replace("assist_predic1.jsp?email="+email+ "&&type=" + type);
            // Perform further actions with the email
          });
        }); */
    	
    
</script>
 <!-- <script>
//Get the modal and the open modal link
var email= null;
const modal = document.getElementById('popup-box');
const openModalLink = document.getElementById('openModal');
const image = document.getElementById('myImage');
const mes = document.getElementById('mes');
// Open the modal
openModalLink.addEventListener('click', function(event) {
  event.preventDefault(); // Prevent the default behavior of the link
  email = document.querySelector('a.openModal').getAttribute('data-email');
  console.log(email);
  modal.style.display = 'block';
  setTimeout(function() {
	    image.src = "images/green-tick.gif"; // Replace "new-image.jpg" with the path to your new image
	     image.style.marginleft = "100px";
	  /*  image.style.width = "160px"; */
	    image.style.display =  'center';
	    mes.innerText = "Requested Sucessfully!!!!";
        
  }, 5000);
	});
modal.addEventListener('click', function(event) {
	  if (event.target.classList.contains('modal') || event.target.classList.contains('box-close')) {
	    modal.style.display = 'none';
	  }
	});

</script> 
<script>
        function updateRequestStatus() {
           /*  var status = "sri@gm"; */ // You can dynamically set the value here
         
          
            fetch('UpdateRequestServlet?status=' + email)
                .then(response => {
                    // Handle the response if needed
                })
                .catch(error => {
                    // Handle any error that occurred during the request
                });
        }
    </script> -->
</body>
</html>