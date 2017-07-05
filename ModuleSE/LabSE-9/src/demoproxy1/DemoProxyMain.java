package demoproxy1;

import java.lang.reflect.Proxy;

/**
 *
 */
public class DemoProxyMain {
    public static void main(String[] args) {
//        Calculate calc  = new CalculateImpl();
//
//        System.out.println("Call methods without proxy");
//
//        System.out.println("mult: " + calc.multiplication(2, 3));
//        System.out.println("div: " + calc.division(10, 3));
//
//        Calculate proxyCalc = CalculateProxy.newInstance(calc);
//
//        System.out.println("Call methods with proxy");
//        proxyCalc.multiplication(2,3);
//        proxyCalc.division(10,3);

        Calculate proxyCalc1 = CalculateProxy.newInstance(Calculate.class);
        Calculate proxyCalc2 = CalculateProxy.newInstance(Calculate.class);
        CalculateBitwise proxyCalc3 = CalculateProxy.newInstance(CalculateBitwise.class);
        CalculateBitwise proxyCalc4 = CalculateProxy.newInstance(CalculateBitwise.class);


        System.out.println(proxyCalc1.multiplication(3, 5));
        System.out.println(proxyCalc2.division(3, 5));
        System.out.println(proxyCalc3.andBitwise(3, 5));
        System.out.println(proxyCalc4.orBitwise(3, 5));

    }
}
