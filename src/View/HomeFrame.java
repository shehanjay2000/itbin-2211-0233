/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.HomeBal;
import Controller.HomeBean;
import Controller.SignupBean;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sheha
 */
public class HomeFrame extends javax.swing.JFrame {
    

    /**
     * Creates new form HomeFrame
     */
    public HomeFrame() {
        initComponents();
        
        loadTable();
    }
    
    //method for load table
    
    public void loadAllDataIntoTable(List<HomeBean> list){
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        
        for (HomeBean bean : list){
            Vector v = new Vector();
            v.add(bean.getId());
            v.add(bean.getFirstName());
            v.add(bean.getLastName());
            v.add(bean.getGender());
            v.add(bean.getCity());
            v.add(bean.getDate());
            v.add(bean.getAddress());
            
            dtm.addRow(v);
        }
    }
    
    public void loadSignupUsersIntoTable(List<SignupBean> list) {
    DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
    dtm.setRowCount(0);

    for (SignupBean bean : list) {
        Vector<Object> v = new Vector<>();
        v.add(bean.getId());
        v.add(bean.getFullName());
        v.add(bean.getEmail());
        dtm.addRow(v);
    }
}

    
    
    public void loadTable(){
        //access those method which selecting all data
        
        HomeBal bal = new HomeBal();
        List list = bal.loadData();
        loadAllDataIntoTable(list);
    }
    
