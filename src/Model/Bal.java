/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JoptionPane;


/**
 *
 * @author sheha
 */
public class Bal {
    
    public void insertDataSignup(Bean beanObj){
        Connection con = null;
        Statement stmt = null;
        
        
        try {
            con = DBconnection.loadConnection();
            //create query for inserting signup data
            String query = "INSERT INTO signup (fullName, email, password) VALUES ('" +
                                        beanObj.getFullName() + "', '" + 
                                        beanObj.getEmail() + "', '" +
                                        beanObj.getPassword() + "')";
            
            stmt = con.createStatement();
            stmt.executeUpdate(query);
            
            JOptionPane.showMessageDialog(null, "You have signup successfully, Start login!!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error:" +e);
        }
    } 
    
    // method which will check data from signup table
    public boolean checkLogin(String email, String pass){
        boolean b = false;
        try {
            //create query
            String query = "SELECT Email, Password FROM signup WHERE  Email = '"+email+"' AND Password = '"+pass+"'";
            Statement st = DBconnection.con.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            if(rs.next()) {
                b = true;
            } else{
                JOptionPane.showMessageDialog(null, "Invalid email or password ,try again!!");
            } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" +e);
        }
        return b;
    }
}
