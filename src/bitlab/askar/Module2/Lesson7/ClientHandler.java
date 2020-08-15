package bitlab.askar.Module2.Lesson7;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientHandler extends Thread {

    Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        try {

            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());

            while (true){
                String message = (String)inputStream.readObject();
                System.out.println(message);

                if (message.equals("Hello")){
                    outputStream.writeObject("OKAY");
                }else {
                    outputStream.writeObject("Not oKAY");
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
