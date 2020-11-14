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
    HelperManager myHelperManager = new HelperManager();
    BerryManager myBerryManager = new BerryManager();

    public static void main(String[] args) {
        menuRun();

            }
    public void displayMainMenu(){
            System.out.println("BENNO’s Harvest-Management (Version 1.0 (C) 2020 by Group 1)    " +
            "MAIN MENU\n" +
            "Please select:\n" +
            "Managing helpers 1\n" +
            "Managing berry species 2\n" +
            "Program exit 0\n" +
            "Please enter your choice: ");
            Scanner inputScanner = new Scanner(System.in);
            String input = inputScanner.next();
            try {
            int i = Integer.parseInt(input.trim());
            } 
            catch (NumberFormatException e) {
            int i = 0;
            } 
        }
    private void menuRun(){
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
        
    public int readUserInput(int min, int max){
        int answer = min-1;
        while (answer < min || answer > max){
        }
        return answer;
    }
    private void handleHelpers(){
    myHelperManager.displayHelperMenu();

    int menuselection = readUserinput(0,4);
    switch(menuselection) {
        case 4: myHelperManager.listHelpers();
        case 3: myHelperManager.deleteHelper();
        case 2: myHelperManager.updateHelper();
        case 1: myHelperManager.addHelper();
        case 0: System.exit(0);
        default: break;
    }         
}
    private void handleBerries(){
    myBerryManager.displayBerryMenu();

    int menuselection = readUserinput(0,4);
    switch(menuselection) {
        case 4: myBerryManager.listBerries();
        case 3: myBerryManager.deleteBerry();
        case 2: myBerryManager.updateBerry();
        case 1: myBerryManager.addBerry();
        case 0: System.exit(0);
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