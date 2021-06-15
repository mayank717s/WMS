/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warehousemanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author mayan
 */
public class User extends javax.swing.JFrame {

    /**
     * Creates new form User
     */
    public User() {
        initComponents();
        SelectUser();
    }
    Connection con =null;
    Statement St = null;
    ResultSet Rs = null;
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        upass = new javax.swing.JTextField();
        upno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        addbutton = new javax.swing.JButton();
        editbutton = new javax.swing.JButton();
        deletebutton = new javax.swing.JButton();
        homebutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        usertbl = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jLabel3.setFont(new java.awt.Font("Malgun Gothic", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MANAGE USERS");

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 255));
        jLabel4.setText("USER NAME:");

        jLabel5.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 255));
        jLabel5.setText("PASSWORD:");

        jLabel6.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 255));
        jLabel6.setText("PHONE NO:");

        addbutton.setBackground(new java.awt.Color(0, 153, 255));
        addbutton.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        addbutton.setForeground(new java.awt.Color(255, 255, 255));
        addbutton.setText("ADD");
        addbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbuttonMouseClicked(evt);
            }
        });

        editbutton.setBackground(new java.awt.Color(0, 153, 255));
        editbutton.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        editbutton.setForeground(new java.awt.Color(255, 255, 255));
        editbutton.setText("EDIT");
        editbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbuttonActionPerformed(evt);
            }
        });

        deletebutton.setBackground(new java.awt.Color(0, 153, 255));
        deletebutton.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        deletebutton.setForeground(new java.awt.Color(255, 255, 255));
        deletebutton.setText("DELETE");
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });

        homebutton.setBackground(new java.awt.Color(0, 153, 255));
        homebutton.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        homebutton.setForeground(new java.awt.Color(255, 255, 255));
        homebutton.setText("BACK");
        homebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebuttonActionPerformed(evt);
            }
        });

        usertbl.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        usertbl.setForeground(new java.awt.Color(0, 153, 255));
        usertbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UNAME", "PASSWORD", "PHONE NO."
            }
        ));
        usertbl.setGridColor(new java.awt.Color(255, 255, 255));
        usertbl.setSelectionBackground(new java.awt.Color(0, 153, 255));
        usertbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usertblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(usertbl);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(upass, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(upno, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deletebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(upass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(upno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addbutton)
                            .addComponent(editbutton)
                            .addComponent(deletebutton)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(homebutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 public void SelectUser(){
    try{
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wms","root","");
        St= con.createStatement();
        Rs=St.executeQuery("select * from usrtbl");
        usertbl.setModel(DbUtils.resultSetToTableModel(Rs));
    }catch(SQLException e){
        e.printStackTrace();
    }
}
    private void addbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbuttonMouseClicked
     if(uname.getText().isEmpty()|| upass.getText().isEmpty() || upno.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "Something Missing!!");
           }else{    
                try{
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wms","root","");
                     PreparedStatement add= con.prepareStatement("insert into usrtbl values(?,?,?)");
                     add.setString(1,(uname.getText()));
                     add.setString(2, upass.getText());
                     add.setString(3, upno.getText());
                     int row = add.executeUpdate();
                     JOptionPane.showMessageDialog(this, "User Successfully Added");
                    con.close();
                    SelectUser();
       }catch(SQLException e){
           e.printStackTrace();
       }    }  
    }//GEN-LAST:event_addbuttonMouseClicked

    private void editbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbuttonActionPerformed
       if(uname.getText().isEmpty()|| upass.getText().isEmpty() || upno.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "Something Missing!!");
           }else{    
       try{
                   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wms","root","");
                   String update= "update usrtbl set Uname='"+uname.getText()+"'"+",Upass='"+upass.getText()+"'"+" where Uphone ="+upno.getText();
                   Statement Add = con.createStatement();
                   Add.executeUpdate(update);
                   JOptionPane.showMessageDialog(this, "User Updated Successfully");
                   SelectUser();
               }catch(Exception e){
                   e.printStackTrace();
               }
       } // TODO add your handling code here:
    }//GEN-LAST:event_editbuttonActionPerformed

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
if(upno.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter User Phone No,");
        }else{
            try{
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wms","root","");
                String Id = upno.getText();
                String Query = "delete from usrtbl where Uphone ="+"'"+Id+"'";
                Statement Add = con.createStatement();
                Add.executeUpdate(Query);
                SelectUser();
                     JOptionPane.showMessageDialog(this, "Customer has been deleted successfully");
            }catch(SQLException e){
            }
        }             // TODO add your handling code here:
    }//GEN-LAST:event_deletebuttonActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void usertblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usertblMouseClicked
       DefaultTableModel model = (DefaultTableModel)usertbl.getModel();
       int myindex =  usertbl.getSelectedRow();
       uname.setText(model.getValueAt(myindex,0).toString());
       upass.setText(model.getValueAt(myindex,1).toString());  
       upno.setText(model.getValueAt(myindex,2).toString());        // TODO add your handling code here:
    }//GEN-LAST:event_usertblMouseClicked

    private void homebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebuttonActionPerformed
new HomeForm().setVisible(true);
 this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_homebuttonActionPerformed

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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbutton;
    private javax.swing.JButton deletebutton;
    private javax.swing.JButton editbutton;
    private javax.swing.JButton homebutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField uname;
    private javax.swing.JTextField upass;
    private javax.swing.JTextField upno;
    private javax.swing.JTable usertbl;
    // End of variables declaration//GEN-END:variables
}
