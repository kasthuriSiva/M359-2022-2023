package U3_Boolean_If_Statements.ChevyLab;

public class Chevy{
    //Vehicle Details: year, mileage, fuel efficiency, base price, price with upgrades, grand total, model, color,
    // luxury package status, 4WD package status, and sports package status (constructor is in this same order!)
    private int year;
    private double miles;
    private double mpg;
    private double basePrice;
    private double priceWithUpdates;
    private double grandTotal;
    private String model;
    private String color;
    private boolean hasLuxuryPkg;
    private boolean has4WDPkg;
    private boolean hasSportsPkg;

    //Constructors
    final String MAKE = "Chevrolet";
    final double TAX_RATE = 12.2/100;
    final double LUXURYPKGINCR = basePrice*1.2;
    final double PKG4WD = basePrice + 3500;
    final double SPORTSPKG = basePrice*1.15;

    //Default Constructor
    public Chevy(int year, double miles, double mpg, double basePrice, double priceWithUpdates, double grandTotal, String model, String color) {
        this.year = year;
        this.miles = miles;
        this.mpg = mpg;
        this.basePrice = basePrice;
        this.priceWithUpdates = priceWithUpdates;
        this.grandTotal = grandTotal;
        this.model = model;
        this.color = color;
        hasLuxuryPkg = false;
        has4WDPkg = false;
        hasSportsPkg = false;
    }
    //Full Constructor

    public Chevy(int year, double miles, double mpg, double basePrice, double priceWithUpdates, double grandTotal, String model,
                 String color, boolean hasLuxuryPkg, boolean has4WDPkg, boolean hasSportsPkg) {
        this.year = year;
        this.miles = miles;
        this.mpg = mpg;
        this.basePrice = basePrice;
        this.priceWithUpdates = priceWithUpdates;
        this.grandTotal = grandTotal;
        this.model = model;
        this.color = color;
        this.hasLuxuryPkg = hasLuxuryPkg;
        this.has4WDPkg = has4WDPkg;
        this.hasSportsPkg = hasSportsPkg;
    }

    //Getters and Setters


    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public double getMiles() {
        return miles;
    }
    public void setMiles(double miles) {
        this.miles = miles;
    }

    public double getMpg() {
        return mpg;
    }
    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public double getBasePrice() {
        return basePrice;
    }
    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getPriceWithUpdates() {
        return priceWithUpdates;
    }
    public void setPriceWithUpdates(double priceWithUpdates) {
        this.priceWithUpdates = priceWithUpdates;
    }

    public double getGrandTotal() {
        return grandTotal;
    }
    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHasLuxuryPkg() {
        return hasLuxuryPkg;
    }
    public void setHasLuxuryPkg(boolean hasLuxuryPkg) {
        this.hasLuxuryPkg = hasLuxuryPkg;
    }

    public boolean isHas4WDPkg() {
        return has4WDPkg;
    }
    public void setHas4WDPkg(boolean has4WDPkg) {
        this.has4WDPkg = has4WDPkg;
    }

    public boolean isHasSportsPkg() {
        return hasSportsPkg;
    }
    public void setHasSportsPkg(boolean hasSportsPkg) {
        this.hasSportsPkg = hasSportsPkg;
    }

    //compareTo() Method
    public int compareTo(Chevy other){
            if(this.miles > other.miles){
                return 1;
            }
            else if(this.miles < other.miles){
                return -1;
            }
            else{
                return 0;
            }
    }

    //equals() Method
    public boolean equals(Chevy other){
        if(this.model.equals(other.model) && this.color.equals(other.color)){
            if(this.miles<200 && other.miles<200){
                return true;
            }
            else if (this.miles>200 && other.miles>200){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }

    //toString Method
    public String toString(){
        String output =  "**************************************************\n";
        output += this.year + " Chevrolet " + this.model + " (" + this.color + ") \n";
        output += "BASE PRICE:\t\t\t\t\t\t" + this.basePrice;
        output += "\nMILES:\t\t\t\t\t\t\t" + this.miles;
        output += "\nFUEL EFFICIENCY:\t\t\t\t" + this.mpg + " mpg\n";
        output += "PACKAGES";
        return output;
    }
}


