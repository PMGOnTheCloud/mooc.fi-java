
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        while(number > 0) {
            System.out.print("*");
            number--;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        while(number > 0) {
            System.out.print(" ");
            number--;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        
        // Printing the basic triangle
        for(int numOfStars = 1; numOfStars <= size; numOfStars++) {
            // The number of spaces is always 1 less than the triangle's height for the star to fit
            int numOfSpaces = size - numOfStars;
            
            printSpaces(numOfSpaces);
            printStars(numOfStars);
        }
        
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        
        // Printing the top triangle with "mirroring"
        for(int numOfStars = 1; numOfStars <= height; numOfStars++) {
            // The number of spaces is always 1 less than the triangle's height for the star to fit
            int numOfSpaces = height - numOfStars;
            
            // Then calculate the "mirrored" stars that starts with 0 and increases by 1 with each loop
            int mirrorStars = numOfStars - 1;
            
            printSpaces(numOfSpaces);
            printStars(numOfStars + mirrorStars);
        }
        
        // Printing the base
        for(int i = 0; i < 2; i++) {
            int numOfSpaces = height - 2;
            printSpaces(numOfSpaces);
            printStars(3);
        }
        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
