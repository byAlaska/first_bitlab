package bitlab.askar.Module1.Lesson8.Lab4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        User []users = {
                new User(1,"qwerty","password","admin"),
                new User(2,"login","asdf","default"),
                new User(3,"123123","123123","manager")
        };


        System.out.println("INSERT LOGIN:\n");
        String login = in.next();
        System.out.println("INSERT PASSWORD:\n");
        String password = in.next();


        User user = new User();
        for (int i=0;i<users.length;i++){
            if (users[i].getLogin().equals(login) && users[i].getPassword().equals(password)) {
                user = users[i];
            }
        }

        while (true){

            System.out.println("Welcome " + user.getLogin());

            System.out.println(" PRESS [1] TO EDIT LOGIN\n" +
                    "        PRESS [2] TO CHANGE PASSWORD\n" +
                    "        PRESS [3] TO LIST USERS\n" +
                    "        PRESS [0] TO EXIT");

            int choice = in.nextInt();

            if (choice==1){
                System.out.println("Insert login");

                String newLogin = in.next();
                user.setLogin(newLogin);




            }else if(choice==2){

                System.out.println("Insert old password");
                String oldPassword = in.next();


                if (user.getPassword().equals(oldPassword)){
                    System.out.println("Insert new password");
                    String newPassword = in.next();
                    System.out.println("Re-insert new password");
                    if (newPassword.equals(in.next())){
                        user.setPassword(newPassword);
                    }



                }else{
                    System.out.println("Error incorrect password");




                }
            } else if (choice == 3) {
                for (int i=0;i<users.length;i++){
                    System.out.println(users[i]);
                }
            }else {
                break;
            }

        }



    }
}
