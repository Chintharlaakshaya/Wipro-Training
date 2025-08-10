package mysql;

import java.sql.Connection;
import java.sql.Statement;

public class DeletingRecord {
	public void deleteRecord() {
		try {
			//reusing connection from connection class
			Connection con = new Connection_Class().getConnection();

			Statement st = con.createStatement();
			String deleteQuery="delete from student where roll_no in (1,3,5)";
			int deleted=st.executeUpdate(deleteQuery);
       	   System.out.println("Deleted records successfully: " + deleted);
       	   con.close();
       	   
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
