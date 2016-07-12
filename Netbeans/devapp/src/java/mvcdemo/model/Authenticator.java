/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcdemo.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author elev4
 */
 
public class Authenticator {
 
	public String authenticate(String username, String password) throws SQLException {
//		if (("prasad".equalsIgnoreCase(username))
//				&& ("password".equals(password))) {
//			return "success";
//		} else {
//			return "failure";
//		}

        // TODO Auto-generated method stub
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String val="";
        
        try{
            conn = DBUtil.getConnection(DBType.MYSQLDB);
            stmt = conn.createStatement();
            //rs = stmt.executeQuery("select * from users where username=username and password=password");
            //rs.next();
            //System.out.println("Total No. of rows :" + rs.getRow());
            //if ((rs.getString("username").equalsIgnoreCase(username)) && ("password".equals(password))) {
            if (("prasad".equalsIgnoreCase(username)) && ("password".equals(password))) {
            val="success";
        }else{
            val="failure";
        }

        } catch(SQLException e){
                DBUtil.showErrorMessage(e);
        }
        return val;
    }
}

