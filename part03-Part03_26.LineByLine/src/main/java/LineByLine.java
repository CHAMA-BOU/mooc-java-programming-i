
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input="";
        while(true){
            input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            splittingString(input);
        }
        
        

    }

    private static void splittingString(String input) {
        String[] result=input.split(" ");
        for(String word:result){
            System.out.println(word);
        }
    }
}
