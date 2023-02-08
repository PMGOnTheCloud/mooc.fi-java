
import java.util.ArrayList;

public class Cuisine {

    private ArrayList<Recipe> recipes;

    public Cuisine() {
        this.recipes = new ArrayList();
    }

    public void add(Recipe recipe) {
        this.recipes.add(recipe);
    }

    public void printRecipeByName(String name) {
        name = name.toLowerCase();
        for (Recipe recipe : this.recipes) {
            if (recipe.getName().toLowerCase().contains(name)) {
                System.out.println(recipe);
            }
        }
    }

    public void printRecipeByMaxCookingTime(int maxCookingTime) {
        for (Recipe recipe : this.recipes) {
            if (recipe.getCookingTime() <= maxCookingTime) {
                System.out.println(recipe);
            }
        }
    }

    public void printRecipeByIngredient(String ingredient) {
        for (Recipe recipe : this.recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
        }
    }

    public void getAndPrintRecipeByName(String name) {
        name = name.toLowerCase();
        for (Recipe recipe : this.recipes) {
            if (recipe.getName().toLowerCase().contains(name)) {
                System.out.println(recipe);
            }
        }
    }

    @Override
    public String toString() {
        String recipesString = "";

        for (Recipe recipe : this.recipes) {
            recipesString += recipe.toString() + "\n";
        }

        return recipesString;
    }
}
