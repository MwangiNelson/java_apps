
package electionsystem;
import java.awt.Image;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        DisplayElections();
     
    }
      Connection Con=null;
    PreparedStatement pst=null;
    Statement St = null;
    ResultSet Rs=null;
     private void DisplayElections()
    {
        try
        {
            Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
            St=Con.createStatement();
            Rs=St.executeQuery("Select* from ElectionTbl");
            ElectionsTable.setModel(DbUtils.resultSetToTableModel(Rs));
            
            
        }
        catch(Exception e)
        {
        
        }
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CandidatePictureLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ElectionsTable = new javax.swing.JTable();
        WinnerLbl = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        VotesLbl = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        BravoLbl1 = new javax.swing.JLabel();
        PercentageLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Showcard Gothic", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 204, 0));
        jLabel5.setText("2022 Kenya's election management system");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(169, 169, 169))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        jLabel6.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 204, 0));
        jLabel6.setText("Dashboard");

        CandidatePictureLbl.setFont(new java.awt.Font("Serif", 3, 20)); // NOI18N
        CandidatePictureLbl.setBorder(new javax.swing.border.MatteBorder(null));

        ElectionsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        ElectionsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ElectionsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ElectionsTable);

        WinnerLbl.setFont(new java.awt.Font("Serif", 3, 20)); // NOI18N
        WinnerLbl.setText("Name");

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\OMEN\\Desktop\\images.jfif")); // NOI18N

        BackBtn.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        BackBtn.setText("Back");
        BackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackBtnMouseClicked(evt);
            }
        });

        VotesLbl.setFont(new java.awt.Font("Showcard Gothic", 1, 26)); // NOI18N
        VotesLbl.setForeground(new java.awt.Color(51, 255, 0));
        VotesLbl.setText("Votes");

        jLabel12.setFont(new java.awt.Font("Serif", 3, 20)); // NOI18N
        jLabel12.setText("Posts List");

        BravoLbl1.setFont(new java.awt.Font("Showcard Gothic", 1, 26)); // NOI18N
        BravoLbl1.setForeground(new java.awt.Color(51, 255, 0));
        BravoLbl1.setText("Winner");

        PercentageLbl.setFont(new java.awt.Font("Showcard Gothic", 1, 26)); // NOI18N
        PercentageLbl.setForeground(new java.awt.Color(255, 51, 51));
        PercentageLbl.setText("Percentage");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(CandidatePictureLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PercentageLbl)
                            .addComponent(VotesLbl))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BravoLbl1)
                            .addComponent(WinnerLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(502, 502, 502)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(406, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(BravoLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CandidatePictureLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(VotesLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PercentageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(WinnerLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(BackBtn)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     int WinnerId, Votes, Percentage;
    private void GetWinner()
     {
         try{
            Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
            St=Con.createStatement();
            String Query="select CandidateId, Count(CandidateId) from VotesTbl where ElectId="+Key+" Group BY CandidateId ORDER BY CandidateId DESC LIMIT 1";
            Rs=St.executeQuery(Query);
            while(Rs.next())
            {
               // JOptionPane.showMessageDialog(this, ""+Rs.getInt(1));
                WinnerId=Rs.getInt(1);
            }
         
         }
         catch(SQLException e){
             JOptionPane.showMessageDialog(this, e);
         }
     }
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
    
    private void GetWinnerData()
    {
      
       
            String Query="select Cphoto, CName from CandidateTbl where CId="+WinnerId;
            Statement St;
            ResultSet Rs;
        try {
            Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
            St=Con.createStatement();
            Rs=St.executeQuery(Query);
            if(Rs.next())
            {
                CandidatePictureLbl.setIcon(ResizePhoto(null,Rs.getBytes("Cphoto")));
                WinnerLbl.setText(Rs.getString("CName"));
            }
        } catch (SQLException ex) {
            
        }
    
    
    }
     private void GetVotes()
    {
      
       
          try{
            Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
            St=Con.createStatement();
            String Query="select Count(CandidateId) from VotesTbl where CandidateId="+WinnerId;
            Rs=St.executeQuery(Query);
            while(Rs.next())
            {
             
                Votes=Rs.getInt(1);
                VotesLbl.setText(Votes+ " Votes");
            }
         
         }
         catch(SQLException e){
             JOptionPane.showMessageDialog(this, e);
         }
    
    
    }
     int TotalVotes;
     double WinPercentage;
      private void GetPercentage()
    {
      
       
          try{
            Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
            St=Con.createStatement();
            String Query="select Count(*) from VotesTbl where ElectId="+Key;
            Rs=St.executeQuery(Query);
            while(Rs.next())
            {
             
                TotalVotes=Rs.getInt(1);
             
              WinPercentage= (Votes/TotalVotes)*100;
              PercentageLbl.setText(new DecimalFormat("##.##").format(WinPercentage)+"%");
            }
         
         }
         catch(SQLException e){
             JOptionPane.showMessageDialog(this, e);
         }
    
    
    }
    int Key=-1;
    private void ElectionsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ElectionsTableMouseClicked
        // TODO add your handling code here:
      
        DefaultTableModel model=(DefaultTableModel)ElectionsTable.getModel();
        int MyIndex=ElectionsTable.getSelectedRow();
        Key=Integer.valueOf(model.getValueAt(MyIndex,0).toString());
         GetWinner();
         GetWinnerData();
         GetVotes();
         GetPercentage();
        //FetchPhoto();
    }//GEN-LAST:event_ElectionsTableMouseClicked

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel BravoLbl1;
    private javax.swing.JLabel CandidatePictureLbl;
    private javax.swing.JTable ElectionsTable;
    private javax.swing.JLabel PercentageLbl;
    private javax.swing.JLabel VotesLbl;
    private javax.swing.JLabel WinnerLbl;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
