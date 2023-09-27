
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nomber=0;
        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while(reader.hasNext()){
                int content= Integer.valueOf(reader.nextLine());
                if(content <= upperBound && content>= lowerBound ){
                    nomber++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        System.out.println("Numbers: "+nomber);
    }

}
