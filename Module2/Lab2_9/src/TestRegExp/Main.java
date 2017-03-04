package TestRegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        String[] names = {"VOVA", "Ivan", "R2d2", "ZX", "Anna", "12345", "ToAd", "TomCat", " "};

        for (String name : names) {
            System.out.println(checkPersonWithRegExp(name));
        }
    }

    private static boolean checkPersonWithRegExp(String userNameString) {
        String test = "^[A-Z]\\w[a-z]+";
        Pattern pattern = Pattern.compile(test);
        Matcher matcher = pattern.matcher(userNameString);
        return matcher.matches();
    }
}

