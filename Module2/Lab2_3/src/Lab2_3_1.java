/**
 *
 */
public class Lab2_3_1 {
    public static void main(String[] args) {
        MyWindow wind1 = new MyWindow(30, 40, 2, "white", true);
        MyWindow wind2 = new MyWindow(40, 40, 2, "black", true);
        MyWindow wind3 = new MyWindow(30, 50, 2, "red", false);
        MyWindow wind4 = new MyWindow(50, 40, 2, "blue", false);
        MyWindow wind5 = new MyWindow(50, 50, 2, "green", true);

        wind1.printFields();
        wind2.printFields();
        wind3.printFields();
        wind4.printFields();
        wind5.printFields();
    }
}
