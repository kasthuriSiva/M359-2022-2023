package U1_PrimitiveTypes;

public class Notes_1_4_1_5 {
    public static void main(String[] args) {
        // 1. Given a decimal number (double), truncate the decimals (chop off)
        // and display the resulting whole number
        double width = 12.7391;     // should display 12
        int newValue = (int)width;  //newValue = 12
        System.out.println(newValue);

        //2.Given an integer, display it TRUNCATED tot he 100's place
        int population = 8132789;   // should display 8132700
        //int newPopulation =  population - (8132789%100);
        int newPopulation = population /100 *100;
        System.out.println(newPopulation);

        //3.Given a decimal number (double), display it ROUNDED to
        // the nearest integer
        double height = 7.89;
        int newHeight = (int)(height +0.5);
        System.out.println(newHeight);

        //4. Given an integer round it to the nearest hundred
        int speed = 16378;  //should display 16400
       // int roundSpeed =
    }
}
