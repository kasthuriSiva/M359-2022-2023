package U6_Arrays.TriviaLab;

public class Question {
    //Private variables for the Question class: Question, answer choices, and total number of points
    private String question;
    private int[] answerChoices;
    private char
    private int points;

    public Question(String question, int[] answerChoices, int points) {
        this.question = question;
        this.answerChoices = answerChoices;
        this.points = points;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int[] getAnswerChoices() {
        return answerChoices;
    }

    public void setAnswerChoices(int[] answerChoices) {
        this.answerChoices = answerChoices;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
