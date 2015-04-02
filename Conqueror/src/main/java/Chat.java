/**
 * Created by 1 on 29.03.2015.
 */
public class Chat {
    private Player[] players;
    private String[] massages ;
    private String time ;

    public Chat() {
    }
    //Getters + Setters


    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public String[] getMassages() {
        return massages;
    }

    public void setMassages(String[] massages) {
        this.massages = massages;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
