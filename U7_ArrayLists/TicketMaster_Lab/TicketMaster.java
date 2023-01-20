package U7_ArrayLists.TicketMaster_Lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TicketMaster {
    private ArrayList<Show> shows;

    private String filePath;
    //Empty Constructor

    public TicketMaster(String filePath) {
        this.shows = new ArrayList<Show>();
        this.filePath = filePath;
    }

    public TicketMaster(){

    }
    public void readFromFile() throws FileNotFoundException{

        File myFile = new File("showData.txt");
        Scanner scanFile = new Scanner(myFile);
        scanFile.useDelimiter(" ");

        ArrayList<Show> showInfo = new ArrayList<Show>();
        while (scanFile.hasNext())
        {
            String date = scanFile.next();
            double price = scanFile.nextDouble();
            int qty = scanFile.nextInt();

            String str = scanFile.nextLine();
            int loc = str.indexOf(",");

            String artist = str.substring(1, loc);
            String city = str.substring(loc+2);

            /*
            String[] split = scanFile.nextLine().split(",");
            String artist = split[0];
            String city = split[1];
            */

            Show temp = new Show(date,price,qty,artist,city);
            showInfo.add(temp);

            //System.out.println( date + "\t" + price + "\t\t" + qty + "\t\t" + artist;
/*
            if (artist is long){
            only add 2 tabs
            }
            else if (artist is short){
            add 3 tabs
            }
*/
            //+ "\t\t" + city);
        }
        scanFile.close();








    }
}
