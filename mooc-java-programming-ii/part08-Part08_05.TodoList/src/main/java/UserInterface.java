
import java.util.Scanner;

public class UserInterface {

    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        OUTER:
        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();
            
            switch (command) {
                case "stop":
                    break OUTER;
                case "add":
                    System.out.println("To add:");
                    String task = scanner.nextLine();
                    this.todoList.add(task);
                    break;
                case "list":
                    this.todoList.print();
                    break;
                case "remove":
                    System.out.println("Which one is removed?");
                    int number = Integer.parseInt(scanner.nextLine());
                    this.todoList.remove(number);
                    break;
                default:
                    break;
            }
        }
    }
}
