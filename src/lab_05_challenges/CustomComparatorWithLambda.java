package lab_05_challenges;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class CustomComparatorWithLambda {
    public static void main(String[] args) {
        //Task: Create a list of Person objects and sort them by age using a lambda expression. The Person class should have fields name and age.
        List<Person> list = Stream.of(new Person("toto", 23), new Person("titi", 43), new Person("tata", 01))
                .sorted(Comparator.comparingInt(Person::age))
                .toList();
        System.out.println(list)    ;
    }
}
