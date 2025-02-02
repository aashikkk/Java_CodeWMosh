package streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void show(){
        var movies = List.of(
                new Movie("a", 10),
                new Movie("b", 30),
                new Movie("c", 20)
        );

//        movies.stream()
//                .takeWhile(m -> m.getLikes() < 30) // it will stop when it finds the first movie with likes >= 30
//                .forEach(m -> System.out.println(m.getTitle()));
//
        movies.stream()
                .dropWhile(m -> m.getLikes() < 30) // skip elements as long as the condition is true. Once it encounters an element where the condition is false, it stops skipping and includes the rest of the elements
                .forEach(m -> System.out.println(m.getTitle()));
    }
}
