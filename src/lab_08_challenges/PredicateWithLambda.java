package lab_08_challenges;

import java.util.function.Predicate;

public class PredicateWithLambda {
    public static void main(String[] args) {
        //Task: Write a lambda expression using the Predicate interface that checks if a string is non-empty.
        Predicate<String> stringPredicate = String::isEmpty;
        System.out.println(stringPredicate.test(""));
        System.out.println(stringPredicate.test("totla"));
    }
}
