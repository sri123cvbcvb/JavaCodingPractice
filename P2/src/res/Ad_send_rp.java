package res;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import connection.DB;

/**
 * Servlet implementation class CL_uploaddata
 */
@WebServlet("/Ad_send_rp")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 1, // 1 MB
maxFileSize = 10737418240L,     // 10 GB
maxRequestSize = 10737418240L   // 100 gb
)
public class Ad_send_rp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String fn = request.getParameter("email");
		
    	String st ="Report sended";
    	System.out.println(fn);
    	
    	
    	    try {
    	    	Connection con=DB.getConnection();
    	   
    	    String qry1 = "update uc set req_st='"+st+"' where email = '"+fn+"' ";
    	    int ps1=con.prepareStatement(qry1).executeUpdate();
  
    		 if (ps1 > 0) {
    			 String redirectURL = "ad_send_rp.jsp" ;
 				 out.println("<script>");
 		        /* out.println("alert('Accident details upload Successfully');");*/
 		         out.println("window.location.href = '" + redirectURL + "';"); 
 		         out.println("</script>");
    	    	
    			}
    			else {
    				out.print("<html><body><script>alert('sorry')</script></body></html>");
    	   }
    	}catch(Exception e) {
    		 e.printStackTrace();
    	}
   }
    	
 
    			
    	}
    	