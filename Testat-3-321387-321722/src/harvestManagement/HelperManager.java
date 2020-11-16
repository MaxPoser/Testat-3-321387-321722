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
public class HelperManager {
    Helper myHelper[] = new Helper[1000];
    static HarvestManagement myHarvestManager = new HarvestManagement();
    int counter = 0;

        public void displayHelperMenu() {
        System.out.println("BENNO’s Harvest-Management (Version 1.0 (C) 2020 by Group 13)\n" +
            "MANAGING HELPERS MENU\n" +
            "Please select:\n" +
            "Create new helper 1\n" +
            "Update a helper 2\n" +
            "Delete a helper 3\n" +
            "Show helper list 4\n" +
            "Back to main menu 0\n" +
            "Please enter your choice:");
    }
    public void listHelpers() {
        System.out.println("Helper index: ");
        for (int index = 0; index < myHelper.length; index++) {
            if (myHelper[index] != null) {
                System.out.println(myHelper[index]);
            }   
        }   
    }

    public void deleteHelper() {
        System.out.println("Please choose helper id to delete helper: ");
        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.next();
        try {
            int index = Integer.parseInt(input)-1;
            myHelper[index] = null;
            } catch (Exception e) {
                System.out.println("Please choose an existing helper id.");
                myHarvestManager.handleHelpers();
                
            }
       
    }

    public void updateHelper() {
        System.out.println("Please choose helper id to update helper: ");
        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.next();
        try {
            int index = Integer.parseInt(input)-1;
                System.out.println(myHelper[index]);
                displayUpdateMenu();
                selectUpdate(index);
            } catch (Exception e) {
                System.out.println("Please choose an existing helper id.");
                myHarvestManager.handleHelpers();
                
            }   
    }

    public void addHelper() {
        myHelper[counter] = new Helper (1,"","","","");
            System.out.println("Enter origin: ");myHelper[counter].setOrigin(readUpdateInput());
            System.out.println("Enter gender: ");myHelper[counter].setGender(readUpdateInput());
            System.out.println("Enter last name: ");myHelper[counter].setLastName(readUpdateInput());
            System.out.println("Enter first name: ");myHelper[counter].setFirstName(readUpdateInput());
            counter++;
                    
            myHarvestManager.handleHelpers();
    }
        
    public void displayUpdateMenu(){
        System.out.println("BENNO’s Harvest-Management (Version 1.0 (C) 2020 by Group 1)\n" +
            "UPDATE HELPERS MENU\n" +
            "Please select:\n" +
            "Update first name 1\n" +
            "Update last name 2\n" +
            "Update gender 3\n" +
            "Back to helper menu 0\n" +
            "Please enter your choice:");
        
    }

    private void selectUpdate(int index) {
        
        int menuselection = myHarvestManager.readUserInput(0,3);
        switch(menuselection) {
            case 3: myHelper[index].setGender(readUpdateInput());break;
            case 2: myHelper[index].setLastName(readUpdateInput());break;
            case 1: myHelper[index].setFirstName(readUpdateInput());break;
            case 0: myHarvestManager.handleHelpers();break;
            default: break;
    }
    }
    public String readUpdateInput(){
        System.out.println("Please type: ");
        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.next();
        input.trim();
        while (input == null) {
            System.out.println("Please use correct input:");
        }
        return input;    
    }
}

/*
CRUD programmieren + auf Objekte beziehen (index??)
Scanner integrieren??
submenu für update und welche variablen können gesetted werden
*/