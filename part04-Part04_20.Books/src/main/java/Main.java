import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner= new Scanner(System.in);
        ArrayList<Book> book=new ArrayList<>();
        while(true){
            System.out.print("Title: ");
            String name= scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            System.out.print("Pages: ");
            int pages=Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int publicationYear=Integer.valueOf(scanner.nextLine());
            book.add(new Book(name, pages,publicationYear));
        }
        System.out.print("What information will be printed? ");
        String proposition=scanner.nextLine();
        if(proposition.equals("everything")){
            for(Book livre:book){
                System.out.println(livre);
            }
        } else if(proposition.equals("name")){
            for(Book livre:book){
                System.out.println(livre.getName());
            }
        }
    }
}
