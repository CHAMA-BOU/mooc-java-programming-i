
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int up = Integer.valueOf(scan.nextLine());
        if (up< 0){
            System.out.println("impossible!");
        } else if (0<=up && up<=49){
            System.out.println("failed");
        } else if (50<=up && up <=59){
            System.out.println("1");
        } else if (60<=up && up<=69){
            System.out.println("2");
        } else if (70<=up && up<=79){
            System.out.println("3");
        } else if (80<=up && up<=89){
            System.out.println("4");
        } else if (90<=up && up<=100){
            System.out.println("5");
        } else {
            System.out.println("incredible!");
        }

    }
}
