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

/**
 *
 * @author elev4
 */
public class TestStaticSQLStatement {
    public static void main(String[] args) throws SQLException {
        // TODO Auto-generated method stub
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        try{
            conn = DBUtil.getConnection(DBType.MYSQLDB);
            //conn = DBUtil.getConnection(DBType.MYSQLDB);
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery("select * from users");
            rs.last();
            System.out.println("Total No. of rows :" + rs.getRow());
        } catch(SQLException e){
                DBUtil.showErrorMessage(e);
        }
        finally{
            if(rs != null)    
            rs.close();
            if(stmt != null)    
            stmt.close();
            if(conn != null)    
            conn.close();                        
        }
    }    
}
