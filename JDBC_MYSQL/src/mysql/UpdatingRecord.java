package mysql;

import java.sql.Connection;
import java.sql.Statement;

public class UpdatingRecord {
	public void updateRecord() {
		try {
			//reusing connection from connection class
			Connection con = new Connection_Class().getConnection();

			Statement st = con.createStatement();
			 String updateQuery="update student set name='Draupadi Arjun',address='Hastinapur' where roll_no=10";
        	 int updated_Query=st.executeUpdate(updateQuery);
        	 System.out.println("Updated records: " + updated_Query);
        	 con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
