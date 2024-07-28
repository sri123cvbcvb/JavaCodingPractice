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
String type1 = request.getParameter("type");
String reason1 = request.getParameter("reason");
String st = "rejected";
System.out.println(type1+" "+reason1);
%>

<%-- *************CLIENT rejected PROCESS************ --%>

<%

String email=request.getParameter("email");
System.out.println(email);
HttpSession ses = request.getSession();
session.setAttribute("email1",email);
Random random = new Random();
String otp = String.format("%06d", random.nextInt(1000000));
System.out.println(otp);
try {
	String s = "update uc set st='"+st+"' where email='"+email+"'";
	int r1 = DB.getConnection().prepareStatement(s).executeUpdate();
	String s1 = "select * from uc where email='"+email+"'";
	Connection con=DB.getConnection(); 
//	int r1 = DB.getConnection().prepareStatement(s1).executeUpdate();
	Statement stmt = con.createStatement();
    
    ResultSet rs = stmt.executeQuery(s1);
     while (rs.next()){
    	// String id1 = rs.getString(1);
    	 String email1 = rs.getString(2);
    	// String otp1 = rs.getString(10);
     
%>
    <%--    <input type="hidden" name="id" value="<%=rs.getString(1)%>"> --%>
     
	<%
	
//String fname=(String)session.getAttribute("fname");
	//System.out.println("fname===="+fname);
//	String dirname=(String)session.getAttribute("test");
//	System.out.println("dirname===="+dirname);
//String st ="Accepted";
//String email1 = request.getParameter("email");
String fname = "report";
//HttpSession ses = request.getSession();
//String email = (String)ses.getAttribute("email");
System.out.println(email);
String message1="Your Profile Accepted Successfully";
String host="", user="", pass="";

host ="smtp.gmail.com"; //"smtp.gmail.com";

user ="sriramj.surya@gmail.com"; //"YourEmailId@gmail.com" // email id to send the emails

pass ="kynrenacmeomclte"; //Your gmail password

String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";

String to = email1; // out going email id


String from = email1; //Email id of the recipient
     
String subject="Registration process";
//String subject ="welcome";

String messageText =message1;


//session.setAttribute("emailid",emailid);
boolean sessionDebug = true;

Properties props = System.getProperties();
props.put("mail.host", host);
props.put("mail.transport.protocol.", "smtp");
props.put("mail.smtp.auth", "true");
props.put("mail.smtp.", "true");
props.put("mail.smtp.port", "465");
props.put("mail.smtp.socketFactory.fallback", "false");
props.put("mail.smtp.socketFactory.class", SSL_FACTORY);
Session mailSession = Session.getDefaultInstance(props, null);
mailSession.setDebug(sessionDebug);
Message msg = new MimeMessage(mailSession);
msg.setFrom(new InternetAddress(from));
InternetAddress[] address = {new InternetAddress(to)};
msg.setRecipients(Message.RecipientType.TO, address);
msg.setSubject(subject);
MimeBodyPart messageBodyPart = new MimeBodyPart();

Multipart multipart = new MimeMultipart();

MimeBodyPart attachmentPart = new MimeBodyPart();

MimeBodyPart textPart = new MimeBodyPart();



    

    
    textPart.setText("your registration was rejected");
    multipart.addBodyPart(textPart);
    



   



msg.setContent(multipart);
 // use setText if you want to send text
Transport transport = mailSession.getTransport("smtp");
transport.connect(host, user, pass);

	
transport.sendMessage(msg, msg.getAllRecipients());
transport.close();
     }    
%>

<script>
alert("CLIENT REGISTRATION REJECTED ");
window.location="ad_view_us.jsp";

</script>

<%}
catch (Exception err) {

out.println("message not successfully sended"); // assume itâs a fail
} 



//*************password	: kynrenacmeomclte



%>

