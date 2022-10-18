package U4_Loops;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int randNum = (int)(Math.random()*10)+1;
        boolean isDone= false;
        int numGuesses = 0;

        //!isDone
        while(isDone == false){
            //prompt user for guess
            System.out.println("Guess a number from 1-10:");
            int guess = input.nextInt();
            input.nextLine();
            numGuesses++;

            if(guess < randNum){
                System.out.println("Your guess is too low");
            }
            else if (guess > randNum){
                System.out.println("Your guess is too high");
            }
            else{
                System.out.println("You're correct!");
                System.out.println("# of guesses: 6" + numGuesses);
                isDone = true;
            }
        }
    }
}
