/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Bird {
    private String name;
    private String nameLatin;
    private int observation;

    public Bird() {
        this.observation=0;
    }

    public Bird(String name, String nameLatin) {
        this(name, nameLatin, 0);
    }
    
    public Bird(String name, String nameLatin, int observation) {
        this.name = name;
        this.nameLatin = nameLatin;
        this.observation = observation;
    }

    public String getName() {
        return name;
    }

    public String getNameLatin() {
        return nameLatin;
    }

    public int getObservation() {
        return observation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNameLatin(String nameLatin) {
        this.nameLatin = nameLatin;
    }

    public void setObservation(int observation) {
        this.observation = observation;
    }
    
    public void increaseObservation() {
        this.observation++;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.nameLatin + "): " + this.observation + " observations";
    }
    
    
}
