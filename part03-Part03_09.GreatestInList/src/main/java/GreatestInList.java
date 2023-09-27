
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        int indexGreatest=0;
        int greatest=list.get(0);
        System.out.println("");
        for(int i=1;i<=list.size()-1;i++){
            if(list.get(i)>greatest){
                greatest=list.get(i);
                indexGreatest=i;
            }         
        }
        System.out.println("The greatest number: "+greatest);
        System.out.println("index of the greatest number is "+indexGreatest);
        // implement finding the greatest number in the list here
    }
}
