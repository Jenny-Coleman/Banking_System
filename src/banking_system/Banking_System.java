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
        new Sign_In().setVisible(true);
        DBConnection();
    }

    public static void DBConnection() {
        String serverhost = "garyperitus.dyndns.org";
        String serverUname = "remote";
        String serverPswd = "J4v4Gr0up1";
        
        String localhost = "localhost";
        String localUname = "root";
        String localPswd = "root";
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://"+localhost+":3306/bankingdatabase", localUname, localPswd);
            System.out.println("Connection Successful!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection Failed! " + e);
        }
    }
    
}
