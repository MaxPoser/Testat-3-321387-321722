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
public class HarvestManagement {
    static HelperManager myHelperManager = new HelperManager();
    static BerryManager myBerryManager = new BerryManager();

    public static void main(String[] args) {
        menuRun();

            }
    public static void displayMainMenu(){
            System.out.println("BENNO’s Harvest-Management (Version 1.0 (C) 2020 by Group 1)\n\n" +
            "MAIN MENU\n" +
            "Please select:\n\n" +
            "Managing helpers 1\n" +
            "Managing berries 2\n" +
            "Program exit 0\n\n" +
            "Please enter your choice: ");

        }
    private static void menuRun(){
        while (true){
            displayMainMenu();
            int menuselection = readUserInput(0,2);
            switch(menuselection){
                case 2: handleBerries(); break;
                case 1: handleHelpers(); break;
                case 0: System.exit(0); break;
                default: break;
            }        
        }
    }
        
    public static int readUserInput(int min, int max){
        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.next();
        try {
            int choice = Integer.parseInt(input);
            } catch (Exception e) {
                menuRun();
            }

        int choice = Integer.parseInt(input);
        while (choice < min || choice > max){
            System.out.println("Please choose one of the given options:");
            break;
        }
        return choice;
    }
    public static void handleHelpers(){
    myHelperManager.displayHelperMenu();

    int menuselection = readUserInput(0,4);
    switch(menuselection) {
        case 4: myHelperManager.listHelpers();break;
        case 3: myHelperManager.deleteHelper();break;
        case 2: myHelperManager.updateHelper();break;
        case 1: myHelperManager.addHelper();break;
        case 0: menuRun();break;
        default: break;
    }         
}
    public static void handleBerries(){
    myBerryManager.displayBerryMenu();

    int menuselection = readUserInput(0,4);
    switch(menuselection) {
        case 4: myBerryManager.listBerries();break;
        case 3: myBerryManager.deleteBerry();break;
        case 2: myBerryManager.updateBerry();break;
        case 1: myBerryManager.addBerry();break;
        case 0: menuRun();break;
        default: break;
    }  
    }
}
/*
wo kommt scanner hin(displaymenu oder readinput?
while schleife readInput, was muss rein?
fehler beheben private?
menuRun static?
main method
input control
*/