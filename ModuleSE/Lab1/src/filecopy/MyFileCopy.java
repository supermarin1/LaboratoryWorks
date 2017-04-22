package filecopy;

import java.io.*;

/**
 * Created by Maringa on 22.04.2017.
 */
public class MyFileCopy {
    public static void main(String[] args) throws IOException {
        System.out.println(args[0]);
        System.out.println(args[1]);

        InputStream is = new FileInputStream(args[0]);
        OutputStream os = new FileOutputStream(args[1]);
        int variable;
        while ((variable=is.read())!= -1){
            os.write(variable);
        }
    }
}
