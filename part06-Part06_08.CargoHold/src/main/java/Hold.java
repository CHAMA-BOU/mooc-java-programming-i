/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
import java.util.ArrayList;
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> hold;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        hold= new ArrayList<>();
    }
    public void addSuitcase(Suitcase suitcase){
        int sumWeight=0;
        for(Suitcase i: this.hold){
            sumWeight+=i.totalWeight();
        }
        if(sumWeight+suitcase.totalWeight()<=this.maxWeight){
            this.hold.add(suitcase);
        }
    }
    public String toString(){
        int sumWeight=0;
        for(Suitcase i: this.hold){
            sumWeight+=i.totalWeight();
        }
        return  this.hold.size()+" suitcases ("+sumWeight+" kg)";
    }
    public void printItems(){
        for(Suitcase suitcase:this.hold){
            suitcase.printItems();
        }
    }
    
}
