
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        
        String missingPerson = scanner.nextLine();
        
        if (list.contains(missingPerson)) {
            System.out.println(missingPerson + " was found!");
        } else {
            System.out.println(missingPerson + " was not found!");
        }

    }
}
