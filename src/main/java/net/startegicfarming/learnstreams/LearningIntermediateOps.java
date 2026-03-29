package net.startegicfarming.learnstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LearningIntermediateOps {
    static void main() {

        // Intermediate operations transform a stream into another stream
        // They are lazy, meaning they don't execute until a terminal operation is invoked.

        // 1. Filter
        List<String> list = Arrays.asList("Summi","Hemant","Mukesh","Sharan","Summi");
        Stream<String> filteredStream = list.stream().filter(x -> x.startsWith("S"));
        // No filtering at this point
        long res = list.stream().filter(x -> x.startsWith("S")).count();
        System.out.println(res);

        // 2. Map
        Stream<String> stringStream = list.stream().map(String::toUpperCase);

        // 3. sorted
        Stream<String> sortedStream = list.stream().sorted();
        Stream<String> sortedStreamUsingComparator = list.stream().sorted((a,b) -> a.length() - b.length());

        // 4. Distinct
        System.out.println(list.stream().filter(x -> x.startsWith("S")).distinct().count());

        // 5. Limit
        long count = Stream.iterate(1, x -> x + 1).limit(10).count();
        System.out.println(count);

        // 6. Skip
        long count1 = Stream.iterate(1, x -> x + 1).skip(2).limit(10).count();
        System.out.println(count1);

        // 7. Peek
        // Performs an action on each element as it is consumed.
        Stream.iterate(1, x -> x + 1).skip(2).limit(10).peek(System.out::println).count();

        // 8. flatMap
        // Handle streams of collections, lists, or arrays where each element is itself a collection.
        // Flatten nested structures (e.g., list within list) so that they can be processed as a single sequence of element.
        // Transform and flatten elements at the same time.
        List<List<String>> listOfList = Arrays.asList(
                Arrays.asList("Apple", "Kashmir"),
                Arrays.asList("Litchi", "Bihar"),
                Arrays.asList("Coconut", "Kerala")
        );
        System.out.println(listOfList
                .stream()
                .flatMap(x -> x.stream())
                .map(String::toUpperCase)
                .toList());

        // Another Example
        List<String> sentences = Arrays.asList(
                "Hello World",
                "java streams are powerful",
                "flatmap is useful"
        );
        System.out.println(sentences
                .stream()
                .flatMap(x -> Arrays.stream(x.split(" ")))
                .map(String::toUpperCase)
                .toList());



    }
}
