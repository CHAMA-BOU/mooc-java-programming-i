
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
public class LiquidContainers {
    public static void main(String[] args) {
        int container1=0;
        int container2=0;
        Scanner scanner= new Scanner(System.in);
        
        while(true){
            System.out.println("First: "+container1+"/100\nSecond: "+container2+"/100");
            String input = scanner.nextLine();
            if(input.equals("quit")){
                break;
            }
            String[] inputSplitted= input.split(" ");
            String command=inputSplitted[0];
            int amount= Integer.valueOf(inputSplitted[1]);
            if(amount<0){
                continue;
            }
            
            if(command.equals("add")){
                container1+=amount;
                if(container1>100){
                    container1=100;
                    continue;
                }
            }
            
            if(command.equals("move")){
                if(amount>container1){
                    amount=container1;
                }
                container1-=amount;
                container2+=amount;
                if(container2>100){
                    container2=100;
                    continue;
                }
            }
            
            if(command.equals("remove")){
                container2-=amount;
                if(container2<0){
                    container2=0;
                }
                
            }
            System.out.println("");
        }
    }
}
