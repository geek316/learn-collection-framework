package net.startegicfarming.learnset;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class LearnSet {
    public static void main(String[] args) {
        // Set is a collection that cannot contains duplicate elements
        // Faster operations
        // Internal working is similar to hashMap - [key, value] where value is null
        // Methods are extended from collection interface so it has methods of list interface.
        // Map -> HashMap, LinkedHashMap, TreeMap, EnumMap
        // Set -> HashSet, LinkedHashSet, TreeSet, EnumSet
        Set<Integer> set = new HashSet<>();

        Map<Integer, String> map = new HashMap<>();
        Set<Integer> key = map.keySet(); // Key of map is a set.

        set.add(2);
        set.add(5);
        set.add(1);
        set.add(3);
        set.add(4);
        set.add(100);
        set.add(2);
        set.add(55);
        set.add(1);
        set.add(999);
        set.add(1); // this will be ignored as this value is already present
        System.out.println("HashSet : " + set); // output will be unordered

        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(34);
        set2.add(23);
        set2.add(12);
        set2.add(45);
        set2.add(12); // this will be ignored as this value is already present
        System.out.println("LinkedHashSet : " + set2); // output will be ordered (insertion order)

        NavigableSet<Integer> set3 = new TreeSet<>();
        set3.add(100);
        set3.add(2);
        set3.add(55);
        set3.add(1);
        set3.add(999);
        set3.add(1); // this will be ignored as this value is already present
        System.out.println("TreeSet : " + set3); // output will be ordered (sorted order)
        System.out.println("Contains 1 : " + set3.contains(1));
        System.out.println("Remove 1 : " + set3.remove(1));

        for(int i : set3) {
            System.out.println("Inside loop : " + i);
        }

        set3.clear();
        System.out.println("Is set3 empty : " + set3.isEmpty());


        // For thread safety
        System.out.println("Thread safety : ");
        Set<Integer> set4 = Collections.synchronizedSet(set2); // Operations are blocking
        Set<Integer> set5 = new ConcurrentSkipListSet<>(); // Better to use - buildIn thread safety

        // Example : syncronizedSet
        synchronized (set4) {
            for (int i : set4) {
                System.out.println("Inside syncronizedSet loop : " + i);
            }
        }


        // UnmodifiableSet
        // We can input more than 10 elements, different from Map.of() in which we can input only input 10 elements.
        Set<Integer> set6 = Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15); // unmodifiable set
        System.out.println("set6 which is unmodifiable : " + set6);
        set6.remove(15); // This will throw UnsupportedOperationException



    }
}
