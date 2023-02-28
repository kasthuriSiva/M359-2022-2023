package U9_Inheritance.Notes_9_3;

public class Circle extends Shape{
    private double radius;

    public Circle() {
        super();
        radius = 0;
    }
    public Circle(String color, int numSides, double r)
    {
        super(color,numSides);
        this.radius = r;
    }
}
