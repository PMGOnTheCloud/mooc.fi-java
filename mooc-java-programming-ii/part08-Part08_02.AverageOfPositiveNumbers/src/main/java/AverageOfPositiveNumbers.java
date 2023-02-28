
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> listOfNums = new ArrayList<>();
        
        while(true) {
            int input = Integer.parseInt(scanner.nextLine());
            
            if (input == 0) {
                break;
            }
            
            if (input > 0) {
                listOfNums.add(input);
            }            
            
        }
        
        if (listOfNums.isEmpty()) {
            System.out.println("Cannnot calculate de average");
        } else {
            int avgOfListNums = listOfNums.stream().reduce(0, Integer::sum);
            int sizeOfListNums = listOfNums.size();
            
            System.out.println(1. * avgOfListNums / sizeOfListNums);
        } 
        
    }
}
