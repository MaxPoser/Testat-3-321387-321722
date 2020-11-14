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
    private int id;
    public String firstName;
    private String lastName;
    private String origin;
    private static int counter = 1;

    public Helper(int id, String firstName, String lastName, String origin) {
        this.id = counter;
        this.firstName = firstName;
        this.lastName = lastName;
        this.origin = origin;
        counter++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
    public String toString(){
        String helper = "";
        helper = "Helper:" + id + ", "+ firstName + ", "+ lastName;
        return helper;
        
    }
}
