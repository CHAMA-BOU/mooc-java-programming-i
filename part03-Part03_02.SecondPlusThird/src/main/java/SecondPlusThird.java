
import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            
            numbers.add(number);
        }
        int value= numbers.get(0);
        System.out.println(value==value);
        System.out.println(numbers.get(0)==numbers.get(0));
        
        System.out.println(numbers.get(1)+numbers.get(2));
    }
}
