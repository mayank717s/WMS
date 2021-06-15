/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warehousemanagementsystem;

/**
 *
 * @author mayan
 */
public class splash extends javax.swing.JFrame {

    /**
     * Creates new form splash
     */
    public splash() {
        initComponents();
      
   
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Percentage = new javax.swing.JLabel();
        Myprogress = new javax.swing.JProgressBar();

        jScrollPane1.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Warehouse Management System");

        jLabel2.setFont(new java.awt.Font("Malgun Gothic", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("WmSys");

        Percentage.setFont(new java.awt.Font("Malgun Gothic", 1, 30)); // NOI18N
        Percentage.setForeground(new java.awt.Color(0, 153, 255));
        Percentage.setText("%");

        Myprogress.setForeground(new java.awt.Color(0, 153, 255));
        Myprogress.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(136, 136, 136))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(Percentage)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Myprogress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(93, 93, 93)
                .addComponent(jLabel2)
                .addGap(42, 42, 42)
                .addComponent(Percentage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Myprogress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    public static void main(String args[]) {
     splash MysSplash = new splash();
        MysSplash.setVisible(true);
        try{
            for(int i =0; i<= 100; i++){
                Thread.sleep(40);
                MysSplash.Myprogress.setValue(i);
                MysSplash.Percentage.setText(Integer.valueOf(i)+"%");
            }
        }catch(Exception e){
            
        }
        new Login().setVisible(true);
        MysSplash.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Myprogress;
    private javax.swing.JLabel Percentage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}
