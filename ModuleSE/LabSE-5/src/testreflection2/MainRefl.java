package testreflection2;

import java.lang.reflect.Field;

/**
 * Created by Maringa on 21.05.2017.
 */
public class MainRefl {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        String myStr = "abcd";
        System.out.println("Original string: " + myStr);

        Field field = myStr.getClass().getDeclaredField("value");
        field.setAccessible(true);
        field.set(myStr, "zxvc".toCharArray());
        field.setAccessible(false);

        System.out.println("Modified string: " + myStr);
    }
}
