package demosocket;

import java.io.DataInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 */
public class MyServer {

    public static void main(String[] args) {
        try (ServerSocket ss = new ServerSocket(6666);){
            while (true) {
                Socket s = ss.accept(); //establishes connection
                new ServerThread(s);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

