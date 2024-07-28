package res;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.FileOutputStream;
import java.io.*;
import java.util.*;
import java.sql.*; 
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

import connection.DB;
/**
 * Servlet implementation class Pdf
 */
@WebServlet("/Pdf_gen")
public class Pdf_gen extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String email = request.getParameter("email");
		String loc = request.getParameter("loc");
		/*String yor = request.getParameter("yor");*/
		String yor ="2021";
		/*String [] parts = email.split("email=");
		String email1 = parts[0].trim();
		String type = parts[1].trim();*/
		System.out.println("email:"+email);
		System.out.println("loc:"+loc);
		System.out.println("yor:"+yor);
		/*System.out.println("type:"+type);*/
		/*String type = request.getParameter("type");*/
		/*System.out.println("email:"+email);
		System.out.println("type1:"+type);*/
		/*HttpSession ses = request.getSession();
		ses.setAttribute("email1",email);*/
		PreparedStatement p = null;
        ResultSet rs = null;
        String sql = null;
		 int fatal = 0;
		 int non_fatal = 0;
		 int t_death = 0;
	     
			try {
		Connection con = DB.getConnection();
		if(yor.equalsIgnoreCase("2020")){
		 sql = "select fatal_2020,non_fatal_2020,t_death_2020 from dataset1 where District= '"+loc+"'";
		}
		else if(yor.equalsIgnoreCase("2021")){
			 sql = "select fatal_2021,non_fatal_2021,t_death_2021 from dataset1 where District= '"+loc+"'";
		}
		else if(yor.equalsIgnoreCase("2022")){
			 sql = "select fatal_2022,non_fatal_2022,t_death_2022 from dataset1 where District= '"+loc+"'";
		}
         p = con.prepareStatement(sql);
         rs = p.executeQuery();
         String file = "D:/workspace(23-24)/P2";
     	String FilePath = file+"//WebContent//Report//"+ email + ".pdf";
     	System.out.println(FilePath);
         Document my_pdf_report = new Document();
         PdfWriter.getInstance(my_pdf_report, new FileOutputStream(FilePath));
         my_pdf_report.open(); 
         float fntSize, lineSpacing;
         fntSize = 15.0f;
         lineSpacing = 40f;
         Paragraph p1 = new Paragraph(new Phrase(lineSpacing,"ACCIDENT DATA",FontFactory.getFont(FontFactory.COURIER, fntSize)));
         p1.setAlignment(Element.ALIGN_CENTER);
         p1.setAlignment(Element.ALIGN_CENTER);
         p1.setLeading(0,1);
         p1.setSpacingAfter(20);
         my_pdf_report.add(p1);
        
         while (rs.next()) {
         fatal = rs.getInt(1);
         non_fatal = rs.getInt(2);
         t_death = rs.getInt(3);
         
         }
         
         String fatal1 = String.valueOf(fatal);
         String nfatal = String.valueOf(non_fatal);
         String t_d = String.valueOf(t_death);
         
         PdfPTable my_report_table = new PdfPTable(2);
         my_report_table.setWidthPercentage(100);
         my_report_table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
         my_report_table.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);
         my_report_table.getDefaultCell().setFixedHeight(70);
         my_report_table.addCell("EMAIL");
         my_report_table.addCell(email);
         my_report_table.addCell("LOCATION");
         my_report_table.addCell(loc);
         my_report_table.addCell("YEAR OF REPORT");
         my_report_table.addCell(yor);
         my_report_table.addCell("FATAL");
         my_report_table.addCell(fatal1);
         my_report_table.addCell("NON_FATAL");
         my_report_table.addCell(nfatal);
         my_report_table.addCell("TOTAL DEATH");
         my_report_table.addCell(t_d);
        /* my_report_table.addCell("Extended Description");
         my_report_table.addCell("Related Weaknesses");
         my_report_table.addCell("Applicable Platforms");
         my_report_table.addCell("Modes Of Introduction");
         my_report_table.addCell("Common Consequences");
         my_report_table.addCell("Detection Methods");
         my_report_table.addCell("Potential Mitigations");
         my_report_table.addCell("Observed Examples");
         my_report_table.addCell("Related Attack Patterns");*/
        /* my_report_table.addCell("Notes");*/
        
           
        	             /*String dept_id1 = rs.getString("INDEX");
                         table_cell=new PdfPCell(new Phrase(dept_id1));
                         my_report_table.addCell(table_cell);
                         String dept_id = rs.getString("CWE-ID");
                         table_cell=new PdfPCell(new Phrase(dept_id));
                         my_report_table.addCell(table_cell);
                         String dept_name=rs.getString("Name");
                         table_cell=new PdfPCell(new Phrase(dept_name));
                         my_report_table.addCell(table_cell);
                         String manager_id=rs.getString("Weakness Abstraction");
                         table_cell=new PdfPCell(new Phrase(manager_id));
                         my_report_table.addCell(table_cell);
                         String location_id=rs.getString("Status");
                         table_cell=new PdfPCell(new Phrase(location_id));
                         my_report_table.addCell(table_cell);
                         String location_id1=rs.getString("Description");
                         table_cell=new PdfPCell(new Phrase(location_id1));
                         my_report_table.addCell(table_cell);
                         String location_id2=rs.getString("Extended Description");
                         table_cell=new PdfPCell(new Phrase(location_id2));
                         my_report_table.addCell(table_cell);
                         String location_id3=rs.getString("Related Weaknesses");
                         table_cell=new PdfPCell(new Phrase(location_id3));
                         my_report_table.addCell(table_cell);
                         String location_id4=rs.getString("Applicable Platforms");
                         table_cell=new PdfPCell(new Phrase(location_id4));
                         my_report_table.addCell(table_cell);
                         String location_id5=rs.getString("Modes Of Introduction");
                         table_cell=new PdfPCell(new Phrase(location_id5));
                         my_report_table.addCell(table_cell);
                         String location_id6=rs.getString("Common Consequences");
                         table_cell=new PdfPCell(new Phrase(location_id6));
                         my_report_table.addCell(table_cell);
                         String location_id7=rs.getString("Detection Methods");
                         table_cell=new PdfPCell(new Phrase(location_id7));
                         my_report_table.addCell(table_cell);
                         String location_id8=rs.getString("Potential Mitigations");
                         table_cell=new PdfPCell(new Phrase(location_id8));
                         my_report_table.addCell(table_cell);
                         String location_id9=rs.getString("Observed Examples");
                         table_cell=new PdfPCell(new Phrase(location_id9));
                         my_report_table.addCell(table_cell);
                         String location_id10=rs.getString("Related Attack Patterns");
                         table_cell=new PdfPCell(new Phrase(location_id10));
                         my_report_table.addCell(table_cell);*/
                       /*  String location_id11=rs.getString("Notes");
                         table_cell=new PdfPCell(new Phrase(location_id11));
                         my_report_table.addCell(table_cell);*/
                         /*String location_id6=rs.getString("Pressure");
                         table_cell=new PdfPCell(new Phrase(location_id6));
                         my_report_table.addCell(table_cell);*/
                         
         /* Attach report table to PDF */
         my_pdf_report.add(my_report_table);                       
         my_pdf_report.close();
         
         /* Close all DB related objects */
         rs.close();
        
           p.close();  
           String status = "finished";
           String sql1 = "update uc set req_st= '"+status+"' where email= '"+email+"'";
           PreparedStatement statement = con.prepareStatement(sql1);
           int status1 = statement.executeUpdate();
			RequestDispatcher rs1 = request.getRequestDispatcher("fc_prediction.jsp");
			rs1.include(request, response);
			} catch (Exception e) {
			    e.printStackTrace();
			}
	
	 	
	
 }
}