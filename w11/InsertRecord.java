import java.sql.*;
import java.sql.ResultSet;
public class InsertRecord{
	public static void main (String[] args){
		Connection conn = null;
		Statement stmt = null; 
		ResultSet rs = null;
		String NameString, RollString, MarksString, GradeString;
		
		try{
			String userName = "root";
			String password = "root";
			String url = "jdbc:mysql://localhost:3306/test";
			Class.forName ("com.mysql.cj.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection (url, userName, password);                
			stmt = conn.createStatement();  
			stmt.execute("insert into JavaCourse values (01,'Debasis', 75, 'A')");
			stmt.execute("insert into JavaCourse values(02,'Nilanjan', 85, 'EX')");
			stmt.execute("insert into JavaCourse values(03,'Tauheed', 65, 'B')");
			stmt.execute("insert into JavaCourse values(04,'Priyabrata', 78, 'A')");
			} 
		catch (SQLException ex){
			// handle any errors
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
				} catch (SQLException sqlEx) { } // ignore
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException sqlEx) { } // ignore
				stmt = null;
			}
			if (conn != null) {
				try {
					conn.close ();// System.out.println ("Database connection terminated");
				} catch (Exception e) { /* ignore close errors */ }
			}
		}
	}
}