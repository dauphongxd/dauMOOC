
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("File: ");
        String file = sc.nextLine();
        System.out.println("Team: ");
        String teamName = sc.nextLine();

        ArrayList<Team> records = readRecordsFromFile(file);
        int game = 0;
        int win = 0;
        int lose = 0;

        for(Team team : records){
            if(team.getHomeTeam().contains(teamName)){
               game++;
               if(team.getHomeScore() > team.getAwayScore()){
                   win++;
                   team.setWin();
               } else {
                   lose++;
                   team.setLose();
               }
               team.gamePlayed();
            } else if (team.getAwayTeam().contains(teamName)) {
                game++;

                if(team.getAwayScore() > team.getHomeScore()){
                    win++;
                    team.setWin();

                } else {
                    lose++;
                    team.setLose();
                }
                team.gamePlayed();
            }



        }
        System.out.println("Games: " + game);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + lose);

    }

    public static ArrayList<Team> readRecordsFromFile(String file){
        ArrayList<Team> team = new ArrayList<>();

        try(Scanner reader = new Scanner(Paths.get(file))){
            while(reader.hasNextLine()){
                String data = reader.nextLine();
                String[] parts = data.split(",");
                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homeScore = Integer.valueOf(parts[2]);
                int awayScore = Integer.valueOf(parts[3]);

                team.add(new Team(homeTeam, awayTeam, homeScore, awayScore));
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return team;
    }

}
