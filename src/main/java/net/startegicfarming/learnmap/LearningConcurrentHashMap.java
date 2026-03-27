package net.startegicfarming.learnmap;

import java.util.concurrent.ConcurrentHashMap;

public class LearningConcurrentHashMap {
    static void main() {

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        // Java 7 -> segment based locking -> 16 segments -> smaller hashmaps
        // Only the segment being written to or read from is locked
        // Read : do not require locking unless there is a write operation happening on the same segment
        // write : lock

        // Java 8   -> no segmentation
        //          -> compare and swap approach -> no locking except resizing or collision.
        // Thread A last saw -> x = 42
        // Thread A work -> x -> 50
        // If x is still is 42, then change it to 50 else don't change and retry.

        map.put(1, "Summi");

        System.out.println("ConcurrentHashMap : " + map);
    }
}
