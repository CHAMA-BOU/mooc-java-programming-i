
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        int number=0;
        while(true){
            int input=Integer.valueOf(scanner.nextLine());
            if(input==0){
                break;
            }
            if(input>0){
                sum+=input;
                number++;
            }
        }
        if(number>0){
            System.out.println(1.0*sum/number);
        }else{
            System.out.println("Cannot calculate the average");
        }

    }
}
