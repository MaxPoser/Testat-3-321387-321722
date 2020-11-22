/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harvestManagement;

import static harvestManagement.HelperManager.myHarvestManager;
import java.util.Scanner;

/**
 *
 * @author Sina Stumpp
 */
public class BerryManager {
    Berry myBerry[] = new Berry [1000];
    Scanner myScanner;
    static HarvestManagement myHarvestManager = new HarvestManagement();
    int counter = 0;

    public BerryManager() {
    this.myScanner = new Scanner(System.in);
    }


    public void displayBerryMenu() {
        System.out.println("BENNO’s Harvest-Management (Version 1.0 (C) 2020 by Group 1)\n\n" +
            "MANAGING BERRY MENU\n" +
            "Please select:\n\n" +
            "Create new berry 1\n" +
            "Update a berry 2\n" +
            "Delete a berry 3\n" +
            "Show berry list 4\n" +
            "Back to main menu 0\n\n" +
            "Please enter your choice:");
    }

    public void listBerries() {
        System.out.println("Berry index: ");
        for (int index = 0; index < myBerry.length; index++) {
            if (myBerry[index] != null) {
                System.out.println(myBerry[index]); // Index satt 0 eingefügt
            }   
        }   
    }

    public void deleteBerry() {
        System.out.println("Please choose berry id to delete berry: ");
        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.next();
        try {
            int index = Integer.parseInt(input)-1;
            myBerry[index] = null;
            } catch (Exception e) {
                System.out.println("Please choose an existing berry id.");
                myHarvestManager.handleBerries();    
            }   
    }

    public void updateBerry() {
        System.out.println("Please choose berry id to update berry: ");
        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.next();
        try {
            int index = Integer.parseInt(input)-1;
                System.out.println(myBerry[index]);
                displayBerryUpdateMenu();
                selectBerryUpdate(index);
            } catch (Exception e) {
                System.out.println("Please choose an existing berry id.");
                myHarvestManager.handleBerries();    
            }   
    }

    public void addBerry() {
        myBerry[counter] = new Berry (1,"",0.0,"","");
            System.out.println("Enter species: ");myBerry[counter].setSpecies(readUpdateInput());
            System.out.println("Enter colour: ");myBerry[counter].setColor(readUpdateInput());        
            System.out.println("Enter weight: ");myBerry[counter].setWeight(readDoubleUpdateInput());    
            System.out.println("Enter taste: ");myBerry[counter].setTaste(readUpdateInput());
            counter++;
                    
            myHarvestManager.handleBerries();
    }

    private void displayBerryUpdateMenu() {
        System.out.println("BENNO’s Harvest-Management (Version 1.0 (C) 2020 by Group 1)\n\n" +
            "UPDATE BERRY MENU\n" +
            "Please select:\n\n" +
            "Update species 1\n" +
            "Update color 2\n" +
            "Update weight 3\n" +
            "Update taste 4\n" + 
            "Back to helper menu 0\n\n" +
            "Please enter your choice:");
    }

    private void selectBerryUpdate(int index) {
        int menuselection = myHarvestManager.readUserInput(0,4);
        switch(menuselection) {
            case 4: myBerry[index].setTaste(readUpdateInput());break;
            case 3: myBerry[index].setWeight(readDoubleUpdateInput());break;
            case 2: myBerry[index].setColor(readUpdateInput());break;
            case 1: myBerry[index].setSpecies(readUpdateInput());break;
            case 0: myHarvestManager.handleHelpers();break;
            default: System.out.println("System input is not valid. Going back to main menu.");break;
        }
    }

    private String readUpdateInput() {
        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.next();
        input.trim();
        if(input.contains("exit")){
            myHarvestManager.menuRun();
        }
        while(input == null || input.matches("[^a-zA-Z]")){
            System.out.println("Please correct input: ");
            input= inputScanner.next();
            input = input.trim();
        }
        return input;  
    }

    private double readDoubleUpdateInput() {
        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.next();
        input.trim();
        if(input.contains("exit")){
            myHarvestManager.menuRun();
        }
       // while()){
            System.out.print("Please enter correct weight: ");
            input = inputScanner.next();
            input = input.trim();
        try {
            double updateInput = Double.parseDouble(input);
        }
            catch (Exception e) {
            System.out.println("Please use correct input:");
            readDoubleUpdateInput();
            } 
       // }
        double updateInput = Double.parseDouble(input);
        return updateInput; 
    }
    
}

