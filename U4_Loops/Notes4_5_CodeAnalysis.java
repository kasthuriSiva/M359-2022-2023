package U4_Loops;

public class Notes4_5_CodeAnalysis {
    public static void main(String[] args) {
        //#1
        outputBreak("Challenge 1: Number Pyramid 1 to 5");
       for(int max =5; max>=1; max--){
           for(int i=1; i<=max; i++){
               System.out.print(i);
           }
           System.out.println();
       }

        //#2
        outputBreak("Challenge 2: Number Pyramid 55555 to 1");
        for( int i=5; i>=1;i--){
            for (int j=0; j<i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        //#3
        outputBreak("Challenge 3: String pyramid");
        everyOtherLetterPyramid("FremdVikings");
        //#4


        //#5


        //#6


        //#7


        //#8

    }
    public static void outputBreak(String title){
        System.out.println();
        System.out.println();
        System.out.println(title);
        System.out.println();
    }
    public static void everyOtherLetterPyramid(String str){
        for(int i=5; i>0; i--){
            System.out.println(str.substring(0,i));
        }
    }
}
