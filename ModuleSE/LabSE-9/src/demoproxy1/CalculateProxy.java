package demoproxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *
 *
 */
public class CalculateProxy implements InvocationHandler {
    private Object[] objCalc;

    private Class[] interfaces = {};

    public CalculateProxy(Object[] objCalc, Class[] interfaces) {
        this.objCalc = objCalc;
        this.interfaces = interfaces;
    }

// for first task
//    @Override
//    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        System.out.println("The method<" + method.getName() + "> invoked with arg: " + Arrays.toString(args));
//
//        Object result = method.invoke(objCalc, args);
//
//        System.out.println("The method <" + method.getName() + "> ends with result: " + result.toString());
//
//        return result;
//    }

//    static Calculate newInstance(Object objCalc){
//        Calculate proxyInstance = (Calculate) Proxy.newProxyInstance(objCalc.getClass().getClassLoader(),
//                objCalc.getClass().getInterfaces(), new CalculateProxy(objCalc));
//
//        return proxyInstance;
//    }

    public  static <T> T newInstance(Class<T> intfc) {
        Object[] objCalc = new Object[]{new CalculateImpl(), new CalculateBitwiseImpl()};
        Class[] interfaces = new Class[]{Calculate.class, CalculateBitwise.class};
        Object proxyCalc = null;

        for (int i = 0; i < interfaces.length; i++) {
            if (intfc.isAssignableFrom(interfaces[i])) {
                System.out.println("I hope it works");
                proxyCalc = Proxy.newProxyInstance(objCalc[i].getClass().getClassLoader(), interfaces, new CalculateProxy(objCalc, interfaces));
            }
        }
        return (T)proxyCalc;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Method[] calcMeth = Calculate.class.getMethods();
        Method[] bitMeth = CalculateBitwise.class.getMethods();

        Object result = null;

        for (Method method1 : calcMeth) {
            if (method1.equals(method)) {
                result = method.invoke(new CalculateImpl(), args);
            }
        }

        for (Method method1 : bitMeth) {
            if (method1.equals(method)) {
                result = method.invoke(new CalculateBitwiseImpl(), args);
            }
        }
        return result;
    }
}
