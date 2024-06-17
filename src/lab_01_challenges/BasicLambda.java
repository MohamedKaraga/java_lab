package lab_01_challenges;

import java.util.function.IntBinaryOperator;

public class BasicLambda {
    public static void main(String[] args) {
        //Write a lambda expression that takes two integers and returns their sum.
        IntBinaryOperator sum = Integer::sum;
        System.out.println(sum.applyAsInt(12,12));
    }
}
