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
public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }
    public void addItem(Item item){
        int sumWeight=0;
        for(Item i: this.items){
            sumWeight+=i.getWeight();
        }
        if(sumWeight+item.getWeight()<=this.maxWeight){
            this.items.add(item);
        }
    }
    public String toString(){
        int sumWeight=0;
        if(this.items.isEmpty()){
            return "no items "+"("+sumWeight+" kg)";
        }
        for(Item i: this.items){
            sumWeight+=i.getWeight();
        }
        if(this.items.size()==1){
            return "1 item "+ "("+sumWeight+" kg)";
        }
        return this.items.size()+ " items "+"("+sumWeight+" kg)";
    }
    public void printItems(){
        for(Item item:items){
            System.out.println(item);
        }
    }
    public int totalWeight(){
        int total=0;
        for(Item i: this.items){
            total+=i.getWeight();
        }
        return total;
    }
    public Item heaviestItem(){
        if(this.items.isEmpty()){
            return null;
        }
        Item heaviest= this.items.get(0);
        for(Item item:items){
            if(item.getWeight()>heaviest.getWeight()){
                heaviest= item;
            }
        }
        return heaviest;
    }
}
