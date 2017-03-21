package testgenerics1;

/**
 *
 */
public class MyTuple<A, B, C> {
    A first;
    B second;
    C third;

    public MyTuple(A first, B second, C third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

    public C getThird() {
        return third;
    }
}

