
import java.util.Scanner;
import java.util.ArrayList;
public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input="";
        ArrayList<Integer> nbrList= new ArrayList<>();
        ArrayList<String> names= new ArrayList<>();
        boolean found = false;
        while(true){
            input = scanner.nextLine();
            if(input.equals("")){
                break;
            }   
            String[] array= arrayOf(input);
            int inputNumber=Integer.valueOf(array[1]);
            nbrList.add(inputNumber);
            names.add(array[0]);
            
        }
        System.out.println("Age of the oldest: "+names.get(oldest(nbrList)));
    }

    private static String[] arrayOf(String input) {
        return input.split(",");
    }
    private static int oldest(ArrayList<Integer> list){
        int oldest=list.get(0);
        int i=0;
        int index=0;
        for(int number:list){
            if(number>oldest){
                oldest=number;
                index=i;
            }
            i++;
        }
        return index;
    }
}
