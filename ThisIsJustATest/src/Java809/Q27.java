package Java809;

import java.sql.*;

public class Q27 {
	static Connection newConnection = null;
	public static Connection getDBConnection() throws SQLException {
		try (Connection con = DriverManager.getConnection("", "username", "password")) {
			newConnection = con;
		}
		return newConnection;
	}
	public static void main(String[] args) throws SQLException {
		getDBConnection();
		Statement st = newConnection.createStatement();
		st.executeUpdate("INSERT INTO student VALUES (102, 'Kelvin')");
	}
}
//https://magiclen.org/ocpjp-try-with-resources-4/
/*C Onne C tion of articles with a-Resour-try C resources es structure, 
 * thus leaving-with-Resour try C will automatically call the time es try block structure C lose method. 
 * Since C Onne c tion has c lose, so at line 14, try to use 
 * C Onne c when tion object to create Statement objects will be thrown SQL Ex c eption.*/
