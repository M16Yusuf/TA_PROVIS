package SambungDB;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author m16yusuf
 */
public class sambungDatabase {
    String user     = "root";
    String pass     = "";
    String db       = "db10118370nilaisekolah"; 
    String urlValue = "Jdbc:mysql://localhost:3306/"+db;
    String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    Connection con = null;
    public Statement stat  = null;
    
    public sambungDatabase(){
        try{
            Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection(urlValue,user,pass);
            stat = con.createStatement();
        }
        catch (ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Koneksi Gagal "+e.getMessage());
            System.out.println("Koneksi Gagal "+e.toString());
        } 
    }
    
}
