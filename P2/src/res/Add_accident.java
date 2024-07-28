package res;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

//import connection.Cfileupload;
import connection.DB;

/**
 * Servlet implementation class Clientregform
 */
@WebServlet("/Add_accident")
@MultipartConfig(maxFileSize = 16177215)
public class Add_accident extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//private Cfileupload cfileupload;

 //   @Override
   // public void init() {
  //  	cfileupload = new Cfileupload();
 //   }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
	
		String time = request.getParameter("time");
		String day = request.getParameter("day");
        String age = request.getParameter("age");
        String weather = request.getParameter("weather");
		String edu = request.getParameter("edu");
		String exp = request.getParameter("exp");
		String vdr = request.getParameter("vdr");
		String lane = request.getParameter("lane");
		String l_c = request.getParameter("l_c");
		String gender = request.getParameter("gender");
		String collision = request.getParameter("collision");
		String cause = request.getParameter("cause");
		String loc = request.getParameter("loc");
		String severity = request.getParameter("severity");
		
		System.out.println(time+day+age+weather+edu+exp+vdr+lane+l_c+gender+collision+cause+loc+severity);
		
		try {
			Connection con = DB.getConnection();
/*			String u = "UPDATE dataset SET time=?, day=?, age=?, gender=?, edu=?, vdr=?, exp=?, lane=?, light_con=?, weather=?, collision=?, cause=?, location=?, severity=? ";
*/	  	    String u1 = "insert into dataset(time,day,age,gender,edu,vdr,exp,lane,light_con,weather,collision,cause,location,severity) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement statement = con.prepareStatement(u1);
	  	  statement.setString(1, time);
	      statement.setString(2, day);
	      statement.setString(3, age);
	      statement.setString(4, weather);
	      statement.setString(5, edu);
	      statement.setString(6, exp);
	      statement.setString(7, vdr);
	      statement.setString(8, lane);
	      statement.setString(9, l_c);
	      statement.setString(10, gender);
	      statement.setString(11, collision);
	      statement.setString(12, cause);
	      statement.setString(13, loc);
	      statement.setString(14, severity);
		  int status1 = statement.executeUpdate();
			
			if(status1>0)
				
			{
				
				String redirectURL = "dc_home.jsp";
				out.println("<script>");
		        out.println("alert('Accident Details Added Successfully');");
		        out.println("window.location.href = '" + redirectURL + "';"); 
		        out.println("</script>");
				
			}
			else
			{
				out.print("<html><body><script>alert('Unsuccessfull');</script></body></html>");
				RequestDispatcher rs1 = request.getRequestDispatcher("add_accident.jsp");
				rs1.include(request, response);
			}


	    	
	    }catch(Exception e)
	    {
	    	System.out.println(e);
	    }


		}

	}

