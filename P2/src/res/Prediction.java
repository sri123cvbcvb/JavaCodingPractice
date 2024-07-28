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

import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import connection.DB;
@WebServlet("/Prediction")
public class Prediction extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String location = request.getParameter("location");
       /* String loc = "100 Feet Road, Anna Nagar, Chennai";*/
        if(location.equalsIgnoreCase("600040")){
        	System.out.println("hai");
        double l1 = 13.087326085275633;
        double l2 = 80.19858543012332;
        
        String loc= "100 Feet Road, AnnaNagar,Chennai";
        String accident_count = null;
        
// getting system data:
     // Get the current system time
        LocalDateTime currentTime = LocalDateTime.now();

        // Subtract 30 minutes from the current time to get time1
       /* LocalDateTime time1 = currentTime.minusMinutes(30);*/

        // Add 30 minutes to the current time to get time2
        LocalDateTime time1 = currentTime.plusMinutes(0);
        LocalDateTime time2 = currentTime.plusMinutes(60);
        

        // Format the time1 and time2 to HH:mm:ss format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:00");
        String formattedTime1 = time1.format(formatter);
        String formattedTime2 = time2.format(formatter);

       /* System.out.println("Time1 (30 minutes ago): " + formattedTime1);*/
        System.out.println("Time: " + formattedTime1);
        System.out.println("Time2 (60 minutes from now): " + formattedTime2);
        
// data getting end//        
        try{
        	Connection con = DB.getConnection();
	  	    PreparedStatement ps = con.prepareStatement("SELECT COUNT(location) AS cu FROM dataset WHERE location = '" + loc + "' AND time BETWEEN '" + formattedTime1 + "' AND '" + formattedTime2 + "'");
	  	    ResultSet rs = (ResultSet) ps.executeQuery();
	  	    while(rs.next()){
	  	    	accident_count = rs.getString("cu");
	  	    }
        }catch(Exception e){
        	System.out.println(e);
        }
        // Pass the values of l1 and l2 to another Java class file
        int accidentCountInt = Integer.parseInt(accident_count);
        WeaUtils.doSomething(l1, l2, accidentCountInt);
        String weatherData = WeaUtils.getWeatherData(l1, l2);
        WeaUtils.WeatherInfo weatherInfo = WeaUtils.parseWeatherData(weatherData);
        String riskPrediction = WeaUtils.predictRisk(weatherInfo);
        request.setAttribute("riskPrediction", riskPrediction);
        // Set the response content type to "text/html"
        response.setContentType("text/html");
        request.setAttribute("weatherCondition", weatherInfo.weatherCondition);
        request.setAttribute("temperature", weatherInfo.temperature);
        request.setAttribute("humidity", weatherInfo.humidity);
        request.setAttribute("visibility", weatherInfo.visibility);
        request.setAttribute("numAccidents", accidentCountInt);
        request.setAttribute("l1", l1);
        request.setAttribute("l2", l2); 
        request.getRequestDispatcher("user_prediction1.jsp").forward(request, response);
        }
        else if(location.equalsIgnoreCase("600034")){
        	System.out.println("hai");
        		
        double l1 = 13.058401319607732;
        double l2 = 80.24814097525365;
        String loc= "Nungambakkam, Chennai";   // Nungambakkam High Road - 13.058401319607732, 80.24814097525365
        String accident_count = null;
        
// getting system data:
     // Get the current system time
        LocalDateTime currentTime = LocalDateTime.now();

        // Subtract 30 minutes from the current time to get time1
       /* LocalDateTime time1 = currentTime.minusMinutes(30);*/

        // Add 30 minutes to the current time to get time2
        LocalDateTime time1 = currentTime.plusMinutes(0);
        LocalDateTime time2 = currentTime.plusMinutes(60);
        

        // Format the time1 and time2 to HH:mm:ss format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:00");
        String formattedTime1 = time1.format(formatter);
        String formattedTime2 = time2.format(formatter);

       /* System.out.println("Time1 (30 minutes ago): " + formattedTime1);*/
        System.out.println("Time: " + formattedTime1);
        System.out.println("Time2 (60 minutes from now): " + formattedTime2);
        
// data getting end//        
        try{
        	Connection con = DB.getConnection();
	  	    PreparedStatement ps = con.prepareStatement("SELECT COUNT(location) AS cu FROM dataset WHERE location = '" + loc + "' AND time BETWEEN '" + formattedTime1 + "' AND '" + formattedTime2 + "'");
	  	    ResultSet rs = (ResultSet) ps.executeQuery();
	  	    while(rs.next()){
	  	    	accident_count = rs.getString("cu");
	  	    }
	  	    System.out.println("accident_count:"+ accident_count);
        }catch(Exception e){
        	System.out.println(e);
        }
        // Pass the values of l1 and l2 to another Java class file
        int accidentCountInt = Integer.parseInt(accident_count);
        WeaUtils.doSomething(l1, l2, accidentCountInt);
        String weatherData = WeaUtils.getWeatherData(l1, l2);
        WeaUtils.WeatherInfo weatherInfo = WeaUtils.parseWeatherData(weatherData);
        String riskPrediction = WeaUtils.predictRisk(weatherInfo);
        request.setAttribute("riskPrediction", riskPrediction);
        // Set the response content type to "text/html"
        response.setContentType("text/html");
        request.setAttribute("weatherCondition", weatherInfo.weatherCondition);
        request.setAttribute("temperature", weatherInfo.temperature);
        request.setAttribute("humidity", weatherInfo.humidity);
        request.setAttribute("visibility", weatherInfo.visibility);
        request.setAttribute("numAccidents", accidentCountInt); 
      
        request.setAttribute("l1", l1);
        request.setAttribute("l2", l2); 
    
        request.getRequestDispatcher("user_prediction1.jsp").forward(request, response);
        }
        
        else if(location.equalsIgnoreCase("600002")){
        	System.out.println("hai");
        		
        double l1 = 13.041799696046828;
        double l2 = 80.24746471519593;
        String loc= "Mount Road, Chennai";     //13.041799696046828, 80.24746471519593
        String accident_count = null;
       
// getting system data:
     // Get the current system time
        LocalDateTime currentTime = LocalDateTime.now();

        // Subtract 30 minutes from the current time to get time1
       /* LocalDateTime time1 = currentTime.minusMinutes(30);*/

        // Add 30 minutes to the current time to get time2
        LocalDateTime time1 = currentTime.plusMinutes(0);
        LocalDateTime time2 = currentTime.plusMinutes(60);
        

        // Format the time1 and time2 to HH:mm:ss format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:00");
        String formattedTime1 = time1.format(formatter);
        String formattedTime2 = time2.format(formatter);

       /* System.out.println("Time1 (30 minutes ago): " + formattedTime1);*/
        System.out.println("Time: " + formattedTime1);
        System.out.println("Time2 (60 minutes from now): " + formattedTime2);
        
// data getting end//        
        try{
        	Connection con = DB.getConnection();
	  	    PreparedStatement ps = con.prepareStatement("SELECT COUNT(location) AS cu FROM dataset WHERE location = '" + loc + "' AND time BETWEEN '" + formattedTime1 + "' AND '" + formattedTime2 + "'");
	  	    ResultSet rs = (ResultSet) ps.executeQuery();
	  	    while(rs.next()){
	  	    	accident_count = rs.getString("cu");
	  	    }
        }catch(Exception e){
        	System.out.println(e);
        }
        // Pass the values of l1 and l2 to another Java class file
        int accidentCountInt = Integer.parseInt(accident_count);
        WeaUtils.doSomething(l1, l2, accidentCountInt);
        String weatherData = WeaUtils.getWeatherData(l1, l2);
        WeaUtils.WeatherInfo weatherInfo = WeaUtils.parseWeatherData(weatherData);
        String riskPrediction = WeaUtils.predictRisk(weatherInfo);
        request.setAttribute("riskPrediction", riskPrediction);
        // Set the response content type to "text/html"
        response.setContentType("text/html");
        request.setAttribute("weatherCondition", weatherInfo.weatherCondition);
        request.setAttribute("temperature", weatherInfo.temperature);
        request.setAttribute("humidity", weatherInfo.humidity);
        request.setAttribute("visibility", weatherInfo.visibility);
        request.setAttribute("numAccidents", accidentCountInt);
        request.setAttribute("l1", l1);
        request.setAttribute("l2", l2); 
        request.getRequestDispatcher("user_prediction1.jsp").forward(request, response);
        }
        
        else if(location.equalsIgnoreCase("600017")){
        	System.out.println("hai");
        		
        double l1 = 13.034487822074874;
        double l2 = 80.23031214975133;
        String loc= "T Nagar, Chennai";    //s usman road - 13.034487822074874, 80.23031214975133
        String accident_count = null;
       
// getting system data:
     // Get the current system time
        LocalDateTime currentTime = LocalDateTime.now();

        // Subtract 30 minutes from the current time to get time1
       /* LocalDateTime time1 = currentTime.minusMinutes(30);*/

        // Add 30 minutes to the current time to get time2
        LocalDateTime time1 = currentTime.plusMinutes(0);
        LocalDateTime time2 = currentTime.plusMinutes(60);
        

        // Format the time1 and time2 to HH:mm:ss format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:00");
        String formattedTime1 = time1.format(formatter);
        String formattedTime2 = time2.format(formatter);

       /* System.out.println("Time1 (30 minutes ago): " + formattedTime1);*/
        System.out.println("Time: " + formattedTime1);
        System.out.println("Time2 (60 minutes from now): " + formattedTime2);
        
// data getting end//        
        try{
        	Connection con = DB.getConnection();
	  	    PreparedStatement ps = con.prepareStatement("SELECT COUNT(location) AS cu FROM dataset WHERE location = '" + loc + "' AND time BETWEEN '" + formattedTime1 + "' AND '" + formattedTime2 + "'");
	  	    ResultSet rs = (ResultSet) ps.executeQuery();
	  	    while(rs.next()){
	  	    	accident_count = rs.getString("cu");
	  	    }
        }catch(Exception e){
        	System.out.println(e);
        }
        // Pass the values of l1 and l2 to another Java class file
        int accidentCountInt = Integer.parseInt(accident_count);
        WeaUtils.doSomething(l1, l2, accidentCountInt);
        String weatherData = WeaUtils.getWeatherData(l1, l2);
        WeaUtils.WeatherInfo weatherInfo = WeaUtils.parseWeatherData(weatherData);
        String riskPrediction = WeaUtils.predictRisk(weatherInfo);
        request.setAttribute("riskPrediction", riskPrediction);
        // Set the response content type to "text/html"
        response.setContentType("text/html");
        request.setAttribute("weatherCondition", weatherInfo.weatherCondition);
        request.setAttribute("temperature", weatherInfo.temperature);
        request.setAttribute("humidity", weatherInfo.humidity);
        request.setAttribute("visibility", weatherInfo.visibility);
        request.setAttribute("numAccidents", accidentCountInt);
        request.setAttribute("l1", l1);
        request.setAttribute("l2", l2); 
        request.getRequestDispatcher("user_prediction1.jsp").forward(request, response);
        }
        else if(location.equalsIgnoreCase("600096")){
        	System.out.println("hai");
        		
        double l1 = 13.054647738773383;
        double l2 = 80.18610068711577;
        String loc= "Rajiv Gandhi Salai, Chennai";   //13.054647738773383, 80.18610068711577
        String accident_count = null;
        
// getting system data:
     // Get the current system time
        LocalDateTime currentTime = LocalDateTime.now();

        // Subtract 30 minutes from the current time to get time1
       /* LocalDateTime time1 = currentTime.minusMinutes(30);*/

        // Add 30 minutes to the current time to get time2
        LocalDateTime time1 = currentTime.plusMinutes(0);
        LocalDateTime time2 = currentTime.plusMinutes(60);
        

        // Format the time1 and time2 to HH:mm:ss format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:00");
        String formattedTime1 = time1.format(formatter);
        String formattedTime2 = time2.format(formatter);

       /* System.out.println("Time1 (30 minutes ago): " + formattedTime1);*/
        System.out.println("Time: " + formattedTime1);
        System.out.println("Time2 (60 minutes from now): " + formattedTime2);
        
// data getting end//        
        try{
        	Connection con = DB.getConnection();
	  	    PreparedStatement ps = con.prepareStatement("SELECT COUNT(location) AS cu FROM dataset WHERE location = '" + loc + "' AND time BETWEEN '" + formattedTime1 + "' AND '" + formattedTime2 + "'");
	  	    ResultSet rs = (ResultSet) ps.executeQuery();
	  	    while(rs.next()){
	  	    	accident_count = rs.getString("cu");
	  	    }
        }catch(Exception e){
        	System.out.println(e);
        }
        // Pass the values of l1 and l2 to another Java class file
        int accidentCountInt = Integer.parseInt(accident_count);
        WeaUtils.doSomething(l1, l2, accidentCountInt);
        String weatherData = WeaUtils.getWeatherData(l1, l2);
        WeaUtils.WeatherInfo weatherInfo = WeaUtils.parseWeatherData(weatherData);
        String riskPrediction = WeaUtils.predictRisk(weatherInfo);
        request.setAttribute("riskPrediction", riskPrediction);
        // Set the response content type to "text/html"
        response.setContentType("text/html");
        request.setAttribute("weatherCondition", weatherInfo.weatherCondition);
        request.setAttribute("temperature", weatherInfo.temperature);
        request.setAttribute("humidity", weatherInfo.humidity);
        request.setAttribute("visibility", weatherInfo.visibility);
        request.setAttribute("numAccidents", accidentCountInt);
        request.setAttribute("l1", l1);
        request.setAttribute("l2", l2); 
        request.getRequestDispatcher("user_prediction1.jsp").forward(request, response);
        }
        else if(location.equalsIgnoreCase("600005")){
        	System.out.println("hai");
        		
        double l1 = 13.054743326269813;
        double l2 = 80.1867510930607;
        String loc= "Kamarajar Salai, Chennai";   // 13.054743326269813, 80.1867510930607
        String accident_count = null;
       
// getting system data:
     // Get the current system time
        LocalDateTime currentTime = LocalDateTime.now();

        // Subtract 30 minutes from the current time to get time1
       /* LocalDateTime time1 = currentTime.minusMinutes(30);*/

        // Add 30 minutes to the current time to get time2
        LocalDateTime time1 = currentTime.plusMinutes(0);
        LocalDateTime time2 = currentTime.plusMinutes(60);
        

        // Format the time1 and time2 to HH:mm:ss format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:00");
        String formattedTime1 = time1.format(formatter);
        String formattedTime2 = time2.format(formatter);

       /* System.out.println("Time1 (30 minutes ago): " + formattedTime1);*/
        System.out.println("Time: " + formattedTime1);
        System.out.println("Time2 (60 minutes from now): " + formattedTime2);
        
// data getting end//        
        try{
        	Connection con = DB.getConnection();
	  	    PreparedStatement ps = con.prepareStatement("SELECT COUNT(location) AS cu FROM dataset WHERE location = '" + loc + "' AND time BETWEEN '" + formattedTime1 + "' AND '" + formattedTime2 + "'");
	  	    ResultSet rs = (ResultSet) ps.executeQuery();
	  	    while(rs.next()){
	  	    	accident_count = rs.getString("cu");
	  	    }
        }catch(Exception e){
        	System.out.println(e);
        }
        // Pass the values of l1 and l2 to another Java class file
        int accidentCountInt = Integer.parseInt(accident_count);
        WeaUtils.doSomething(l1, l2, accidentCountInt);
        String weatherData = WeaUtils.getWeatherData(l1, l2);
        WeaUtils.WeatherInfo weatherInfo = WeaUtils.parseWeatherData(weatherData);
        String riskPrediction = WeaUtils.predictRisk(weatherInfo);
        request.setAttribute("riskPrediction", riskPrediction);
        // Set the response content type to "text/html"
        response.setContentType("text/html");
        request.setAttribute("weatherCondition", weatherInfo.weatherCondition);
        request.setAttribute("temperature", weatherInfo.temperature);
        request.setAttribute("humidity", weatherInfo.humidity);
        request.setAttribute("visibility", weatherInfo.visibility);
        request.setAttribute("numAccidents", accidentCountInt);
        request.setAttribute("l1", l1);
        request.setAttribute("l2", l2); 
        request.getRequestDispatcher("user_prediction1.jsp").forward(request, response);
        }
        else if(location.equalsIgnoreCase("600040")){
        	System.out.println("hai");
        		
        double l1 = 13.08749127928381;
        double l2 = 80.19137802071765;
        String loc= "Thirumangalam, Chennai";   //Ambattur Estate rd   13.08749127928381, 80.19137802071765
        String accident_count = null;
        
// getting system data:
     // Get the current system time
        LocalDateTime currentTime = LocalDateTime.now();

        // Subtract 30 minutes from the current time to get time1
       /* LocalDateTime time1 = currentTime.minusMinutes(30);*/

        // Add 30 minutes to the current time to get time2
        LocalDateTime time1 = currentTime.plusMinutes(0);
        LocalDateTime time2 = currentTime.plusMinutes(60);
        

        // Format the time1 and time2 to HH:mm:ss format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:00");
        String formattedTime1 = time1.format(formatter);
        String formattedTime2 = time2.format(formatter);

       /* System.out.println("Time1 (30 minutes ago): " + formattedTime1);*/
        System.out.println("Time: " + formattedTime1);
        System.out.println("Time2 (60 minutes from now): " + formattedTime2);
        
// data getting end//        
        try{
        	Connection con = DB.getConnection();
	  	    PreparedStatement ps = con.prepareStatement("SELECT COUNT(location) AS cu FROM dataset WHERE location = '" + loc + "' AND time BETWEEN '" + formattedTime1 + "' AND '" + formattedTime2 + "'");
	  	    ResultSet rs = (ResultSet) ps.executeQuery();
	  	    while(rs.next()){
	  	    	accident_count = rs.getString("cu");
	  	    }
        }catch(Exception e){
        	System.out.println(e);
        }
        // Pass the values of l1 and l2 to another Java class file
        int accidentCountInt = Integer.parseInt(accident_count);
        WeaUtils.doSomething(l1, l2, accidentCountInt);
        String weatherData = WeaUtils.getWeatherData(l1, l2);
        WeaUtils.WeatherInfo weatherInfo = WeaUtils.parseWeatherData(weatherData);
        String riskPrediction = WeaUtils.predictRisk(weatherInfo);
        request.setAttribute("riskPrediction", riskPrediction);
        // Set the response content type to "text/html"
        response.setContentType("text/html");
        request.setAttribute("weatherCondition", weatherInfo.weatherCondition);
        request.setAttribute("temperature", weatherInfo.temperature);
        request.setAttribute("humidity", weatherInfo.humidity);
        request.setAttribute("visibility", weatherInfo.visibility);
        request.setAttribute("numAccidents", accidentCountInt);
        request.setAttribute("l1", l1);
        request.setAttribute("l2", l2); 
        request.getRequestDispatcher("user_prediction1.jsp").forward(request, response);
        }
        else if(location.equalsIgnoreCase("600016")){
        	System.out.println("hai");
        		
        double l1 = 12.997345489824138;
        double l2 = 80.19085877750969;
        String loc= "GST Road, Chennai";   //12.997345489824138, 80.19085877750969
        String accident_count = null;
        
// getting system data:
     // Get the current system time
        LocalDateTime currentTime = LocalDateTime.now();

        // Subtract 30 minutes from the current time to get time1
       /* LocalDateTime time1 = currentTime.minusMinutes(30);*/

        // Add 30 minutes to the current time to get time2
        LocalDateTime time1 = currentTime.plusMinutes(0);
        LocalDateTime time2 = currentTime.plusMinutes(60);
        

        // Format the time1 and time2 to HH:mm:ss format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:00");
        String formattedTime1 = time1.format(formatter);
        String formattedTime2 = time2.format(formatter);

       /* System.out.println("Time1 (30 minutes ago): " + formattedTime1);*/
        System.out.println("Time: " + formattedTime1);
        System.out.println("Time2 (60 minutes from now): " + formattedTime2);
        
// data getting end//        
        try{
        	Connection con = DB.getConnection();
	  	    PreparedStatement ps = con.prepareStatement("SELECT COUNT(location) AS cu FROM dataset WHERE location = '" + loc + "' AND time BETWEEN '" + formattedTime1 + "' AND '" + formattedTime2 + "'");
	  	    ResultSet rs = (ResultSet) ps.executeQuery();
	  	    while(rs.next()){
	  	    	accident_count = rs.getString("cu");
	  	    }
        }catch(Exception e){
        	System.out.println(e);
        }
        // Pass the values of l1 and l2 to another Java class file
        int accidentCountInt = Integer.parseInt(accident_count);
        WeaUtils.doSomething(l1, l2, accidentCountInt);
        String weatherData = WeaUtils.getWeatherData(l1, l2);
        WeaUtils.WeatherInfo weatherInfo = WeaUtils.parseWeatherData(weatherData);
        String riskPrediction = WeaUtils.predictRisk(weatherInfo);
        request.setAttribute("riskPrediction", riskPrediction);
        // Set the response content type to "text/html"
        response.setContentType("text/html");
        request.setAttribute("weatherCondition", weatherInfo.weatherCondition);
        request.setAttribute("temperature", weatherInfo.temperature);
        request.setAttribute("humidity", weatherInfo.humidity);
        request.setAttribute("visibility", weatherInfo.visibility);
        request.setAttribute("numAccidents", accidentCountInt);
        request.setAttribute("l1", l1);
        request.setAttribute("l2", l2); 
        request.getRequestDispatcher("user_prediction1.jsp").forward(request, response);
        }
        else if(location.equalsIgnoreCase("600084")){
        	System.out.println("hai");
        		
        double l1 = 13.050917155655128;
        double l2 = 80.09419871110924;
        String loc= "Poonamallee High Road, Chennai";   //13.050917155655128, 80.09419871110924
        String accident_count = null;
       
// getting system data:
     // Get the current system time
        LocalDateTime currentTime = LocalDateTime.now();

        // Subtract 30 minutes from the current time to get time1
       /* LocalDateTime time1 = currentTime.minusMinutes(30);*/

        // Add 30 minutes to the current time to get time2
        LocalDateTime time1 = currentTime.plusMinutes(0);
        LocalDateTime time2 = currentTime.plusMinutes(60);
        

        // Format the time1 and time2 to HH:mm:ss format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:00");
        String formattedTime1 = time1.format(formatter);
        String formattedTime2 = time2.format(formatter);

       /* System.out.println("Time1 (30 minutes ago): " + formattedTime1);*/
        System.out.println("Time: " + formattedTime1);
        System.out.println("Time2 (60 minutes from now): " + formattedTime2);
        
// data getting end//        
        try{
        	Connection con = DB.getConnection();
	  	    PreparedStatement ps = con.prepareStatement("SELECT COUNT(location) AS cu FROM dataset WHERE location = '" + loc + "' AND time BETWEEN '" + formattedTime1 + "' AND '" + formattedTime2 + "'");
	  	    ResultSet rs = (ResultSet) ps.executeQuery();
	  	    while(rs.next()){
	  	    	accident_count = rs.getString("cu");
	  	    }
        }catch(Exception e){
        	System.out.println(e);
        }
        // Pass the values of l1 and l2 to another Java class file
        int accidentCountInt = Integer.parseInt(accident_count);
        WeaUtils.doSomething(l1, l2, accidentCountInt);
        String weatherData = WeaUtils.getWeatherData(l1, l2);
        WeaUtils.WeatherInfo weatherInfo = WeaUtils.parseWeatherData(weatherData);
        String riskPrediction = WeaUtils.predictRisk(weatherInfo);
        request.setAttribute("riskPrediction", riskPrediction);
        // Set the response content type to "text/html"
        response.setContentType("text/html");
        request.setAttribute("weatherCondition", weatherInfo.weatherCondition);
        request.setAttribute("temperature", weatherInfo.temperature);
        request.setAttribute("humidity", weatherInfo.humidity);
        request.setAttribute("visibility", weatherInfo.visibility);
        request.setAttribute("numAccidents", accidentCountInt);
        request.setAttribute("l1", l1);
        request.setAttribute("l2", l2); 
        request.getRequestDispatcher("user_prediction1.jsp").forward(request, response);
        }
        else if(location.equalsIgnoreCase("600116")){
        	System.out.println("hai");
        		
        double l1 = 13.043279970348015;
        double l2 = 80.14942316061834;
        String loc= "Porur, Chennai";    //chennai Bypass rd  13.043279970348015, 80.14942316061834
        String accident_count = null;
       
// getting system data:
     // Get the current system time
        LocalDateTime currentTime = LocalDateTime.now();

        // Subtract 30 minutes from the current time to get time1
       /* LocalDateTime time1 = currentTime.minusMinutes(30);*/

        // Add 30 minutes to the current time to get time2
        LocalDateTime time1 = currentTime.plusMinutes(0);
        LocalDateTime time2 = currentTime.plusMinutes(60);
        

        // Format the time1 and time2 to HH:mm:ss format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:00");
        String formattedTime1 = time1.format(formatter);
        String formattedTime2 = time2.format(formatter);

       /* System.out.println("Time1 (30 minutes ago): " + formattedTime1);*/
        System.out.println("Time: " + formattedTime1);
        System.out.println("Time2 (60 minutes from now): " + formattedTime2);
        
// data getting end//        
        try{
        	Connection con = DB.getConnection();
	  	    PreparedStatement ps = con.prepareStatement("SELECT COUNT(location) AS cu FROM dataset WHERE location = '" + loc + "' AND time BETWEEN '" + formattedTime1 + "' AND '" + formattedTime2 + "'");
	  	    ResultSet rs = (ResultSet) ps.executeQuery();
	  	    while(rs.next()){
	  	    	accident_count = rs.getString("cu");
	  	    }
        }catch(Exception e){
        	System.out.println(e);
        }
        // Pass the values of l1 and l2 to another Java class file
        int accidentCountInt = Integer.parseInt(accident_count);
        WeaUtils.doSomething(l1, l2, accidentCountInt);
        String weatherData = WeaUtils.getWeatherData(l1, l2);
        WeaUtils.WeatherInfo weatherInfo = WeaUtils.parseWeatherData(weatherData);
        String riskPrediction = WeaUtils.predictRisk(weatherInfo);
        request.setAttribute("riskPrediction", riskPrediction);
        // Set the response content type to "text/html"
        response.setContentType("text/html");
        request.setAttribute("weatherCondition", weatherInfo.weatherCondition);
        request.setAttribute("temperature", weatherInfo.temperature);
        request.setAttribute("humidity", weatherInfo.humidity);
        request.setAttribute("visibility", weatherInfo.visibility);
        request.setAttribute("numAccidents", accidentCountInt);
        request.setAttribute("l1", l1);
        request.setAttribute("l2", l2); 
        request.getRequestDispatcher("user_prediction1.jsp").forward(request, response);
        }
        else if(location.equalsIgnoreCase("600042")){
        	System.out.println("hai");
        		
        double l1 = 12.951429089541339;
        double l2 = 80.21106892517282;
        String loc= "Velachery Main Road, Chennai";   // 12.951429089541339, 80.21106892517282
        String accident_count = null;
       
// getting system data:
     // Get the current system time
        LocalDateTime currentTime = LocalDateTime.now();

        // Subtract 30 minutes from the current time to get time1
       /* LocalDateTime time1 = currentTime.minusMinutes(30);*/

        // Add 30 minutes to the current time to get time2
        LocalDateTime time1 = currentTime.plusMinutes(0);
        LocalDateTime time2 = currentTime.plusMinutes(60);
        

        // Format the time1 and time2 to HH:mm:ss format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:00");
        String formattedTime1 = time1.format(formatter);
        String formattedTime2 = time2.format(formatter);

       /* System.out.println("Time1 (30 minutes ago): " + formattedTime1);*/
        System.out.println("Time: " + formattedTime1);
        System.out.println("Time2 (60 minutes from now): " + formattedTime2);
        
// data getting end//        
        try{
        	Connection con = DB.getConnection();
	  	    PreparedStatement ps = con.prepareStatement("SELECT COUNT(location) AS cu FROM dataset WHERE location = '" + loc + "' AND time BETWEEN '" + formattedTime1 + "' AND '" + formattedTime2 + "'");
	  	    ResultSet rs = (ResultSet) ps.executeQuery();
	  	    while(rs.next()){
	  	    	accident_count = rs.getString("cu");
	  	    }
        }catch(Exception e){
        	System.out.println(e);
        }
        // Pass the values of l1 and l2 to another Java class file
        int accidentCountInt = Integer.parseInt(accident_count);
        WeaUtils.doSomething(l1, l2, accidentCountInt);
        String weatherData = WeaUtils.getWeatherData(l1, l2);
        WeaUtils.WeatherInfo weatherInfo = WeaUtils.parseWeatherData(weatherData);
        String riskPrediction = WeaUtils.predictRisk(weatherInfo);
        request.setAttribute("riskPrediction", riskPrediction);
        // Set the response content type to "text/html"
        response.setContentType("text/html");
        request.setAttribute("weatherCondition", weatherInfo.weatherCondition);
        request.setAttribute("temperature", weatherInfo.temperature);
        request.setAttribute("humidity", weatherInfo.humidity);
        request.setAttribute("visibility", weatherInfo.visibility);
        request.setAttribute("numAccidents", accidentCountInt);
        request.setAttribute("l1", l1);
        request.setAttribute("l2", l2); 
        request.getRequestDispatcher("user_prediction1.jsp").forward(request, response);
        }
        else if(location.equalsIgnoreCase("600097")){
        	System.out.println("hai");
        		
        double l1 = 12.718288554829174;
        double l2 = 80.1886835117401;
        String loc= "OMR, Chennai";      //12.718288554829174, 80.1886835117401
        String accident_count = null;
        
// getting system data:
     // Get the current system time
        LocalDateTime currentTime = LocalDateTime.now();

        // Subtract 30 minutes from the current time to get time1
       /* LocalDateTime time1 = currentTime.minusMinutes(30);*/

        // Add 30 minutes to the current time to get time2
        LocalDateTime time1 = currentTime.plusMinutes(0);
        LocalDateTime time2 = currentTime.plusMinutes(60);
        

        // Format the time1 and time2 to HH:mm:ss format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:00");
        String formattedTime1 = time1.format(formatter);
        String formattedTime2 = time2.format(formatter);

       /* System.out.println("Time1 (30 minutes ago): " + formattedTime1);*/
        System.out.println("Time: " + formattedTime1);
        System.out.println("Time2 (60 minutes from now): " + formattedTime2);
        
// data getting end//        
        try{
        	Connection con = DB.getConnection();
	  	    PreparedStatement ps = con.prepareStatement("SELECT COUNT(location) AS cu FROM dataset WHERE location = '" + loc + "' AND time BETWEEN '" + formattedTime1 + "' AND '" + formattedTime2 + "'");
	  	    ResultSet rs = (ResultSet) ps.executeQuery();
	  	    while(rs.next()){
	  	    	accident_count = rs.getString("cu");
	  	    }
        }catch(Exception e){
        	System.out.println(e);
        }
        // Pass the values of l1 and l2 to another Java class file
        int accidentCountInt = Integer.parseInt(accident_count);
        WeaUtils.doSomething(l1, l2, accidentCountInt);
        String weatherData = WeaUtils.getWeatherData(l1, l2);
        WeaUtils.WeatherInfo weatherInfo = WeaUtils.parseWeatherData(weatherData);
        String riskPrediction = WeaUtils.predictRisk(weatherInfo);
        request.setAttribute("riskPrediction", riskPrediction);
        // Set the response content type to "text/html"
        response.setContentType("text/html");
        request.setAttribute("weatherCondition", weatherInfo.weatherCondition);
        request.setAttribute("temperature", weatherInfo.temperature);
        request.setAttribute("humidity", weatherInfo.humidity);
        request.setAttribute("visibility", weatherInfo.visibility);
        request.setAttribute("numAccidents", accidentCountInt);
        request.setAttribute("l1", l1);
        request.setAttribute("l2", l2); 
        request.getRequestDispatcher("user_prediction1.jsp").forward(request, response);
        }
        else if(location.equalsIgnoreCase("600044")){
        	System.out.println("hai");
        		
        double l1 = 13.0554;
        double l2 = 80.2531;
        String loc= "Chromepet, Chennai";    //grand southern trunk rd    12.951691378260724, 80.14032727305467
        String accident_count = null;
        
// getting system data:
     // Get the current system time
        LocalDateTime currentTime = LocalDateTime.now();

        // Subtract 30 minutes from the current time to get time1
       /* LocalDateTime time1 = currentTime.minusMinutes(30);*/

        // Add 30 minutes to the current time to get time2
        LocalDateTime time1 = currentTime.plusMinutes(0);
        LocalDateTime time2 = currentTime.plusMinutes(60);
        

        // Format the time1 and time2 to HH:mm:ss format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:00");
        String formattedTime1 = time1.format(formatter);
        String formattedTime2 = time2.format(formatter);

       /* System.out.println("Time1 (30 minutes ago): " + formattedTime1);*/
        System.out.println("Time: " + formattedTime1);
        System.out.println("Time2 (60 minutes from now): " + formattedTime2);
        
// data getting end//        
        try{
        	Connection con = DB.getConnection();
	  	    PreparedStatement ps = con.prepareStatement("SELECT COUNT(location) AS cu FROM dataset WHERE location = '" + loc + "' AND time BETWEEN '" + formattedTime1 + "' AND '" + formattedTime2 + "'");
	  	    ResultSet rs = (ResultSet) ps.executeQuery();
	  	    while(rs.next()){
	  	    	accident_count = rs.getString("cu");
	  	    }
        }catch(Exception e){
        	System.out.println(e);
        }
        // Pass the values of l1 and l2 to another Java class file
        int accidentCountInt = Integer.parseInt(accident_count);
        WeaUtils.doSomething(l1, l2, accidentCountInt);
        String weatherData = WeaUtils.getWeatherData(l1, l2);
        WeaUtils.WeatherInfo weatherInfo = WeaUtils.parseWeatherData(weatherData);
        String riskPrediction = WeaUtils.predictRisk(weatherInfo);
        request.setAttribute("riskPrediction", riskPrediction);
        // Set the response content type to "text/html"
        response.setContentType("text/html");
        request.setAttribute("weatherCondition", weatherInfo.weatherCondition);
        request.setAttribute("temperature", weatherInfo.temperature);
        request.setAttribute("humidity", weatherInfo.humidity);
        request.setAttribute("visibility", weatherInfo.visibility);
        request.setAttribute("numAccidents", accidentCountInt);
        request.setAttribute("l1", l1);
        request.setAttribute("l2", l2); 
        request.getRequestDispatcher("user_prediction1.jsp").forward(request, response);
        }
        else if(location.equalsIgnoreCase("600096")){
        	System.out.println("hai");
        		
        double l1 = 13.048145351762498;
        double l2 = 80.08426801470672;
        String loc= "Outer Ring Road, Chennai";    //13.048145351762498, 80.08426801470672
        String accident_count = null;
        
// getting system data:
     // Get the current system time
        LocalDateTime currentTime = LocalDateTime.now();

        // Subtract 30 minutes from the current time to get time1
       /* LocalDateTime time1 = currentTime.minusMinutes(30);*/

        // Add 30 minutes to the current time to get time2
        LocalDateTime time1 = currentTime.plusMinutes(0);
        LocalDateTime time2 = currentTime.plusMinutes(60);
        

        // Format the time1 and time2 to HH:mm:ss format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:00");
        String formattedTime1 = time1.format(formatter);
        String formattedTime2 = time2.format(formatter);

       /* System.out.println("Time1 (30 minutes ago): " + formattedTime1);*/
        System.out.println("Time: " + formattedTime1);
        System.out.println("Time2 (60 minutes from now): " + formattedTime2);
        
// data getting end//        
        try{
        	Connection con = DB.getConnection();
	  	    PreparedStatement ps = con.prepareStatement("SELECT COUNT(location) AS cu FROM dataset WHERE location = '" + loc + "' AND time BETWEEN '" + formattedTime1 + "' AND '" + formattedTime2 + "'");
	  	    ResultSet rs = (ResultSet) ps.executeQuery();
	  	    while(rs.next()){
	  	    	accident_count = rs.getString("cu");
	  	    }
        }catch(Exception e){
        	System.out.println(e);
        }
        // Pass the values of l1 and l2 to another Java class file
        int accidentCountInt = Integer.parseInt(accident_count);
        WeaUtils.doSomething(l1, l2, accidentCountInt);
        String weatherData = WeaUtils.getWeatherData(l1, l2);
        WeaUtils.WeatherInfo weatherInfo = WeaUtils.parseWeatherData(weatherData);
        String riskPrediction = WeaUtils.predictRisk(weatherInfo);
        request.setAttribute("riskPrediction", riskPrediction);
        // Set the response content type to "text/html"
        response.setContentType("text/html");
        request.setAttribute("weatherCondition", weatherInfo.weatherCondition);
        request.setAttribute("temperature", weatherInfo.temperature);
        request.setAttribute("humidity", weatherInfo.humidity);
        request.setAttribute("visibility", weatherInfo.visibility);
        request.setAttribute("numAccidents", accidentCountInt);
        request.setAttribute("l1", l1);
        request.setAttribute("l2", l2); 
        request.getRequestDispatcher("user_prediction1.jsp").forward(request, response);
        }
        else if(location.equalsIgnoreCase("600078")){
        	System.out.println("hai");
        		
        double l1 = 12.83378521788406;
        double l2 = 80.22864604976945;
        String loc= "Old Mahabalipuram Road, Chennai";   //12.83378521788406, 80.22864604976945
        String accident_count = null;
       
// getting system data:
     // Get the current system time
        LocalDateTime currentTime = LocalDateTime.now();

        // Subtract 30 minutes from the current time to get time1
       /* LocalDateTime time1 = currentTime.minusMinutes(30);*/

        // Add 30 minutes to the current time to get time2
        LocalDateTime time1 = currentTime.plusMinutes(0);
        LocalDateTime time2 = currentTime.plusMinutes(60);
        

        // Format the time1 and time2 to HH:mm:ss format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:00");
        String formattedTime1 = time1.format(formatter);
        String formattedTime2 = time2.format(formatter);

       /* System.out.println("Time1 (30 minutes ago): " + formattedTime1);*/
        System.out.println("Time: " + formattedTime1);
        System.out.println("Time2 (60 minutes from now): " + formattedTime2);
        
// data getting end//        
        try{
        	Connection con = DB.getConnection();
	  	    PreparedStatement ps = con.prepareStatement("SELECT COUNT(location) AS cu FROM dataset WHERE location = '" + loc + "' AND time BETWEEN '" + formattedTime1 + "' AND '" + formattedTime2 + "'");
	  	    ResultSet rs = (ResultSet) ps.executeQuery();
	  	    while(rs.next()){
	  	    	accident_count = rs.getString("cu");
	  	    }
        }catch(Exception e){
        	System.out.println(e);
        }
        // Pass the values of l1 and l2 to another Java class file
        int accidentCountInt = Integer.parseInt(accident_count);
        WeaUtils.doSomething(l1, l2, accidentCountInt);
        String weatherData = WeaUtils.getWeatherData(l1, l2);
        WeaUtils.WeatherInfo weatherInfo = WeaUtils.parseWeatherData(weatherData);
        String riskPrediction = WeaUtils.predictRisk(weatherInfo);
        request.setAttribute("riskPrediction", riskPrediction);
        // Set the response content type to "text/html"
        response.setContentType("text/html");
        request.setAttribute("weatherCondition", weatherInfo.weatherCondition);
        request.setAttribute("temperature", weatherInfo.temperature);
        request.setAttribute("humidity", weatherInfo.humidity);
        request.setAttribute("visibility", weatherInfo.visibility);
        request.setAttribute("numAccidents", accidentCountInt);
        request.setAttribute("l1", l1);
        request.setAttribute("l2", l2); 
        request.getRequestDispatcher("user_prediction1.jsp").forward(request, response);
        }
        else if(location.equalsIgnoreCase("600060")){
        	System.out.println("hai");
        		
        double l1 = 12.922980155479317;
        double l2 = 80.1142729968093;
        String loc= "Tambaram, Chennai";   //12.922980155479317, 80.1142729968093
        String accident_count = null;
        
// getting system data:
     // Get the current system time
        LocalDateTime currentTime = LocalDateTime.now();

        // Subtract 30 minutes from the current time to get time1
       /* LocalDateTime time1 = currentTime.minusMinutes(30);*/

        // Add 30 minutes to the current time to get time2
        LocalDateTime time1 = currentTime.plusMinutes(0);
        LocalDateTime time2 = currentTime.plusMinutes(60);
        

        // Format the time1 and time2 to HH:mm:ss format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:00");
        String formattedTime1 = time1.format(formatter);
        String formattedTime2 = time2.format(formatter);

       /* System.out.println("Time1 (30 minutes ago): " + formattedTime1);*/
        System.out.println("Time: " + formattedTime1);
        System.out.println("Time2 (60 minutes from now): " + formattedTime2);
        
// data getting end//        
        try{
        	Connection con = DB.getConnection();
	  	    PreparedStatement ps = con.prepareStatement("SELECT COUNT(location) AS cu FROM dataset WHERE location = '" + loc + "' AND time BETWEEN '" + formattedTime1 + "' AND '" + formattedTime2 + "'");
	  	    ResultSet rs = (ResultSet) ps.executeQuery();
	  	    while(rs.next()){
	  	    	accident_count = rs.getString("cu");
	  	    }
        }catch(Exception e){
        	System.out.println(e);
        }
        // Pass the values of l1 and l2 to another Java class file
        int accidentCountInt = Integer.parseInt(accident_count);
        WeaUtils.doSomething(l1, l2, accidentCountInt);
        String weatherData = WeaUtils.getWeatherData(l1, l2);
        WeaUtils.WeatherInfo weatherInfo = WeaUtils.parseWeatherData(weatherData);
        String riskPrediction = WeaUtils.predictRisk(weatherInfo);
        request.setAttribute("riskPrediction", riskPrediction);
        // Set the response content type to "text/html"
        response.setContentType("text/html");
        request.setAttribute("weatherCondition", weatherInfo.weatherCondition);
        request.setAttribute("temperature", weatherInfo.temperature);
        request.setAttribute("humidity", weatherInfo.humidity);
        request.setAttribute("visibility", weatherInfo.visibility);
        request.setAttribute("numAccidents", accidentCountInt);
        request.setAttribute("l1", l1);
        request.setAttribute("l2", l2); 
        request.getRequestDispatcher("user_prediction1.jsp").forward(request, response);
        }
        else if(location.equalsIgnoreCase("600041")){
        	System.out.println("hai");
        		
        double l1 = 12.924150258835635;
        double l2 = 80.25108245930954;
        String loc= "ECR, Chennai";    //12.924150258835635, 80.25108245930954
        String accident_count = null;
        
// getting system data:
     // Get the current system time
        LocalDateTime currentTime = LocalDateTime.now();

        // Subtract 30 minutes from the current time to get time1
       /* LocalDateTime time1 = currentTime.minusMinutes(30);*/

        // Add 30 minutes to the current time to get time2
        LocalDateTime time1 = currentTime.plusMinutes(0);
        LocalDateTime time2 = currentTime.plusMinutes(60);
        

        // Format the time1 and time2 to HH:mm:ss format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:00");
        String formattedTime1 = time1.format(formatter);
        String formattedTime2 = time2.format(formatter);

       /* System.out.println("Time1 (30 minutes ago): " + formattedTime1);*/
        System.out.println("Time: " + formattedTime1);
        System.out.println("Time2 (60 minutes from now): " + formattedTime2);
        
// data getting end//        
        try{
        	Connection con = DB.getConnection();
	  	    PreparedStatement ps = con.prepareStatement("SELECT COUNT(location) AS cu FROM dataset WHERE location = '" + loc + "' AND time BETWEEN '" + formattedTime1 + "' AND '" + formattedTime2 + "'");
	  	    ResultSet rs = (ResultSet) ps.executeQuery();
	  	    while(rs.next()){
	  	    	accident_count = rs.getString("cu");
	  	    }
        }catch(Exception e){
        	System.out.println(e);
        }
        // Pass the values of l1 and l2 to another Java class file
        int accidentCountInt = Integer.parseInt(accident_count);
        WeaUtils.doSomething(l1, l2, accidentCountInt);
        String weatherData = WeaUtils.getWeatherData(l1, l2);
        WeaUtils.WeatherInfo weatherInfo = WeaUtils.parseWeatherData(weatherData);
        String riskPrediction = WeaUtils.predictRisk(weatherInfo);
        request.setAttribute("riskPrediction", riskPrediction);
        // Set the response content type to "text/html"
        response.setContentType("text/html");
        request.setAttribute("weatherCondition", weatherInfo.weatherCondition);
        request.setAttribute("temperature", weatherInfo.temperature);
        request.setAttribute("humidity", weatherInfo.humidity);
        request.setAttribute("visibility", weatherInfo.visibility);
        request.setAttribute("numAccidents", accidentCountInt);
        request.setAttribute("l1", l1);
        request.setAttribute("l2", l2); 
        request.getRequestDispatcher("user_prediction1.jsp").forward(request, response);
        }
        else if(location.equalsIgnoreCase("600032")){
        	System.out.println("hai");
        		
        double l1 = 13.007661104260496;
        double l2 = 80.20372084303852;
        String loc= "Alandur, Chennai";       // 13.007661104260496, 80.20372084303852
        String accident_count = null;
       
// getting system data:
     // Get the current system time
        LocalDateTime currentTime = LocalDateTime.now();

        // Subtract 30 minutes from the current time to get time1
       /* LocalDateTime time1 = currentTime.minusMinutes(30);*/

        // Add 30 minutes to the current time to get time2
        LocalDateTime time1 = currentTime.plusMinutes(0);
        LocalDateTime time2 = currentTime.plusMinutes(60);
        

        // Format the time1 and time2 to HH:mm:ss format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:00");
        String formattedTime1 = time1.format(formatter);
        String formattedTime2 = time2.format(formatter);

       /* System.out.println("Time1 (30 minutes ago): " + formattedTime1);*/
        System.out.println("Time: " + formattedTime1);
        System.out.println("Time2 (60 minutes from now): " + formattedTime2);
        
// data getting end//        
        try{
        	Connection con = DB.getConnection();
	  	    PreparedStatement ps = con.prepareStatement("SELECT COUNT(location) AS cu FROM dataset WHERE location = '" + loc + "' AND time BETWEEN '" + formattedTime1 + "' AND '" + formattedTime2 + "'");
	  	    ResultSet rs = (ResultSet) ps.executeQuery();
	  	    while(rs.next()){
	  	    	accident_count = rs.getString("cu");
	  	    }
        }catch(Exception e){
        	System.out.println(e);
        }
        // Pass the values of l1 and l2 to another Java class file
        int accidentCountInt = Integer.parseInt(accident_count);
        WeaUtils.doSomething(l1, l2, accidentCountInt);
        String weatherData = WeaUtils.getWeatherData(l1, l2);
        WeaUtils.WeatherInfo weatherInfo = WeaUtils.parseWeatherData(weatherData);
        String riskPrediction = WeaUtils.predictRisk(weatherInfo);
        request.setAttribute("riskPrediction", riskPrediction);
        // Set the response content type to "text/html"
        response.setContentType("text/html");
        request.setAttribute("weatherCondition", weatherInfo.weatherCondition);
        request.setAttribute("temperature", weatherInfo.temperature);
        request.setAttribute("humidity", weatherInfo.humidity);
        request.setAttribute("visibility", weatherInfo.visibility);
        request.setAttribute("numAccidents", accidentCountInt);
        request.setAttribute("l1", l1);
        request.setAttribute("l2", l2); 
        request.getRequestDispatcher("user_prediction1.jsp").forward(request, response);
        }
        
        

        out.println("The values of l1 and l2 have been passed to another Java class file.");
    }
}
