package net.startegicfarming.learnmap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class LearnHashtable {
    static void main() {

        Hashtable<Integer, String> hashtable = new Hashtable<>();
        // Hashtable is synchronized
        // no null key or value
        // Legacy class, has been replaced by ConcurrentHashMap
        // slower than HashMap
        // Only linked-list in case of collision
        // All methods are synchronized
        hashtable.put(1, "Banana");
        hashtable.put(2, "Cherry");
        hashtable.put(3, "Apple");
        System.out.println("HashTable : " + hashtable);
        System.out.println("value for key 2 : " + hashtable.get(2));
        hashtable.remove(2);
        System.out.println("Hashtable after removing key 2 : " + hashtable);
        System.out.println();
        System.out.println();


        System.out.println("Check for Multithreading");
        HashMap<Integer, String> map = new HashMap<>();
        Hashtable<Integer, String> table = new Hashtable<>();

        multiThreading(map);
        System.out.println("Final Size of HashMap : " + map.size());

        multiThreading(table);
        System.out.println("Final Size of Hashtable : " + table.size());


    }

    private static void multiThreading(Map<Integer, String> map) {
        Thread thread1 = new Thread(() -> {
            for (int i=0; i<10000; i++) {
                map.put(i, "Thread1");
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i=10000; i<20000; i++) {
                map.put(i, "thread2");
            }
        });

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
