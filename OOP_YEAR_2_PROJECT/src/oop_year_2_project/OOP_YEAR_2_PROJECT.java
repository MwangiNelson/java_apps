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
public class OOP_YEAR_2_PROJECT
{    
    public static void main(String[] args) 
    {
        //Run Church Donation GUI
        ChurchDonation_GUI runChurchGUI = new ChurchDonation_GUI();
        runChurchGUI.churchGUI();
        
        //Run Children's Home GUI
        ChildrensHome_GUI runChildGUI = new ChildrensHome_GUI();
        runChildGUI.childrensHomeGUI();
        
    }
    
}
