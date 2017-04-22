package testnested1;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        // Lab2_14_1

        MyPhone.MyPhoneBook firstPhoneBook = new MyPhone.MyPhoneBook();

        firstPhoneBook.addPhoneNumber("Yurii", "380939347896");
        firstPhoneBook.addPhoneNumber("Oleg", "380939347455");
        firstPhoneBook.addPhoneNumber("Natalia", "380939666896");
        firstPhoneBook.addPhoneNumber("Mom", "380939340000");
        firstPhoneBook.addPhoneNumber("Stan", "380939388896");

        firstPhoneBook.printPhoneBook();

        // Lab2_14_2
        System.out.println("   ***   ");

        MyPhone.MyPhoneBook secondPhoneBook = new MyPhone.MyPhoneBook();

        secondPhoneBook.addPhoneNumber("Nastya", "380939347896");
        secondPhoneBook.addPhoneNumber("Amanda", "380939347455");
        secondPhoneBook.addPhoneNumber("Bill", "380939666896");
        secondPhoneBook.addPhoneNumber("Jon", "380939340000");
        secondPhoneBook.addPhoneNumber("Teon", "380939388896");
        secondPhoneBook.addPhoneNumber("Yurii", "380939347897");
        secondPhoneBook.addPhoneNumber("Oleg", "380939347457");
        secondPhoneBook.addPhoneNumber("Natalia", "380939666897");
        secondPhoneBook.addPhoneNumber("Mom", "380939340007");
        secondPhoneBook.addPhoneNumber("Stan", "380939388897");

        System.out.println("Sorted by name: ");
        secondPhoneBook.sortByName();
        secondPhoneBook.printPhoneBook();

        System.out.println();

        System.out.println("Sorted by phone number: ");
        secondPhoneBook.sortByPhoneNumber();
        secondPhoneBook.printPhoneBook();

        // Lab 2_14_3
        System.out.println("   ***   ");

        MyPhone myPhone = new MyPhone();

        myPhone.SwitchOn();
        myPhone.call(1);
    }
}
