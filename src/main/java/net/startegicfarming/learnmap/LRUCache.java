package net.startegicfarming.learnmap;

import java.util.LinkedHashMap;
import java.util.Map;

// Last Recent Unit, only takes effect when put / putall command is run.

public class LRUCache<K, V> extends LinkedHashMap<K, V> {

    private int capacity;

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    static void main() {
        LRUCache<String, Integer> studentMap = new LRUCache<>(3);
        studentMap.put("Summi", 99);
        studentMap.put("Ram", 100);
        studentMap.put("Hemant", 33);
        studentMap.put("Anshal", 91);
        studentMap.put("Mukesh", 40);

        studentMap.get("Anshal");
        studentMap.put("Hemant", 33);
        studentMap.put("Summi", 99);
        studentMap.get("Mukesh");

        System.out.println(studentMap);
    }
}
