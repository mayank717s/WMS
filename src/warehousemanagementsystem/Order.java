
package warehousemanagementsystem;
import java.awt.Color;
import java.sql.*;
import java.time.format.DateTimeFormatter;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.time.LocalDateTime;
import java.util.Vector;

public class Order extends javax.swing.JFrame {

    public Order() {
        initComponents();
        SelectProd();
        SelectCust();
        GetToday();
    }

    Connection con =null;
    Statement St = null;
    ResultSet Rs = null;
    
    @SuppressWarnings("Unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        custnamel = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        datel = new javax.swing.JLabel();
        amt = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        addbtn = new javax.swing.JButton();
        updbtn = new javax.swing.JButton();
        print = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        prodtable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        Customertable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        OrID = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        billtbl = new javax.swing.JTable();
        qid1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Addtoquant = new javax.swing.JButton();
        rs = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

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
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(26, 26, 26))
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

        jPanel3.setBackground(new java.awt.Color(255, 0, 51));

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

        custnamel.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        custnamel.setForeground(new java.awt.Color(0, 153, 255));
        custnamel.setText("CustName");

        price.setSelectionColor(new java.awt.Color(255, 255, 255));

        datel.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        datel.setForeground(new java.awt.Color(0, 153, 255));
        datel.setText("Date");

        amt.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        amt.setForeground(new java.awt.Color(0, 153, 255));
        amt.setText("Amount");

        jLabel8.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 255));
        jLabel8.setText("Date:");

        addbtn.setBackground(new java.awt.Color(0, 153, 255));
        addbtn.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        addbtn.setForeground(new java.awt.Color(255, 255, 255));
        addbtn.setText("Add Orders");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        updbtn.setBackground(new java.awt.Color(0, 153, 255));
        updbtn.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        updbtn.setForeground(new java.awt.Color(255, 255, 255));
        updbtn.setText("View Orders");

        print.setBackground(new java.awt.Color(0, 153, 255));
        print.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        print.setForeground(new java.awt.Color(255, 255, 255));
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 153, 255));
        jButton4.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
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

        Customertable.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        Customertable.setForeground(new java.awt.Color(0, 153, 255));
        Customertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CUSTID", "NAME", "PHONE NO."
            }
        ));
        Customertable.setGridColor(new java.awt.Color(0, 153, 255));
        Customertable.setSelectionBackground(new java.awt.Color(0, 153, 255));
        Customertable.getTableHeader().setResizingAllowed(false);
        Customertable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomertableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Customertable);

        jLabel9.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 255));
        jLabel9.setText("Product List");

        jLabel10.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 255));
        jLabel10.setText("Customer List");

        jLabel11.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 255));
        jLabel11.setText("OrderID");

        jLabel12.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 255));
        jLabel12.setText("CustomerName");

        OrID.setForeground(new java.awt.Color(0, 153, 255));

        jLabel13.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 255));
        jLabel13.setText("Price");

        billtbl.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        billtbl.setForeground(new java.awt.Color(0, 153, 255));
        billtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S.No.", "Product", "Quantity", "Price", "Total"
            }
        ));
        billtbl.setOpaque(false);
        billtbl.setSelectionBackground(new java.awt.Color(0, 153, 255));
        billtbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billtblMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(billtbl);

        jLabel14.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 255));
        jLabel14.setText("Quantity");

        Addtoquant.setBackground(new java.awt.Color(0, 153, 255));
        Addtoquant.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        Addtoquant.setForeground(new java.awt.Color(255, 255, 255));
        Addtoquant.setText("AddToOrder");
        Addtoquant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddtoquantActionPerformed(evt);
            }
        });

        rs.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        rs.setForeground(new java.awt.Color(0, 153, 255));
        rs.setText("RS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(custnamel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 283, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(OrID, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13)
                                .addGap(32, 32, 32)))
                        .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(qid1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Addtoquant)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(229, 229, 229)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(539, 539, 539))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(addbtn))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(updbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(datel))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(print)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rs)
                                .addGap(18, 18, 18)
                                .addComponent(amt)
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(OrID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(custnamel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(qid1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(Addtoquant))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(datel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addbtn)
                            .addComponent(updbtn))
                        .addGap(172, 172, 172)
                        .addComponent(jButton4)
                        .addGap(236, 236, 236))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(print)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(amt)
                                .addComponent(rs)))
                        .addGap(246, 246, 246)))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
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
 private void GetToday(){
     DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
     LocalDateTime now = LocalDateTime.now();
     datel.setText(dtf.format(now));
 }
 private void update() 
         {
         int newqty = olqty - Integer.valueOf(qid1.getText());
         try{
                   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wms","root","");
                   String update= "update producttbl set ProdQty="+newqty+" where ProdId ="+productid;
                   Statement Add = con.createStatement();
                   Add.executeUpdate(update);

                   SelectProd();
                   SelectCust();
               }catch(Exception e){
                   e.printStackTrace();
               }
         }
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
try{
        billtbl.print();
    }catch(Exception exp)
    {
        exp.printStackTrace();
    }
    }//GEN-LAST:event_printActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
 new HomeForm().setVisible(true);
 this.dispose();
    }//GEN-LAST:event_jButton4MouseClicked
