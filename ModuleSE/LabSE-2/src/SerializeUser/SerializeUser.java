package SerializeUser;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;

/**
 * Created by Maringa on 23.04.2017.
 */
public class SerializeUser {
    public static void main(String[] args) throws IOException {
        String fileSource = "D:\\IdeaProjects\\BrainAcademy\\ModuleSE\\LabSE-2\\src\\SerializeUser\\user.ser";

        User user1 = new User("Tony", "Stark", 42);

        RandomAccessFile file = new RandomAccessFile(fileSource,"rw");
        file.seek(0);
        file.writeBytes(String.valueOf(user1));

        file.seek(0);
        String userData = file.readLine();
        System.out.println(userData);



    }
}
