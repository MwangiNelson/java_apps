/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donatorsloginpage;

import java.sql.*;

import com.mysql.jdbc.Connection;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author nelso
 */
public class Wallet extends javax.swing.JFrame {

    /**
     * Creates new form Wallet
     */
    public Wallet() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        balance = new javax.swing.JLabel();
        addcash = new javax.swing.JLabel();
        home = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/donatorsloginpage/wallet1.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/donatorsloginpage/bank1.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/donatorsloginpage/soo.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/donatorsloginpage/home.png"))); // NOI18N
        jLabel4.setToolTipText("");

        balance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/donatorsloginpage/bbutton.png"))); // NOI18N
        balance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                balanceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                balanceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                balanceMouseExited(evt);
            }
        });

        addcash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/donatorsloginpage/badd.png"))); // NOI18N
        addcash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addcashMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addcashMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addcashMouseExited(evt);
            }
        });

        home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/donatorsloginpage/bhome.png"))); // NOI18N
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(217, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(balance, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(addcash, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(285, 285, 285))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(balance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(addcash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(65, 65, 65))
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

        setResizable(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void balanceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_balanceMouseEntered
        // TODO add your handling code here:
        balance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/donatorsloginpage/gbutton.png")));
    }//GEN-LAST:event_balanceMouseEntered

    private void balanceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_balanceMouseExited
        // TODO add your handling code here:
        balance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/donatorsloginpage/bbutton.png")));
    }//GEN-LAST:event_balanceMouseExited

    private void balanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_balanceMouseClicked
        // TODO add your handling code here:

        String Pass = JOptionPane.showInputDialog(Wallet.this, "Enter your password");

        Connection conn;
        ResultSet rs;
        Statement stmt;
        try {
            conn = (Connection) java.sql.DriverManager.getConnection("jdbc:mysql://localhost/lifeline", "root", "");
            stmt = conn.createStatement();
            
            String Balance = "SELECT acc_balance FROM users WHERE password = '"+ Pass +"'";
            rs = stmt.executeQuery(Balance);
            
            
            
            
            while (rs.next()){
 
                //outputs bank balance 
                        int bankbal = rs.getInt("acc_balance");
                        JOptionPane.showMessageDialog(Wallet.this, "Your acount balance is '"+bankbal+"' ");                
            }
            

        }catch(Exception e){
            
        }


    }//GEN-LAST:event_balanceMouseClicked

    private void addcashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addcashMouseClicked
        // TODO add your handling code here:
           int result = JOptionPane.showConfirmDialog(this,"Sure? You want to exit?", "Log out?",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
            if(result == JOptionPane.YES_OPTION){
               this.setVisible(false);
            }else if (result == JOptionPane.NO_OPTION){
               this.setVisible(true);
            }
         
        
        
        String Add = JOptionPane.showInputDialog(Wallet.this, "Enter the amount you wish to add:");

        //converting the user input to integer//    
        int addedMoney = Integer.parseInt(Add);
        try {

            //Queries user for their username to ensure legitimacy and as a reference for the sql queries//
            //Password input//
            String Pass = JOptionPane.showInputDialog(Wallet.this, "Enter your password:");

            //connecting to th database//
            Connection conn;
            ResultSet rs;
            Statement stmt;

            conn = (Connection) java.sql.DriverManager.getConnection("jdbc:mysql://localhost/lifeline", "root", "");
            stmt = conn.createStatement();

            //invoke sql queries//
            String sql2 = "SELECT * FROM users WHERE password = ('" + Pass + "') ";
            rs = stmt.executeQuery(sql2);

            while (rs.next()) {

                //gets the initial bank balance//
                int bankbal = rs.getInt("acc_balance");

                //computes the new balance//
                int newBal = bankbal + addedMoney;

                //Updates in the database the new balance//
                String sql4 = "UPDATE users SET acc_balance='" + newBal + "' WHERE password = ('" + Pass + "')";
                stmt.executeUpdate(sql4);

                //outputs the new bank balance//
                JOptionPane.showMessageDialog(Wallet.this, "Your new account balance : $" + newBal + ".");

            }

        } catch (Exception e) {

        }
        
    }//GEN-LAST:event_addcashMouseClicked

    private void addcashMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addcashMouseEntered
       
           addcash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/donatorsloginpage/gadd.png")));
        
        
    }//GEN-LAST:event_addcashMouseEntered

    private void addcashMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addcashMouseExited
       
        addcash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/donatorsloginpage/badd.png")));
    }//GEN-LAST:event_addcashMouseExited

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
   
    }//GEN-LAST:event_jPanel1MouseClicked

    private void homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseExited
        // TODO add your handling code here:
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/donatorsloginpage/bhome.png")));
    }//GEN-LAST:event_homeMouseExited

    private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered
        // TODO add your handling code here:
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/donatorsloginpage/ghome.png")));
    }//GEN-LAST:event_homeMouseEntered

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
        HomePage a = new HomePage();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeMouseClicked

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
            java.util.logging.Logger.getLogger(Wallet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Wallet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Wallet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Wallet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Wallet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addcash;
    private javax.swing.JLabel balance;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
