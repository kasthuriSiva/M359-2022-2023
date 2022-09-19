package U2_Objects;

import java.util.Locale;

public class StringExample
{
    public static void main(String[] args)
    {
        String s1 = "vacation";
        String s2 = "Sunshine cures all things";

        //.toUpperCase() returns the same string
        //but in all capital letters: VACATION
        System.out.println(s1.toUpperCase());

        //just prints out s1 which is: vacation
        //the .toUpperCase call didn't SAVE the change
        System.out.println(s1);

        // index of returns the first place that
        // the computer finds the letter "u"
        System.out.println(s2.indexOf("u"));
        System.out.println(s2.indexOf("x"));

        //Returns s1 starting at index 4 (going to end)
        System.out.println(s1.substring(4));

        //returns s1 starting at index 2 going all the wsy up to
        //index 5 but not including 5 (so:index 2,3,4)
        System.out.println(s1.substring(2,5));

        //.length returns the number of characters in the string
        System.out.println(s1.length());
        System.out.println(s2.length());

        //.equals() returns true is dtrings are equal; false otherwise
        boolean isEqual = s1.equals("VACATION");
        System.out.println(isEqual);

        String s3 = "bat";
        String s4 = "bird";
        String s5 = "Mickey";

        System.out.println(s3.compareTo(s4));
        System.out.println(s3.compareTo(s3));
        System.out.println(s4.compareTo(s3));
    }
}
