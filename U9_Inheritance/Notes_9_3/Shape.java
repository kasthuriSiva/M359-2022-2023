package U9_Inheritance.Notes_9_3;

public class Shape
{
    private String color;
    private int numSides;

    //Create a default constructor and a full constructor
    public Shape()
    {
        color = "No Color";
        numSides = -1;
    }
    public Shape(String color, int numSides)
    {
        this.color = color;
        this.numSides = numSides;
    }

    public static void main(String[] args) {
        public String toString(String color, int numSides)
        {
            System.out.println("This shape is " + color + " and has " + numSides + " sides");
        }
    }

}
