
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String inputString = scanner.nextLine();
            if (inputString.equals("")) {
                break;
            }
            System.out.println(inputString.split(" ")[0]);
        }
    }
}
