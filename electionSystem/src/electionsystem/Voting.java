
package electionsystem;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Voting extends javax.swing.JFrame {

    /**
     * Creates new form Voting
     */
    public Voting() {
        initComponents();
        DisplayCandidates();
        BravoLbl.setVisible(false);
    }
    int VotingId;
    public Voting(int VoterId)
    {
        initComponents();
        DisplayCandidates();
        BravoLbl.setVisible(false);
        VotingId=VoterId;
        // JOptionPane.showMessageDialog(this,VotingId);
    }
     Connection Con=null;
    PreparedStatement pst=null;
    Statement St = null;
    ResultSet Rs=null;

      private void DisplayCandidates()
    {
        try
        {
            Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
            St=Con.createStatement();
            Rs=St.executeQuery("Select* from CandidateTbl");
            CandidatesTable.setModel(DbUtils.resultSetToTableModel(Rs));
            
            
        }
        catch(Exception e)
        {
        
        }
        
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CandidatePictureLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CandidatesTable = new javax.swing.JTable();
        CnameLbl = new javax.swing.JLabel();
        VoteBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        BravoLbl = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(169, 169, 169))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 204, 0));
        jLabel3.setText("CAST YOUR VOTE");

        CandidatePictureLbl.setFont(new java.awt.Font("Serif", 3, 20)); // NOI18N
        CandidatePictureLbl.setBorder(new javax.swing.border.MatteBorder(null));

        CandidatesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Candidate ID", "Name", "Age", "Gender", "Photo", "Election Post ID"
            }
        ));
        CandidatesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CandidatesTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CandidatesTable);

        CnameLbl.setFont(new java.awt.Font("Serif", 3, 20)); // NOI18N
        CnameLbl.setText("Name");

        VoteBtn.setBackground(new java.awt.Color(153, 204, 0));
        VoteBtn.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        VoteBtn.setText("Vote");
        VoteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VoteBtnMouseClicked(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\OMEN\\Desktop\\images.jfif")); // NOI18N

        jLabel10.setFont(new java.awt.Font("Serif", 3, 20)); // NOI18N
        jLabel10.setText("Your Candidate");

        BackBtn.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        BackBtn.setText("Back");
        BackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackBtnMouseClicked(evt);
            }
        });

        BravoLbl.setFont(new java.awt.Font("Showcard Gothic", 1, 26)); // NOI18N
        BravoLbl.setForeground(new java.awt.Color(51, 255, 0));
        BravoLbl.setText("Vote Counted!!");

        jLabel12.setFont(new java.awt.Font("Serif", 3, 20)); // NOI18N
        jLabel12.setText("Candidates list");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(502, 502, 502)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 485, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(405, 405, 405))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CandidatePictureLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(VoteBtn)
                        .addGap(139, 139, 139)
                        .addComponent(BravoLbl)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CnameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(549, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(387, 387, 387)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CandidatePictureLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BravoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VoteBtn))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CnameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(BackBtn)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(640, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(243, 243, 243)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
     private ImageIcon ResizePhoto(String ImagePath,byte[]pic)
    {
        ImageIcon MyImage=null;
        if(ImagePath!=null){
            MyImage=new ImageIcon(ImagePath);
          }
        else{
            MyImage=new ImageIcon(pic);
        
        }
        Image img=MyImage.getImage();
        Image newImg=img.getScaledInstance(CandidatePictureLbl.getWidth(), CandidatePictureLbl.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image=new ImageIcon(newImg);
        return image;
    
    }
     private void FetchPhoto()
    {
       
            String Query="select Cphoto from CandidateTbl where CId="+Key;
            Statement St;
            ResultSet Rs;
        try {
            Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
            St=Con.createStatement();
            Rs=St.executeQuery(Query);
            if(Rs.next())
            {
                CandidatePictureLbl.setIcon(ResizePhoto(null,Rs.getBytes("Cphoto")));
            }
        } catch (SQLException ex) {
            
        }
    }
    int Key=-1;
    int ElecId=0;
    private void CandidatesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CandidatesTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)CandidatesTable.getModel();
         int MyIndex=CandidatesTable.getSelectedRow();
        Key=Integer.valueOf(model.getValueAt(MyIndex,0).toString());
        CnameLbl.setText(model.getValueAt(MyIndex,1).toString());
        ElecId=Integer.valueOf(model.getValueAt(MyIndex,5).toString());
        FetchPhoto();
    }//GEN-LAST:event_CandidatesTableMouseClicked
    int VId;
    Statement St1=null;
    ResultSet Rs1=null;
    
    private void VCount()
    {
        try
        {
            St1=Con.createStatement();
            Rs1=St1.executeQuery("select MAx (VoteId) from VotesTbl");
            Rs1.next();
            VId=Rs1.getInt(1)+1;
        }
        catch(Exception Ex)
        {
        
        }

    }
    int VNumber=-1;
    private void VCheck()
    {
        try
        {
            St1=Con.createStatement();
            Rs1=St1.executeQuery("select * from VotesTbl where VoterId="+VotingId+" and ElectId="+ElecId);
            if(Rs1.next())
            {
                VNumber=1;
            
            }else
            {
                VNumber=0;
            }
            
           
        }
        catch(Exception Ex)
        {
            JOptionPane.showMessageDialog(this, Ex);
        }

    }
    private void VoteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoteBtnMouseClicked
        // TODO add your handling code here:
        VCheck();
        if(Key==-1)
        {
             JOptionPane.showMessageDialog(this, "Select your Candidate");
        }else if (VNumber>0)
        {
            JOptionPane.showMessageDialog(this, "You can not cast your vote twice!!!");
        }
        else
        {
            try{
                
                VCount();
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
                PreparedStatement Add= Con.prepareStatement("insert into VotesTbl values(?,?,?,?) ");
                Add.setInt(1,VId);
                 Add.setInt(2,VotingId);
                  Add.setInt(3,ElecId);
                   Add.setInt(4,Key);
               
                int row = Add.executeUpdate();
               JOptionPane.showMessageDialog(this, "Vote Counted ");
                Con.close();
                BravoLbl.setVisible(true);
                DisplayCandidates();
                VoteBtn.setVisible(false);
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_VoteBtnMouseClicked

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
        // TODO add your handling code here:
        new Login().setVisible(true);
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
            java.util.logging.Logger.getLogger(Voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Voting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel BravoLbl;
    private javax.swing.JLabel CandidatePictureLbl;
    private javax.swing.JTable CandidatesTable;
    private javax.swing.JLabel CnameLbl;
    private javax.swing.JButton VoteBtn;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
