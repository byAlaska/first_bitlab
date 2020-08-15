package bitlab.askar.Module2.Lesson7;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        try {

            Socket socket = new Socket("localhost",2077);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

            String message;

            while (true){
                message = in.next();
                outputStream.writeObject(message);

                System.out.println(inputStream.readObject());

            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
