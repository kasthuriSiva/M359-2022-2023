package U3_Boolean_If_Statements;

public class CompundBooleanExample {
    public static void main(String[] args) {
        String day ="Saturday";
        int numHwAssignments = 2;

        //1. Alicia loves video ga,e. She plays video games if it's Saturday
        //or if she doesn't have any hw. Print out either
        // "Yay, video games!" or "I guess I'll have to wait :("

        if(numHwAssignments==0 || day.equals("Saturday")){
            System.out.println("Yay, video games!");
        }
        else{
            System.out.println("I guess I'll have to wait :(");
        }

        //2.
        if(day.equals("Monday") && numHwAssignments <= 2){
            System.out.println("Yay coding club!");
        }
        else{
            System.out.println("Today is a sad day :(");
        }

        //3.
        if(day.equals("Saturday")||day.equals("Sunday")){
                System.out.println("Exercise");
        }
        else{
            if(numHwAssignments == 0){
                int rand = (int)(Math.random()*10) +1;
                if(rand<=8){
                    System.out.println("Exercise");
                }
                else{
                    System.out.println("NO Exercise");
                }
            }
            else {
                int rand = (int)(Math.random()*10) +1;
                if(rand<=3){
                    System.out.println("Exercise");
                }
                else{
                    System.out.println("NO Exercise");
                }
            }
        }

    }
}
