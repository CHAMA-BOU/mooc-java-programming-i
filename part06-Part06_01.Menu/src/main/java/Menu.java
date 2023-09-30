
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }
    public void addMeal(String meal){
        if(!meals.contains(meal)){
            this.meals.add(meal);
        }
    }
    public void printMeals(){
        for(String item:this.meals){
            System.out.println(item);
        }
    }
    public void clearMenu(){
        this.meals.clear();
    }

    // implement the required methods here
}
