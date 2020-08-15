package bitlab.askar.Module1.Lesson10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);



        Shape []shape = new Shape[3];

        shape[0] = new Circle(5);
        shape[1] = new Square(4);
        shape[2] = new Circle(6);

        for (int i=0;i<3;i++){
            System.out.println(shape[i].getArea());
            System.out.println(shape[i].getPreimeter());
        }
    }
}