<%-- *************DESIGNER ACCEPT PROCESS************ --%>
<%-- 
<%
if (type1.equalsIgnoreCase("designer")){
String id=request.getParameter("id1");
System.out.println(id);
HttpSession ses = request.getSession();
session.setAttribute("id",id);
Random random = new Random();
String otp = String.format("%06d", random.nextInt(1000000));
System.out.println(otp);
try {
	String s = "update designer_register set status='"+st+"' where id='"+id+"'";
	int r1 = DB.getConnection().prepareStatement(s).executeUpdate();
	String s1 = "select * from designer_register where id='"+id+"'";
	Connection con=DB.getConnection(); 
//	int r1 = DB.getConnection().prepareStatement(s1).executeUpdate();
	Statement stmt = con.createStatement();
    
    ResultSet rs = stmt.executeQuery(s1);
     while (rs.next()){
    	// String id1 = rs.getString(1);
    	 String email = rs.getString(3);
    	// String otp1 = rs.getString(10);
     
%>
       <input type="hidden" name="id" value="<%=rs.getString(1)%>">
     
	<%
	
//String fname=(String)session.getAttribute("fname");
	//System.out.println("fname===="+fname);
//	String dirname=(String)session.getAttribute("test");
//	System.out.println("dirname===="+dirname);
//String st ="Accepted";
//String email1 = request.getParameter("email");
String fname = "report";
//HttpSession ses = request.getSession();
//String email = (String)ses.getAttribute("email");
System.out.println(email);
String message1="Your Profile Accepted Successfully";
String host="", user="", pass="";

host ="smtp.gmail.com"; //"smtp.gmail.com";

user ="sriramj.surya@gmail.com"; //"YourEmailId@gmail.com" // email id to send the emails

pass ="kynrenacmeomclte"; //Your gmail password

String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";

String to = email; // out going email id


String from = email; //Email id of the recipient
     
String subject="Registration process";
//String subject ="welcome";

String messageText =message1;


//session.setAttribute("emailid",emailid);
boolean sessionDebug = true;

Properties props = System.getProperties();
props.put("mail.host", host);
props.put("mail.transport.protocol.", "smtp");
props.put("mail.smtp.auth", "true");
props.put("mail.smtp.", "true");
props.put("mail.smtp.port", "465");
props.put("mail.smtp.socketFactory.fallback", "false");
props.put("mail.smtp.socketFactory.class", SSL_FACTORY);
Session mailSession = Session.getDefaultInstance(props, null);
mailSession.setDebug(sessionDebug);
Message msg = new MimeMessage(mailSession);
msg.setFrom(new InternetAddress(from));
InternetAddress[] address = {new InternetAddress(to)};
msg.setRecipients(Message.RecipientType.TO, address);
msg.setSubject(subject);
MimeBodyPart messageBodyPart = new MimeBodyPart();

Multipart multipart = new MimeMultipart();

MimeBodyPart attachmentPart = new MimeBodyPart();

MimeBodyPart textPart = new MimeBodyPart();



    

    
    textPart.setText("your registration was rejected" +"\n"+"REASON:" + reason1);
    multipart.addBodyPart(textPart);
    



   



msg.setContent(multipart);
 // use setText if you want to send text
Transport transport = mailSession.getTransport("smtp");
transport.connect(host, user, pass);

	
transport.sendMessage(msg, msg.getAllRecipients());
transport.close();
     }    
%>

<script>
alert("DESIGNER REGISTRATION REJECTED SUCCESSFULLY ");
window.location="admin_view_de.jsp";

</script>

<%}
catch (Exception err) {

out.println("message not successfully sended"); // assume itâs a fail
} 



//*************password	: kynrenacmeomclte
}


%>
 --%>
<%-- *************ANALYSER ACCEPT PROCESS************ --%>
<%-- 
<%
if (type1.equalsIgnoreCase("analyser")){
String id=request.getParameter("id1");
System.out.println(id);
HttpSession ses = request.getSession();
session.setAttribute("id",id);
Random random = new Random();
String otp = String.format("%06d", random.nextInt(1000000));
System.out.println(otp);
try {
	String s = "update analyser_register set status='"+st+"' where id='"+id+"'";
	int r1 = DB.getConnection().prepareStatement(s).executeUpdate();
	String s1 = "select * from analyser_register where id='"+id+"'";
	Connection con=DB.getConnection(); 
//	int r1 = DB.getConnection().prepareStatement(s1).executeUpdate();
	Statement stmt = con.createStatement();
    
    ResultSet rs = stmt.executeQuery(s1);
     while (rs.next()){
    	// String id1 = rs.getString(1);
    	 String email = rs.getString(3);
    	// String otp1 = rs.getString(10);
     
%>
       <input type="hidden" name="id" value="<%=rs.getString(1)%>">
     
	<%
	
//String fname=(String)session.getAttribute("fname");
	//System.out.println("fname===="+fname);
//	String dirname=(String)session.getAttribute("test");
//	System.out.println("dirname===="+dirname);
//String st ="Accepted";
//String email1 = request.getParameter("email");
String fname = "report";
//HttpSession ses = request.getSession();
//String email = (String)ses.getAttribute("email");
System.out.println(email);
String message1="Your Profile Accepted Successfully";
String host="", user="", pass="";

host ="smtp.gmail.com"; //"smtp.gmail.com";

user ="sriramj.surya@gmail.com"; //"YourEmailId@gmail.com" // email id to send the emails

pass ="kynrenacmeomclte"; //Your gmail password

String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";

String to = email; // out going email id


String from = email; //Email id of the recipient
     
String subject="Registration process";
//String subject ="welcome";

String messageText =message1;


//session.setAttribute("emailid",emailid);
boolean sessionDebug = true;

Properties props = System.getProperties();
props.put("mail.host", host);
props.put("mail.transport.protocol.", "smtp");
props.put("mail.smtp.auth", "true");
props.put("mail.smtp.", "true");
props.put("mail.smtp.port", "465");
props.put("mail.smtp.socketFactory.fallback", "false");
props.put("mail.smtp.socketFactory.class", SSL_FACTORY);
Session mailSession = Session.getDefaultInstance(props, null);
mailSession.setDebug(sessionDebug);
Message msg = new MimeMessage(mailSession);
msg.setFrom(new InternetAddress(from));
InternetAddress[] address = {new InternetAddress(to)};
msg.setRecipients(Message.RecipientType.TO, address);
msg.setSubject(subject);
MimeBodyPart messageBodyPart = new MimeBodyPart();

Multipart multipart = new MimeMultipart();

MimeBodyPart attachmentPart = new MimeBodyPart();

MimeBodyPart textPart = new MimeBodyPart();



    

    
    textPart.setText("your registration was rejected" +"\n"+"REASON:" + reason1);
    multipart.addBodyPart(textPart);
    



   



msg.setContent(multipart);
 // use setText if you want to send text
Transport transport = mailSession.getTransport("smtp");
transport.connect(host, user, pass);

	
transport.sendMessage(msg, msg.getAllRecipients());
transport.close();
     }    
%>

<script>
alert("ANALYSER REGISTRATION REJECTED SUCCESSFULLY ");
window.location="admin_view_an.jsp";

</script>

<%}
catch (Exception err) {

out.println("message not successfully sended"); // assume itâs a fail
} 



//*************password	: kynrenacmeomclte
}


