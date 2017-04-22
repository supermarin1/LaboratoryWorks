package overloadwithnull;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Animal animal = null;
        Dog dog = null;
        Puppy puppy = null;

        foo(animal);
        foo(dog);
        foo(puppy);
        foo(null);
    }

    static void foo (Animal a){
        System.out.println("Animal");
    }
    static void foo (Dog d){
        System.out.println("Dog");
    }

    static void foo(Puppy p) {
        System.out.println("Puppy");
    }
}

class Animal{}
class Dog extends Animal{}
class Puppy extends Dog{}