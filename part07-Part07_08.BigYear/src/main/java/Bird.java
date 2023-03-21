/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cagri
 */
public class Bird {

    private String name;
    private String latin;
    private int observation;

    public Bird(String name, String latin) {
        this.name = name;
        this.latin = latin;
        observation = 0;
    }

    public String getName() {
        return name;
    }

    public void addObservation() {
        observation++;
    }

    public String toString() {
        return name + " (" + latin + "): " + observation + " observations";
    }
}
