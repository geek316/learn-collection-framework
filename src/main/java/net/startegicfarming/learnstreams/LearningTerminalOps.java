package net.startegicfarming.learnstreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LearningTerminalOps {
    static void main() {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // 1. Collect
        list.stream().skip(1).collect(Collectors.toList());
        list.stream().skip(1).toList();

        // 2. For Each
        list.stream().forEach(x -> System.out.println(x));

        // 3. Reduce/Accumulator - combines elements to produce a single result.
        Optional<Integer> optionalInteger = list.stream().reduce(Integer::sum);
        System.out.println(optionalInteger.get());

        // 4. Count

        // 5. anyMatch, allMatch, noneMatch
        boolean anyMatch = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(anyMatch);

        boolean allMatch = list.stream().allMatch(x -> x % 2 == 0);
        System.out.println(allMatch);

        boolean noneMatch = list.stream().noneMatch(x -> x % 2 == 0);
        System.out.println(noneMatch);

        // 6. findFirst, findAny
        System.out.println(list.stream().findFirst().get());
        System.out.println(list.stream().findAny().get());

        // 7. toArray()
        Stream.of(1,2,3).toArray();

        // 8. min/max
        System.out.println("Min/Max");
        System.out.println(Stream.of(2,5,4).max(Comparator.naturalOrder()).get());
        System.out.println(Stream.of(2,5,4).min(Comparator.naturalOrder()).get());


        // Examples : Filtering and collecting names
        List<String> names = Arrays.asList("Summi", "Hemant", "Mukesh", "Anshal", "Neel");
        List<String> stringList = names.stream().filter(x -> x.length() > 4).toList();
        System.out.println(stringList);

        // Example : Squaring and sorting numbers.
        List<Integer> nums = Arrays.asList(5, 2, 9, 1, 6);
        List<Integer> integerList = nums.stream().map(x -> x * x).sorted().toList();
        System.out.println(integerList);

        // Example : Summing values
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 10, 15);
        System.out.println(list1.stream().reduce(Integer::sum).get());

        // Example : Counting occurrence of character.
        String sentence = "Hello World";
        System.out.println(sentence.chars().filter(x -> x == 'l').count());

        // stateful & stateless operations

    }
}
