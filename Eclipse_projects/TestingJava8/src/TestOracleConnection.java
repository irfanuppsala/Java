import java.sql.*;

public class TestOracleConnection {

	static final String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
	static final String username = "system";
	static final String password = "oracle";
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection conn = DriverManager.getConnection(dbUrl, username, password);
		System.out.println("Connection to Oracle database hase been established Successfully!");
	}

}
