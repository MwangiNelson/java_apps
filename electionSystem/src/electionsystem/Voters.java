/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electionsystem;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author OMEN
 */
public class Voters extends javax.swing.JFrame {

    public Voters() {
        initComponents();
        GetElections();
        DisplayVoters();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        VNameTb = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        VotersTable = new javax.swing.JTable();
        AddBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        VAgeTb = new javax.swing.JTextField();
        VElectionCb = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        VGenCb = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        VPassTb = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 204, 0));
        jLabel2.setText("2022 Kenya's election management system");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 204, 0));
        jLabel3.setText("Manage voters");

        jLabel4.setFont(new java.awt.Font("Serif", 3, 20)); // NOI18N
        jLabel4.setText("Elections");

        VotersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        VotersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VotersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(VotersTable);

        AddBtn.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        AddBtn.setText("Add");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });

        EditBtn.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        EditBtn.setText("Update");
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });

        DeleteBtn.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        DeleteBtn.setText("Delete");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });

        BackBtn.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        BackBtn.setText("Back");
        BackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackBtnMouseClicked(evt);
            }
        });

        VElectionCb.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Serif", 3, 20)); // NOI18N
        jLabel5.setText("Age");

        jLabel6.setFont(new java.awt.Font("Serif", 3, 20)); // NOI18N
        jLabel6.setText("Name:");

        VGenCb.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        VGenCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", " " }));

        jLabel7.setFont(new java.awt.Font("Serif", 3, 20)); // NOI18N
        jLabel7.setText("Gender");

        jLabel8.setFont(new java.awt.Font("Serif", 3, 20)); // NOI18N
        jLabel8.setText("Password");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\OMEN\\Desktop\\images.jfif")); // NOI18N

        VPassTb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                        .addComponent(VElectionCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(VNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(VPassTb)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(VAgeTb, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(BackBtn, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(AddBtn)
                                .addGap(18, 18, 18)
                                .addComponent(EditBtn)
                                .addGap(18, 18, 18)
                                .addComponent(DeleteBtn)))
                        .addGap(0, 145, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(VGenCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(445, 445, 445)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(VNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VAgeTb, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VGenCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(VElectionCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VPassTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(205, 205, 205)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddBtn)
                            .addComponent(EditBtn)
                            .addComponent(DeleteBtn))
                        .addGap(37, 37, 37)
                        .addComponent(BackBtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
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
    }// </editor-fold>//GEN-END:initComponents
        Connection Con=null;
    PreparedStatement pst=null;
    Statement St = null;
    ResultSet Rs=null;
    private void GetElections()
    {
        try
        {
            Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
            St=Con.createStatement();
            String Query=("Select* from ElectionTbl");
            Rs=St.executeQuery(Query);
            while(Rs.next()){
                String ElectId=Rs.getString("EId");
                VElectionCb.addItem(ElectId);
            }
        
        }
        catch(Exception e)
        {
        
        }
    
    }
     private void DisplayVoters()
    {
        try
        {
            Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
            St=Con.createStatement();
            Rs=St.executeQuery("Select* from VotersTbl");
            VotersTable.setModel(DbUtils.resultSetToTableModel(Rs));
            
            
        }
        catch(Exception e)
        {
        
        }
        
    
    }
             int VId;
             Statement St1=null;
             ResultSet Rs1=null;
         private void VoterCount()
    {
        try
        {
            St1=Con.createStatement();
            Rs1=St1.executeQuery("select MAx (VId) from VotersTbl");
            Rs1.next();
            VId=Rs1.getInt(1)+1;
        }
        catch(Exception Ex)
        {
        
        }

    }
    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        // TODO add your handling code here:
         if(VAgeTb.getText().isEmpty()||VNameTb.getText().isEmpty()||VElectionCb.getSelectedIndex()==-1||VGenCb.getSelectedIndex()==-1)
        {
            JOptionPane.showMessageDialog(this, "Missing Information");
        
        }
        else{
            try { 
                VoterCount();
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
                PreparedStatement Add=Con.prepareStatement("insert into VotersTbl values (?,?,?,?,?,?)");
            
                Add.setInt(1, VId);
                 Add.setString(2, VNameTb.getText());
                  Add.setInt(3, Integer.valueOf(VAgeTb.getText()));
                  Add.setString(4, VPassTb.getText());
                   Add.setString(5, VGenCb.getSelectedItem().toString());
                   
                     Add.setInt(6, Integer.valueOf(VElectionCb.getSelectedItem().toString()));
                int row=Add.executeUpdate();
                JOptionPane.showMessageDialog(this,"Voter registered");
                Con.close();
                DisplayVoters();
                
            } catch (Exception ex) {
               JOptionPane.showMessageDialog(this, ex);
            }
        
        }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        // TODO add your handling code here:
        if (Key==-1)
        {
            JOptionPane.showMessageDialog(this, "Select the Candidate profile to be deleted");
        }
        else
        {
            try
            {
                 Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
                 String Query =" Delete from VotersTbl where VId="+Key;
                 Statement Del=Con.createStatement();
                 Del.executeUpdate(Query);
                 JOptionPane.showMessageDialog(this,"Voter profile deleted successfully" );
                 DisplayVoters();
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, e);
                
            }
        }
        
    }//GEN-LAST:event_DeleteBtnMouseClicked
    int Key=-1;
    private void VotersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VotersTableMouseClicked
        // TODO add your handling code here:
         DefaultTableModel model=(DefaultTableModel)VotersTable.getModel();
         int MyIndex=VotersTable.getSelectedRow();
        Key=Integer.valueOf(model.getValueAt(MyIndex,0).toString());
        VNameTb.setText(model.getValueAt(MyIndex,1).toString());
        VAgeTb.setText(model.getValueAt(MyIndex,2).toString());
          VPassTb.setText(model.getValueAt(MyIndex,3).toString());
        VGenCb.setSelectedItem(model.getValueAt(MyIndex,4).toString());
        VElectionCb.setSelectedItem(model.getValueAt(MyIndex,5).toString());
    }//GEN-LAST:event_VotersTableMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
        // TODO add your handling code here:
           if(VAgeTb.getText().isEmpty()||VNameTb.getText().isEmpty()||VElectionCb.getSelectedIndex()==-1||VGenCb.getSelectedIndex()==-1)
        {
            JOptionPane.showMessageDialog(this, "   Missing information");
        }
        else
        {
            try
            {
                
                 Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
                 String Query =" Update VotersTbl set VName=?,VAge=?,VPass=? , VGen=?, VElection=? where VId=?";
                 
                PreparedStatement UpdateQuery=Con.prepareStatement(Query);
                UpdateQuery.setString(1, VNameTb.getText());
                UpdateQuery.setInt(2, Integer.valueOf(VAgeTb.getText()));
                 UpdateQuery.setString(3, VPassTb.getText());
                  UpdateQuery.setString(4, VGenCb.getSelectedItem().toString());
                UpdateQuery.setInt(5,Integer.valueOf(VElectionCb.getSelectedItem().toString()));
                 UpdateQuery.setInt(6,Key);
                UpdateQuery.executeUpdate();
                JOptionPane.showMessageDialog(this,"Update successful" );
                 DisplayVoters();
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, e);
                
            }
        }
    }//GEN-LAST:event_EditBtnMouseClicked

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
        // TODO add your handling code here:
         new MainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Voters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Voters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Voters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Voters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Voters().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JTextField VAgeTb;
    private javax.swing.JComboBox<String> VElectionCb;
    private javax.swing.JComboBox<String> VGenCb;
    private javax.swing.JTextField VNameTb;
    private javax.swing.JPasswordField VPassTb;
    private javax.swing.JTable VotersTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
