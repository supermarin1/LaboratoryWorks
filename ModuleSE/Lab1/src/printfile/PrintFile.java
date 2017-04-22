package printfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Maringa on 22.04.2017.
 */
public class PrintFile {
    public static void main(String[] args) throws IOException {

            BufferedReader bufferedReader =  new BufferedReader(new FileReader(args[0]));

            while (bufferedReader.ready()) {
                System.out.println(bufferedReader.readLine());
            }
    }
}
