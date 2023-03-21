
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cagri
 */
public class RecipeManager {

    private ArrayList<String> ingredients;
    private ArrayList<Recipe> recipes;

    public RecipeManager() {
        this.ingredients = new ArrayList<>();
        this.recipes = new ArrayList<>();
    }

    public void readRecipe(String fileName) {
        try (Scanner input = new Scanner(Paths.get(fileName))) {
            while (input.hasNextLine()) {
                String name = input.nextLine();
                int time = Integer.valueOf(input.nextLine());
                Recipe recipe = new Recipe(name, time);
                recipes.add(recipe);
                while (input.hasNextLine()) {
                    String ingredient = input.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    recipe.addIngredients(ingredient);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void listRecipes() {
        System.out.println("Recipes: ");
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }

    public void findName(String nameToSearch) {
        System.out.println("Recipes: ");
        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(nameToSearch)) {
                System.out.println(recipe);
            }
        }
    }

    public void findCookingTime(int maxTime) {
        System.out.println("Recipes: ");
        for (Recipe recipe : recipes) {
            if (recipe.getTime() <= maxTime) {
                System.out.println(recipe);
            }
        }
    }

    public void findIngredient(String ingredient) {
        for (int i = 0; i < recipes.size(); i++) {
            if (recipes.get(i).getIngredients().contains(ingredient)) {
                System.out.println(recipes.get(i));
            }
        }
    }

}
