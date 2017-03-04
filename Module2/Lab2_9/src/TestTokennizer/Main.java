package TestTokennizer;

import java.util.StringTokenizer;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        String myStr = "This is String, split by StringTokenizer. Created by Student:Name of Student";
        StringTokenizer st = new StringTokenizer(myStr, " .,");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
