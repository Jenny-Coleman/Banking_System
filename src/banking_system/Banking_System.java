/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking_system;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Banking_System {

    public static double balance;
    public static Connection conn;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new SignIn().setVisible(true);
        DBConnection();
    }

    public static void DBConnection() {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://garyperitus.dyndns.org:3306/bankingdatabase", "remote", "J4v4Gr0up1");
            System.out.println("Connection Successful!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection Failed! " + e);
        }
    }
    
}
