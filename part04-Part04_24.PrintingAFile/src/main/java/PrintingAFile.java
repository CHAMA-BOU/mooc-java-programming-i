
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        
        try (Scanner scan= new Scanner(Paths.get("data.txt"))){
            while(scan.hasNext()){
                System.out.println(scan.nextLine());
            }
        } catch (IOException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
        
    }
}
