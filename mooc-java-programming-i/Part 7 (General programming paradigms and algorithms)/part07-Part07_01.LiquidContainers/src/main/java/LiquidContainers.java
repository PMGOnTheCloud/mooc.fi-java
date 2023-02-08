
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String command = input.split(" ")[0];
            int number = Integer.parseInt(input.split(" ")[1]);

            if (number >= 0) {
                if (command.equals("add")) {

                    if ((number + firstContainer) < 100) {
                        firstContainer += number;
                    } else {
                        firstContainer = 100;
                    }

                } else if (command.equals("move")) {

                    if (firstContainer >= number) {
                        firstContainer -= number;
                        if ((number + secondContainer) < 100) {
                            secondContainer += number;
                        } else {
                            secondContainer = 100;
                        }
                        
                    } else {
                       secondContainer = firstContainer;
                       firstContainer = 0;
                    }
                    
                } else if (command.equals("remove")) {
                    
                    if (secondContainer >= number) {
                        secondContainer -= number;
                    } else {
                        secondContainer = 0;
                    }
                    
                }
            }

        }
    }

}
