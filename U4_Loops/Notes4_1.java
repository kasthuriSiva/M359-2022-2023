package U4_Loops;
import java.util.Scanner;

public class Notes4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isDone= false;
        int sum = 0;
        int numScores = 0;

        //!isDone
        while(isDone == false){
            //prompt ser if they have a new number for us
            System.out.println("Do you have a number to enter? (Y or N)");
            String reply = input.nextLine();

            if(reply.equalsIgnoreCase("Y")){
                //Prompt user to enter number
                System.out.println("Enter Number: ");
                int intNewScore = input.nextInt();
                input.nextLine(); //to clear the "enter" after #

                //Update some stats
                sum += intNewScore;
                numScores++;
            }
            else{
                isDone = true;
            }
        }

        //IF YOU GET HERE THAT MEANS YOU'RE DONE
        System.out.println("Sum of all numbers: " + sum);
        double avg = (double)sum/numScores;
        System.out.println("Average: " + avg);
    }
}
