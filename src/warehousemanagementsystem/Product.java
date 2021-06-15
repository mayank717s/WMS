
package warehousemanagementsystem;


import java.awt.Color;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Product extends javax.swing.JFrame {

    public Product() {
        initComponents();
        SelectProd();
        getCat();
        /**prodtable.setBackground(new Color(0,0,0,0));
        ((DefaultTableCellRenderer)prodtable.getDefaultRenderer(Object.class)).setBackground(new Color(0,0,0,0));
        prodtable.setGridColor(Color.WHITE);
        prodtable.setForeground(Color.WHITE);
        prodtable.setOpaque(false);
        ((DefaultTableCellRenderer)prodtable.getDefaultRenderer(Object.class)).setOpaque(false);
        **/
        
    }

    Connection con =null;
    Statement St = null;
    ResultSet Rs = null;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pname = new javax.swing.JTextField();
        pqty = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pdesc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Catcb = new javax.swing.JComboBox<>();
        addbtn = new javax.swing.JButton();
        updbtn = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        prodtable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jLabel3.setFont(new java.awt.Font("Malgun Gothic", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MANAGE PRODUCT");

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
                .addGap(17, 17, 17)
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
        jLabel4.setText("PID:");

        jLabel5.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 255));
        jLabel5.setText("NAME:");

        jLabel6.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 255));
        jLabel6.setText("QUANTITY:");

        jLabel7.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 255));
        jLabel7.setText("DESCRIPTION:");

        jLabel8.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 255));
        jLabel8.setText("CATEGORY:");

        Catcb.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        Catcb.setForeground(new java.awt.Color(0, 153, 255));

        addbtn.setBackground(new java.awt.Color(0, 153, 255));
        addbtn.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        addbtn.setForeground(new java.awt.Color(255, 255, 255));
        addbtn.setText("ADD");
        addbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbtnMouseClicked(evt);
            }
        });
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        updbtn.setBackground(new java.awt.Color(0, 153, 255));
        updbtn.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        updbtn.setForeground(new java.awt.Color(255, 255, 255));
        updbtn.setText("EDIT");
        updbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updbtnMouseClicked(evt);
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

        jButton4.setBackground(new java.awt.Color(0, 153, 255));
        jButton4.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("BACK");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        prodtable.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        prodtable.setForeground(new java.awt.Color(0, 153, 255));
        prodtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PID", "NAME", "QUANTITY", "DESCRIPTION", "CATEGORY"
            }
        ));
        prodtable.setOpaque(false);
        prodtable.setSelectionBackground(new java.awt.Color(0, 153, 255));
        prodtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prodtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(prodtable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(updbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pid)
                                    .addComponent(pname)
                                    .addComponent(pqty, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                    .addComponent(pdesc)
                                    .addComponent(Catcb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(pqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(pdesc, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(Catcb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addbtn)
                            .addComponent(updbtn)
                            .addComponent(DeleteButton)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(34, 34, 34)
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

public void SelectProd(){
    try{
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wms","root","");
        St= con.createStatement();
        Rs=St.executeQuery("select * from producttbl");
        prodtable.setModel(DbUtils.resultSetToTableModel(Rs));
    }catch(SQLException e){
        e.printStackTrace();
    }
}
private void getCat(){
    try{
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wms","root","");
        St= con.createStatement();
        String query = "select * from categorytbl";
        Rs=St.executeQuery(query);
        while(Rs.next()){
            String MyCat = Rs.getString("CatName");
            Catcb.addItem(MyCat);
        } 
    }catch(Exception e){
        
    }
}
    
    
    private void addbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtnMouseClicked
       try{
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wms","root","");
           PreparedStatement add= con.prepareStatement("insert into producttbl values(?,?,?,?,?)");
           add.setInt(1,Integer.valueOf(pid.getText()));
           add.setString(2,pname.getText());
           add.setString(3,pqty.getText());
           add.setString(4,pdesc.getText());
           add.setString(5,Catcb.getSelectedItem().toString());
           int row = add.executeUpdate();
           JOptionPane.showMessageDialog(this, "Product Successfully Added");
           con.close();
           SelectProd();
       }catch(SQLException e){
           e.printStackTrace();
       }      
    }//GEN-LAST:event_addbtnMouseClicked

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        if(pid.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter Product ID");
        }else{
            try{
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wms","root","");
                String Id = pid.getText();
                String Query = "delete from producttbl where ProdId ="+Id;
                Statement Add = con.createStatement();
                Add.executeUpdate(Query);
                SelectProd();
                     JOptionPane.showMessageDialog(this, "Product deleted successfully!");
            }catch(SQLException e){
            }
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void prodtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prodtableMouseClicked
       DefaultTableModel model = (DefaultTableModel)prodtable.getModel();
       int myindex = prodtable.getSelectedRow();
       pid.setText(model.getValueAt(myindex,0).toString());
       pname.setText(model.getValueAt(myindex,1).toString());
       pqty.setText(model.getValueAt(myindex,2).toString());
       pdesc.setText(model.getValueAt(myindex,3).toString());
       Catcb.setSelectedItem(model.getValueAt(myindex,4).toString());
    }//GEN-LAST:event_prodtableMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
            System.exit(0);       
    }//GEN-LAST:event_jLabel1MouseClicked

    private void updbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updbtnMouseClicked
           if(pid.getText().isEmpty()|| pname.getText().isEmpty()|| pqty.getText().isEmpty()|| pdesc.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "Something Missing!!");
           }else{
               try{
                   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wms","root","");
                   String update= "update producttbl set ProdName='"+pname.getText()+"'"+",ProdQty="+pqty.getText()+""+",ProdDesc='"+pdesc.getText()+"'"+",ProdCat='"+Catcb.getSelectedItem().toString()+"'"+" where ProdId ="+pid.getText();
                   Statement Add = con.createStatement();
                   Add.executeUpdate(update);
                   JOptionPane.showMessageDialog(this, "Product Updated Successfully");
                   SelectProd();
               }catch(Exception e){
                   e.printStackTrace();
               }
           }
    }//GEN-LAST:event_updbtnMouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
       new HomeForm().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton4MouseClicked

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Catcb;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton addbtn;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pdesc;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField pname;
    private javax.swing.JTextField pqty;
    private javax.swing.JTable prodtable;
    private javax.swing.JButton updbtn;
    // End of variables declaration//GEN-END:variables
}