/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package North_Library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Balsara
 */
public class conn {
    
    String path, mysql_username, mysql_pass;
    
    void setSettings(String v1, String v2, String v3)
    {
        path = v1;
        mysql_username = v2;
        mysql_pass = v3;
    }
    
    Connection connect(String v1, String v2, String v3)
    {
        this.path = v1;
        this.mysql_username = v2;
        this.mysql_pass = v3;
        
        try
        {
            System.out.println("Registering driver...");
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connecting to selected database...");
            Connection conn = DriverManager.getConnection("jdbc:mysql://"+path, mysql_username, mysql_pass);
            System.out.println("Connected successfully!");
            
            Statement s = conn.createStatement();
            s.executeUpdate("create database if not exists lib");
            System.out.println("Database created.");
            s.executeUpdate("use lib");
            
            return conn;
        }
        
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
    
}
