/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.wheel.deal;

/**
 *
 * @author OMEN
 */
public class TheWheelDeal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          LoadingSc sp=new LoadingSc();
        sp.setVisible(true);
         Login n=new Login();
        try
        {
            for(int i=0;i<=100;i++)
            {
                Thread.sleep(75);
                
                
                sp.ProgressBar1.setValue(i);
                sp.ProgressLabel.setText(Integer.toString(i)+"%");
               
              
                if(i==10){
                    sp.LoadingLbl.setText("Turning On Modules...");
                    
                }if(i==20)
                {
                    sp.LoadingLbl.setText("Loading Modules...");
                }if(i==50)
                {
                    sp.LoadingLbl.setText("Connecting To Database...");
                }if(i==70)
                {
                    sp.LoadingLbl.setText("Connection Successful!!!");
                }if(i==80)
                {
                    sp.LoadingLbl.setText("Launching Application...");
                }
                if(i==100){
                     new LoadingSc().setVisible(false);
                }
              
            }
        }catch(Exception e)
        {
            
        }
        
       
        n.setVisible(true);
        sp.dispose();
       
    
    }
        // TODO code application logic here
    }
    

