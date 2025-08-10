package mysql;

import java.sql.Connection;
import java.sql.Statement;

public class InsertingRecord {
	public void insertData() {
		try {
			//reusing connection from connection class
			Connection con = new Connection_Class().getConnection();

			Statement st = con.createStatement();
            String insertQuery = "INSERT INTO student VALUES"+
			    "('Arjun', 10, 20,'10th','Hyd'),"+
			   "('Laxman',11,20,'4th','Hyd')";
            int count = st.executeUpdate(insertQuery);
            System.out.println(count + " records inserted Successfully");
            con.close();
            
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
