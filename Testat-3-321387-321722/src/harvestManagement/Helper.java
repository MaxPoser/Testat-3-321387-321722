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
public class Helper {
    private final int id;
    public String firstName;
    private String lastName;
    private String gender;
    private String origin;
    private static int counter = 1;
/**
 * 
 * @param id
 * @param firstName
 * @param lastName
 * @param gender
 * @param origin 
 */
    public Helper(int id, String firstName, String lastName,String gender, String origin) {
        this.id = counter;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.origin = origin;
        counter++;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }
/**
 * 
 * @param firstName 
 */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
/**
 * returns last name of helper
 * @return 
 */
    public String getLastName() {
        return lastName;
    }
/**
 * 
 * @param lastName 
 */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }
/**
 * 
 * @param gender 
 */
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOrigin() {
        return origin;
    }
/**
 *  
 * @param origin 
 */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getCounter() {
        return counter;
    }
    
    public String toString(){
        String helper = "";
        helper = "Helper:" + id + ", "+ firstName + ", "+ lastName + ", " + gender + ", " + origin;
        return helper;
        
    }
}
