package lab_03_challenges;

import java.util.List;
import java.util.stream.Stream;

public class FilterWithLambda {
    public static void main(String[] args) {
        //Task: Given a list of integers, use a lambda expression to filter out the even numbers and print the remaining numbers.
        List<Integer> list = Stream.of(1, 3, 4, 6, 8)
                .filter(it -> it > 5)
                .toList();
        System.out.println(list);
    }
}
