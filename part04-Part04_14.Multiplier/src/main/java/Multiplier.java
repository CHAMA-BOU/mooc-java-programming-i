/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Multiplier {
    private int number;
    public Multiplier (int number){
        this.number= number;
    }
    public int multiply(int number){
        return this.number*number;
    }
    public String toString() {
        return "the number is " + this.number + "itsmultiplication by 4 is "+ this.multiply(4);
    }
}
