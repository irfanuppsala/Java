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
public class ResultSetScrollingDemo {
    public static void main(String[] args) throws SQLException {
        // TODO Auto-generated method stub
     
        try{
            Connection conn = DBUtil.getConnection(DBType.MYSQLDB);
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("select * from users limit 10");
            
        
        //String format ="\n";
        rs.beforeFirst();
        System.out.println("First 10 Rows: ");
        while(rs.next()){
            System.out.println(rs.getString("userid") + " " + rs.getString("uname") + " " + rs.getString("password"));
        }
        System.out.println("\n");
        
        rs.afterLast();
        System.out.println("Last 10 Rows: ");
        while(rs.previous()){
            System.out.println(rs.getString("userid") + " " + rs.getString("uname") + " " + rs.getString("password"));
        }
        System.out.println("\n");
        
        rs.first();
        System.out.println("First record: ");
        System.out.println(rs.getString("userid") + " " + rs.getString("uname") + " " + rs.getString("password"));
        System.out.println("\n");
        
        rs.last();
        System.out.println("Last record: ");
        System.out.println(rs.getString("userid") + " " + rs.getString("uname") + " " + rs.getString("password"));
        System.out.println("\n");
        
        rs.absolute(4);
        System.out.println("Record at 4th Row: ");
        System.out.println(rs.getString("userid") + " " + rs.getString("uname") + " " + rs.getString("password"));
        System.out.println("\n");
        
        rs.relative(2);
        System.out.println("Record at 6th Row: ");
        System.out.println(rs.getString("userid") + " " + rs.getString("uname") + " " + rs.getString("password"));
        System.out.println("\n");
        
        rs.relative(-4);
        System.out.println("Record at 2nd Row: ");
        System.out.println(rs.getString("userid") + " " + rs.getString("uname") + " " + rs.getString("password"));
        
        } catch(SQLException e){
                DBUtil.showErrorMessage(e);
        }
    }    
}
