package animaldog;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Dog();
        Dog animal3 = new Dog();

        foo(animal1);
        foo(animal2);
        foo(animal3);
    }

    static void foo (Animal animal){
        System.out.println("animaldog.Animal");
    }
    static void foo (Dog dog){
        System.out.println("animaldog.Dog");
    }
}
