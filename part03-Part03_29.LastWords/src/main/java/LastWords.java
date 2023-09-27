
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input="";
        while(true){
            input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            giveLast(input);
        }
        
        

    }

    private static void giveLast(String input) {
        String[] result=input.split(" ");
        System.out.println(result[result.length-1]);
    }
}
