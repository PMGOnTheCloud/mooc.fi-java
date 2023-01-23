
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = null;
        Integer sumOfAges = null;
        Integer numberOfPeople = null;
        
        while (true) {
            String inputString = scanner.nextLine();
            if (inputString.equals("")) {
                break;
            }

            String name = inputString.split(",")[0];
            Integer age = Integer.valueOf(inputString.split(",")[1]);

            longestName = (longestName == null || longestName.length() < name.length()) ? name : longestName;
            sumOfAges = (sumOfAges != null) ? sumOfAges + age : age;
            
            numberOfPeople = (numberOfPeople != null) ? numberOfPeople + 1 : 1;
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of birth years: " + ((double) sumOfAges / numberOfPeople));
        
    }
}
