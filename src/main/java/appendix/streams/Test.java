package appendix.streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        anatomy();
    }

    static void anatomy() {
        // Pipeline = Source + Intermediate Operations + Terminal operation
        // Source -                   Stream.of("foo", "", "bar")
        // Intermediate Operations - .filter(), .map()
        // Terminal Operation -      toList()
        List<String> s = Stream.of("foo", "", "bar")
                .filter(Predicate.not(String::isEmpty))
                .map(String::toUpperCase)
                .toList();
        System.out.println(s);
    }
}
