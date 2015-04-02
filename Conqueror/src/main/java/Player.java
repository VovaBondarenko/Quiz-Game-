
public class Player {
    private int score;
    private Answer answer;
    private String name ;
    private String password, login , mail ;
    public Player() {
    }

    //Getters + Setters
    public String getName() {
        return name;
    }

    public Answer getAnswer() {
        return answer;
    }

    public int getScore() {
        return score;
    }


    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }



}
