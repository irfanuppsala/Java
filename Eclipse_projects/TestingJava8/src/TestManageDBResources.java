import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class TestManageDBResources {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		try {
			//conn = DBUtil.getConnection(DBType.ORADB);
			conn = DBUtil.getConnection(DBType.MYSQLDB);
			
			System.out.println("Connection established to Mysql DB");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		finally{
			conn.close();
		}
	}

}
