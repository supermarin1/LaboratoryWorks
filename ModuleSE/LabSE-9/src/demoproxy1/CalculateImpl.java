package demoproxy1;

/**
 *
 */
public class CalculateImpl implements Calculate {
    @Override
    public int multiplication(int a, int b) {
        return a*b;
    }

    @Override
    public int division(int a, int b) {
        return a/b;
    }
}
