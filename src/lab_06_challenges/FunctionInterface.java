package lab_06_challenges;

import java.util.function.ToIntFunction;

public class FunctionInterface {
    public static void main(String[] args) {
        //Task: Write a lambda expression using the Function interface that takes a string and returns its length.
        ToIntFunction<String> function = String::length;
        System.out.println(function.applyAsInt("talato"));
    }
}
