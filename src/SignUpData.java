package berklee;

import java.sql.*;

public class SignUpData {

	public static void insert(String usr,String pass) {
		
	    String insert = "INSERT INTO signin(username,password) VALUES ('"+usr+"','"+pass+"');";
		try {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hackathon","root","9182467224");
	    Statement st = con.createStatement();
	    
	    int count=st.executeUpdate(insert);
	    // ResultSet rs = st.executeQuery(insert);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
