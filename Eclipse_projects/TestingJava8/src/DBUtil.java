import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	static final String oraUser = "system";
	static final String oraPwd = "oracle";
	static final String mysqlUser = "root";
	static final String mysqlPassword = "";
	static final String oraCS = "jdbc:oracle:thin:@localhost:1521:xe";
	static final String mysqlCS = "jdbc:mysql://localhost:3306/example";
	
	public static Connection getConnection(DBType dbType) throws SQLException{
		switch (dbType) {
		case ORADB:
			return DriverManager.getConnection(oraCS, oraUser, oraPwd);
		case MYSQLDB:
			return DriverManager.getConnection(mysqlCS, mysqlUser, mysqlPassword);
		
		default:
			return null;
		}
	} 
	
	public static void showErrorMessage(SQLException e){
		System.err.println("Error :" + e.getMessage());
		System.err.println("Error code :" + e.getErrorCode());
	}
}
