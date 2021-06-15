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
public class Category extends javax.swing.JFrame {

    /**
     * Creates new form Category
     */
    public Category() {
        initComponents();
        SelectCat();
    }
    Connection con =null;
    Statement St = null;
    ResultSet Rs = null;
    
    @SuppressWarnings("unchecked")
    public void SelectCat(){
    try{
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wms","root","");
        St= con.createStatement();
        Rs=St.executeQuery("select * from categorytbl");
        categorytable.setModel(DbUtils.resultSetToTableModel(Rs));
    }catch(SQLException e){
        e.printStackTrace();
    }
}
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        CatID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CatName = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        homebutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        categorytable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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
        jLabel4.setText("CAT ID:");

        jLabel5.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 255));
        jLabel5.setText("CAT NAME:");

        AddButton.setBackground(new java.awt.Color(0, 153, 255));
        AddButton.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        AddButton.setForeground(new java.awt.Color(255, 255, 255));
        AddButton.setText("ADD");
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddButtonMouseClicked(evt);
            }
        });

        EditButton.setBackground(new java.awt.Color(0, 153, 255));
        EditButton.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        EditButton.setForeground(new java.awt.Color(255, 255, 255));
        EditButton.setText("EDIT");
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });

        DeleteButton.setBackground(new java.awt.Color(0, 153, 255));
        DeleteButton.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        DeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        DeleteButton.setText("DELETE");
        DeleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteButtonMouseClicked(evt);
            }
        });

        homebutton.setBackground(new java.awt.Color(0, 153, 255));
        homebutton.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        homebutton.setForeground(new java.awt.Color(255, 255, 255));
        homebutton.setText("BACK");
        homebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homebuttonMouseClicked(evt);
            }
        });

        categorytable.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        categorytable.setForeground(new java.awt.Color(0, 153, 255));
        categorytable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CATID", "CATNAME"
            }
        ));
        categorytable.setGridColor(new java.awt.Color(255, 255, 255));
        categorytable.setSelectionBackground(new java.awt.Color(0, 153, 255));
        categorytable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categorytableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(categorytable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CatID, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                    .addComponent(CatName)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(83, 83, 83)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(homebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(CatID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(CatName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddButton)
                            .addComponent(DeleteButton)
                            .addComponent(EditButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(homebutton)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(164, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jLabel3.setFont(new java.awt.Font("Malgun Gothic", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MANAGE CATEGORIES");

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
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseClicked
 try{
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wms","root","");
           PreparedStatement add= con.prepareStatement("insert into categorytbl values(?,?)");
           add.setInt(1,Integer.valueOf(CatID.getText()));
           add.setString(2, CatName.getText());
           int row = add.executeUpdate();
           JOptionPane.showMessageDialog(this, "Category Successfully Added");
           con.close();
           SelectCat();
       }catch(SQLException e){
           e.printStackTrace();
       }             // TODO add your handling code here:
    }//GEN-LAST:event_AddButtonMouseClicked

    private void categorytableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categorytableMouseClicked
DefaultTableModel model = (DefaultTableModel)categorytable.getModel();
       int myindex = categorytable.getSelectedRow();
       CatID.setText(model.getValueAt(myindex,0).toString());
       CatName.setText(model.getValueAt(myindex,1).toString());
    }//GEN-LAST:event_categorytableMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void DeleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButtonMouseClicked
if(CatID.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter Category ID");
        }else{
            try{
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wms","root","");
                String Id = CatID.getText();
                String Query = "delete from categorytbl where CatID ="+Id;
                Statement Add = con.createStatement();
                Add.executeUpdate(Query);
                SelectCat();
                     JOptionPane.showMessageDialog(this, "Category has been deleted successfully");
            }catch(SQLException e){
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteButtonMouseClicked

    private void homebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homebuttonMouseClicked
     new HomeForm().setVisible(true);
 this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_homebuttonMouseClicked

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
if(CatID.getText().isEmpty()|| CatName.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "Something Missing!!");
           }else{
               try{
                   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wms","root","");
                   String update= "update categorytbl set CatName='"+CatName.getText()+"'"+"where CatId ="+CatID.getText();
                   Statement Add = con.createStatement();
                   Add.executeUpdate(update);
                   JOptionPane.showMessageDialog(this, "Category Updated Successfully");
                   SelectCat();
               }catch(Exception e){
                   e.printStackTrace();
               }
           }        // TODO add your handling code here:
    }//GEN-LAST:event_EditButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Category().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTextField CatID;
    private javax.swing.JTextField CatName;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JTable categorytable;
    private javax.swing.JButton homebutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
