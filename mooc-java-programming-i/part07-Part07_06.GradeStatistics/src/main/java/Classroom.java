
import java.util.ArrayList;
import java.util.Collections;

public class Classroom {
    
    private ArrayList<Integer> pointsList;
    private ArrayList<Integer> grades;
    
    public Classroom() {
        this.pointsList = new ArrayList();
        this.grades = new ArrayList();
    }
    
    public void add(int points) {
        if (points <= 100 && points >= 0) {
            this.pointsList.add(points);
            this.convertToGrade(points);
        }
    }
    
    private void convertToGrade(int points) {
        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        this.grades.add(grade);
    }
    
    private int sumOfPoints() {        
        return this.pointsList.stream().map((points) -> points).reduce(0, Integer::sum);
    }
    
    private int sumOfPoints(int limit) {        
        return this.pointsList.stream().filter((points) -> (points >= limit)).map((points) -> points).reduce(0, Integer::sum);
    }
    
    private int numOfExams() {
        return this.pointsList.size();
    }
    
    public String avgOfPoints() {
        return (this.numOfExams() != 0) ? Double.toString(((double) this.sumOfPoints() / this.numOfExams())) : "-";
    }
    
    private int numOfPassedExams() {
        return this.pointsList.stream().filter((points) -> (points >= 50)).map((_item) -> 1).reduce(0, Integer::sum);
    }
    
    public String avgOfPassedExams() {
        return (this.numOfExams() != 0) ? Double.toString(((double) this.sumOfPoints(50) / this.numOfPassedExams())) : "-";
    }
    
    public String percentageOfPassedExams() {        
        return (this.numOfExams() != 0) ? Double.toString(((100 * (double) this.numOfPassedExams() / this.numOfExams()) )) : "-";
    }
    
    private String getStars(int numOfStarsLeft) {
        String stars = "";
        while(numOfStarsLeft > 0) {
            stars += "*";
            numOfStarsLeft--;
        }
        
        stars+= "\n";
        return stars;
    }
    
    public String getGradesAsStars() {
        String toReturnString = "\n";
        for(int i = 5; i >= 0; i--) {
            int numOfOcc = Collections.frequency(this.grades, i);
            toReturnString = toReturnString + i + ": " + this.getStars(numOfOcc);
        }
        
        return toReturnString;
    }
}
