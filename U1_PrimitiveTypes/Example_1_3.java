package U1_PrimitiveTypes;

public class Example_1_3 {
    //psvm tab
    public static void main(String[] args) {
        //sout
        System.out.println("Hello World");

        //You're throwing a pizza party! create variables
        //for the # of guests, as well as the # of pizzas
        int guestNum = 5;
        int pizzaNum = 3;

        // 1. Use a system.out.print statement to display a
        // summary of the party so far

        System.out.println("Number of Guests:" + guestNum);
        System.out.println("Number of Pizzas:" + pizzaNum );

        //2. Two more guests just showed up, bringing 4 more pizzas
        // update all variables appropriately, then display the new info
        guestNum += 2;
        pizzaNum += 4;

        System.out.println("Number of Guests:" + guestNum);
        System.out.println("Number of Pizzas:" + pizzaNum );

        //3. Switching gears a bit... display the ones digit of a
        // given integer
        int num = 1872;
        int onesDigit = num % 10;
        System.out.println("One's digit: " +onesDigit);

        //4. display the 10's digit of an integer
        int tensDigit = (num % 100) / 10;
        System.out.println("Ten's digit: " +tensDigit );

    }
}
