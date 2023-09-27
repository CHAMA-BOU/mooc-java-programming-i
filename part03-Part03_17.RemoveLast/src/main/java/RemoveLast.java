
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> abc= new ArrayList<>();
        abc.add("a");
        abc.add("b");
        abc.add("c");
        abc.add("dada");
        removeLast(abc);
        System.out.println(abc);
    }
    public static void removeLast(ArrayList<String> strings){
        if (!strings.isEmpty()){
            strings.remove(strings.get(strings.size()-1));
        }
    }
}