int flag = 0, productid, olqty;
    private void prodtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prodtableMouseClicked
        DefaultTableModel model = (DefaultTableModel)prodtable.getModel();
       int myindex = prodtable.getSelectedRow();
       productid = Integer.valueOf(model.getValueAt(myindex,0).toString());
       Prodname = (model.getValueAt(myindex,1).toString());
       olqty = Integer.valueOf(model.getValueAt(myindex,2).toString());
       //pqty.setText(model.getValueAt(myindex,2).toString());
       //pdesc.setText(model.getValueAt(myindex,3).toString());
       flag = 1;
    }//GEN-LAST:event_prodtableMouseClicked

    private void CustomertableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomertableMouseClicked
DefaultTableModel model = (DefaultTableModel)Customertable.getModel();
       int myindex =  Customertable.getSelectedRow();
       custnamel.setText(model.getValueAt(myindex,1).toString());
       //Custname.setText(model.getValueAt(myindex,1).toString());  
       //CustPno.setText(model.getValueAt(myindex,3).toString());
    }//GEN-LAST:event_CustomertableMouseClicked

    private void billtblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billtblMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_billtblMouseClicked
int i =1, Uprice, tot=0, total;
String Prodname;
    private void AddtoquantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddtoquantActionPerformed
      if(flag == 0 || qid1.getText().isEmpty() || price.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Select Product and Enter Qty");
        }else{
        
        Uprice = Integer.valueOf(price.getText());
        tot= Uprice * Integer.valueOf(qid1.getText());
        Vector v = new Vector();
        v.add(i);
        v.add(Prodname);
        v.add(qid1.getText());
        v.add(Uprice);
        v.add(tot);
        DefaultTableModel dt = (DefaultTableModel)billtbl.getModel();
        dt.addRow(v);
        total = total + tot;
        amt.setText(""+total);
        update();
        i++;
        
        }
    }//GEN-LAST:event_AddtoquantActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
    if(OrID.getText().isEmpty()){
    JOptionPane.showMessageDialog(this, "Pleas Enter OrderID!");
    }
    else{ 
        try{
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wms","root","");
           PreparedStatement add= con.prepareStatement("insert into odertbl values(?,?,?,?)");
           add.setInt(1,Integer.valueOf(OrID.getText()));
           add.setString(2,custnamel.getText());
           add.setString(3,datel.getText());
           add.setInt(4,Integer.valueOf(amt.getText()));
           int row = add.executeUpdate();
           JOptionPane.showMessageDialog(this, "Order Successfully Added");
           con.close();
           SelectProd();
       }catch(SQLException e){
           e.printStackTrace();
       }
    }       // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addtoquant;
    private javax.swing.JTable Customertable;
    private javax.swing.JTextField OrID;
    private javax.swing.JButton addbtn;
    private javax.swing.JLabel amt;
    private javax.swing.JTable billtbl;
    private javax.swing.JLabel custnamel;
    private javax.swing.JLabel datel;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField price;
    private javax.swing.JButton print;
    private javax.swing.JTable prodtable;
    private javax.swing.JTextField qid1;
    private javax.swing.JLabel rs;
    private javax.swing.JButton updbtn;
    // End of variables declaration//GEN-END:variables
}
