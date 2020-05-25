package mainapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//jdbc connectivity
		
				//register the driver class
				Class.forName("oracle.jdbc.OracleDriver");
				
				//Create the connection object
				Connection con=null;
				con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/ORCL","system","oracle");
				if(con!=null) {
					System.out.println("Established Everything Course");
				}
	}

}
