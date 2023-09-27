
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        // implement here a program that reads user input
        // until the user enters 9999
        while(true){
            int input=Integer.valueOf(scanner.nextLine());
            if(input==9999){
                break;
            }
            list.add(input);
        }
        
        int smallest=list.get(0);
        int indexOfSmallest=0;
        for(int i=1;i<list.size();i++){
            int value=list.get(i);
            if(value<smallest){
                smallest=value;
            }
        }
        System.out.println("Smallest number: "+smallest);
        for(int i=0;i<list.size();i++){
            if(list.get(i)==smallest){
                System.out.println("Found at index: "+i);
            }
        }

    }
}
