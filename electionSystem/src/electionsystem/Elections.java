
package electionsystem;

import java.sql.*;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Elections extends javax.swing.JFrame {
    Connection Con=null;
    PreparedStatement pst=null;
    ResultSet Rs=null;
    Statement St=null;

    public Elections() {
        initComponents();
        DisplayElections();
    }
    
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ElectionNameTb = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ElectionTable = new javax.swing.JTable();
        AddButton = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        ElectionDate = new com.toedter.calendar.JDateChooser();

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(195, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(231, 231, 231))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 204, 0));
        jLabel3.setText("Manage election Posts");

        jLabel1.setFont(new java.awt.Font("Serif", 3, 20)); // NOI18N
        jLabel1.setText("Election Date");

        jLabel4.setFont(new java.awt.Font("Serif", 3, 20)); // NOI18N
        jLabel4.setText("Name:");

        ElectionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Name", "Date"
            }
        ));
        ElectionTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ElectionTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ElectionTable);

        AddButton.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        AddButton.setText("Add");
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddButtonMouseClicked(evt);
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

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\OMEN\\Desktop\\images.jfif")); // NOI18N
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackBtn)
                    .addComponent(ElectionNameTb)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AddButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(EditBtn)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteBtn))
                    .addComponent(ElectionDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(490, 490, 490)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(425, 425, 425)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ElectionNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ElectionDate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(179, 179, 179)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddButton)
                            .addComponent(EditBtn)
                            .addComponent(DeleteBtn))
                        .addGap(31, 31, 31)
                        .addComponent(BackBtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    int EId;
    Statement St1=null;
    ResultSet Rs1=null;
    
    private void ElecCount()
    {
        try
        {
            St1=Con.createStatement();
            Rs1=St1.executeQuery("select MAX (EId) from ElectionTbl");
            Rs1.next();
            EId=Rs1.getInt(1)+1;
        }
        catch(Exception Ex)
        {
        
        }

    }
    private void DisplayElections()
    {
        try
        {
            Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
            St=Con.createStatement();
            Rs=St.executeQuery("Select* from ElectionTbl");
            ElectionTable.setModel(DbUtils.resultSetToTableModel(Rs));
            
            
        }
        catch(Exception e)
        {
        
        }
    
    }
    private void AddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseClicked
        if(ElectionNameTb.getText().isEmpty())
        {
             JOptionPane.showMessageDialog(this, "Enter the Election Post Name");
        }else
        {
            try{
                String Day=  String.valueOf(ElectionDate.getDate().getDay())  ;
                String Month=  String.valueOf(ElectionDate.getDate().getMonth())  ;
                String Year=  String.valueOf(ElectionDate.getDate().getYear())  ;
                String EDate= Day+"/"+Month+"/"+Year;
                ElecCount();
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
                PreparedStatement Add= Con.prepareStatement("insert into ElectionTbl values(?,?,?) ");
                Add.setInt(1,EId);
                Add.setString(2, ElectionNameTb.getText() );
                Add.setString(3, EDate );
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Election Post and date added successfully");
                Con.close();
                DisplayElections();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_AddButtonMouseClicked
    int Key=-1;
    private void ElectionTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ElectionTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)ElectionTable.getModel();
        int MyIndex=ElectionTable.getSelectedRow();
        Key=Integer.valueOf(model.getValueAt(MyIndex,0).toString());
        ElectionNameTb.setText(model.getValueAt(MyIndex,1).toString());
    }//GEN-LAST:event_ElectionTableMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        // TODO add your handling code here:
        //EId=Key;
      
        if (Key==-1)
        {
            JOptionPane.showMessageDialog(this, "Select the post to be deleted");
        }
        else
        {
            try
            {
                 Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
                 String Query =" Delete from ElectionTbl where EId="+Key;
                 Statement Del=Con.createStatement();
                 Del.executeUpdate(Query);
                 JOptionPane.showMessageDialog(this,"Post deleted successfully" );
                 DisplayElections();
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, e);
                
            }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
        // TODO add your handling code here:
         if (Key==-1||ElectionDate.getDate().toString().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "   Missing information");
        }
        else
        {
            try
            {
                 String Day=  String.valueOf(ElectionDate.getDate().getDay())  ;
                String Month=  String.valueOf(ElectionDate.getDate().getMonth())  ;
                String Year=  String.valueOf(ElectionDate.getDate().getYear())  ;
                String EDate= Day+"/"+Month+"/"+Year;
                 Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
                 String Query =" Update ElectionTbl set EName=?,EDate=? where EId=?";
                 
                PreparedStatement UpdateQuery=Con.prepareStatement(Query);
                UpdateQuery.setString(1, ElectionNameTb.getText());
                UpdateQuery.setString(2, EDate);
                UpdateQuery.setInt(3, Key);
                 UpdateQuery.executeUpdate();
                 JOptionPane.showMessageDialog(this,"Update successful" );
                 DisplayElections();
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
            java.util.logging.Logger.getLogger(Elections.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Elections.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Elections.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Elections.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Elections().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private com.toedter.calendar.JDateChooser ElectionDate;
    private javax.swing.JTextField ElectionNameTb;
    private javax.swing.JTable ElectionTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
