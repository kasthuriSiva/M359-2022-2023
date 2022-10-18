package U4_Loops;

import java.util.Scanner;

public class Notes4_2 {
    public static void main(String[] args) {
        //1.Print the even number from 0-20 on the same line
        for (int i=0; i<=20; i+=2){
            System.out.print(i + " ");
        }
        System.out.println();

        //2.print the multiples of 5 from 5 - 100
        for (int i=5; i<=100; i+=5){
            System.out.print(i + " ");
        }
        System.out.println();
        //3.Print every character of String str with a space
        //in between them (Ex: "cookie" would print as "c o o k i e")
        String str = "FremdHS";
        for(int i =0; i< str.length(); i++){
            System.out.print(str.substring(i,i+1) + " ");
        }
        System.out.println();

        //4.reverse order
        for(int i = str.length()-1; i>=0; i--){
            System.out.print(str.substring(i,i+1));
        }
    }
}
