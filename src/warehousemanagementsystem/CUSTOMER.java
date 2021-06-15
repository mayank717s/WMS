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
import static javax.swing.UIManager.getInt;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author mayan
 */
public class CUSTOMER extends javax.swing.JFrame {

    /**
     * Creates new form CUSTOMER
     */
    public CUSTOMER() {
        initComponents();
        SelectCust();
    }

    Connection con =null;
    Statement St = null;
    ResultSet Rs = null;
    Statement St1 = null;
    ResultSet Rs1 = null;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        CustId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Custname = new javax.swing.JTextField();
        CustPno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Addbutton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        HomeButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Customertable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        clb = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        amt = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jLabel3.setFont(new java.awt.Font("Malgun Gothic", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MANAGE CUSTOMER");

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
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addContainerGap(14, Short.MAX_VALUE))
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
        jLabel4.setText("CUSTID:");

        jLabel5.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 255));
        jLabel5.setText("NAME:");

        jLabel6.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 255));
        jLabel6.setText("PHONE NO:");

        Addbutton.setBackground(new java.awt.Color(0, 153, 255));
        Addbutton.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        Addbutton.setForeground(new java.awt.Color(255, 255, 255));
        Addbutton.setText("ADD");
        Addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbuttonActionPerformed(evt);
            }
        });

        EditButton.setBackground(new java.awt.Color(0, 153, 255));
        EditButton.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        EditButton.setForeground(new java.awt.Color(255, 255, 255));
        EditButton.setText("EDIT");
        EditButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditButtonMouseClicked(evt);
            }
        });
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });

        DeleteButton.setBackground(new java.awt.Color(0, 153, 255));
        DeleteButton.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        DeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        DeleteButton.setText("DELETE");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        HomeButton.setBackground(new java.awt.Color(0, 153, 255));
        HomeButton.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        HomeButton.setForeground(new java.awt.Color(255, 255, 255));
        HomeButton.setText("BACK");
        HomeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeButtonMouseClicked(evt);
            }
        });

        Customertable.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        Customertable.setForeground(new java.awt.Color(0, 153, 255));
        Customertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CUSTID", "NAME", "PHONE NO."
            }
        ));
        Customertable.setGridColor(new java.awt.Color(255, 255, 255));
        Customertable.setSelectionBackground(new java.awt.Color(0, 153, 255));
        Customertable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomertableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Customertable);

        jPanel4.setBackground(new java.awt.Color(153, 204, 255));

        clb.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        clb.setForeground(new java.awt.Color(255, 255, 255));
        clb.setText("0");

        jPanel5.setBackground(new java.awt.Color(102, 153, 255));

        jLabel7.setBackground(new java.awt.Color(255, 51, 51));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Order Number");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(clb)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(clb)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(153, 204, 255));

        amt.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        amt.setForeground(new java.awt.Color(255, 255, 255));
        amt.setText("Amount");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("RS");

        jPanel7.setBackground(new java.awt.Color(102, 153, 255));

        jLabel2.setBackground(new java.awt.Color(255, 51, 51));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Order Amount");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(amt, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(amt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(Addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(CustId)
                                .addComponent(Custname)
                                .addComponent(CustPno, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)))
                        .addGap(120, 120, 120)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 28, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(CustId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Custname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(CustPno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Addbutton)
                            .addComponent(EditButton)
                            .addComponent(DeleteButton)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(HomeButton)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 public void SelectCust(){
    try{
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wms","root","");
        St= con.createStatement();
        Rs=St.executeQuery("select * from customertbl");
        Customertable.setModel(DbUtils.resultSetToTableModel(Rs));
    }catch(SQLException e){
        e.printStackTrace();
    }
}
    private void AddbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbuttonActionPerformed
 try{
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wms","root","");
           PreparedStatement add= con.prepareStatement("insert into customertbl values(?,?,?)");
           add.setInt(1,Integer.valueOf(CustId.getText()));
           add.setString(2, Custname.getText());
           add.setString(3, CustPno.getText());
           int row = add.executeUpdate();
           JOptionPane.showMessageDialog(this, "Customer Successfully Added");
           con.close();
           SelectCust();
       }catch(SQLException e){
           e.printStackTrace();
       }            // TODO add your handling code here:
    }//GEN-LAST:event_AddbuttonActionPerformed

    private void CustomertableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomertableMouseClicked
