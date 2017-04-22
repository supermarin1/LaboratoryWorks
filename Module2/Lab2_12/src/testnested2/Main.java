package testnested2;

/**
 *
 */
public class Main {

    public static void main(String[] args) {
        MyTestClass myTestClass = new MyTestClass();


        MyTestClass.MyInner inner = myTestClass.inner;

        MyTestClass.MyStaticNested staticNested = myTestClass.staticNested;

    }
}
