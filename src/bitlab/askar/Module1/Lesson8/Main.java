package bitlab.askar.Module1.Lesson8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("PRESS [1] TO EDIT LOGIN");
        System.out.println(" PRESS [2] TO CHANGE PASSWORD");
        System.out.println(" PRESS [3] TO LIST USERS\n" +
                "        PRESS [0] TO EXIT");


        int choice = in.nextInt();

        if (choice==1){
            System.out.println("Insert new login");
            String newLogin = in.next();
        }


        User user = new User();

    }

}
