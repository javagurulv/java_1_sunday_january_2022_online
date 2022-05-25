package student_yevgeniy_tolks.training.imperativeProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Main {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Yevgeniy", Gender.MALE),
                new Person("Alina", Gender.FEMALE),
                new Person("Agata", Gender.FEMALE),
                new Person("Jelizaveta", Gender.FEMALE)
        );
        System.out.println("//Imperative approach");

        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if (Gender.FEMALE.equals(person.getGender())) {
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println(female);
        }

        System.out.println("//Declarative approach");

        Predicate<Person> personPredicate = person -> Gender.FEMALE.equals(person.getGender());
        people.stream()
                .filter(personPredicate)
                .toList()
                .forEach(System.out::println);

    }
}
