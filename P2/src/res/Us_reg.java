package res;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connection.DB;

/**
 * Servlet implementation class Userreg
 */
@WebServlet("/Us_reg")
public class Us_reg extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String username = request.getParameter("uname");
		String email = request.getParameter("email");
		String password = request.getParameter("pass");
		String confirmPassword = request.getParameter("cpass");
     System.out.println(username+email+password+confirmPassword);
    try {
		Connection con = DB.getConnection();
  	    PreparedStatement ps = con.prepareStatement("insert into uc(uname,email,pass,cpass) values(?,?,?,?)");
          
  	    ps.setString(1, username);
  	    ps.setString(2, email);
  	    ps.setString(3, password);
  	    ps.setString(4, confirmPassword);
  	     System.out.println(username+email+password+confirmPassword);

		int status = ps.executeUpdate();
	     System.out.println(username+email+password+confirmPassword);

		if(status>0)
			
		{
			String redirectURL = "index.jsp";
				out.println("<script>");
		        out.println("alert('User Registeration Successfull');");
		        out.println("window.location.href = '" + redirectURL + "';"); 
		        out.println("</script>");
			
			/*out.print("<html><body><script>alert('Client Registeration Successfull');</script></body></html>");
			RequestDispatcher rs1 = request.getRequestDispatcher("index.html");
			rs1.include(request, response);*/
		}
		else
		{
			String redirectURL = "index.jsp";
			out.println("<script>");
	        out.println("alert('User Registration Unsuccessfull');");
	        out.println("window.location.href = '" + redirectURL + "';"); 
	        out.println("</script>");
	        
			/*out.print("<html><body><script>alert('Client Registration Unsuccessfull');</script></body></html>");
			RequestDispatcher rs1 = request.getRequestDispatcher("index.html");
			rs1.include(request, response);*/
		}


    	
    }catch(Exception e)
    {
    	System.out.println(e);
    }


	}

}
