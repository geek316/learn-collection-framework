package net.startegicfarming.learnstreams;

import java.util.*;
import java.util.stream.Collectors;

public class LearningCollectors {
    public LearningCollectors() {
    }

    public static void main(String[] args) {
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

        // Example 1: Collecting names by length
        System.out.println("Example Questions");
        List<String> friendsList = Arrays.asList("Summi", "Hemant", "Mukesh", "Anshal", "Neel", "Subhadeep");
        System.out.println(friendsList.stream().collect(Collectors.groupingBy(String::length)));
        System.out.println(friendsList.stream().collect(Collectors.groupingBy(String::length, Collectors.counting())));

        // Example 2: counting word occurrences
        String sentence = "Hello world hello java world";
        System.out.println(Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(x -> x, Collectors.counting())));

        // Example 3: Partitioning even and odd numbers
        List<Integer> allNums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        Map<Boolean, List<Integer>> evenOddMap = allNums.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println("Even from list : " + evenOddMap.get(true));
        System.out.println("Odd from list : " + evenOddMap.get(false));

        // Example 4: Summing values in a map
        HashMap<String, Integer> items = new HashMap<>();
        items.put("Apple", 10);
        items.put("Banana", 20);
        items.put("Orange", 30);
        System.out.println(items.values().stream().reduce(Integer::sum).get());
        System.out.println(items.values().stream().collect(Collectors.summingInt(x -> x)));

        // Example 5: Creating a map from stream elements, based on length as value.
        List<String> fruitList = Arrays.asList("Apple", "Banana", "Cherry");
        System.out.println(fruitList.stream().collect(Collectors.toMap(x -> x.toUpperCase(), x -> x.length())));

        // Example 6:
        List<String> stringList = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        System.out.println(stringList.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting())));
        System.out.println(stringList.stream().collect(Collectors.toMap(k -> k, v -> 1, (x, y) -> x + y)));

    }
}
