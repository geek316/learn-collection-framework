package net.startegicfarming.learnstreams;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LearnStreams {
    static void main() {
        // Steams
        // feature introduced in JAVA 8
        // process collections of data in a functional and declarative manner.
        // Simplify data processing.
        // Embrace readability and maintainability
        // Enable easy parallelism

        // What is stream ?
        // A sequence of elements supporting functional and declarative programming.

        // How to use streams ?
        // Source, intermediate operations & terminal operation

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        int count = 0;
        for (int i : numbers) {
            if (i%2 == 0) {
                count++;
            }
        }
        System.out.println(count);

        System.out.println(numbers.stream().filter(x -> x % 2 == 0).count());


        // Creating Streams
        // 1. From Collections
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream = list.stream();
        // 2. From Arrays
        String[] array = {"a", "b","c"};
        Stream<String> stream1 = Arrays.stream(array);
        // 3. Using Stream.of()
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6);
        Stream<? extends Serializable> stream2 = Stream.of("A", 1, 2, "B");
        // 4. Infinite Streams -> generate/iterate
        Stream<Integer> generate = Stream.generate(() -> 1);
        Stream<Integer> limit = Stream.generate(() -> 2).limit(100);
        List<Integer> collect = Stream.iterate(1, x -> x + 1).limit(100).collect(Collectors.toList());
        System.out.println(collect);


    }
}
