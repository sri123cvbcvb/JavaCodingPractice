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
@WebServlet("/Us_register")
@MultipartConfig(maxFileSize = 16177215)
public class Us_register extends HttpServlet {
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
	
		String name = request.getParameter("name");
		String email = request.getParameter("email");
        String pn = request.getParameter("pn");
        String gen = request.getParameter("gender");
		String ci = request.getParameter("citizen");
		String ad = request.getParameter("ad");
		String aa = request.getParameter("aa");
		/*String rn = request.getParameter("rn");
		String ln = request.getParameter("ln");*/
		InputStream inputStream1 = null; 
		InputStream inputStream2 = null; 
		String st = "pending";
		System.out.println(name+email+pn+gen+ci+ad+aa);
		 /*InputStream inputStream1 = null; */

	        //String message = null;
	        Part filePart = request.getPart("file1");
	        if (filePart != null) {
	            System.out.println(filePart.getName());
	            System.out.println(filePart.getSize());
	          //  System.out.println(filePart.getContentType());

	            inputStream1 = filePart.getInputStream();
	            System.out.println(inputStream1);
	        }
	            

		        //String message = null;
		        Part filePart1 = request.getPart("file2");
		        if (filePart1 != null) {
		            System.out.println(filePart1.getName());
		            System.out.println(filePart1.getSize());
		          //  System.out.println(filePart.getContentType());

		            inputStream2 = filePart1.getInputStream();
		            System.out.println(inputStream2);
		        }
		try {
			Connection con = DB.getConnection();
			String u = "UPDATE uc SET uname=?, pn=?, gen=?, ci=?, ad=?, aa=?, f1=?, f2=?, st=? WHERE email='"+email+"' ";
	  	    PreparedStatement statement = con.prepareStatement(u);
	  	  statement.setString(1, name);
	     /* statement.setString(2, pe);*/
	      statement.setString(2, pn);
	      statement.setString(3, gen);
	      statement.setString(4, ci);
	      statement.setString(5, ad);
	      statement.setString(6, aa);
	      statement.setBinaryStream(7, inputStream1,(int)filePart.getSize());
	      statement.setBinaryStream(8, inputStream2,(int)filePart.getSize());
	      statement.setString(9, st);
			int status1 = statement.executeUpdate();
			
			if(status1>0)
				
			{
				
				String redirectURL = "user_home.jsp?p=" + email ;
				out.println("<script>");
		        out.println("alert('User Details Added Successfully');");
		        out.println("window.location.href = '" + redirectURL + "';"); 
		        out.println("</script>");
				
			}
			else
			{
				out.print("<html><body><script>alert('User Registration Unsuccessfull');</script></body></html>");
				RequestDispatcher rs1 = request.getRequestDispatcher("user_reg.jsp");
				rs1.include(request, response);
			}


	    	
	    }catch(Exception e)
	    {
	    	System.out.println(e);
	    }


		}

	}

