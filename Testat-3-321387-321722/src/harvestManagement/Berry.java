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
    int berryId;
    String species;
    Double weight;
    String color;
    String taste;
    private static int counter = 1;

    public Berry(int berryId, String species, Double weight, String color, String taste) {
        this.berryId = counter;
        this.species = species;
        this.weight = weight;
        this.color = color;
        this.taste = taste;
        counter++;
    }

    public int getBerryId() {
        return berryId;
    }

    public void setBerryId(int berryId) {
        this.berryId = berryId;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
    
    
}
//alles