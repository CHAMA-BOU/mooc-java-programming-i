
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class UserInterface {
    private Scanner scanner;
    private Birds birds;

    public UserInterface() {
    }

    public UserInterface(Scanner scanner, Birds birds) {
        this.scanner = scanner;
        this.birds = birds;
    }
    
    public void start() {
        while (true) {
            System.out.println("? ");
            String command = scanner.nextLine();

            if (command.equals("Quit")) {
                break;
            }
            
            if (command.equals("Add")) {
                System.out.println("Name: ");
                String name= scanner.nextLine();
                System.out.println("Name in Latin: ");
                String nameLatin= scanner.nextLine();
                birds.add(new Bird(name, nameLatin));
                continue;
            }
            
            if(command.equals("Observation")) {
                System.out.println("Bird? ");
                String birdName = scanner.nextLine();
                Bird bird = birds.birdByName(birdName);
                if (bird!=null) {
                    bird.increaseObservation();
                    continue;
                }
                System.out.println("Not a bird!");
            }
            
            if (command.equals("All")) {
                birds.printBirds();
                continue;
            }
            
            if (command.equals("One")) {
                System.out.println("Bird? ");
                String birdName = scanner.nextLine();
                Bird bird = birds.birdByName(birdName);
                if (bird!=null) {
                    System.out.println(bird);
                }
            }
        } 
    }
    
}
