package U2_Objects;

public class wrapperExample {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x);

        //Create a wrapped integer
        Integer wrappedInt = new Integer(6 );
        System.out.println(wrappedInt.intValue());

        //Create a wrapped integer USING AUTOBOXING
        Integer wrappedInt2 = 12;
        System.out.println(wrappedInt2);

        //Create a wrapped double as well
        Double wrappedDouble = 5.4682734870;
        System.out.println(wrappedDouble);

        //Display the minimum and maximum value of the integer
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

    }
}
