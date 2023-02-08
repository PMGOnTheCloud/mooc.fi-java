
import java.util.ArrayList;
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] firstArray = {3, 1, 3, 99, 2, 12};
        int[] secondArray = {3, 2, 5, 4, 8};
        
        sort(firstArray);
        sort(secondArray);
        
        System.out.println("Array array: " + Arrays.toString(firstArray));
        System.out.println("Numbers array: " + Arrays.toString(secondArray));
    }

    public static int smallest(int[] numbers) {
        int number = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (number > numbers[i]) {
                number = numbers[i];
            }
        }

        return number;
    }

    public static int indexOfSmallest(int[] numbers) {
        int indexOfSmallest = 0;
        int number = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (number > numbers[i]) {
                number = numbers[i];
                indexOfSmallest = i;
            }
        }

        return indexOfSmallest;
    }

    public static int indexOfSmallestFrom(int[] numbers, int startIndex) {
        int indexOfSmallest = startIndex;
        int number = numbers[startIndex];
        for (int i = startIndex; i < numbers.length; i++) {
            if (number > numbers[i]) {
                number = numbers[i];
                indexOfSmallest = i;
            }
        }

        return indexOfSmallest;
    }

    public static void swap(int[] numbers, int index1, int index2) {
        
        if (index1 == index2) {
            return;
        }
        
        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;
    }
    
    public static void sort(int[] numbers) {
        
        for(int i = 0; i < numbers.length; i++) {
            int numberOfSmallestIndex = indexOfSmallestFrom(numbers, i);
            swap(numbers, i, numberOfSmallestIndex);
        }
    }

}
