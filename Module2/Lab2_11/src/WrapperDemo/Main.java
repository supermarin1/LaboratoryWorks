package WrapperDemo;

/**
 *
 */
    public class Main {
        public static void main(String[] args) {
            Byte a = 1;
            Integer b = 234234;
            Long l = compute(a, b);

            assert (l.equals(234235)) : "HA-HA-HA";
            System.out.println(l);

        }

        private static Long compute(Byte num1, Integer num2) {
            Long sum = (long) (num1 + num2);
            return sum;
        }
    }

