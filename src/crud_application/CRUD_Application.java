/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_application;

import Model.DBconnection;
import View.LoginFrame;


public class CRUD_Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create object of that login frame for show when running this project to show login frame first..
        LoginFrame loginObj = new LoginFrame();
        loginObj.show();
        
        DBconnection.loadConnection(); //calling load method in main class
    }
    
}
