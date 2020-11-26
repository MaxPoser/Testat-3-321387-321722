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
    static ErrorMessages em = new ErrorMessages();

    public HarvestManagement() {
    }

    /**
     * main method that starts the programme
     * @param args
     */
    public static void main(String[] args) {
        menuRun();
    }

    /**
     * displays main menu
     */
    public static void displayMainMenu() {
        System.out.println("BENNO’s Harvest-Management (Version 1.0 (C) 2020 by Group 1)\n\n"
                + "MAIN MENU\n"
                + "Please select:\n\n"
                + "Managing helpers 1\n"
                + "Managing berries 2\n"
                + "Program exit 0\n\n"
                + "Please enter your choice: ");

    }

    /**
     * 
     */
    public static void menuRun() {
        while (true) {
            displayMainMenu();
            int menuselection = readUserInput(0, 2);
            switch (menuselection) {
                case 2:
                    handleBerries();
                    break;
                case 1:
                    handleHelpers();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }

    /**
     * gets and checks user input
     * if input cannot be converted into Integer or Integer is smaller or greater than set values,
     * user is requested to correct input and main menu is displayed again
     * @param min
     * @param max
     * @return
     */
    public static int readUserInput(int min, int max) {
        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.next();
        if (input.contains("exit")) {
            menuRun();
        }
        try {
            int choice = Integer.parseInt(input);
        } catch (Exception e) {
            em.chooseOptions();
            menuRun();
        }

        int choice = Integer.parseInt(input);
        while (choice < min || choice > max) {
            em.chooseOptions();
            break;
        }
        return choice;
    }

    /**
     * shows full handleHelpers menu
     * processes correct user input and forwards to choice made
     */
    public static void handleHelpers() {
        myHelperManager.displayHelperMenu();

        int menuselection = readUserInput(0, 4);
        switch (menuselection) {
            case 4:
                myHelperManager.listHelpers();
                break;
            case 3:
                myHelperManager.deleteHelper();
                break;
            case 2:
                myHelperManager.updateHelper();
                break;
            case 1:
                myHelperManager.addHelper();
                break;
            case 0:
                menuRun();
                break;
            default:
                em.inputNotValid();
                em.backLastMenu();
                break;
        }
    }

    /**
     * shows full handleBeriies menu
     * processes correct user input and forwards to choice made
     */
    public static void handleBerries() {
        myBerryManager.displayBerryMenu();

        int menuselection = readUserInput(0, 4);
        switch (menuselection) {
            case 4:
                myBerryManager.listBerries();
                break;
            case 3:
                myBerryManager.deleteBerry();
                break;
            case 2:
                myBerryManager.updateBerry();
                break;
            case 1:
                myBerryManager.addBerry();
                break;
            case 0:
                menuRun();
                break;
            default:
                em.inputNotValid();
                em.backLastMenu();
                break;
        }
    }
}
