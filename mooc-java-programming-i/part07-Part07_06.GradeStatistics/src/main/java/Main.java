
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        
        Classroom classroom = new Classroom();
        
        System.out.println("Enter total points, -1 stops:");
        while(true) {
            int points = Integer.parseInt(scanner.nextLine());
            
            if (points == -1) {
                break;
            }
            
            if (points >= 0 && points <= 100) {
                classroom.add(points);
            }
        }
        
        System.out.println("Point average (all): " + classroom.avgOfPoints());
        System.out.println("Point average (passing): " + classroom.avgOfPassedExams());
        System.out.println("Pass percentage: " + classroom.percentageOfPassedExams());
        System.out.println("Grade distribution: " + classroom.getGradesAsStars());
    }
}
