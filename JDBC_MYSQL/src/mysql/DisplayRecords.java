package mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayRecords {
	public void displayAllMethods() {
		try {
			Connection con = new Connection_Class().getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM student");
            
            System.out.println("\n--- Student Records ---");
            while (rs.next()) {
                System.out.println(
                    rs.getString("name") + " | " +
                    rs.getInt("roll_no") + " | " +
                    rs.getInt("age") + " | " +
                    rs.getString("class") + " | " +
                    rs.getString("address")
                );
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
            
            
			
		}
		
	

}
