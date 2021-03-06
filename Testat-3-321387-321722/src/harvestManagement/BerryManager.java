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

    public BerryManager() {
        Berry myBerry[];
        HarvestManagement myHarvestManager;
        ErrorMessages em;
        counter = 0;
    }

    Berry myBerry[] = new Berry[1000];
    static HarvestManagement myHarvestManager = new HarvestManagement();
    static ErrorMessages em = new ErrorMessages();
    int counter;

    /**
     * displays berry menu
     */
    public void displayBerryMenu() {
        System.out.println("BENNO’s Harvest-Management (Version 1.0 (C) 2020 by Group 1)\n\n"
                + "MANAGING BERRY MENU\n"
                + "Please select:\n\n"
                + "Create new berry 1\n"
                + "Update a berry 2\n"
                + "Delete a berry 3\n"
                + "Show berry list 4\n"
                + "Back to main menu 0\n\n"
                + "Please enter your choice:");
    }

    /**
     * lists all existing Berry objects
     */
    public void listBerries() {
        System.out.println("Berry index: ");
        for (int index = 0; index < myBerry.length; index++) {
            if (myBerry[index] != null) {
                System.out.println(myBerry[index]);
            }
        }
        myHarvestManager.handleBerries();
    }

    /**
     * asks user to choose berry through id which is supposed to be deleted
     * deletes this berry
     */
    public void deleteBerry() {
        System.out.println("Please choose berry id to delete berry: ");
        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.next();
        if (input.contains("exit")) {
            em.backMenu();
            myHarvestManager.handleBerries();
        } else {
            try {
                int index = Integer.parseInt(input) - 1;
                myBerry[index] = null;
            } catch (Exception e) {
                em.existingID();
                myHarvestManager.handleBerries();
            }
        }
        myHarvestManager.handleBerries();
    }

    /**
     * asks user to choose berry through id which is supposed to be updated
     */
    public void updateBerry() {
        System.out.println("Please choose berry id to update berry: ");
        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.next();
        if (input.contains("exit")) {
            em.backMenu();
            myHarvestManager.handleBerries();
        } else {
            try {
                int index = Integer.parseInt(input) - 1;
                System.out.println(myBerry[index]);
                displayBerryUpdateMenu();
                selectBerryUpdate(index);
                myHarvestManager.handleBerries();
            } catch (Exception e) {
                em.existingID();
                myHarvestManager.handleBerries();
            }
        }
    }

    /**
     * creates a new berry through user input (species, colour, weight, taste)
     * id is configured automatically
     */
    public void addBerry() {
        myBerry[counter] = new Berry(1, "", 0.0, "", "");

        System.out.println("Enter species: ");
        myBerry[counter].setSpecies(readAddInput());
        System.out.println("Enter colour: ");
        myBerry[counter].setColor(readAddInput());
        System.out.println("Enter weight: ");
        myBerry[counter].setWeight(readDoubleUpdateInput());
        System.out.println("Enter taste: ");
        myBerry[counter].setTaste(readAddInput());
        System.out.println(myBerry[counter]);
        counter++;

        myHarvestManager.handleBerries();
    }

    /**
     * displays choices user can make to update berry
     */
    private void displayBerryUpdateMenu() {
        System.out.println("BENNO’s Harvest-Management (Version 1.0 (C) 2020 by Group 1)\n\n"
                + "UPDATE BERRY MENU\n"
                + "Please select:\n\n"
                + "Update species 1\n"
                + "Update color 2\n"
                + "Update weight 3\n"
                + "Update taste 4\n"
                + "Back to helper menu 0\n\n"
                + "Please enter your choice:");
    }

    /**
     * shows full selectBerryUpdate menu processes correct user input and
     * forwards to choice made
     *
     * @param index
     */
    private void selectBerryUpdate(int index) {
        int menuselection = myHarvestManager.readUserInput(0, 4);
        switch (menuselection) {
            case 4:
                System.out.println("Please enter new taste now: ");
                myBerry[index].setTaste(readUpdateInput());
                System.out.println(myBerry[index]);
                break;
            case 3:
                System.out.println("Please enter new weight now: ");
                myBerry[index].setWeight(readDoubleUpdateInput());
                System.out.println(myBerry[index]);
                break;
            case 2:
                System.out.println("Please enter new color now: ");
                myBerry[index].setColor(readUpdateInput());
                System.out.println(myBerry[index]);
                break;
            case 1:
                System.out.println("Please enter new species now: ");
                myBerry[index].setSpecies(readUpdateInput());
                System.out.println(myBerry[index]);
                break;
            case 0:
                myHarvestManager.handleHelpers();
                break;
            default:
                em.inputNotValid();
                em.backLastMenu();
                break;
        }
    }

    /**
     * reads user input and controls it if input equals null or is no letter,
     * user is asked to correct input
     *
     * @return
     */
    private String readUpdateInput() {
        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.next();
        input.trim();
        if (input.contains("exit")) {
            em.backLastMenu();
            myHarvestManager.handleBerries();
        } else {
            while (input == null || input.matches("[^a-zA-Z0-9]*") || input.matches(".*\\d.*")) {
                em.correctInput();
                input = inputScanner.next();
                input = input.trim();
            }
        }
        return input;
    }

    /**
     * reads user input and controls it if input cannot be converted into a
     * double or input is smaller than zero or greater than 200, user is asked
     * to correct input
     *
     * @return
     */
    private double readDoubleUpdateInput() {
        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.next();
        input.trim();

        try {
            double updateInput = Double.parseDouble(input);
            while (updateInput < 0 || updateInput > 200) {
                em.correctInput();
                updateInput = Double.parseDouble(inputScanner.next());
            }
        } catch (Exception e) {
            em.correctInput();
            readDoubleUpdateInput();
        }

        double updateInput = Double.parseDouble(input);
        return updateInput;
    }

    /**
     * reads user input and controls it if input equals null or is no letter,
     * user is asked to correct input
     *
     * @return
     */
    private String readAddInput() {
        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.next();
        input.trim();

        while (input == null || input.matches("[^a-zA-Z0-9]*") || input.matches(".*\\d.*")) {
            em.correctInput();
            input = inputScanner.next();
            input = input.trim();
        }

        return input;
    }

}
