package demosocket;


import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

public class MySecondClient {

    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException,
            InvalidKeyException, BadPaddingException, IllegalBlockSizeException {

        String[] names = new String[]{"John2", "Anna2", "Peter2"};
        for (String name : names) {
            try (Socket s = new Socket("localhost", 6666)) {

                System.out.println("Client2: data to be sent: " + name);
                byte[] output = name.getBytes();

                ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
                System.out.println("Client2: Key received");
                Key publicKey = (Key) ois.readObject();
                Cipher cipher = Cipher.getInstance("RSA");
                cipher.init(Cipher.ENCRYPT_MODE, publicKey);

                byte[] encrData = cipher.doFinal(output);
                ObjectOutputStream dout = new ObjectOutputStream(s.getOutputStream());
                dout.writeObject(encrData);
                System.out.println("Client2: Encrypted data sent");

                Thread.sleep(3000);

                dout.flush();
                dout.close();
        } catch(IOException | ClassNotFoundException | InterruptedException e){
            e.printStackTrace();
        }
        }
}
}

