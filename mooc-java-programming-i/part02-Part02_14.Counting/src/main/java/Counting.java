
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        
        int loopNum = 0;
        while (loopNum <= number) {
            System.out.println(loopNum);
            loopNum++;
        }
    }
}
