package U6_Arrays.TriviaLab;

public class Question {
    //Private variables for the Question class: Question, answer choices, and total number of points
    private String question;
    private String MC1;
    private String MC2;
    private String MC3;
    private String MC4;
    private String[] answerChoices;
    private char correctAnswer;
    private int points;

    public Question(String question, String MC1, String MC2, String MC3,
                    String MC4, String[] answerChoices, char correctAnswer,
                    int points) {
        this.question = question;
        this.MC1 = MC1;
        this.MC2 = MC2;
        this.MC3 = MC3;
        this.MC4 = MC4;
        this.answerChoices = answerChoices;
        this.correctAnswer = correctAnswer;
        this.points = points;
    }

    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public String getMC1() {
        return MC1;
    }
    public void setMC1(String MC1) {
        this.MC1 = MC1;
    }
    public String getMC2() {
        return MC2;
    }
    public void setMC2(String MC2) {
        this.MC2 = MC2;
    }
    public String getMC3() {
        return MC3;
    }
    public void setMC3(String MC3) {
        this.MC3 = MC3;
    }
    public String getMC4() {
        return MC4;
    }
    public void setMC4(String MC4) {
        this.MC4 = MC4;
    }
    public String[] getAnswerChoices() {
        return answerChoices;
    }
    public void setAnswerChoices(String[] answerChoices) {
        this.answerChoices = answerChoices;
    }
    public char getCorrectAnswer() {
        return correctAnswer;
    }
    public void setCorrectAnswer(char correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }
}
