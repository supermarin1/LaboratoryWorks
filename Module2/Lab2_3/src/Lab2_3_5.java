/**
 *
 */
public class Lab2_3_5 {
    public static void main(String[] args) {
        MyWindow[] window = new MyWindow[4];

        window[0] = new MyWindow(40, 55);
        window[1] = new MyWindow();
        window[2] = new MyWindow(33, 44, 4);
        window[3] = new MyWindow(60, 50, 3, "yellow", true);

        for (MyWindow myWindow : window) {
            myWindow.printFields();
        }
    }
}
