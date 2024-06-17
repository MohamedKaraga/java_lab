import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // Stream from an Array
        String[] array = {"x", "y", "z"};
        Stream<String> streamFromArray = Arrays.stream(array);

        // Stream from values
        Stream<String> streamFromValues = Stream.of("one", "two", "three");

        // Infinite Stream using Stream.generate
        Stream<Double> randomNumbers = Stream.generate(Math::random);


        List<String> list = List.of("apple", "banana", "cherry", "date");

        // Filter and map example
        List<String> filteredList = list.stream()
                .filter(s -> s.startsWith("a"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(filteredList); // Output: [APPLE]


        // Reducing example
        //Optional<Integer> sum = list.stream().reduce(Integer::sum);
        //sum.ifPresent(System.out::println); // Output: 15

        // Infinite Stream using Stream.iterate
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);

        Optional<String> optional = Optional.of("value");

        // Checking if the value is present
        if (optional.isPresent()) {
            System.out.println(optional.get());
        }

        // Or use ifPresent
        optional.ifPresent(System.out::println);


        Optional<String> emptyOptional = Optional.empty();
        String value = emptyOptional.orElse("default");


        // Using method reference with Optional
        optional.map(String::toUpperCase)
                .ifPresent(System.out::println);  // Prints "HELLO"

        Optional<String> nullableOptional = Optional.ofNullable(null); // Can be null







        printWithSwitchAndSealedInterface(new Dog(13, "titi"));
        printWithSwitchAndSealedInterface(new Cat("toto", 12));
        printWithSwitchAndSealedInterface(new Cat(null, null));
    }

    private static void printWithSwitchAndSealedInterface(Animal animal) {
        switch (animal) {
            case Dog(Integer a, String n) -> System.out.println(STR."This is dog age : \{a} and name \{n}");
            case Cat(_, Integer age) -> System.out.println(STR."This is cat age: \{age}");
        }
    }
}