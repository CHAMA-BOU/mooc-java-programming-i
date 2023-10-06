
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
public class Birds {
    
    private ArrayList<Bird> birds;

    public Birds() {
        this.birds = new ArrayList<>();
    }
    
    public void add (Bird bird) {
        birds.add(bird);
    }

    public Bird birdByName(String name) {
        for(Bird bird: birds) {
            if (bird.getName().equals(name)) {
                return bird;
            }
        }
        return null;
    }

    public void printBirds() {
        for (Bird bird:birds) {
            System.out.println(bird);
        }
    }
    
    
    
}
