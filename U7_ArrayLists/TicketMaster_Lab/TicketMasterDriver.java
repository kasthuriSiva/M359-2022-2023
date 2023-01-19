package U7_ArrayLists.TicketMaster_Lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TicketMasterDriver {
    public static void main(String[] args) throws FileNotFoundException{
        //Show S1 = new Show("02-14-22",124.75, 52,"Beyonce", "Chicago");
        //System.out.println(S1);

        TicketMaster myStore = new TicketMaster();

        myStore.readFromFile();

        System.out.println(myStore);


    }
}