    //create clear method
    public void clearTextFields(){
        
        FirstName.setText("");
        LastName.setText("");
        jDateChooser1.setDate(null);
        jTextAreaAddress.setText("");
       
        
    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        LastName = new javax.swing.JTextField();
        FirstName = new javax.swing.JTextField();
        jComboBoxGender = new javax.swing.JComboBox<>();
        jComboBoxCity = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAddress = new javax.swing.JTextArea();
        jButtonDelete = new javax.swing.JButton();
        jButtonInsert = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 150, 243));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/image/home.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, 0, 420, 140));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 92, 250, 10));

        jLabel9.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Home Page");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Click this button to show user list ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 20, 380, 40));

        jButton5.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 150, 243));
        jButton5.setText("SHOW USER LIST");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1590, 20, 290, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/image/facebook.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, 80, 70));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/image/instagram.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 70, 70));

        jButton1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 150, 243));
        jButton1.setText(" PROJECT MANAGEMENT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1590, 70, 290, 30));

        jLabel13.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Go to the project management");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 70, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1940, 120));

        jPanel3.setBackground(new java.awt.Color(0, 150, 243));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/image/website (2).png"))); // NOI18N
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, 70, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 900, 1940, 130));

        jTable1.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "First Name", "Last Name", "Gender", "City", "Date", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 140, 880, 360));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable2);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 520, 880, 360));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 2), "Home Page", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sylfaen", 1, 18), new java.awt.Color(0, 153, 255))); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 150, 243));
        jLabel4.setText("First name");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 200, 50));

        jLabel5.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 150, 243));
        jLabel5.setText("Last name");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 200, 50));

        jLabel6.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 150, 243));
        jLabel6.setText("Gender");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 200, 50));

        jLabel7.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 150, 243));
        jLabel7.setText("City");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 200, 50));

        jLabel8.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 150, 243));
        jLabel8.setText("Date");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 200, 50));

        jLabel10.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 150, 243));
        jLabel10.setText("Address");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 200, 50));
        jPanel6.add(LastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 590, 50));
        jPanel6.add(FirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 590, 50));

        jComboBoxGender.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jComboBoxGender.setForeground(new java.awt.Color(0, 150, 243));
        jComboBoxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other", " " }));
        jComboBoxGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxGenderActionPerformed(evt);
            }
        });
        jPanel6.add(jComboBoxGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 590, 50));

        jComboBoxCity.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jComboBoxCity.setForeground(new java.awt.Color(0, 150, 243));
        jComboBoxCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Colombo", "Gampaha", "Kaluthara", "Galle", " " }));
        jComboBoxCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCityActionPerformed(evt);
            }
        });
        jPanel6.add(jComboBoxCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 590, 50));
        jPanel6.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 590, 80));

        jTextAreaAddress.setColumns(20);
        jTextAreaAddress.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jTextAreaAddress.setForeground(new java.awt.Color(0, 150, 243));
        jTextAreaAddress.setRows(5);
        jScrollPane1.setViewportView(jTextAreaAddress);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 590, 80));

        jButtonDelete.setBackground(new java.awt.Color(0, 150, 243));
        jButtonDelete.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDelete.setText("DELETE");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jPanel6.add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 660, 290, 60));

        jButtonInsert.setBackground(new java.awt.Color(0, 150, 243));
        jButtonInsert.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jButtonInsert.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInsert.setText("INSERT");
        jButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertActionPerformed(evt);
            }
        });
        jPanel6.add(jButtonInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 590, 290, 60));

        jButtonUpdate.setBackground(new java.awt.Color(0, 150, 243));
        jButtonUpdate.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUpdate.setText("UPDATE");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        jPanel6.add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 590, 290, 60));

        jButtonClear.setBackground(new java.awt.Color(0, 150, 243));
        jButtonClear.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jButtonClear.setForeground(new java.awt.Color(255, 255, 255));
        jButtonClear.setText("CLEAR");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });
        jPanel6.add(jButtonClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 660, 290, 60));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 970, 750));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1940, 1020));

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    int id = 0; //global variable (because through this variable can make updating process)
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        if(row < 0) {
            JOptionPane.showMessageDialog(null, "Please select any record from table for update or delete");
            
            //this code means when there haven't any selected record from table then display this
        }else{
            id = (int) jTable1.getValueAt(row, 0); //getting id from table
            HomeBal bal = new HomeBal();
            HomeBean bean = bal.returnAllDataToTesxtFields(id); //this method has return type
            FirstName.setText(bean.getFirstName());
            LastName.setText(bean.getLastName());
            jComboBoxGender.setSelectedItem(bean.getGender());
            jComboBoxCity.setSelectedItem(bean.getCity());
            jDateChooser1.setDate(bean.getDate());
            jTextAreaAddress.setText(bean.getAddress());
            
            
            
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jComboBoxGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxGenderActionPerformed

    private void jComboBoxCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCityActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        
        String firstName = FirstName.getText();
        String lastName = LastName.getText();
        String gender = (String) jComboBoxGender.getSelectedItem();
        String city = (String) jComboBoxCity.getSelectedItem();
        Date date = jDateChooser1.getDate();
        String address = jTextAreaAddress.getText();
        
        HomeBean bean = new HomeBean(id, firstName, lastName, gender, city, date, address);
        HomeBal bal = new HomeBal();
        bal.updateDate(bean);
        loadTable();
        clearTextFields();
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed
        String firstName = FirstName.getText();
        String lastName = LastName.getText();
        String gender = (String) jComboBoxGender.getSelectedItem();
        String city = (String) jComboBoxCity.getSelectedItem();
        Date date = jDateChooser1.getDate();
        String address = jTextAreaAddress.getText();
        
        HomeBean homeBean = new HomeBean(0, firstName, lastName, gender,  city, date, address);
        
        HomeBal homeObj = new HomeBal();
        homeObj.insert(homeBean);
        loadTable();
        clearTextFields();
    }//GEN-LAST:event_jButtonInsertActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        HomeBal bal = new HomeBal();
        bal.deleteRecord(id);
        loadTable();
        clearTextFields();
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        HomeBal bal = new HomeBal();
        List<SignupBean> list = bal.loadSignupUsers();
        loadSignupUsersIntoTable(list);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        clearTextFields();
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ProjectManagementFrame projectObj = new ProjectManagementFrame();
        projectObj.show();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FirstName;
    private javax.swing.JTextField LastName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBoxCity;
    private javax.swing.JComboBox<String> jComboBoxGender;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextAreaAddress;
    // End of variables declaration//GEN-END:variables
}
