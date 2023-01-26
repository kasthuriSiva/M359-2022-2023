package U7_ArrayLists.TicketMaster_Lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TicketMasterDriver {
    public static void main(String[] args) throws FileNotFoundException{
        //Intro Statements
        System.out.println("\n\t\t\t**** Welcome to the Ticket Master Kiosk ****");
        System.out.println("You may search our shows by city as well as sort the shows by performer and ticket price");
        System.out.println("\t\tSimply select the correct option corresponding with your choice\n\n");
        System.out.println("Date:\t\tPrice\t\tQuantity\tArtist\t\t\tCity");
        System.out.println("-----------------------------------------------------------------");

        //Create myStore
        TicketMaster myStore = new TicketMaster();

        //Call on the readFromFile function in ticketMaster
        myStore.readFromFile();

        //Print myStore
        System.out.println(myStore);

        //Prints out the 6 options the user can choose from
        System.out.println("1.Search by City\n2.Sort by Performer(A-Z)\n3.Sort by Performer(Z-A)");
        System.out.println("4.Sort by Price (low-high)\n5.Sort by Price(high-low)\n6.Quit\n\n");

        //Boolean variable to enter the while loop
        boolean isDone = false;

        //Prompts user to type in a number
        System.out.println("Enter a value between 1 & 6");

        //Takes the user's answer choice
        Scanner input = new Scanner (System.in);
        int answer = input.nextInt();
        input.nextLine(); //Dummy read for \n


        while(!isDone){
            //based off of user's answer returns the corresponding available shows 
            if(answer == 1||answer == 2||answer == 3||answer == 4||answer == 5||answer == 6){
                isDone = true;
            }
            else{
                isDone = false;
            }

        }

    }
}
