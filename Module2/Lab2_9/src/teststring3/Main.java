package teststring3;

import java.util.Arrays;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        String myStr = "Using methods of class String";
        System.out.println(myStr);

        System.out.println(Arrays.toString(uniqueChars(myStr)));
    }

    private static char[] uniqueChars(String s) {
        char[] ch = s.toCharArray();
        boolean isValid;
        char[] unique = new char[0];

        for (int i = 0; i < ch.length; i++) {
            isValid = true;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    ch[j] = 0;
                    isValid = false;
                }
            }
            if (isValid) {
                unique = addUnique(unique, ch[i]);
            }
        }
        return unique;
    }

    private static char[] addUnique(char[] unique, char a) {
        char[] newUnique = Arrays.copyOf(unique, unique.length + 1);
        newUnique[newUnique.length - 1] = a;
        return newUnique;
    }
}
