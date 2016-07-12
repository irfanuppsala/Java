import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class TestMysqlDatabase {

	static final String username = "root";
	static final String password = "";
	static final String dbUrl = "jdbc:mysql://localhost:3306/example";
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(dbUrl, username, password);
			
			System.out.println("Connection established to MySQL DB");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		finally{
			conn.close();
		}
	}

}
