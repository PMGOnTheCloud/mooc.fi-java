
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();
        
        try(Scanner scannerFile = new Scanner(Paths.get(fileName))) {
            while(scannerFile.hasNextLine()) {
                
                String fileLine = scannerFile.nextLine();
                String[] splittedLine = fileLine.split(",");
                
                String name = splittedLine[0], age = splittedLine[1];
                
                System.out.println(name + ", age: " + age + ((age.equals("1")) ? " year" : " years"));
                
            }
        } catch (Exception e) {
            System.out.println("");
        }
    }
}
