/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpos;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author monir.sobuj
 */
public class DB {
    
    public static Connection dbCon(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/pos?autoReconnect=true&useSSL=false", "root", "1234");
            return con;
        } catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
            return null;
        }
    }
    
}
