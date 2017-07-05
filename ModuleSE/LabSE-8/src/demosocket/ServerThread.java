package demosocket;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 */
public class ServerThread extends Thread{
    Student student;
    private Socket socket;

    public ServerThread (Socket socket){
        this.socket = socket;
        this.start();
    }

    @Override
    public void run() {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(socket.getInputStream());
            Student inStudent = (Student) ois.readObject();
            System.out.println(inStudent.toString());

            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject("recieved student: " + inStudent.getName());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
