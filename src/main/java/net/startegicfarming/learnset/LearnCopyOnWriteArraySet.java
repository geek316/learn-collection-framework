package net.startegicfarming.learnset;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class LearnCopyOnWriteArraySet {
    public static void main(String[] args) {
        // Thread safe
        // Copy on write mechanism
        // No duplicate elements
        // Iterators do not reflect modifications
        CopyOnWriteArraySet<Integer> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();

        for(int i = 0; i < 10; i++) {
            copyOnWriteArraySet.add(i);
            concurrentSkipListSet.add(i);
        }

        System.out.println("CopyOnWriteArraySet : " + copyOnWriteArraySet);
        System.out.println("ConcurrentSkipListSet : " + concurrentSkipListSet);

        System.out.println("\nIterating and modifying CopyOnWriteArraySet:");
        for(int i : copyOnWriteArraySet) {
            System.out.println("Reading from CopyOnWriteArraySet : " + i);
            // Attempt to modify CopyOnWriteArraySet while iterating
            copyOnWriteArraySet.remove(i);
        }
        System.out.println("CopyOnWriteArraySet after iteration : " + copyOnWriteArraySet);

        System.out.println("\nIterating and modifying ConcurrentSkipListSet:");
        for(int i : concurrentSkipListSet) {
            System.out.println("Reading from ConcurrentSkipListSet : " + i);
            // Attempt to modify ConcurrentSkipListSet while iterating
            concurrentSkipListSet.add(20);
        }
        System.out.println("ConcurrentSkipListSet after iteration : " + concurrentSkipListSet);

        // ConcurrentSkipListSet is weakly consistent
        // CopyOnWriteArraySet is strong consistency

        System.out.println("\nIterating and modifying ConcurrentSkipListSet:");
        for(int i : concurrentSkipListSet) {
            System.out.println("Reading from ConcurrentSkipListSet : " + i);
            // Attempt to modify ConcurrentSkipListSet while iterating
            concurrentSkipListSet.add(21);
            if(i == concurrentSkipListSet.size()) {
                concurrentSkipListSet.add(30);
            }
        }
        System.out.println("ConcurrentSkipListSet after iteration : " + concurrentSkipListSet);
    }
}
