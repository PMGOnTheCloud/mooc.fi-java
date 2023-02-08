

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }

    public static void printUntilNumber(int number) {
        int numberInit = number;
        while(number > 0) {
            number--;
            System.out.println(numberInit - number);
        }
    }
}
