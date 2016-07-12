import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Util;

public class TestExceptionHandlingJava {
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try{
			//conn = DBUtil.getConnection(DBType.ORADB);
			conn = DBUtil.getConnection(DBType.MYSQLDB);
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			rs = stmt.executeQuery("select * from users");
			rs.last();
			System.out.println("Total No. of rows :" + rs.getRow());
		} catch(SQLException e){
			DBUtil.showErrorMessage(e);
		}
		finally{
			conn.close();
		}
		
	}
}
