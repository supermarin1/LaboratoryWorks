package randomaccess;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by Maringa on 24.04.2017.
 */
public class UseRandomAccess {
    public static void main(String[] args) throws IOException {
        String filePath = "D:\\IdeaProjects\\BrainAcademy\\ModuleSE\\Lab1\\src\\randomaccess\\users.txt";

        try {
            RandomAccessFile file = new RandomAccessFile(filePath, "rw");
            testUsers("Ololoev", file);
            printFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void printFile(RandomAccessFile file) throws IOException {
        System.out.println("The list of users: ");
        file.seek(0);
        while (file.getFilePointer() != file.length()) {
            System.out.println(file.readLine());
        }
    }

    static void testUsers(String user, RandomAccessFile file) throws IOException {
        boolean isExist = false;
        System.out.println("Reading file...");
        while (file.getFilePointer() != file.length()) {
            String input = file.readLine();
            String[] userFromFile = input.split(":");

            if (userFromFile[0].equals(user)) {
                System.out.println("User found. Changing entries...");
                isExist = true;
                file.seek(file.getFilePointer() - 1 - userFromFile[1].length());
                String toWrite = String.valueOf(Integer.valueOf(userFromFile[1]) + 1);
                file.writeBytes(toWrite);
                file.seek(file.getFilePointer() + 1);
            }
        }
        if (!isExist) {
            System.out.println("User not found. Adding new user...");
            file.seek(file.getFilePointer());
            file.writeBytes(user + ":1\n");
        }
        System.out.println("The end. Thank you!");
    }
}


