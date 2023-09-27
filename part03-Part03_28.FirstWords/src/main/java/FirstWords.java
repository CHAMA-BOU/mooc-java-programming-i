
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input="";
        while(true){
            input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            giveFirst(input);
        }
        
        

    }

    private static void giveFirst(String input) {
        String[] result=input.split(" ");
        System.out.println(result[0]);
    }
}
