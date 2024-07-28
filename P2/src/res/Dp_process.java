package res;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.DB;

public class Dp_process {
    public void updateRequestStatus(String status) {
        String st = "Requested";
        String csv = "D:/workspace(23-24)/P2";
    	String csvFilePath = csv+"//WebContent//dataset//cleaned.csv";
        String qry1 = "LOAD DATA INFILE '"+csvFilePath+"'" +
	    	       "INTO TABLE dataset FIELDS TERMINATED BY ','" +
	    	       "OPTIONALLY ENCLOSED by '\"'" +"IGNORE 1 LINES";
       String qry2 = "TRUNCATE `dataset`";
        
        try (Connection con2 = DB.getConnection();)
              {
        	PreparedStatement ps = con2.prepareStatement(qry2);
            /*ps.setString(1, st);*/
            int rowsAffected = ps.executeUpdate();
        	
        	
        	PreparedStatement ps1 = con2.prepareStatement(qry1);
            /*ps1.setString(1, st);*/
            int rowsAffected1 = ps1.executeUpdate();
            
            System.out.println(rowsAffected1 + " rows updated.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
