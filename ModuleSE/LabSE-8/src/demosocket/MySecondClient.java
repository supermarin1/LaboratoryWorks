package demosocket;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class MySecondClient {

    public static void main(String[] args) {
        Student outStudent = new Student("Maryna", "Java", 2);


        try (Socket s = new Socket("10.11.0.224",6666);) {

            ObjectOutputStream dout = new ObjectOutputStream(s.getOutputStream());
            dout.writeObject(outStudent);

            ObjectInputStream dis = new ObjectInputStream(s.getInputStream());
            Student answer = (Student) dis.readObject();
            System.out.println(answer);
            dout.flush();
            dout.close();
            dis.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

