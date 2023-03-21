
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        RecipeManager manager = new RecipeManager();
        manager.readRecipe(fileName);
        while (true) {
            printUserMenu();
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {
                manager.listRecipes();
            }

            if (command.equals("find name")) {
                System.out.println("Searched word: ");
                String searched = scanner.nextLine();
                manager.findName(searched);
            }

            if (command.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                int maxTime = Integer.valueOf(scanner.nextLine());
                manager.findCookingTime(maxTime);
            }

            if (command.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                String ingredient = scanner.nextLine();
                manager.findIngredient(ingredient);
            }
        }
    }

    public static void printUserMenu() {
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
        System.out.print("Enter command: ");
    }

}
