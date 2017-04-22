package testcore4;

/**
 * Created by Maringa on 21.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime();
        String[] programs = new String[5];

        programs[0] = "notepad.exe";
        programs[1] = "calc.exe";

        for (String program : programs) {
            try {
                System.out.println("Executing programs: ");
                Process process = Runtime.getRuntime().exec(program);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
