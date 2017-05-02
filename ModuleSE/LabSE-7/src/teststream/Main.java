package teststream;

import testlambda2.Person;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> streamFromIterate = Stream.iterate(10, n -> n + 10);
        List<Integer> intList = streamFromIterate.limit(10).collect(Collectors.toList());
        intList = intList.stream().map(n -> n / 2).collect(Collectors.toList());
        System.out.println("In integer list: ");
        System.out.println(intList.toString());

        System.out.println();

        List<String> strList = Arrays.asList("Padme Amidala", "Luke Skywalker", " Leia Organa", "Anakin Skywalker",
                "Chewey", "Yoda", "Jabba the Hutt", "General Grievous", "Mace Windu", "Jar Jar Binks", "Count Dooku",
                "Obi-Wan Kenobi", "Darth Maul", "Palpatine", "Kylo Ren", "Rey", "Han Solo", "Ahsoka Tano", "Boba Fett",
                "Jango Fett");

        String start = "J";
        System.out.println("All strings starting with " + start + ": ");
        strList.stream()
                .filter(s -> s.startsWith(start))
                .peek(s -> System.out.print(s + ", "))
                .collect(Collectors.toList());

        System.out.println();
        System.out.println();

        List<Person> people = new LinkedList<>();
        people.add(new Person("Maryna", 27, "female"));
        people.add(new Person("Yurii", 23, "male"));
        people.add(new Person("Andrii", 17, "male"));
        people.add(new Person("Anastasiia", 28, "female"));
        people.add(new Person("Danny", 47, "male"));
        people.add(new Person("Serena", 40, "female"));

        System.out.println("Military men: ");
        people.stream()
                .filter(p -> p.getGender().toLowerCase().equals("male") && p.getAge() > 17 && p.getAge() < 28)
                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println();

        OptionalDouble avAge = people.stream()
                .filter(p -> p.getGender().toLowerCase().equals("female"))
                .mapToInt(Person::getAge)
                .average();

        System.out.println("The average female age is " + avAge.getAsDouble());
    }
}
