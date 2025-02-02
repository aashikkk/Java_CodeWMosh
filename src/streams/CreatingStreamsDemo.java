package streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

public class CreatingStreamsDemo {
    public static void show(){

        // M2 Another way to create a stream - infinite
        Stream.iterate(1, n-> n+1)
                .limit(10)
                .forEach(n -> System.out.println(n));


//        // M1 -  Arbitary no of objects
////        Stream.of() // to create a stream of objects
//        var stream = Stream.generate(() -> Math.random());
//        stream
//                .limit(3)
//                .forEach(System.out::println);

//        // From Arrays
//        int[] number = {1, 2, 3};
//        Arrays.stream(number)
//                .forEach(n -> System.out.println(n));
    }
}

/*
*
* // From Arrays
        int[] number = {1, 2, 3};
        Arrays.stream(number)
                .forEach(n -> System.out.println(n));
                *

// M1 - Arbitary no of objects
//        Stream.of() // to create a stream of objects
        var stream = Stream.generate(() -> Math.random());
        stream
                .limit(3)
                .forEach(System.out::println);
                *

     // M2 Another way to create a stream - infinite
        Stream.iterate(1, n-> n+1)
                .limit(10)
                .forEach(n -> System.out.println(n));

* */