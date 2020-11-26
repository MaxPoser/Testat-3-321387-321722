/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harvestManagement;

/**
 * collection of error messages to be used in all other classes in need.
 *
 * @author maxpo
 */
public class ErrorMessages {

    /**
     * states that user is brought back to menu.
     */
    public void backMenu() {
        System.out.println("Changes will not be saved. You will return to the menu. ");
    }

    /**
     * states that user should choose an ID which already exists.
     */
    public void existingID() {
        System.out.println("Please choose an existing id. ");
    }

    /**
     * Informs the user that he will be brought back to the previous menu.
     */
    public void backLastMenu() {
        System.out.println("You will be brought back to the last menu. ");
    }

    /**
     * Informs the user that the entered input is invalid.
     */
    public void inputNotValid() {
        System.out.println("System input is not valid. ");
    }

    /**
     * Requests the user to correct the input.
     */
    public void correctInput() {
        System.out.println("Please correct input: ");
    }

    /**
     * Requests the user to choose one of the given opstions.
     */
    public void chooseOptions() {
        System.out.println("Please choose one of the given options. ");
    }

}
