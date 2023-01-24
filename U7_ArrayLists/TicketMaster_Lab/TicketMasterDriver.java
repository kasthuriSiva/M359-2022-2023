package U7_ArrayLists.TicketMaster_Lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TicketMasterDriver {
    public static void main(String[] args) throws FileNotFoundException{
        //Intro Statements
        System.out.println("Welcome to Ticket Master!\n");
        System.out.println("Here are our available shows for this year!\n");
        System.out.println("Date:\t\tPrice\t\tQuantity\tArtist\t\t\tCity");
        System.out.println("-----------------------------------------------------------------");

        //Create myStore
        TicketMaster myStore = new TicketMaster();

        //Call on the readFromFile function in ticketMaster
        myStore.readFromFile();

        //Print myStore
        System.out.println(myStore);

        boolean isTrue = false;
        while(isTrue = false){

        }


    }
}
