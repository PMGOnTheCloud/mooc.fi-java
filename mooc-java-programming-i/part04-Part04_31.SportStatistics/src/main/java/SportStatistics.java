
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scanner.nextLine();

        try ( Scanner fileScanner = new Scanner(Paths.get(fileName))) {

            System.out.println("Team:");
            String teamSelected = scanner.nextLine();

            int gameCounter = 0;
            int winCounter = 0;
            int lossCounter = 0;

            while (fileScanner.hasNextLine()) {

                String[] splittedLine = fileScanner.nextLine().split(",");

                String localTeam = splittedLine[0];
                String awayTeam = splittedLine[1];

                if (localTeam.equals(teamSelected)) {
                    
                    int localScore = Integer.parseInt(splittedLine[2]);
                    int awayScore = Integer.parseInt(splittedLine[3]);

                    gameCounter++;
                    
                    if (localScore > awayScore) {
                        winCounter++;
                    } else {
                        lossCounter++;
                    }
                }
                
                if (awayTeam.equals(teamSelected)) {
                    
                    int localScore = Integer.parseInt(splittedLine[2]);
                    int awayScore = Integer.parseInt(splittedLine[3]);
                    
                    gameCounter++;
                    
                    if (localScore > awayScore) {
                        lossCounter++;
                    } else {
                        winCounter++;
                    }   
                }

            }

            System.out.println("Games: " + gameCounter);
            System.out.println("Wins: " + winCounter);
            System.out.println("Losses: " + lossCounter);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
