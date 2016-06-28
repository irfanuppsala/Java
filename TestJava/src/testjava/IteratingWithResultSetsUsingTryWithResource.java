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
public class IteratingWithResultSetsUsingTryWithResource {
    public static void main(String[] args) throws SQLException {
        // TODO Auto-generated method stub
     
        try{
            Connection conn = DBUtil.getConnection(DBType.ORADB);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from dba_users");
        
        //String format ="\n";
        while(rs.next()){
            System.out.println(rs.getString("user_id") + " " + rs.getString("username") + " " + rs.getString("password"));
        }
        
        } catch(SQLException e){
                DBUtil.showErrorMessage(e);
        }
    }    
}
