package bitlab.askar.Module1.Others;

import java.util.Scanner;

public class Domashka {
    public static void main(String[] args){


        Scanner in = new Scanner(System.in);


        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();

        System.out.println(Math.pow(x,4) + 4*x*Math.pow(y,2) - 4*y*z + Math.pow(z,4) );

    }
}
