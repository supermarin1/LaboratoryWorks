/**
 *
 */
public class Lab2_1_5 {
    public static void main(String[] args) {
        Computer[] comp = new Computer[5];

        for (int i = 0; i < comp.length; i++) {
            comp[i] = new Computer("HP", (i*11+1), (i+1), (i*100));
            comp[i].setPrice(100*comp[i].getQuantityCPU());
        }

        for (Computer computer : comp) {
            computer.view();
        }

    }
}
