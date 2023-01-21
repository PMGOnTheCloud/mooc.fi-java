
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int number = scanner.nextInt();
        
        System.out.println("Where from?");
        int init = scanner.nextInt();
        while(init <= number) {
            System.out.println(init);
            init++;
        }
    }
}
