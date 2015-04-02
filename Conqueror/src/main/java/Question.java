/**
 * Created by 1 on 29.03.2015.
 */
public class Question {
    private String question ;
    private String time ;
    private Answer rightAnswer ;

    public Question() {
    }

    //Getters + Setters

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Answer getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(Answer rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    public String getTime() {
        return time;
    }

}
