package net.startegicfarming.learnmap;

import java.util.concurrent.ConcurrentSkipListMap;

public class LearnConcurrentSkipListMap {
    static void main() {

        // probabilistic data structure
        // similar to sorted linked list but with multiple layers
        ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();
        map.put(2, "Hemant");
        map.put(1, "Summi");
        map.put(3, "Mukesh");
        map.put(5, "Neel");
        map.put(4, "Anshal");
        System.out.println("Original map : " + map);


    }
}
