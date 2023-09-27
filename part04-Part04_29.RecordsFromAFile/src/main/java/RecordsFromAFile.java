
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String fileName= scanner.nextLine();
        try (Scanner readingFile= new Scanner(Paths.get(fileName))) {
            while(readingFile.hasNext()){
                String row=readingFile.nextLine();
                String[] splitted= row.split(",");
                String name= splitted[0];
                int age= Integer.valueOf(splitted[1]);
                if(age==1){
                    System.out.println(name+", age: 1 year");
                    continue;
                }
                System.out.println(name+", age: "+age+" years");
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        
    }
}
