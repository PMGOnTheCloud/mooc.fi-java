
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        System.out.print("File to read: ");
        String file = scanner.nextLine();

        Cuisine cuisine = new Cuisine();

        try {
            FileHandler.parseFileAndOrganiseCuisine(file, cuisine);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("");
        System.out.println("Commands: ");
        System.out.println("list - lists the recipes");
        System.out.println("stops - stop the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");

        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;

            } else if (command.equals("list")) {

                System.out.println("\nRecipes:");
                System.out.print(cuisine);

            } else if (command.equals("find name")) {

                System.out.print("Searched word: ");
                String name = scanner.nextLine();

                System.out.println("\nRecipes:");
                cuisine.printRecipeByName(name);

            } else if (command.equals("find cooking time")) {

                System.out.print("Max cooking time: ");
                int maxCookingTime = Integer.parseInt(scanner.nextLine());

                System.out.println("\nRecipes:");
                cuisine.printRecipeByMaxCookingTime(maxCookingTime);

            } else if (command.equals("find ingredient")) {

                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();

                System.out.println("\nRecipes:");
                cuisine.printRecipeByIngredient(ingredient);
            }

            System.out.println("");
        }
    }
}
