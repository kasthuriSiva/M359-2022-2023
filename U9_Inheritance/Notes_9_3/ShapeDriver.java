package U9_Inheritance.Notes_9_3;

public class ShapeDriver {
    public static void main(String[] args) {
        Shape myShape = new Shape("red", 5);
        System.out.println(myShape);

        Circle myCircle = new Circle("green",7);
        System.out.println(myCircle);

        Rectangle myRectangle = new Rectangle("yellow",4, 2,5);
        System.out.println(myRectangle);

        Square mySquare = new Square("blue",4);
        System.out.println(mySquare);
    }
}
