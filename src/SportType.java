import java.util.ArrayList;

public class SportType {
    private int howManyOnTeam;
    private int sportID;
    private double timeOnGame;

    public int getHowManyOnTeam() {
        return howManyOnTeam;
    }

    public int getSportID() {
        return sportID;
    }

    public double getTimeOnGame() {
        return timeOnGame;
    }
}

class Football extends SportType{
    int howManyOnTeam = 11;
    int sportID = 1;
    double timeOnGame = 90.0;
    public boolean checkTeam(Team team) {
        ArrayList<Player> arrayPlayers = team.getPlayers();
        for(int i = 0; i < 11; i++) {
            Player player = arrayPlayers.get(i);
            if Football != player.getSport() {
                return false
            }
        }
        return true
    }
}