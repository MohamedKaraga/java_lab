import java.util.Objects;

public record Cat (String name, Integer age) implements Animal {
    public Cat {
        Objects.requireNonNull(name);
        Objects.requireNonNull(age);
    }
}