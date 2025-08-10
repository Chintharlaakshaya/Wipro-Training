package collections;

import java.util.*;
import java.util.Comparator;

public class PersonMain {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>(Arrays.asList(
            new Person("Brian", 30),
            new Person("Harry", 23),
            new Person("Brian", 25)
        ));

        System.out.println("Original List");
        System.out.println(person);

        person.sort(Comparator.comparing(Person::getName)
                              .thenComparing(Person::getAge));

        System.out.println("Sorted list by name then by age: ");
        for (Person p : person) {
            System.out.println(p);
        }
    }
}
