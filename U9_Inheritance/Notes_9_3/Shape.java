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
    public String getColor()
    {
        return this.color;
    }
    public int getNumSides()
    {
        return this.numSides;
    }
    public String toString()
    {
        String output = "";
        output += "Color: " + this.color;
        output += ", Number of sides: " + this.numSides;
        return output;
    }
}
