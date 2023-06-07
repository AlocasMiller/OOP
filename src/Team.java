import java.util.ArrayList;

public class Team {
    private String teamName;
    private int teamID;
    //private PNG logo;
    private String description;
    private ArrayList<Player> players;
    private ArrayList<Match> matches;

    public Team(String teamName, int teamID, String description) {
        this.teamName = teamName;
        this.teamID = teamID;
        //this.logo = logo;
        this.description = description;
    }


    public String getTeamName() {
        return teamName;
    }

    public int getTeamID() {
        return teamID;
    }

//    public PNG getLogo() {
//        return logo;
//    }
//
//    public void setLogo(PNG logo) {
//        this.logo = logo;
//    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public ArrayList<Match> getMatches() {
        return matches;
    }
}
