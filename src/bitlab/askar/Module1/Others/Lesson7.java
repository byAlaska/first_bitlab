package bitlab.askar.Module1.Others;

import java.util.Scanner;

public class Lesson7 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        findText("Alibi","bi");

    }

    public static String[] filter(String[] strings){

        String[] result = new String[strings.length];
        int index = 0;

        for (int i=0;i<strings.length;i++){
            int counter = 0;

            for (int j=0;j<strings[i].length();j++){

                if (strings[i].charAt(j) == 'a' || strings[i].charAt(j) == 'e' || strings[i].charAt(j) == 'o'
                        || strings[i].charAt(j) == 'u' || strings[i].charAt(j) == 'i'){
                    counter++;

                    if (counter>3){
                        result[index] = strings[i];
                        index++;
                        break;
                    }
                }
            }
        }

        return result;
    }



    public static void findText(String text, String subtext){

        ///////
        boolean b = true;



        if (b){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
