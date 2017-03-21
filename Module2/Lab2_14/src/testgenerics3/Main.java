package testgenerics3;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        MyMixer<Integer> intMix = new MyMixer<>(intArray);

        System.out.print("An original array: ");
        for (Integer integer : intArray) {
            System.out.print(integer + " ");
        }
        System.out.println();

        intMix.suffle(intArray);

        System.out.print("Shuffled Array:= ");
        for (Integer integer : intArray) {
            System.out.print(integer + " ");
        }
        System.out.println();

        System.out.println("   ***   ");

        String[] stringArray = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        MyMixer<String> stringMix = new MyMixer<>(stringArray);

        System.out.print("An original array: ");
        for (String string : stringArray) {
            System.out.print(string + " ");
        }
        System.out.println();

        stringMix.suffle(stringArray);

        System.out.print("Shuffled Array:= ");
        for (String string : stringArray) {
            System.out.print(string + " ");
        }
    }
}
