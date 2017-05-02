package testlambda;

import java.util.*;

/**
 * Created by Maringa on 30.04.2017.
 */
public class testLambda {
    public static void main(String[] args) {
        // working with integer
        Integer[] intArray = new Integer[10];

        //filling an array
        Random rndm = new Random();
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = rndm.nextInt(100);
        }
        System.out.println("Original array: " + Arrays.toString(intArray));

        //sorting
//        Arrays.sort(intArray, (o1, o2) -> o1 - o2);
        Arrays.sort(intArray, Comparator.comparingInt(o -> o));
        System.out.println("Original array after sorting: " + Arrays.toString(intArray));

        //working with Strings
        List<String> stringList = new ArrayList<>();
// filling in list
        stringList.add("ololol");
        stringList.add("blablabla");
        stringList.add("woof-woof");
        stringList.add("Andromeda");
        stringList.add("Indicator");
        stringList.add("Cat");
        stringList.add("minor");
        System.out.println("An original list: \n" + stringList);
        //sorting
//        stringList.sort(((o1, o2) -> o2.compareTo(o1)));
        stringList.sort((Comparator.reverseOrder()));
        System.out.println("An original list after reverse sorting: \n" + stringList);
    }
}
