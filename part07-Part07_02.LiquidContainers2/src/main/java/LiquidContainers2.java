
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container1= new Container();
        Container container2= new Container();
        String command="";
        int value=0;
         while (true) {
            System.out.println("First: "+container1);
            System.out.println("Second: "+container2);
            String input = scan.nextLine();
            String[] user= input.split(" ");
            if(user.length==2){
                command= user[0];
                value= Integer.valueOf(user[1]);   
            }
            if (input.equals("quit")) {
                break;
            }
            if(command.equals("add")){
                container1.add(value);
            }
            if(command.equals("move")){
                int lastAmount=container1.contains();
                container1.remove(value);
                if(container1.contains()==0){
                    container2.add(lastAmount);
                } else{
                    container2.add(value);
                }
            }
            if(command.equals("remove")){
                container2.remove(value);
            }
            System.out.println("");

        }
    }

}
