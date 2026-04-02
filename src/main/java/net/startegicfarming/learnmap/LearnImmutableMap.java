package net.startegicfarming.learnmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LearnImmutableMap {
    public static void main(String[] args) {

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Summi");
        map1.put(2, "Hemant");
        System.out.println("Original map : " + map1);

        Map<Integer, String> map2 = Collections.unmodifiableMap(map1);
//        map2.put(3, "Mukesh"); // throws exception - java.lang.UnsupportedOperationException
        System.out.println("Unmodifiable map : " + map2);
        System.out.println();
        System.out.println();

        System.out.println("Clean way of writing immutable map.");
        // Java 9 - introduced in.
        // limited to 10 pairs
        Map<Integer, String> map3 = Map.of(1, "Summi", 2, "Hemant");
        System.out.println(map3);
//        map3.put(3, "Mukesh"); // throws exception - java.lang.UnsupportedOperationException
        System.out.println("After modification : " + map3);
        System.out.println();
        System.out.println();

        // Another method to overcome limit of 10 pairs
        Map<Integer, String> map4 = Map.ofEntries(
                Map.entry(1, "Summi"),
                Map.entry(2, "Hemant"),
                Map.entry(3, "Mukesh"),
                Map.entry(4, "Anshal"),
                Map.entry(8, "Health"),
                Map.entry(5, "Neel"),
                Map.entry(9, "Money"),
                Map.entry(6, "Subhadeep"),
                Map.entry(7, "Work"),
                Map.entry(10, "Riding"),
                Map.entry(11, "Rest")
                );
        System.out.println(map4);
        // map4.put(3, "Mukesh"); // throws exception - java.lang.UnsupportedOperationException
        System.out.println("Immutable map cannot be modified: " + map4);

    }
}
