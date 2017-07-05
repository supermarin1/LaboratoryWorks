package demoproxy1;

/**
 *
 */
public class CalculateBitwiseImpl implements CalculateBitwise {
    @Override
    public int andBitwise(int a, int b) {
        return a&b;
    }

    @Override
    public int orBitwise(int a, int b) {
        return a|b;
    }
}
