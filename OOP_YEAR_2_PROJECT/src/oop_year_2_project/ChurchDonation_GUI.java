/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_year_2_project;

/**
 *
 * @author PC
 */
//GUI Packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class ChurchDonation_GUI implements ActionListener
{
    //Inputs (JTextFields) as global variables
    JTextField nameInput = new JTextField(10);
    JTextField dateInput = new JTextField(10);
    JTextField amountInput = new JTextField(10);
    
    public void churchGUI()
    {
        JFrame churchFrame = new JFrame();
        //frame properties
        churchFrame.setSize(700, 400);
        churchFrame.setLocation(new Point(150,150));
        churchFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        churchFrame.setTitle("Catholic Association of Kenya");
        churchFrame.setLayout(new BorderLayout());
        
        
        //JPANEL NORTH
        JPanel northPanel = new JPanel();
        northPanel.setLayout(new FlowLayout());
        //North Panel elements
        //Title
        JLabel churchTitle = new JLabel("CATHOLIC ASSOCIATION OF KENYA");
        northPanel.add(churchTitle);
        
        //JPANEL CENTER
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new FlowLayout());
        //Center Panel elements
        //Description
        //..................
        
        //JPANEL SOUTH
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new BorderLayout());
        
        //1. MainSouthPanel
        JPanel MainSouthPanel = new JPanel();
        MainSouthPanel.setLayout(new GridLayout(3,2));
        //MainSouthPanel elements: 3x3 form
        //COLUMN 1
        JPanel labelA = new JPanel();
        labelA.setLayout(new FlowLayout());
        labelA.add(new JLabel("Name "));
        MainSouthPanel.add(labelA);
        MainSouthPanel.add(nameInput);
        //COLUMN 2
        JPanel labelB = new JPanel();
        labelB.setLayout(new FlowLayout());
        labelB.add(new JLabel("Date "));
        MainSouthPanel.add(labelB);
        MainSouthPanel.add(dateInput);
        //COLUMN 3
        JPanel labelC = new JPanel();
        labelC.setLayout(new FlowLayout());
        labelC.add(new JLabel("Amount (Ksh) "));
        MainSouthPanel.add(labelC);
        MainSouthPanel.add(amountInput);
     
        //2. MinorSouthPanel
        JPanel MinorSouthPanel = new JPanel();
        MinorSouthPanel.setLayout(new FlowLayout());
        //MinorSouthPanel elements: Submit and Back Buttons
        JButton backHome = new JButton("Back");
        MinorSouthPanel.add(backHome);
        JButton submit = new JButton("Submit");
        MinorSouthPanel.add(submit);
        //ActionListener to retrieve and submit Information
        submit.addActionListener(this);
        //ActionListener to return to Home Page
        //...Code -> backHome.addActionListener(new className());
 
        //Add to SouthPanel
        southPanel.add(MainSouthPanel, BorderLayout.CENTER);
        southPanel.add(MinorSouthPanel, BorderLayout.SOUTH);
        
        
        //Add minor Panels to Main Frame
        churchFrame.add(northPanel, BorderLayout.NORTH);
        churchFrame.add(centerPanel, BorderLayout.CENTER);
        churchFrame.add(southPanel, BorderLayout.SOUTH);
        
        
        //Visibility
        churchFrame.setVisible(true);
    }
    
    //Events when Button is Pressed
    @Override
    public void actionPerformed(ActionEvent e)
    {
        //Retrieve Name Input
        String name = nameInput.getText();
        //Retrieve Date Input
        String date = dateInput.getText();
        //Retrieve Amount Input
        String amountString = amountInput.getText();
        //convert string Input to integer
        double amountInteger = Double.parseDouble(amountString);
    }
    
}
