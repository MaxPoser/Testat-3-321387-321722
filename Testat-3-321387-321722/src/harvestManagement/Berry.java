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
public class Berry {

    private final int berryId;
    private String species;
    private Double weight;
    private String color;
    private String taste;
    private static int counter = 1;

    /**
     * @param berryId
     * @param species
     * @param weight
     * @param color
     * @param taste
     */
    public Berry(int berryId, String species, Double weight, String color, String taste) {
        this.berryId = counter;
        this.species = species;
        this.weight = weight;
        this.color = color;
        this.taste = taste;
        counter++;
    }

    /**
     * returns final variable ID of berry.
     *
     * @return
     */
    public int getBerryId() {
        return berryId;
    }

    /**
     * returns name of species.
     *
     * @return
     */
    public String getSpecies() {
        return species;
    }

    /**
     * sets name of species.
     *
     * @param species
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     * returns weight of berry.
     *
     * @return
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * sets weight of berry.
     *
     * @param weight
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    /**
     * returns color of berry.
     *
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     * sets color of berry.
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * returns taste of berry.
     *
     * @return
     */
    public String getTaste() {
        return taste;
    }

    /**
     * sets taste of berry.
     *
     * @param taste
     */
    public void setTaste(String taste) {
        this.taste = taste;
    }

    /**
     * String that is printed when myBerry[index] is printed
     *
     * @return
     */
    public String toString() {
        String berry = "";
        berry = "Berry:" + berryId + ", " + species + ", " + weight + "g, " + color + ", " + taste;
        return berry;

    }
}
