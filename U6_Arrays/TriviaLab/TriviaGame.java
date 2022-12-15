package U6_Arrays.TriviaLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaGame {
    //Instance Variables for the Game
    private Question[] questions;
    private int numQRight;
    private int numQWrong;
    private int numTotalPoints;
    private int answerStreak;

    //PSVM to read in the file
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File ("bookQ.txt");
        Scanner fileIn = new Scanner(myFile);

        //The very first line has the question
        int numQuestions = fileIn.nextInt(); //12
        fileIn.nextLine();                  //Dummy read for nextLine after #

        String question = fileIn.nextLine();
        String MC1 = fileIn.nextLine();
    }

    //FUll Constructor for the TriviaGame Variables
    public TriviaGame(Question[] questions, int numQRight, int numQWrong, int numTotalPoints, int answerStreak) {
        this.questions = questions;
        this.numQRight = numQRight;
        this.numQWrong = numQWrong;
        this.numTotalPoints = numTotalPoints;
        this.answerStreak = answerStreak;
    }
    //Random Num Generator to get random questions
    int randNum = (int)Math.random()*12+1;


    //Getters and Setters for Trivia Game
    public Question[] getQuestions() {
        return questions;
    }
    public void setQuestions(Question[] questions) {
        this.questions = questions;
    }
    public int getNumQRight() {
        return numQRight;
    }
    public void setNumQRight(int numQRight) {
        this.numQRight = numQRight;
    }
    public int getNumQWrong() {
        return numQWrong;
    }
    public void setNumQWrong(int numQWrong) {
        this.numQWrong = numQWrong;
    }
    public int getNumTotalPoints() {
        return numTotalPoints;
    }
    public void setNumTotalPoints(int numTotalPoints) {
        this.numTotalPoints = numTotalPoints;
    }
    public int getAnswerStreak() {
        return answerStreak;
    }
    public void setAnswerStreak(int answerStreak) {
        this.answerStreak = answerStreak;
    }
}
