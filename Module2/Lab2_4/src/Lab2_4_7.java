/**
 *
 */
public class Lab2_4_7 {
    public static void main(String[] args) {

        System.out.println("The distance is: " + GravityCalculator.calcDist(2));
    }
}

class GravityCalculator {
    static final double Acceleration = 9.81;
    //original formula x(t) = 0.5 * a * time * time + v*time + x
    //due to v,x = 0 -- ignore
    static double calcDist(double time){
        double dist;
        dist = 0.5 * Acceleration * time * time;
        return dist;
    }
}
