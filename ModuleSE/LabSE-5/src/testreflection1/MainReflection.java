package testreflection1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainReflection {
    public static void main(String[] args) {
        MyClass c = new MyClass(2, 5);

        exploreInstance(c);

        createUsingReflection();
    }

    static void exploreInstance(MyClass instance) {
        Class cls = instance.getClass();

        exploreFileds(cls);
        System.out.println();

        exploreConstructors(cls);
        System.out.println();

        exploreMethod(cls);

    }

    static void exploreFileds(Class cls) {
        Field[] allFields = cls.getDeclaredFields();
        for (Field field : allFields) {

            switch (field.getModifiers()) {
                case 0:
                    System.out.println("DEFAULT modifier fields: ");
                    System.out.print("\tName: " + field.getName() + ", ");
                    System.out.println("Type: " + field.getType().getName());
                    break;
                case 1:
                    System.out.println("PUBLIC modifier fields: ");
                    System.out.print("\tName: " + field.getName() + ", ");
                    System.out.println("Type: " + field.getType().getName());
                    break;
                case 2:
                    System.out.println("PRIVATE modifier fields: ");
                    System.out.print("\tName: " + field.getName() + ", ");
                    System.out.println("Type: " + field.getType().getName());
                    break;
                case 4:
                    System.out.println("PROTECTED modifier fields: ");
                    System.out.print("\tName: " + field.getName() + ", ");
                    System.out.println("Type: " + field.getType().getName());
            }
        }
    }

    static void exploreConstructors(Class cls) {
        Constructor[] constructors = cls.getConstructors();
        int i = 0;
        for (Constructor constructor : constructors) {
            System.out.print("Constructor " + (++i) + ": ");
            Class[] paramTypes = constructor.getParameterTypes();
            for (Class paramType : paramTypes) {
                System.out.print(paramType.getName() + " ");
            }
            System.out.println();
        }
    }

    static void exploreMethod(Class cls) {
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Name: " + method.getName());
            System.out.println("\tReturn type: " + method.getReturnType().getName());

            Class[] paramTypes = method.getParameterTypes();
            System.out.print("\tParam types: ");
            for (Class paramType : paramTypes) {
                System.out.print(" " + paramType.getName());
            }
            System.out.println();
        }
    }

    static void createUsingReflection() {
        Class cls = MyClass.class;
        MyClass instance = null;
        Constructor[] constr = cls.getConstructors();

        for (Constructor construct : constr) {
            if (construct.getParameterCount() == 1) {
                try {
                    instance = (MyClass) construct.newInstance(12);

                    Method[] methods = cls.getDeclaredMethods();
                    for (Method method : methods) {
                        if (method.getName().equals("setA")) {
                            method.invoke(instance, 33);
                        }
                    }
                    System.out.println(instance.toString());

                } catch (InstantiationException | InvocationTargetException |
                        IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
