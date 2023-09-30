
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    public String toString(){
        String same="The collection " + this.name+" ";
        if(this.elements.isEmpty()){
            return same+ "is empty.";
        }
        String content="";
        for (String item:this.elements){
            content+="\n"+item;
        }
        if(elements.size()==1){
            return same + "has " + this.elements.size()+" element:" + content;
        }
        return same + "has " + this.elements.size()+" elements:" + content;
    }
    
}
