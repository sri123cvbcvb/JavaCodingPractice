<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.*"%>

<%@ page import = "java.sql.Connection" %>
<%@ page import = "java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.Blob" %>
<%@ page import="java.util.Random" %>
<%@ page import="java.sql.Connection" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String email = request.getParameter("email");
/* String a = ""+session.getAttribute("a")+""; */
PrintWriter ou = response.getWriter();  
response.setContentType("text/html");  
/* String csv="D:/javaproject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Boilers";  */
String file = "D:/workspace(23-24)/P2";
String FilePath = file+"//WebContent//Report//"+email+".pdf ";
/* String csv =(String)session.getAttribute("fullpath"); */
response.setContentType("application/pdf");  
response.setHeader("Content-Disposition","attachment; filename=\""+ email +".pdf"+"\"");  
FileInputStream fileInputStream = new FileInputStream(FilePath);  
int i;  
while ((i=fileInputStream.read()) != -1) {  
ou.write(i);  
}  
fileInputStream.close();  
ou.close();    
%>
</body>
