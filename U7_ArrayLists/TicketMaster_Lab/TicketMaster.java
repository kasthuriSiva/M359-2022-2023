package U7_ArrayLists.TicketMaster_Lab;

import U7_ArrayLists.Notes_7_5.Item;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TicketMaster {
    private ArrayList<Show> shows;

    //Empty Constructor

    public TicketMaster(){
        this.shows = new ArrayList<Show>();
    }

    /*public String toString(){
        String output ="";
        for(Show i : shows){
            output += i.toString() + "\n";
        }
        return output;
    }*/
    public void readFromFile() throws FileNotFoundException{

        File myFile = new File("showData.txt");
        Scanner scanFile = new Scanner(myFile);
        scanFile.useDelimiter(" ");

        boolean isTrue = false;
        while(isTrue = false){

        }

        //ArrayList<Show> shows = new ArrayList<Show>();
        while (scanFile.hasNext())
        {
            //Scans the text file
            String date = scanFile.next();
            double price = scanFile.nextDouble();
            int qty = scanFile.nextInt();

            //Checks the text file for a comma to separate the information on each line
            String str = scanFile.nextLine();
            int loc = str.indexOf(",");

            String artist = str.substring(1, loc);
            String city = str.substring(loc+2);

            Show temp = new Show(date,price,qty,artist,city);
            shows.add(temp);

            /*if(scanFile.hasNextLine()){
                scanFile.nextLine();
             }

             */

            /*
            if (artist is long){
            only add 2 tabs
            }
            else if (artist is short){
            add 3 tabs
            }
            */

        }
        //scanFile.close();
    }
    public String toString() {
        String output = "";
        for (Show i : shows) {
            output += i.toString() + "\n";
        }
        return output;
    }
    public static void sortByPerformer(ArrayList<String> list){
        for(int i=0; i < list.size()-1; i++){

            //Look for the smallest remaining
            int minIndex = i;
            for(int j=i+1; j < list.size(); j++){
                if(list.get(j) (list.get(minIndex))){
                    minIndex = j;
                }
            }

            //Swap the values at index i and index minIndex
            String temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);
        }
    }
    public static void sortByPrice(ArrayList<Integer> list){
        for(int i=0; i < list.size()-1; i++){

            //Look for the smallest remaining
            int minIndex = i;
            for(int j=i+1; j < list.size(); j++){
                if(list.get(j) < list.get(minIndex)){
                    minIndex = j;
                }
            }

            //Swap the values at index i and index minIndex
            Integer temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);
        }
    }
}
