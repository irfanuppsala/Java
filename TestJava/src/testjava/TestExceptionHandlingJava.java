/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjava;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.jdbc.Util;
/**
 *
 * @author elev4
 */
public class TestExceptionHandlingJava {
    public static void main(String[] args) throws SQLException {
            // TODO Auto-generated method stub

            Connection conn = null;
            Statement stmt = null;
            ResultSet rs = null;
            try{
                conn = DBUtil.getConnection(DBType.ORADB);
                //conn = DBUtil.getConnection(DBType.MYSQLDB);
                stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                rs = stmt.executeQuery("select * from dba_users");
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
