package demosocket;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerThread extends Thread {
    private Socket socket;

    ServerThread(Socket socket) {
        this.socket = socket;
        this.start();
    }

    @Override
    public void run() {
        Security security = new Security();
        try {
            ObjectOutputStream ous = new ObjectOutputStream(socket.getOutputStream());
            ous.writeObject(security.getPublicKey());
            System.out.println("key sent " + Thread.currentThread().getName());

            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            byte[] encr = (byte[]) ois.readObject();
            String decr = security.decryptKey(encr);

            System.out.println("received decrypted data: " + decr);

            ous.flush();
            ous.close();
            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
