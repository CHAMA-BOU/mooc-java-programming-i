
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String fileName=scan.nextLine();
        ArrayList<Team> teams= new ArrayList<>();
        teams= fillTeams(fileName);
        System.out.println("Team:");
        String teamName=scan.nextLine();
        showingGamesOfTeamName(teamName, teams);
        showingWinsAndLossesOfTeamName(teamName, teams);
    }

    private static ArrayList<Team> fillTeams(String fileName) {
        ArrayList<Team> teams = new ArrayList<>();
        try(Scanner readingFile= new Scanner(Paths.get(fileName))) {
            while(readingFile.hasNext()){
                String row= readingFile.nextLine();
                if(row.isEmpty()){
                    continue;
                }
                String[] splitted= row.split(",");
                String homeTeam= splitted[0];
                String visitingTeam= splitted[1];
                int homeTeamPoints = Integer.valueOf(splitted[2]);
                int visitingTeamPoints = Integer.valueOf(splitted[3]);
                teams.add(new Team(homeTeam, visitingTeam, homeTeamPoints, visitingTeamPoints));
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        // Write here the code for reading from file
        // and printing the read records
        return teams;
    }

    private static void showingGamesOfTeamName(String teamName, ArrayList<Team> teams) {
        int gamesNumber=0;
        for(Team team:teams){
            if(team.getHomeTeam().equals(teamName) || team.getVisitingTeam().equals(teamName)){
                gamesNumber++;
            }
        }
        System.out.println("Games: "+gamesNumber);
    }

    private static void showingWinsAndLossesOfTeamName(String teamName, ArrayList<Team> teams) {
        int wins=0;
        int losses=0;
        for(Team team: teams){
            if(team.homeTeam(teamName) && team.winHomeTeam() || team.visitingTeam(teamName) && team.winVisitingTeam()){
                wins++;
            }
            if(team.homeTeam(teamName) && !team.winHomeTeam() || team.visitingTeam(teamName) && !team.winVisitingTeam()){
                losses++;
            }
        }
        System.out.println("Wins: "+wins);
        System.out.println("Losses: "+losses);
        
    }

}
