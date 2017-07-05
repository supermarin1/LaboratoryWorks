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

/**
 *
 */
public class MyClient {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        Student outStudent = new Student("Andrey", "Java", 1);


        try (Socket s = new Socket("10.11.0.224",6666)) {

            String name = outStudent.getName();
            System.out.println(name);

            byte[] output = name.getBytes();

            ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
            System.out.println("ok");

            Key publicKey = (Key) ois.readObject();
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.ENCRYPT_MODE, publicKey);
            byte[] encrData = cipher.doFinal(output);
            String sended = new String(encrData);
            System.out.println("sended" + " " + sended);

            ObjectOutputStream dout = new ObjectOutputStream(s.getOutputStream());
            dout.writeObject(encrData);

//            ObjectInputStream dis = new ObjectInputStream(s.getInputStream());
//            Student answer = (Student) dis.readObject();
//            System.out.println(answer);
            ois.close();
            dout.flush();
            dout.close();
//            dis.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