DefaultTableModel model = (DefaultTableModel)Customertable.getModel();
       int myindex =  Customertable.getSelectedRow();
       CustId.setText(model.getValueAt(myindex,0).toString());
       Custname.setText(model.getValueAt(myindex,1).toString());  
       CustPno.setText(model.getValueAt(myindex,2).toString());
       try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wms","root","");
            St = con.createStatement();
            St1 = con.createStatement();
            Rs = St.executeQuery("Select count(*) from odertbl where CustName='"+model.getValueAt(myindex, 1).toString()+"'");
            Rs1 = St1.executeQuery("Select sum(Amount) from odertbl where CustName='"+model.getValueAt(myindex,1).toString()+"'");
            while (Rs.next()){
                clb.setText(""+Rs.getInt(1));
            }
            while(Rs1.next()){
                amt.setText(""+Rs1.getInt(1));
            }
                   
       }catch(Exception e){
           e.printStackTrace();
       }
// TODO add your handling code here:
    }//GEN-LAST:event_CustomertableMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
    if(CustId.getText().isEmpty()|| Custname.getText().isEmpty() || CustPno.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "Something Missing!!");
           }else{
               try{
                   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wms","root","");
                   String update= "update customertbl set CustName='"+Custname.getText()+"'"+",CustPno='"+CustPno.getText()+"'"+" where CustID ="+CustId.getText();
                   Statement Add = con.createStatement();
                   Add.executeUpdate(update);
                   JOptionPane.showMessageDialog(this, "Category Updated Successfully");
                   SelectCust();
               }catch(Exception e){
                   e.printStackTrace();
               }
           }        // TODO add your handling code here:
    }//GEN-LAST:event_EditButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
   if(CustId.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter Customer ID");
        }else{
            try{
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wms","root","");
                String Id = CustId.getText();
                String Query = "delete from customertbl where CustID ="+Id;
                Statement Add = con.createStatement();
                Add.executeUpdate(Query);
                SelectCust();
                     JOptionPane.showMessageDialog(this, "Customer has been deleted successfully");
            }catch(SQLException e){
            }
        }          // TODO add your handling code here:
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void EditButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditButtonMouseClicked
    if(CustId.getText().isEmpty()|| Custname.getText().isEmpty() || CustPno.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "Something Missing!!");
           }else{
               try{
                   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wms","root","");
                   String update= "update customertbl set CustName='"+Custname.getText()+"'"+",CustPno="+CustPno.getText()+"where CatId ="+CustId.getText();
                   Statement Add = con.createStatement();
                   Add.executeUpdate(update);
                   JOptionPane.showMessageDialog(this, "Category Updated Successfully");
                   SelectCust();
               }catch(Exception e){
                   e.printStackTrace();
               }
           }      // TODO add your handling code here:
    }//GEN-LAST:event_EditButtonMouseClicked

    private void HomeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeButtonMouseClicked
 new HomeForm().setVisible(true);
 this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_HomeButtonMouseClicked

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
            java.util.logging.Logger.getLogger(CUSTOMER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CUSTOMER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CUSTOMER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CUSTOMER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CUSTOMER().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbutton;
    private javax.swing.JTextField CustId;
    private javax.swing.JTextField CustPno;
    private javax.swing.JTextField Custname;
    private javax.swing.JTable Customertable;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JButton HomeButton;
    private javax.swing.JLabel amt;
    private javax.swing.JLabel clb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
