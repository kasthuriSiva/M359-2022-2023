package U2_Objects;

import java.util.Scanner;

public class MathClass {

    /*
        Kasthuri Siva
        Mr.Moon - Period 7
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //PART 1
        //Prompt user for x1,y1,x2,y2 values

        //x1-value
        System.out.println("Enter x1: ");
        int x1 = input.nextInt();

        //y1-value
        System.out.println("Enter y1 ");
        int y1 = input.nextInt();

        //x2-value
        System.out.println("Enter x2: ");
        int x2 = input.nextInt();

        //y2-value
        System.out.println("Enter y2: ");
        int y2 = input.nextInt();

        //calculate distance
        double distance = Math.sqrt( Math.pow(x1-x2,2) + Math.pow(y1-y2,2));

        //Build display output
        String output = "The distance between ("+x1+ ", "+y1+ ") and ("+x2+ ", "+y2+ ") is "+distance;

        //display output
        System.out.println(output);

        //PART 2
        System.out.println("Enter Max: ");
        int max = input.nextInt();

        System.out.println("Enter Min: ");
        int min = input.nextInt();

        int randNum = (int)(Math.random()*(max-min+1)) + min;

        output = "A random integer between the " + min + " & " + max+ " is: " + randNum;
        System.out.println(output);

        //PART 3
        System.out.println("Absolute value of -3 is "+Math.abs(-3));
        System.out.println("3^4 = " + Math.pow(3,4));
        System.out.println("The maximum between 3 and -6 is: " + Math.max(3,-6));
        System.out.println("The Minimum between 6 and 17 is: " +Math.min(6,17));
    }
}
