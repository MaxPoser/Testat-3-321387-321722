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

    /*
    private String backMenu = ("Changes will not be saved. You will return to the menu. ");
    private String existingID = ("Please choose an existing id. ");
    private String backLastMenu = ("You will be brought back to the last menu. ");
    private String inputNotValid = ("System input is not valid. ");
    private String correctInput = ("Please correct input: ");
    private String chooseOptions = ("Please choose one of the given options. ");

    public ErrorMessages(String backMenu, String existingID, String backLastMenu, String inputNotValid, String correctInput, String chooseOptions) {//Hier stimmt was nicht. Muss hier jede Variable neu compiled werden?
        this.backMenu = backMenu;
        this.existingID = existingID;
        this.backLastMenu = backLastMenu;
        this.inputNotValid = inputNotValid;
        this.correctInput = correctInput;
        this.chooseOptions = chooseOptions;
    }

    public void getBackMenu() {
        System.out.println(backMenu); //Print out hier?
    }

    public String getExistingID() {
        return existingID;
    }

    public String getBackLastMenu() {
        return backLastMenu;
    }

    public String getInputNotValid() {
        return inputNotValid;
    }

    public String getCorrectInput() {
        return correctInput;
    }

    public String getChooseOptions() {
        return chooseOptions;
    }
    
    
    
     */
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

    /*
            
            
    Helper Manager:
    You will be brought back to the last menu.
    System input is not valid.
    Please correct input:
    Please choose an existing helper id.
    Please choose helper id to update helper or enter 'exit' to return to the menu:
    Please choose helper id to delete helper or enter 'exit' to return to the menu:
    
    Berry Manager:
    Changes will not be saved. You will return to the menu.
    Please choose an existing berry id.
    System input is not valid. Going back to main menu.
    
    Harvest Manager:
    Please choose one of the given options.
    System input is not valid. Going back to main menu.

     */
}
