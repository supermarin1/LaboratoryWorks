package teststring2;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";

        for (int i = 0; i < myStr1.length(); i++) {
            if (myStr2.indexOf(myStr1.charAt(i)) == -1) {
                System.out.print(myStr1.charAt(i) + " ");
            }
        }
    }
}
