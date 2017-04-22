package filelist;

import java.io.File;
import java.util.Arrays;

/**
 * Created by Maringa on 22.04.2017.
 */
public class MyFileList {
    public static void main(String[] args) {


        File file = new File(".");

        File [] files = file.listFiles();

        System.out.println("There are the next files in current directory: ");
        for (File file1 : files) {
            System.out.println(file1);
        }
        System.out.println(args.length);

    }
}
