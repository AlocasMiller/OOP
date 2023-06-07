import java.util.ArrayList;

public class Player{
    private String playerName;
    private int playerID;
    private SportType sport;
    private int skill;
    private Team team;
    private ArrayList<Match> matches;

    public Player(String playerName, int playerID, int skill) {
        this.playerName = playerName;
        this.playerID = playerID;
        //this.sport = sport;
        this.skill = skill;
        //this.team = team;
    }


    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerID() {
        return playerID;
    }

    public SportType getSport() {
        return sport;
    }

    public void setSport(SportType sport) {
        this.sport = sport;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public ArrayList<Match> getMatches() {
        return matches;
    }
}
