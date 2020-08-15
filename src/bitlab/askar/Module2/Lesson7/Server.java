package bitlab.askar.Module2.Lesson7;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args){

        try {
            ServerSocket server = new ServerSocket(2077);

            System.out.println("Waiting for a client");

            while (true){
                Socket socket = server.accept();
                System.out.println("Client connected");

                ClientHandler clientHandler = new ClientHandler(socket);
                clientHandler.start();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
