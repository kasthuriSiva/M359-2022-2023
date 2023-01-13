package U7_ArrayLists.TicketMaster_Lab;

public class Show {
    //Private variables
    private String date;
    private double price;
    private int numberOfTickets;
    private String performer;
    private String city;

    //Constructor
    public Show(String date, double price, int numberOfTickets, String performer, String city) {
        this.date = date;
        this.price = price;
        this.numberOfTickets = numberOfTickets;
        this.performer = performer;
        this.city = city;
    }

    //Getters and Setters
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }
    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public String getPerformer() {
        return performer;
    }
    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String toString(){
        String output ="";
        output += "Date        Price      Qty    Performer     City\n";
        output += "---------------------------------------------------------\n";
        output+= date + "    " + price + "     " + numberOfTickets + "     " + performer + "       " + city;
        return output;

    }
}
