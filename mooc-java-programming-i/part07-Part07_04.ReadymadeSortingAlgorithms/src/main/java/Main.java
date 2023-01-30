
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] arrayInt = {3, 1, 5, 99, 3, 12};
        String[] arrayStrings = {"BMW", "Porsche", "Audi", "Lamborghini"};
        
        ArrayList<Integer> arrayListInt = new ArrayList(Arrays.asList(2, 0, 5, 3, 7, 1));
        ArrayList<String> arrayListStrings = new ArrayList(Arrays.asList("Pear", "Apple", "Pineapple", "Kiwi", "Cherry", "Orto"));
        
        sort(arrayInt);
        sort(arrayStrings);
        
        sortIntegers(arrayListInt);
        sortStrings(arrayListStrings);
        
        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(arrayStrings));
        
        System.out.println(arrayListInt.toString());
        System.out.println(arrayListStrings.toString());
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }

}
