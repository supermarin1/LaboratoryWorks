/**
 *
 */
public class Lab2_1_3 {
    public static void main(String[] args) {
        Computer[] comp = new Computer[5];

        for (int i = 0; i < comp.length; i++) {
            comp[i] = new Computer("Mac", i+1, 4,200);
        }

        for (Computer computer : comp) {
            System.out.println("Serial numbers are " + computer.getSerialNumber());
        }
    }
}
