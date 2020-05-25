package mainapp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.io.IOException;

public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException, ClassNotFoundException, SQLException{
		System.out.println("1.Register Here");
		System.out.println("2.Login");
		int x;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		x=Integer.parseInt(br.readLine());
		
		//objects
		
		RegisterPortal rp=new RegisterPortal();
		RegisteDAO registerdao=new RegisteDAO();
		LoginPojo login=new LoginPojo();
		LoginDAO logindao=new LoginDAO();
		
		switch(x){
			case 1:
				System.out.println("Enter the first Name");
				String firstname=br.readLine();
				System.out.println("Enter Last Name");
				String lastname=br.readLine();
				System.out.println("Enter Username");
				String username=br.readLine();
				System.out.println("ENter Password");
				String password=br.readLine();
				System.out.println("Enter Email");
				String email=br.readLine();				
				rp.setFirstname(firstname);
				rp.setLastname(lastname);
				rp.setUsername(username);
				rp.setPassword(password);
				rp.setEmail(email);
				
				registerdao.addUser(rp);
				break;
			case 2:
				
				System.out.println("Enter Username");
				String name=br.readLine();
				System.out.println("ENter Password");
				String pass=br.readLine();
				
				//object loginpojo
				login.setUsername(name);
				login.setPassword(pass);
				
				if(logindao.validate(login)==true) {
					Luck luck=new Luck();
					luck.display();
				}else {
					System.out.println("Incorrect Username.Password");
				}
				break;
		}
	}
}
