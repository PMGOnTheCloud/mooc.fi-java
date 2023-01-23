
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfTheOldest = null;
        Integer ageOfTheOldest = null;
        
        while (true) {
            String inputString = scanner.nextLine();
            if (inputString.equals("")) {
                break;
            }

            String name = inputString.split(",")[0];
            Integer age = Integer.valueOf(inputString.split(",")[1]);

            if (ageOfTheOldest == null || ageOfTheOldest < age) {
                nameOfTheOldest = name;
                ageOfTheOldest = age;
            }
        }
        System.out.println("Name of the oldest: " + nameOfTheOldest);
    }
}
