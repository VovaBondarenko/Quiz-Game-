/**
 * Created by 1 on 29.03.2015.
 */
public class MainGameClass {
    private int gamerNummber;
    private Player[] players;
    private Question questions;
    private Map map;

    public MainGameClass() {
    }
    public void newGame() {}
    public void stopGame() {}

    //Getters + Setters


    public int getGamerNummber() {
        return gamerNummber;
    }

    public void setGamerNummber(int gamerNummber) {
        this.gamerNummber = gamerNummber;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public Question getQuestions() {
        return questions;
    }

    public void setQuestions(Question questions) {
        this.questions = questions;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
}
