package lab_02_challenges;

public class LambdaWithFunctionalInterface {
    public static void main(String[] args) {
        //Task:
        //Create a functional interface named StringManipulator with a method manipulate that takes a String and returns a String.
        //Write a lambda expression that converts the input string to uppercase.
        StringManipulator upperCase =  String::toUpperCase;
        System.out.println(upperCase.manipulate("test"));
    }
}
