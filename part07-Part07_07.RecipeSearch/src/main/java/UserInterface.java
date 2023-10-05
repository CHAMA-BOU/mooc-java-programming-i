
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class UserInterface {
    private Scanner scanner;
    private ArrayList<Recipe> recipes;

    public UserInterface(ArrayList<Recipe> recipes, Scanner scanner) {
        this.scanner = scanner;
        this.recipes = recipes;
    }
    
    public void start() {
        System.out.println("File to read: ");
        String file= scanner.nextLine();
        readRecipes(file);
        System.out.println("\nCommands:\n"
                + "list - lists the recipes\n"
                + "stop - stops the program\n"
                + "find name - searches recipes by name\n"
                + "find cooking time - searches recipes by cooking time\n"
                + "find ingredient - searches recipes by ingredient");
        while(true) {
            System.out.println("\nEnter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }
            
            if (command.equals("list")) {
                list();
                continue;
            }
            
            if (command.equals("find name")) {
                System.out.println("Searched word: ");
                String searchedName= scanner.nextLine();
                findName(searchedName);
                continue;
            }
            
            if (command.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                int maxCookingTime = Integer.valueOf(scanner.nextLine());
                findCookingTime(maxCookingTime);
                
            }
            if (command.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                String ingredient = scanner.nextLine();
                findIngredient(ingredient);
                
            }
        }
        
    }
    public void readRecipes(String file) {
        try (Scanner fileScanner= new Scanner(Paths.get(file))) {
            int index=1;
            Recipe recipe= new Recipe();
            while(fileScanner.hasNext()) {
                String line= fileScanner.nextLine();
                if(line.isEmpty()) {
                    recipes.add(recipe);
                    index=1;
                    recipe = new Recipe();
                    continue;
                }
                if (index==1) {
                    recipe.setName(line);
                    index ++;
                    continue;
                }
                if (index==2) {
                    recipe.setCookingTime(Integer.valueOf(line));
                    index ++;
                    continue;
                }
                recipe.addIngredient(line);
                
            }
            recipes.add(recipe);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void list() {
        System.out.println("\nRecipes:");
        for(Recipe recipe: recipes) {
            System.out.println(recipe);
        }
    }

    public void findName(String searchedName) {
        System.out.println("\nRecipes:");
        for (Recipe recipe:this.recipes) {
            if (recipe.getName().contains(searchedName)) {
                System.out.println(recipe);
            }
        }
    }

    public void findCookingTime(int maxCookingTime) {
        System.out.println("\nRecipes:");
        for (Recipe recipe:this.recipes) {
            if (recipe.getCookingTime()<=maxCookingTime) {
                System.out.println(recipe);
            }
        }
    }

    public void findIngredient(String ingredient) {
        System.out.println("\nRecipes:");
        for (Recipe recipe:this.recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
        }
    }
}


