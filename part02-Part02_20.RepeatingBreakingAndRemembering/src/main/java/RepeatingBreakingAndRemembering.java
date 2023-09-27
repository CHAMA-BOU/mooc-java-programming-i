
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0, number=0,even=0,odd=0;
        System.out.println("Give numbers:");
        while(true){
            int input= Integer.valueOf(scanner.nextLine());
            if (input==-1){
                System.out.println("Thx! Bye!");
                break;
            }
            sum+=input;
            number++;
            if (input%2==0){
                even++;
            } else{
                odd++;
            }
        }
        System.out.println("Sum: "+sum);
        System.out.println("Numbers: "+number);
        System.out.println("Average: "+1.0*sum/number);
        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);
    }
}
