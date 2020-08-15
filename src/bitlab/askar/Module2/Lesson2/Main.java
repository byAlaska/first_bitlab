package bitlab.askar.Module2.Lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException{

        Scanner in = new Scanner(System.in);
        int []array = {1,2,3,4,5};

        try {
            doSmth(in.nextInt(),in.nextInt());
        }catch (Exception e){
            e.printStackTrace();
        }

    }


    public static void doSmth(int a, int b) throws MyException{

        if (b == 0){
            throw new MyException();
        }

        System.out.println(a/b);
    }
}
