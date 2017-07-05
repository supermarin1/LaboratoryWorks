package replacement;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Maringa on 22.04.2017.
 */
public class ReplacementInFIle {
    public static void main(String[] args) throws IOException {
        System.out.println("Reading file...");
        BufferedReader bufRead = new BufferedReader(new FileReader(args[0]));

        System.out.println("Saving data...");
        List<String> javaFile = new ArrayList<>();
        while (bufRead.ready()) {
            javaFile.add(bufRead.readLine());
        }
        bufRead.close();

        System.out.println("Replacing words...");
        List<String> newJavaFile = new ArrayList<>();
        Iterator<String> toRead = javaFile.iterator();
        while (toRead.hasNext()) {
            String s = toRead.next();
            newJavaFile.add(s.replaceAll("public", "private"));
        }

        System.out.println("Writing new data to file...");
        BufferedWriter bufWrite = new BufferedWriter(new FileWriter(args[0]));
        Iterator<String> toWrite = newJavaFile.iterator();
        while (toWrite.hasNext()) {
            String s = toWrite.next();
            bufWrite.write(s + "\n");
        }
        bufWrite.close();

        System.out.println("The end. Check file.");
    }
}
