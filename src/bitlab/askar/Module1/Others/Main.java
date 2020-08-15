package bitlab.askar.Module1.Others;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        double d = Math.pow(a,3);
        d = d + 2*Math.pow(b,2);
        d = d - 3*a*b;
        d = d + Math.pow(c,3);


        System.out.println(d);



    }
}
