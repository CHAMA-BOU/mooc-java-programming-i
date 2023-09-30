
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Stack {
    private ArrayList<String> stringList;

    public Stack() {
        this.stringList= new ArrayList<>();
    }
    
    public boolean isEmpty(){
        return (this.stringList.isEmpty());
    }
    
    public void add(String value){
        this.stringList.add(value);
    }
    
    public ArrayList<String> values(){
        return this.stringList;
    }
    
    public String take(){
        int indexOfTaken= this.stringList.size()-1;
        String taken= this.stringList.get(indexOfTaken);
        this.stringList.remove(indexOfTaken);
        return taken;
    }
}
