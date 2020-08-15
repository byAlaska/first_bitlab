package bitlab.askar.Module2.Lesson5;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        File file = new File("input.txt");

        ArrayList<User> users = new ArrayList<>();

        if (file.exists()){
             users = readUsers();
        }

        while (true){

            System.out.println("[1] Add User");
            System.out.println("[2] Read Users");
            System.out.println("[3] EXIT");

            int choice = in.nextInt();

            if (choice==1){

                System.out.println("Input id");
                int id = in.nextInt();
                System.out.println("Input login");
                String login = in.next();
                System.out.println("Input passwrod");
                String password = in.next();

                User user = new User(id,login,password);
                users.add(user);
                writeUsers(users);

            }else if (choice==2){
                System.out.println(users.toString());
            }else {
                break;
            }
        }
    }


    public static void writeUsers(ArrayList<User> users){

        try {

            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("input.txt"));
            outputStream.writeObject(users);
            outputStream.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static ArrayList<User> readUsers(){

        ArrayList<User> users = new ArrayList<>();

        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("input.txt"));
            users = (ArrayList<User>)inputStream.readObject();
            inputStream.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        return users;
    }
}
