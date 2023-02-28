
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String command = input.split(" ")[0];
            int number = Integer.parseInt(input.split(" ")[1]);

            if (number >= 0) {
                if (command.equals("add")) {

                    firstContainer.add(number);

                } else if (command.equals("move")) {

                    int inCaseMoved = (firstContainer.getActualLiters() < number) ? firstContainer.getActualLiters() : number ;              
                    
                    firstContainer.remove(inCaseMoved);
                    secondContainer.add(inCaseMoved);
                    
                } else if (command.equals("remove")) {
                    
                    secondContainer.remove(number);
                    
                }
            }

        }
    }

}
