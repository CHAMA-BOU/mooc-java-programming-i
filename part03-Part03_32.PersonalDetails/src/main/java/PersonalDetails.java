
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int longestSize=0;
        String longestName="";
        int count=0;
        int sum=0;
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[] array= input.split(",");
            int year=Integer.valueOf(array[1]);
            String name=array[0];
            int currentSize=name.length();
            sum+=year;
            count+=1;
            if(currentSize>longestSize){
                longestSize=currentSize;
                longestName=name;
            }
            
            
        }
        System.out.println("Longest name: "+longestName);
        if(count>0){
            System.out.println("Average of the birth years: "+ 1.0*sum/count);
        }

    }
}
