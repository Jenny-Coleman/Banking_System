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

    public static float balance;
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
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String url = "jdbc:ucanaccess://src/BankingDatabase.mdb";
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection Failed! " + e);
        }
    }
    
}
