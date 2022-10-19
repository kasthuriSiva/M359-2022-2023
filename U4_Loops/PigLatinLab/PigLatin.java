package U4_Loops.PigLatinLab;

public class PigLatin {

   public static String translateWordToPigLatin(String str){
       return toPigLatin(str);
   }

   public static String convertOneWord(String str){
       String strNew = "";
       if(str.substring(0,1).equalsIgnoreCase("a")||str.substring(0,1).equalsIgnoreCase("e")||
               str.substring(0,1).equalsIgnoreCase("i")||str.substring(0,1).equalsIgnoreCase("o")||str.substring(0,1).equalsIgnoreCase("u")){

           strNew += str.substring(1) + str.substring(0,1) + "ay";
           return strNew;

       }
       else if (str.substring(0,1).equalsIgnoreCase("y")){
           strNew += str.substring(1) + "yay";
           return strNew;
       }
       else{
           strNew += str.substring(1) + str.substring(0,1) + "yay";
           return strNew;
       }
   }

   public static String toPigLatin(String phrase){
        String output ="";
       for(int i=0; i<phrase.length(); i++){
            if(phrase.charAt(i)==' '){
                output += convertOneWord(phrase) + " ";
            }
       }
        return output;
    }

}