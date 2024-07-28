<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="connection.DB"%>
<%@ page  import="java.sql.*,java.util.*,java.io.*"%>
<%@ page import="java.io.*,java.util.*,javax.mail.*"%>
<%@ page import="javax.mail.internet.*,javax.activation.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
response.setContentType("text/html");
PrintWriter out1=response.getWriter();
String email=request.getParameter("e1");
String password=request.getParameter("p1");

System.out.println(email+" "+password);
try {
	Connection con = DB.getConnection();
	    PreparedStatement ps = con.prepareStatement("Select * from uc where email=? and pass=?");
	ps.setString(1, email);
   	ps.setString(2, password);
   	ResultSet rs = ps.executeQuery();
   	if(rs.next())
   	{
   		String redirectURL = "user_home.jsp?p=" + email ;
		out.println("<script>");
        out.println("alert('User Login Successfull');");
        out.println("window.location.href = '" + redirectURL + "';"); 
        out.println("</script>");
   		
   		/* out.print("<html><body><script>alert('Data Collection Login Successfully');</script></body></html>");
		RequestDispatcher rs1 = request.getRequestDispatcher("dc_home.jsp");
		rs1.include(request, response); */
	}
	else
	{
		String redirectURL = "index.jsp";
		out.println("<script>");
        out.println("alert('User Login UnSuccessfull');");
        out.println("window.location.href = '" + redirectURL + "';"); 
        out.println("</script>");
		
		
		/* out.print("<html><body><script>alert('Analysing Team Login Unsuccessfull');</script></body></html>");
		RequestDispatcher rs1 = request.getRequestDispatcher("index.jsp");
		rs1.include(request, response); */
	}
   				
}catch(Exception e)
{
	System.out.println(e);
}

%>
</body>
</html>