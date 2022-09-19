package U3_Boolean_If_Statements;

public class Review {
    //Private instance variables
    private String reviewerName;
    private String buisness;
    private int rating ;

    //Constructors
    public Review(String reviewerName, String buisness, int rating) {
        this.reviewerName = reviewerName;
        this.buisness = buisness;
        this.rating = rating;
    }

    //methods
    public String toString(){
        String output = reviewerName + ", " + buisness + ", " + rating;


        if(rating==5){
            output += "\n\t** Highly Recommended";
        }
        else if (rating ==1){
            output += "\n\t ** Stringly Discouraged";
        }

        return output;
    }
}
