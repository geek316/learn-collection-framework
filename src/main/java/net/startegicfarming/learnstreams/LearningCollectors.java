package net.startegicfarming.learnstreams;

import java.util.*;
import java.util.stream.Collectors;

public class LearningCollectors {
    static void main() {
        // Collectors is a utility class
        // provides a set of methods to create common collectors.

        // 1. Collecting to a list
        List<String> names = Arrays.asList("Summi", "Hemant", "Mukesh", "Anshal");
        List<String> list = names.stream().filter(name -> name.startsWith("S")).collect(Collectors.toList());
        System.out.println(list);

        // 2. Collecting to a set
        List<Integer> nums = Arrays.asList(1, 2, 3, 3, 4, 5, 5, 5, 6);
        Set<Integer> set = nums.stream().collect(Collectors.toSet());
        System.out.println(set);

        // 3. Collecting to a specified collection
        ArrayDeque<String> arrayDeque = names.stream().collect(Collectors.toCollection(() -> new ArrayDeque<>()));
        System.out.println(arrayDeque);

        // 4. Joining Strings - concatenates stream elements into a single string.
        String concatenatedNames = names.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println(concatenatedNames);

        // 5. Summarizing Data - generates statistical summary (count, sum, min, average, max)
        List<Integer> numbers = Arrays.asList(2, 3, 5, 7, 11);
        IntSummaryStatistics stats = numbers.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println(stats);
        System.out.println("Count : " + stats.getCount());
        System.out.println("Sum : " + stats.getSum());
        System.out.println("Min : " + stats.getMin());
        System.out.println("Average : " + stats.getAverage());
        System.out.println("Max : " + stats.getMax());
        
        // 6. Calculating Averages
        Double avg = numbers.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println("Average using averageInt : " + avg);

        // 7. Counting elements
        Long counting = numbers.stream().collect(Collectors.counting());
        System.out.println("Count using counting : " + counting);

        // 8. Grouping Elements
        List<String> words = Arrays.asList("Hello", "World", "java", " streams", "collecting");
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length)));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.joining(" "))));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.counting())));
        TreeMap<Integer, Long> treeMap = words.stream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));
        System.out.println(treeMap);

        // 9. Partitioning Elements
        // Partitions elements into two groups (true and false) based on a predicate.
        System.out.println(words.stream().collect(Collectors.partitioningBy(x -> x.length() > 5)));
        System.out.println(words.stream().collect(Collectors.partitioningBy(x -> x.length() > 5, Collectors.counting())));

        // 10. Mapping and collecting
        // Applies a mapping function before collecting
        System.out.println(words.stream().collect(Collectors.mapping(x -> x.toUpperCase(), Collectors.toList())));





    }
}
