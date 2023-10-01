
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
    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
            String command= this.command();
            if(command.equals("X")){
                break;
            }
            this.answeringCommand(command);
        }
    }
    
    public String command(){
        System.out.println("Commands:\n" + "1 - add a joke\n" + "2 - draw a joke\n" + "3 - list jokes\n" + "X - stop");
        return scanner.nextLine();
    }

    public void answeringCommand(String command){
        switch(command){
            case "1":
                this.addingJoke();
                break;
            case "2":
                this.printingRandomJoke();
                break;
            case "3":
                this.printingJokes();
                break;
        }
    }
    
    private void addingJoke() {
        System.out.println("Write the joke to be added:");
        String joke = scanner.nextLine();
        this.jokeManager.addJoke(joke);
    }

    private void printingRandomJoke() {
        System.out.println(this.jokeManager.drawJoke());
    }

    private void printingJokes() {
        this.jokeManager.printJokes();
    }
    
    
}
