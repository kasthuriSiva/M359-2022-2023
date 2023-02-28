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
    public Rectangle(String color, int numSides, int w, int l)
    {
        super(color,numSides);
        this.width = w;
        this.length = l;
    }
}
