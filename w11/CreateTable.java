// Create table in MySQL database using JDBC

import java.sql.*;
import java.sql.ResultSet;
public class CreateTable{
	public static void main (String[] args)   {
		Connection conn = null;
		Statement stmt = null; 
		ResultSet rs = null;
		String TableName;
		try  {
			String userName = "root";
			String password = "root";
			String url = "jdbc:mysql://localhost:3306/test";
			Class.forName ("com.mysql.cj.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection (url, userName, password);
			stmt = conn.createStatement();
			//Creating table
			stmt.execute("create table JavaCourse(Roll Integer primary key, Name Varchar(30), Marks Integer not null, Grade Varchar(2))");  
		} catch (SQLException ex){
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
		catch (Exception e){
			System.err.println ("Cannot connect to database server");
		}
		finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException sqlEx) {}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException sqlEx) {}
				stmt = null; 
			}
			if (conn != null) {
				try {
					conn.close ();
				} catch (Exception e) { /* Ignore code for closing errors */ }
			}	   
		} 
	}
}