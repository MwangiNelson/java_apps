/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tracer;

import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author nelso
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ClientName = new javax.swing.JTextField();
        blunts = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buybn = new javax.swing.JLabel();
        rembn = new javax.swing.JLabel();
        earnbn = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cashCb = new javax.swing.JRadioButton();
        MpesaCb = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tracer/yu.png"))); // NOI18N

        ClientName.setBackground(new java.awt.Color(255, 255, 255));
        ClientName.setForeground(new java.awt.Color(0, 0, 0));

        blunts.setBackground(new java.awt.Color(255, 255, 255));
        blunts.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));

        buybn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tracer/bpurchase.png"))); // NOI18N
        buybn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buybnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buybnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buybnMouseExited(evt);
            }
        });

        rembn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tracer/brem.png"))); // NOI18N
        rembn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rembnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rembnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rembnMouseExited(evt);
            }
        });

        earnbn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tracer/bearn.png"))); // NOI18N
        earnbn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                earnbnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                earnbnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                earnbnMouseExited(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tracer/client2.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tracer/qty2.png"))); // NOI18N

        cashCb.setBackground(new java.awt.Color(255, 255, 255));
        cashCb.setForeground(new java.awt.Color(0, 0, 0));
        cashCb.setText("Cash");
        cashCb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cashCbMouseClicked(evt);
            }
        });
        cashCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashCbActionPerformed(evt);
            }
        });

        MpesaCb.setBackground(new java.awt.Color(255, 255, 255));
        MpesaCb.setForeground(new java.awt.Color(0, 0, 0));
        MpesaCb.setText("M-pesa");
        MpesaCb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MpesaCbMouseClicked(evt);
            }
        });
        MpesaCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MpesaCbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buybn)
                            .addComponent(rembn, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(earnbn)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(111, 111, 111))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cashCb)
                                .addGap(4, 4, 4)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(blunts, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(199, 199, 199)
                                .addComponent(MpesaCb))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(208, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(blunts, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                        .addComponent(buybn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(rembn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(earnbn)
                        .addGap(66, 66, 66))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cashCb)
                            .addComponent(MpesaCb))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setResizable(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buybnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buybnMouseClicked
        // TODO add your handling code here:
        try {
            Connection conn;
            ResultSet rs;
            Statement stmt;

            String Client = ClientName.getText();
            int Blunts = Integer.parseInt(blunts.getText());

            conn = (Connection) java.sql.DriverManager.getConnection("jdbc:mysql://localhost/crooks", "root", "");
            stmt = conn.createStatement();
            
            int earned = Blunts * 50;
            
//payment method //
            if (MpesaCb.isSelected()) {
               
                String Updatedb = "INSERT INTO stock2 (name,blunts,amount,paymentMthd) VALUES ('" + Client + "','" + Blunts + "','" + earned + "','Mpesa')";
                stmt.executeUpdate(Updatedb);
                JOptionPane.showMessageDialog(Admin.this, "Record saved Successfully");
             
            } if (cashCb.isSelected()) {
               
                String Updatedb2 = "INSERT INTO stock2 (name,blunts,amount,paymentMthd) VALUES ('" + Client + "','" + Blunts + "','" + earned + "','Cash')";
                stmt.executeUpdate(Updatedb2);
                JOptionPane.showMessageDialog(Admin.this, "Record saved Successfully");
                
            }if(!cashCb.isSelected()&&!MpesaCb.isSelected()){
                JOptionPane.showMessageDialog(Admin.this, "Please select a payment method.");  
            }
           

            ClientName.setText("");
            blunts.setText("");
         

        } catch (SQLException e) {

        }


    }//GEN-LAST:event_buybnMouseClicked

    private void buybnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buybnMouseEntered
        // TODO add your handling code here:
        buybn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tracer/gpurchase.png")));
    }//GEN-LAST:event_buybnMouseEntered

    private void buybnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buybnMouseExited
        // TODO add your handling code here:
        buybn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tracer/bpurchase.png")));
    }//GEN-LAST:event_buybnMouseExited

    private void rembnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rembnMouseClicked
        // TODO add your handling code here:
        try {
            Connection conn;
            Statement stmt;
            ResultSet rs;

            conn = (Connection) java.sql.DriverManager.getConnection("jdbc:mysql://localhost/crooks", "root", "");
            stmt = conn.createStatement();

            String retreive_data = "SELECT SUM(blunts) as sum_blunts FROM stock2";
            rs = stmt.executeQuery(retreive_data);

            while (rs.next()) {
                int remaining_blunts = rs.getInt("sum_blunts");
                int rem = 150 - remaining_blunts;

                JOptionPane.showMessageDialog(Admin.this, "Remaining blunts are currently : " + rem + "");

            }

        } catch (Exception e) {

        }


    }//GEN-LAST:event_rembnMouseClicked

    private void rembnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rembnMouseEntered
        // TODO add your handling code here:
        rembn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tracer/grem.png")));
    }//GEN-LAST:event_rembnMouseEntered

    private void rembnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rembnMouseExited
        // TODO add your handling code here:
        rembn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tracer/brem.png")));
    }//GEN-LAST:event_rembnMouseExited

    private void earnbnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_earnbnMouseEntered
        // TODO add your handling code here:
        earnbn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tracer/gearn.png")));
    }//GEN-LAST:event_earnbnMouseEntered

    private void earnbnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_earnbnMouseExited
        // TODO add your handling code here:
        earnbn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tracer/bearn.png")));
    }//GEN-LAST:event_earnbnMouseExited

    private void earnbnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_earnbnMouseClicked
        // TODO add your handling code here:

        try {
            Connection conn;
            Statement stmt;
            ResultSet rs;

            conn = (Connection) java.sql.DriverManager.getConnection("jdbc:mysql://localhost/crooks", "root", "");
            stmt = conn.createStatement();

            String retreive_data = "SELECT SUM(amount) as sum_score FROM stock2";
            rs = stmt.executeQuery(retreive_data);

            while (rs.next()) {
                int earnings = rs.getInt("sum_score");
                JOptionPane.showMessageDialog(Admin.this, "Earnings are currently : ksh." + earnings + "");
            }

        } catch (Exception e) {

        }


    }//GEN-LAST:event_earnbnMouseClicked

    private void MpesaCbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MpesaCbMouseClicked
        // TODO add your handling code here:
    


    }//GEN-LAST:event_MpesaCbMouseClicked

    private void cashCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashCbActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_cashCbActionPerformed

    private void cashCbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cashCbMouseClicked
        // TODO add your handling code here:
   

    }//GEN-LAST:event_cashCbMouseClicked

    private void MpesaCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MpesaCbActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_MpesaCbActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ClientName;
    private javax.swing.JRadioButton MpesaCb;
    private javax.swing.JTextField blunts;
    private javax.swing.JLabel buybn;
    private javax.swing.JRadioButton cashCb;
    private javax.swing.JLabel earnbn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel rembn;
    // End of variables declaration//GEN-END:variables
}