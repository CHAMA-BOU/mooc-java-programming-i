/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */import java.util.Scanner;
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionnary;

    public TextUI(Scanner scanner, SimpleDictionary dictionnary) {
        this.scanner = scanner;
        this.dictionnary = dictionnary;
    }
    public void start(){
        while(true){
            System.out.print("Command: ");
            String userText=scanner.nextLine();
            if(userText.equals("end")){
                break;
            }
            if(userText.equals("add")){
                System.out.print("Word: ");
                String word=scanner.nextLine();
                System.out.print("Translation: ");
                String translation=scanner.nextLine();
                this.dictionnary.add(word, translation);
                continue;
            }
            if(userText.equals("search")){
                System.out.print("To be translated: ");
                String word=scanner.nextLine();
                String translation=this.dictionnary.translate(word);
                if(translation==null){
                    System.out.println("Word "+word+" was not found");
                    continue;
                }
                System.out.println("Translation: "+translation);
                continue;
            }
            System.out.println("Unknown command");
            
        }
        System.out.println("Bye bye!");
        
    }
}
