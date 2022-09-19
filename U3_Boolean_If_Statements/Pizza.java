package U3_Boolean_If_Statements;

public class Pizza {
    //Instance variables
    private String store;
    private int inches;
    private int numToppings;
    private boolean isDeepDish;

    //Constructors
    public Pizza (String store, int inches, int numToppings,boolean isDeepDish ){
        //store = aStore;
        this.store = store;
        this.inches = inches;
        this.numToppings = numToppings;
        this.isDeepDish = isDeepDish;
    }
    public Pizza (String store, int inches,boolean isDeepDish ){
        //store = aStore;
        this.store = store;
        this.inches = inches;
        this.numToppings = 0;
        this.isDeepDish = isDeepDish;
    }

    //Methods

    public String getStore(){
        return this.store;
    }

    public void setStore(String newStore){
        this.store = newStore;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public int getNumToppings() {
        return numToppings;
    }

    public void setNumToppings(int numToppings) {
        this.numToppings = numToppings;
    }

    public boolean isDeepDish() {
        return isDeepDish;
    }

    public void setDeepDish(boolean deepDish) {
        isDeepDish = deepDish;
    }

    //printInfo method: prints all of the pizza's information
    public void printInfo(){
        System.out.println(this.inches + " -inch pizza from "+this.store);
        System.out.println("# of toppings: " + this.numToppings);
        System.out.println("Deep Dish? " + this.isDeepDish);
    }

    //toString Method returns not prints the pizza in a String/text format
    public String toString(){
        String output = this.inches + " -inch pizza from "+this.store +"\n";
        output += "# of toppings: " + this.numToppings +"\n";
        output += "Deep Dish? " + this.isDeepDish + "\n";

        return output;
    }
    //.equals method: returns true if both pizzas are equivalent
    //returns false otherwise
    public boolean equals(Pizza other){
        if(this.inches == other.inches){
            return true;
        }
        else{
            return false;
        }
    }

    //returns negative if "this" comes before "other"
    //returns 0 if they're the same
    // returns (+) if "this" comes after "other"
    public int compareTo(Pizza other){
        if(this.inches > other.inches){
            return -1;
        }
        else if (this.inches > other.inches){
            return 1;
        }
        else{
            return 0;
        }
    }
}
