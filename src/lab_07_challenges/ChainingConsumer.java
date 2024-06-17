package lab_07_challenges;

import java.util.function.Consumer;

public class ChainingConsumer {
    public static void main(String[] args) {
        //Task: Create two Consumer lambda expressions. The first one prints a string and the second one prints its length.
        // Chain these consumers together and apply them to a list of strings.
        Consumer<String> stringConsumer = System.out::println;
        stringConsumer
                .andThen(str -> System.out.println(str.length()))
                .accept("totolo");

    }
}
