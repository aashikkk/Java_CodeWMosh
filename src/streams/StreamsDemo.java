package streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void show(){
        IntStream
//                .range(1,5) // 1,2,3,4
                .rangeClosed(1,5) // 1,2,3,4,5
                .forEach(System.out::println);


    }
}
