package lab_04_challenges;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class SortedWithLambda {
    public static void main(String[] args) {
        //Task: Sort a list of strings by their lengths using a lambda expression.
        List<String> list = Stream.of("toto", "tata", "lab", "lambda", "function")
                .sorted(Comparator.comparingInt(String::length))
                .toList();
        System.out.println(list);
    }
}
