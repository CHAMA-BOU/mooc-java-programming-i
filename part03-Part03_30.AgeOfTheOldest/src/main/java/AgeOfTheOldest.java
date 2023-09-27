
import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input="";
        ArrayList<Integer> nbrList= new ArrayList<>();
        boolean found = false;
        while(true){
            input = scanner.nextLine();
            if(input.equals("")){
                break;
            }   
            String[] array= arrayOf(input);
            int inputNumber=Integer.valueOf(array[1]);
            nbrList.add(inputNumber);
            
        }
        System.out.println("Age of the oldest: "+oldest(nbrList));
    }

    private static String[] arrayOf(String input) {
        return input.split(",");
    }
    private static int oldest(ArrayList<Integer> list){
        int oldest=list.get(0);
        for(int number:list){
            if(number>oldest){
                oldest=number;
            }
        }
        return oldest;
    }
}
