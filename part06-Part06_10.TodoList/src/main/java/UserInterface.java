/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
import java.util.Scanner;
public class UserInterface {
    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(TodoList todoList,Scanner scanner) {
        this.scanner = scanner;
        this.todoList = todoList;
    }
    public void start(){
        while(true){
            System.out.print("Command: ");
            String command= this.scanner.nextLine();
            if(command.equals("stop")){
                break;
            }
            usefulCommand(command);
        }
    }
    public void usefulCommand(String command){
        if(command.equals("add")){
            add();
        }else if (command.equals("list")){
            list();
        } else if(command.equals("remove")){
            remove();
        }
        }
    public void add(){
        System.out.print("To add: ");
        String user= this.scanner.nextLine();
        this.todoList.add(user);
    }
    public void list(){
        this.todoList.print();
    }
    public void remove(){
        System.out.print("Which one is removed? ");
        int number= Integer.valueOf(this.scanner.nextLine());
        this.todoList.remove(number);
    }
}
