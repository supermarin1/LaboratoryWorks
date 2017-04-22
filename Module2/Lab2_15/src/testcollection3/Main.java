package testcollection3;

import java.util.*;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            list1.add("num_" + i);
            list2.add("Num_" + i);
        }
        System.out.print("Array list: ");
        Iterator<String> iterator1 = list1.iterator();
        while (iterator1.hasNext()) {
            System.out.print(iterator1.next() + " ");
        }

        System.out.println();

        System.out.print("Linked list: ");
        Iterator<String> iterator2 = list2.iterator();
        while (iterator2.hasNext()) {
            System.out.print(iterator2.next() + " ");
        }

        Random random = new Random();

        Iterator<String> iterator = list1.iterator();
        while (iterator.hasNext()){
            int position = random.nextInt(list2.size());
            list2.add(position,iterator.next());
        }
        printElements(list2);

    }
    static void printElements(Collection c){
        System.out.println("\nThere are all elements in Collection: ");
        Iterator iterator = c.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
}
