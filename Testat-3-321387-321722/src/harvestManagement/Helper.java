/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harvestManagement;

/**
 *
 *
 * @author Sina Stumpp
 */
public class Helper {

    private final int id;
    private String firstName;
    private String lastName;
    private String gender;
    private String origin;
    private static int counter = 1;

    /**
     * @param id
     * @param firstName
     * @param lastName
     * @param gender
     * @param origin
     */
    public Helper(int id, String firstName, String lastName, String gender, String origin) {
        this.id = counter;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.origin = origin;
        counter++;
    }

    /**
     * returns ID of helper.
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * returns first name of helper.
     *
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * sets first name of helper.
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * returns last name of helper.
     *
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * sets last name of helper.
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * returns gender of helper.
     *
     * @return
     */
    public String getGender() {
        return gender;
    }

    /**
     * sets gender of helper.
     *
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * returns origin of helper.
     *
     * @return
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * sets origin of helper.
     *
     * @param origin
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * String that is printed when myHelper[index] is printed
     *
     * @return
     */
    public String toString() {
        String helper = "";
        helper = "Helper:" + id + ", " + firstName + ", " + lastName + ", " + gender + ", " + origin;
        return helper;

    }
}
