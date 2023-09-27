
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int variable = Integer.valueOf(scanner.nextLine());
        if(variable <0){
            System.out.println(-1*variable);
        }else{
            System.out.println(variable);
        }
    }
}
