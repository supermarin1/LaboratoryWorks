package testcollection2;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int insertNum = random.nextInt(list.size() + 1);
            list.add(insertNum, "number_" + i);
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}
