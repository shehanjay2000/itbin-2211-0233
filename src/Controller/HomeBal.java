/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DBconnection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author sheha
 */
public class HomeBal {
    
    //create method for load,read data from employee table
    
    public List<HomeBean> loadData(){
        List<HomeBean> list = new ArrayList<HomeBean>();
        try{
            //queryto select all data from employee table
            
            String query = "SELECT * FROM employee";
            PreparedStatement ps = DBconnection.con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt("Id");
                String firstName = rs.getString("FirstName");
                String lastname = rs.getString("LastName");
                String gender = rs.getString("Gender");
                String city = rs.getString("City");
                Date date = rs.getDate("Date");
                String address = rs.getString("Address");
                
                //create homebean object
                HomeBean bean = new HomeBean(id, firstName, lastname, gender, city, date, address);
                list.add(bean); //add bean in list
                
            }
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, ""+e);
        }
        return list;
    }
    
    //method for insert data
    public void insert(HomeBean homeBean){
        
        //inserting         
        try{
            //insert query
            String query = "INSERT INTO employee VALUES (null, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = DBconnection.con.prepareStatement(query);
            ps.setString(1, homeBean.getFirstName());
            ps.setString(2, homeBean.getLastName());
            ps.setString(3, homeBean.getGender());
            ps.setString(4, homeBean.getCity());
            ps.setObject(5, homeBean.getDate());
            ps.setString(6, homeBean.getAddress());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "A record has been inserted!!");
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, ""+e);
        }
    }
    
    //method for get data on click in table
    
    public HomeBean returnAllDataToTesxtFields(int id){
        HomeBean bean = null;
        try {
            String query = "SELECT * FROM employee WHERE Id = "+id;
            PreparedStatement ps = DBconnection.con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                
                int ids = rs.getInt("Id");
                String firstName = rs.getString("FirstName");
                String lastname = rs.getString("LastName");
                String gender = rs.getString("Gender");
                String city = rs.getString("City");
                Date date = rs.getDate("Date");
                String address = rs.getString("Address");
                bean = new HomeBean(ids, firstName, lastname , gender, city, date, address);
                
                
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, ""+e);
        }
        return bean;
    }
        
        //method for update
    public void updateDate(HomeBean bean){
        try {
            String query = "UPDATE employee SET FirstName = ?, LastName = ?, Gender = ?, City = ?, Date = ?, Address = ? WHERE Id = ?";
            PreparedStatement ps = DBconnection.con.prepareStatement(query);
            ps.setString(1, bean.getFirstName());
            ps.setString(2, bean.getLastName());
            ps.setString(3, bean.getGender());
            ps.setString(4, bean.getCity());
            ps.setObject(5, bean.getDate());
            ps.setString(6, bean.getAddress());
            ps.setInt(7, bean.getId());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "A record has been updated !!");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, ""+e);
        }
    }
    
    //delete method
    public void deleteRecord(int id){
        try {
            String query = "DELETE FROM employee WHERE Id = ?";
            PreparedStatement ps = DBconnection.con.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "A record has been deleted !!");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, ""+e);
        }
    }
    
    


    public List<SignupBean> loadSignupUsers() {
   List<SignupBean> list = new ArrayList<>();
    try {
        String query = "SELECT SignupId, FullName, Email FROM signup";
        PreparedStatement ps = DBconnection.con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int id = rs.getInt("SignupId");
            String fullName = rs.getString("FullName");
            String email = rs.getString("Email");
            SignupBean bean = new SignupBean(id, fullName, email);
            list.add(bean);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e);
    }
    return list;
    }

    
    }

