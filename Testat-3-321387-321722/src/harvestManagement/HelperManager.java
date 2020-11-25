/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harvestManagement;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Sina Stumpp
 */
public class HelperManager {
    Helper myHelper[] = new Helper[1000];
    static HarvestManagement myHarvestManager = new HarvestManagement();
    static ErrorMessages em = new ErrorMessages();
    int counter = 0;
        /**
         * 
         */
        public void displayHelperMenu() {
        System.out.println("BENNO’s Harvest-Management (Version 1.0 (C) 2020 by Group 13)\n\n" +
            "MANAGING HELPERS MENU\n" +
            "Please select:\n\n" +
            "Create new helper 1\n" +
            "Update a helper 2\n" +
            "Delete a helper 3\n" +
            "Show helper list 4\n" +
            "Back to main menu 0\n\n" +
            "Please enter your choice:");
    }
    /**
     * 
     */    
    public void listHelpers() {
        System.out.println("Helper index: ");
        for (int index = 0; index < myHelper.length; index++) {
            if (myHelper[index] != null) {
                System.out.println(myHelper[index]);
            }   
        }
        myHarvestManager.handleHelpers();
    }
    /**
     * 
     */
    public void deleteHelper() {
        System.out.println("Please choose helper id to delete helper or enter 'exit' to return to the menu: ");
        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.next();
        if(input.contains("exit")){
            em.backMenu();
            myHarvestManager.handleHelpers();
        }
        else{
            try {
                int index = Integer.parseInt(input)-1;
                myHelper[index] = null;
                } catch (Exception e) {
                    em.existingID();
                    myHarvestManager.handleHelpers();    
                }
        }    
    }
    /**
     * 
     */
    public void updateHelper() {
        System.out.println("Please choose helper id to update helper or enter 'exit' to return to the menu: ");
        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.next();
        if(input.contains("exit")){
            em.backMenu();
            myHarvestManager.handleHelpers();
        }
        else{ 
            try {
                int index = Integer.parseInt(input)-1;
                    System.out.println(myHelper[index]);
                    displayHelperUpdateMenu();
                    selectHelperUpdate(index);
                    myHarvestManager.handleHelpers();
                } catch (Exception e) {
                    em.existingID();
                    myHarvestManager.handleHelpers();
                
                }
        }
    }
    /**
     * 
     */
    public void addHelper() {
        myHelper[counter] = new Helper (1,"","","","");
            
            System.out.println("Enter first name: ");myHelper[counter].setFirstName(readAddInput());
            System.out.println("Enter last name: ");myHelper[counter].setLastName(readAddInput());
            System.out.println("Enter gender: ");myHelper[counter].setGender(readGenderInput());
            System.out.println("Enter origin: ");myHelper[counter].setOrigin(readAddInput());

            System.out.println(myHelper[counter]);
            counter++;

        myHarvestManager.handleHelpers();
                
    }
        
    public void displayHelperUpdateMenu(){
        System.out.println("BENNO’s Harvest-Management (Version 1.0 (C) 2020 by Group 1)\n\n" +
            "UPDATE HELPERS MENU\n" +
            "Please select:\n\n" +
            "Update first name 1\n" +
            "Update last name 2\n" +
            "Update gender 3\n" +
            "Back to helper menu 0\n\n" +
            "Please enter your choice:");
    }

    private void selectHelperUpdate(int index) {
        int menuselection = myHarvestManager.readUserInput(0,3);
        switch(menuselection) {
            case 3: System.out.println("Please enter new gender now: ");myHelper[index].setGender(readGenderInput());break;
            case 2: System.out.println("Please enter new last name now: ");myHelper[index].setLastName(readUpdateInput());break;
            case 1: System.out.println("Please enter new first name now: ");myHelper[index].setFirstName(readUpdateInput());break;
            case 0: myHarvestManager.handleHelpers();break;
            default: em.inputNotValid();em.backLastMenu();break;
    }
    }
    /**
     * reads user input and controls it
     * @return 
     */
    public String readUpdateInput(){
        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.next();
        input.trim();
        if(input.contains("exit")){
        em.backLastMenu();
        //Stop addHelper
        //Command to break Switch
        //selectHelperUpdate.break;
        myHarvestManager.handleHelpers();
        //System.out.println("Changes will not be safed. You will return to the menu.");
        }
        else {
            while(input == null || input.matches("[^a-zA-Z]")){
            em.correctInput();
            input= inputScanner.next();
            input = input.trim();
            }
        }
        return input;
    }
    public String readAddInput(){
        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.next();
        input.trim();
        
        
        while(input == null || input.matches("[^a-zA-Z]")){
            em.correctInput();
            input= inputScanner.next();
            input = input.trim();
        }
        
        return input;
    }
    
    public String readGenderInput(){
        System.out.println("Please choose a gender: male, female, diverse: ");
        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.next();
        boolean val = false;
        while(val == false){
            Pattern pattern = Pattern.compile("[mM]ale|[fF]emale|[dD]iverse");
            Matcher match = pattern.matcher(input);
            val = match.find();
            if(val == true){
                break;
            }
            em.correctInput();
            input = inputScanner.next();
            input.trim();
        }
                 
        return input;  
   }
    public static boolean isNullOrEmpty(String str) {
        if(str != null && !str.isEmpty())
            return false;
        return true;
    }
}

