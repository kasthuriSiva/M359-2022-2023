package U4_Loops.PigLatinLab;

public class PigLatin {

    public static String toPigLatin(String phrase){
        findWord(phrase);
        return phrase;
    }

    public static String findWord(String phrase){
       boolean isDone = false;
       int loc = -1;
       String output = "";

        while (isDone==false){
            loc = phrase.indexOf(" ");

            if(loc !=-1){
                //if we find space join the part before " " with the part after " "
                output+= phrase.substring(0,loc);
                temp = translateWordToPigLatin(output);

            }
            else{
                //Means no more " " found
                isDone = true;
            }

        }
        return output;
    }

    public static String translateWordToPigLatin(String str){
        String strNew = "";

        if(str.substring(0,1).equalsIgnoreCase("a")||str.substring(0,1).equalsIgnoreCase("e")||
                str.substring(0,1).equalsIgnoreCase("i")||str.substring(0,1).equalsIgnoreCase("o")||
                str.substring(0,1).equalsIgnoreCase("u")){

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
}