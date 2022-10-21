package U4_Loops.PigLatinLab;

public class PigLatin {

    public static String toPigLatin(String phrase) {
        boolean isDone = false;
        int loc = -1;
        String output = "";

        while (phrase.indexOf(" ") != -1) {
            if(isDone == false) {
                loc = phrase.indexOf(" ");

                if (loc != -1) {
                    //if we find space join the part before " " with the part after " "
                    String word = findWord(phrase);
                    System.out.println(word);
                    output += translateWordToPigLatin(word);
                    phrase = phrase.substring(loc+1);

                } else {
                    //Means no more " " found
                    isDone = true;
                }

            }

        }
        return output;
    }

    public static String findWord(String phrase){
        System.out.println(phrase);
       String temp = "";

       boolean isSpace = false;
       while(isSpace = false){
           int i =0;
           if(phrase.charAt(i) != ' '){
               temp += phrase.charAt(i);
           }
           else{
               isSpace = true;
           }
           i++;
       }
       return temp;
    }
    public static String translateWordToPigLatin(String str){
        String strNew = "";
        String vowels = "a e i o u";

        System.out.println(str);

        if(vowels.indexOf(str.substring(0,1)) != -1){

            strNew += str + "yay";
            return strNew;

        }
        else{
            if (vowels.indexOf(str.substring(1,2)) == -1) {
                strNew += str.substring(2) + str.substring(0, 2) + "ay";
                return strNew;
            }
            else{
                strNew += str.substring(1) + str.substring(0, 1) + "ay";
                return strNew;
            }
        }
    }
}