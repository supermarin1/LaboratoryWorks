package teststring1;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        String myStr = "abracadabra";
        String reversedMyStr = reverseString(myStr);

        System.out.println("The original string: " + myStr);

        System.out.println("The first 'ra' is starts on " + myStr.indexOf("ra") + " index");
        System.out.println("The last 'ra' is starts on " + myStr.lastIndexOf("ra") + " index");
        System.out.println("The substring from 2 to 7 index is: " + myStr.substring(3, 7));
        System.out.println("The reversed string: " + reversedMyStr);
    }

    private static String reverseString(String myStr) {
        String reversedMyStr = new StringBuilder(myStr).reverse().toString();
        return reversedMyStr;
    }
}
