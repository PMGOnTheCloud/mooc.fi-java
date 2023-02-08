
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

    public static void parseFileAndOrganiseCuisine(String file, Cuisine cuisine) throws Exception {

        try ( Scanner scanner = new Scanner(Paths.get(file))) {

            int lineNum = 1;

            String name = null;
            Integer cookingTime = null;
            ArrayList<String> ingredients = new ArrayList();

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (line.equals("") || !scanner.hasNextLine()) {
                    Recipe recipe = new Recipe(name, cookingTime, ingredients);
                    cuisine.add(recipe);
                    ingredients.clear();
                    lineNum = 1;
                    continue;
                }

                if (lineNum == 1) {
                    name = line;
                } else if (lineNum == 2) {
                    cookingTime = Integer.parseInt(line);
                } else if (lineNum > 2) {
                    ingredients.add(line);
                }

                lineNum++;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
