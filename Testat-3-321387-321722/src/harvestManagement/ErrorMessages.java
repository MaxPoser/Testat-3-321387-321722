/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harvestManagement;

/**
 *
 * @author maxpo
 */
public class ErrorMessages {
    /**
     * states that user is brought back to menu
     */
    public void backMenu(){
        System.out.println("Changes will not be saved. You will return to the menu. ");
    }
    
    public void existingID(){
        System.out.println("Please choose an existing id. ");
    }
    
    public void backLastMenu(){
        System.out.println("You will be brought back to the last menu. ");
    }
    
    public void inputNotValid(){
        System.out.println("System input is not valid. ");
    }
    
    public void correctInput(){
        System.out.println("Please correct input: ");
    }
    
    public void chooseOptions(){
        System.out.println("Please choose one of the given options. ");
    }
            
             
            
/*
            
    ALLES PRIVATE MIT GETTER UND SETTER??
            
            
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
