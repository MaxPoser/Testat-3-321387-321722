/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harvestManagement;

import java.util.Scanner;

/**
 *
 * @author Sina Stumpp
 */
public class BerryManager {
    Berry myBerry[] = new Berry [1000];
    Scanner myScanner;

    public BerryManager() {
        this.myScanner = new Scanner(System.in);
    }


    public void displayBerryMenu() {
        System.out.println("BENNO’s Harvest-Management (Version 1.0 (C) 2020 by Group 1)\n" +
            "MANAGING HELPERS MENU\n" +
            "Please select:\n" +
            "Create new berry 1\n" +
            "Update a berry 2\n" +
            "Delete a berry 3\n" +
            "Show berry list 4\n" +
            "Back to main menu 0\n" +
            "Please enter your choice:");
        
    }

    public void listBerries() {
        System.out.println("Berry index: ");
        for (int index = 0; index < myBerry.length; index++) {
            if (myBerry[index] != null) {
                System.out.println(myBerry[0]);
            }   
        }   
    }

    public void deleteBerry() {
        int deleteInput;
        deleteInput = Integer. parseInt(myScanner.next());
        myBerry[deleteInput] = null;     
    }

    public void updateBerry() {
        
    }

    public void addBerry() {
        
    }

    
}
/*
try catch statement in delete Berry? und deleteinput.trim(); ?

*/
