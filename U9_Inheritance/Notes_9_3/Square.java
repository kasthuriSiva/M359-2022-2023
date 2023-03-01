package U9_Inheritance.Notes_9_3;

public class Square extends Rectangle
{
    public Square(String color, int sideLength) {
        super(color, 4, sideLength, sideLength);

    }
    public String toString() {
        String output = "";
        output += "Color: " + this.getColor();
        output += ", Number of sides: " + this.getNumSides();
        output += ", Side length: " + super.getWidth();
        return output;
    }

}
