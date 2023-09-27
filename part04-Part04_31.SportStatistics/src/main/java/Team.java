
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Team {
    private String homeTeam;
    private String visitingTeam;
    private int homeTeamPoints;
    private int visitingTeamPoints;

    public Team(String homeTeam, String visitingTeam, int homeTeamPoints, int visitingTeamPoints) {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homeTeamPoints = homeTeamPoints;
        this.visitingTeamPoints = visitingTeamPoints;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getVisitingTeam() {
        return visitingTeam;
    }

    public int getHomeTeamPoints() {
        return homeTeamPoints;
    }

    public int getVisitingTeamPoints() {
        return visitingTeamPoints;
    }
    public boolean homeTeam(String teamName){
        if(this.homeTeam.equals(teamName)){
            return true;
        }
        return false;
    }
    
    public boolean visitingTeam(String teamName){
        if(this.visitingTeam.equals(teamName)){
            return true;
        }
        return false;
    }
    
    public boolean winHomeTeam(){
        if(this.getHomeTeamPoints()>this.getVisitingTeamPoints()){
        return true;
        }
        return false;
    }
    
    public boolean winVisitingTeam(){
        if(this.getVisitingTeamPoints()>this.getHomeTeamPoints()){
        return true;
        }
        return false;
    }
}
