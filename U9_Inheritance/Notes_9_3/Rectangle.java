package U9_Inheritance.Notes_9_3;

public class Rectangle extends Shape
{
    private int width;
    private int length;

    public Rectangle() {
        super();
        width = 0;
        length = 0;
    }
    public Rectangle(String color, int numSides, int width, int length)
    {
        super(color,numSides);
        this.width = width;
        this.length = length;
    }
    public int getWidth()
    {
        return this.width;
    }

    public String toString() {
        String output = "";
        output += super.toString();  //Get the color and numSides
        output += ", Width: " + this.width + ", Length: " + this.length;
        output += ", Area: " + findArea();
        return output;
    }
    public void scaleSize(double factor)
    {
        this.width *= factor;
        this.length *= factor;
    }
    public double findArea()
    {
        return this.width * this.length;
    }
}
