/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harvestManagement;

/**
 *
 * @author Sina Stumpp
 */
public class HelperManager {
    Helper myHelper[] = new Helper[1000];

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
                System.out.println(myHelper[0]);
            }   
        }   
    }

    public void deleteHelper() {
        myHelper[0] = null;
       
    }

    public void updateHelper(int i) {
        displayUpdateMenu();
        myHelper[i].firstName = myHelper[i].setFirstName();
       
    }

    public void addHelper() {
        myHelper[0] = new Helper (23, "Jan", "Müller","GER");
        
    }

    public int readUserinput(int min, int max) {
        int answer = min-1;
        while (answer < min || answer > max){
        }
        return answer;

    
    }
    public void displayUpdateMenu(){
        System.out.println("BENNO’s Harvest-Management (Version 1.0 (C) 2020 by Group 1)\n" +
            "UPDATE HELPERS MENU\n" +
            "Please select:\n" +
            "Update first name 1\n" +
            "Update last name 2\n" +
            "Update a helper 3\n" +
            "Show helper list 4\n" +
            "Back to main menu 0\n" +
            "Please enter your choice:");
        
    }
}
/*
CRUD programmieren + auf Objekte beziehen (index??)
Scanner integrieren??
submenu für update und welche variablen können gesetted werden
*/