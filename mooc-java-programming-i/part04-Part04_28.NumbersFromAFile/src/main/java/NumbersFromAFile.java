
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File?");
        String file = scanner.nextLine();
        System.out.println("Lower bound?");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound?");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        int countNumbersInsideBounds = 0;
        
        try(Scanner scannerFile = new Scanner(Paths.get(file))) {
            while(scannerFile.hasNextLine()) {
                
                int number = Integer.parseInt(scannerFile.nextLine());
                
                if (number <= upperBound && number >=lowerBound) {
                    countNumbersInsideBounds++;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Numbers: " + countNumbersInsideBounds);

    }

}
