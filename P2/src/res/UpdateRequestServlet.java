package res;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/UpdateRequestServlet")
public class UpdateRequestServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	Dp_process updateQueryExample = new Dp_process();
    	String st = request.getParameter("status");
        updateQueryExample.updateRequestStatus(st);

      
        response.sendRedirect("dp_dataprocessing.jsp");
    }
}

