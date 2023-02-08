import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> library = new ArrayList<>();
        
        while(true) {
            System.out.println("Title:");
            String title = scanner.nextLine();
            
            if (title.isEmpty()) {
                break;
            }
            
            System.out.println("Pages:");
            int pages = Integer.parseInt(scanner.nextLine());
            System.out.println("Publication year:");
            int publicationYear = Integer.parseInt(scanner.nextLine());
            
            Book book = new Book(title, pages, publicationYear);
            
            library.add(book);
            
        }
        
        System.out.println("What information will be printed?");
        String wantedInfoPrint = scanner.nextLine();
        
        library.forEach((book) -> {
            if (wantedInfoPrint.equals("name")) {
                System.out.println(book.getTitle());
            } else if (wantedInfoPrint.equals("everything")) {
                System.out.println(book);
            }
        });
    }
}
