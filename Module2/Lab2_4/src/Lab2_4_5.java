/**
 *
 */
public class Lab2_4_5 {
    public static void main(String[] args) {
        System.out.println(calcPi(100000));
    }

    static double calcPi(int n){
        double pi = 0;
        int a = 1;

        for (int i = 0; i < n; i++) {
            if ((i%2)!=0){
                pi += (double) a * 4/i;
                a = a*(-1);
            }
        }
        return pi;
    }
}