%> --%>

<%-- *************RESEARCHER ACCEPT PROCESS************ --%>
<%-- 
<%
if (type1.equalsIgnoreCase("researcher")){
String id=request.getParameter("id1");
System.out.println(id);
HttpSession ses = request.getSession();
session.setAttribute("id",id);
Random random = new Random();
String otp = String.format("%06d", random.nextInt(1000000));
System.out.println(otp);
try {
	String s = "update researcher_register set status='"+st+"' where id='"+id+"'";
	int r1 = DB.getConnection().prepareStatement(s).executeUpdate();
	String s1 = "select * from researcher_register where id='"+id+"'";
	Connection con=DB.getConnection(); 
//	int r1 = DB.getConnection().prepareStatement(s1).executeUpdate();
	Statement stmt = con.createStatement();
    
    ResultSet rs = stmt.executeQuery(s1);
     while (rs.next()){
    	// String id1 = rs.getString(1);
    	 String email = rs.getString(3);
    	// String otp1 = rs.getString(10);
     
%>
       <input type="hidden" name="id" value="<%=rs.getString(1)%>">
     
	<%
	
//String fname=(String)session.getAttribute("fname");
	//System.out.println("fname===="+fname);
//	String dirname=(String)session.getAttribute("test");
//	System.out.println("dirname===="+dirname);
//String st ="Accepted";
//String email1 = request.getParameter("email");
String fname = "report";
//HttpSession ses = request.getSession();
//String email = (String)ses.getAttribute("email");
System.out.println(email);
String message1="Your Profile Accepted Successfully";
String host="", user="", pass="";

host ="smtp.gmail.com"; //"smtp.gmail.com";

user ="sriramj.surya@gmail.com"; //"YourEmailId@gmail.com" // email id to send the emails

pass ="kynrenacmeomclte"; //Your gmail password

String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";

String to = email; // out going email id


String from = email; //Email id of the recipient
     
String subject="Registration process";
//String subject ="welcome";

String messageText =message1;


//session.setAttribute("emailid",emailid);
boolean sessionDebug = true;

Properties props = System.getProperties();
props.put("mail.host", host);
props.put("mail.transport.protocol.", "smtp");
props.put("mail.smtp.auth", "true");
props.put("mail.smtp.", "true");
props.put("mail.smtp.port", "465");
props.put("mail.smtp.socketFactory.fallback", "false");
props.put("mail.smtp.socketFactory.class", SSL_FACTORY);
Session mailSession = Session.getDefaultInstance(props, null);
mailSession.setDebug(sessionDebug);
Message msg = new MimeMessage(mailSession);
msg.setFrom(new InternetAddress(from));
InternetAddress[] address = {new InternetAddress(to)};
msg.setRecipients(Message.RecipientType.TO, address);
msg.setSubject(subject);
MimeBodyPart messageBodyPart = new MimeBodyPart();

Multipart multipart = new MimeMultipart();

MimeBodyPart attachmentPart = new MimeBodyPart();

MimeBodyPart textPart = new MimeBodyPart();
    
    textPart.setText("your registration was rejected" +"\n"+"REASON:" + reason1);
    multipart.addBodyPart(textPart);

msg.setContent(multipart);
 // use setText if you want to send text
Transport transport = mailSession.getTransport("smtp");
transport.connect(host, user, pass);

	
transport.sendMessage(msg, msg.getAllRecipients());
transport.close();
     }    
%>

<script>
alert("RESEARCHER REGISTRATION REJECTED SUCCESSFULLY ");
window.location="admin_view_re.jsp";

</script>

<%}
catch (Exception err) {

out.println("message not successfully sended"); // assume itâs a fail
} 



//*************password	: kynrenacmeomclte
}


%> --%>
</body>
</html>