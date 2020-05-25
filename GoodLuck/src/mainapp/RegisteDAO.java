package mainapp;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisteDAO {
	//getting data in java so to connect database
	public void addUser(RegisterPortal rp) throws SQLException, ClassNotFoundException {
		String fname=rp.getFirstname();
		String lname=rp.getLastname();
		String username=rp.getUsername();
		String password=rp.getPassword();
		String email=rp.getEmail();
		
		ConnectionManager cm=new ConnectionManager();
		//sql oBJECTS
		//insert all statements
		String sql="insert into USERDETAILS(FIRSTNAME,LASTNAME,USERNAME,PASSWORD,EMAIL)VALUES(?,?,?,?,?)";
		//create prepared statement
		
		PreparedStatement st=cm.getConnection().prepareStatement(sql);
		
		st.setString(1, fname);
		st.setString(2, lname);
		st.setString(3, username);
		st.setString(4, password);	
		st.setString(5, email);
		//to execute
		st.executeUpdate();
		
		cm.getConnection().close();
		
		
	}
	
	 
}
