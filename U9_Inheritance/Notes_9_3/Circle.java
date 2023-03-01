package U9_Inheritance.Notes_9_3;

public class Circle extends Shape {
    private double radius;
    public Circle() {
        super();
        radius = 0;
    }

    public Circle(String color, double r) {
        super(color, 1);
        this.radius = r;
    }
    public String toString() {
        String output = "";
        output += super.toString();  //Get the color and numSides
        output += ", Radius: " + this.radius;
        output += ", Area: " + findArea();
        return output;
    }
    public double findArea()
    {
        return Math.PI * this.radius * this.radius;
    }
}
