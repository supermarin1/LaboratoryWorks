package testlambda2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Maringa on 30.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 13, 17, 77, 68, 99, 300, 765, 674);
        List<String> strList = Arrays.asList("lolo", "blabla", "woof", "garden", "master", "wind", "most", "filter",
                "f*ck", "solo", "function");
        System.out.println("An original intList: " + intList.toString());
        System.out.println("An original stringList: " + strList.toString());


        System.out.print("Сумма четных чисел: ");
        sumEven(intList, (n) -> n % 2 == 0);
        System.out.println();

        String test = "f";
        System.out.print("Строки, начинающиеся на \"" + test + "\": ");
        printStr(strList, (s) -> s.startsWith(test));

        System.out.println("StringList to UPPERCASE: ");
        updateList(strList, String::toUpperCase);
        System.out.println("An updated stringList: " + strList.toString());

    }

    static void sumEven(List<Integer> intList, Predicate<Integer> predic) {
        Integer sum = 0;
        for (Integer integer : intList) {
            if (predic.test(integer)) {
                sum = sum + integer;
            }
        }
        System.out.print(sum + " ");
    }

    static void printStr(List<String> stringList, Predicate<String> predic) {
        for (String s : stringList) {
            if (predic.test(s)) {
                System.out.print(s + "\\ ");
            }
        }
    }

    static void updateList(List<String> stringList, MyConverter myConv) {
        for (int i = 0; i < stringList.size(); i++) {
            stringList.set(i, myConv.convertStr(stringList.get(i)));
        }
    }
}
