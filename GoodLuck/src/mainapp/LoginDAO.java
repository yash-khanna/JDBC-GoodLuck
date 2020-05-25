package mainapp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDAO {

	
	public boolean validate(LoginPojo login) throws ClassNotFoundException, SQLException {
		String username=login.getUsername();
		String password=login.getPassword();
		
		//connection with database
		
		ConnectionManager con=new ConnectionManager();
		Statement st=con.getConnection().createStatement();
		
		ResultSet rs=st.executeQuery("SELECT * FROM USERDETAILS");
		
		while(rs.next()) {
			if(username.equals(rs.getString("USERNAME")) && password.equals(rs.getString("PASSWORD"))) {
				con.getConnection().close();
				return true;
			}else {
				con.getConnection().close();
				return false;
			}
		}
		return false;
	}

}
