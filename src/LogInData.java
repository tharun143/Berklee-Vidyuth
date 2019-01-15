package berklee;

import java.sql.*;

public class LogInData {
	
	public String compare(String usr) {
		
		String p = "";
		String select = "SELECT password FROM signin WHERE username='"+usr+"';";
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hackathon","root","9182467224");
		    Statement st = con.createStatement();
		    ResultSet rs = st.executeQuery(select);
			if(rs.next()) {
			   p = rs.getString("password");		 
			}
		    }catch(Exception e) {
				System.out.println(e);
			}
		return p;
	}
	
	public static void main(String[] args) {
		LogInData d = new LogInData();
		d.compare(null);
	}
}

