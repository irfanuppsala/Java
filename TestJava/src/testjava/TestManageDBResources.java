/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjava;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author elev4
 */
public class TestManageDBResources {
    public static void main(String[] args) throws SQLException {
            // TODO Auto-generated method stub

            Connection conn = null;
            try {
                    conn = DBUtil.getConnection(DBType.ORADB);
                    //conn = DBUtil.getConnection(DBType.MYSQLDB);

                    System.out.println("Connection established to ORA DB");
            } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    System.err.println(e.getMessage());
            }
            finally{
                    conn.close();
            }
    }    
}
