package net.startegicfarming.learnmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LearnLinkedHashMap {
    static void main() {

        LinkedHashMap<String, Integer> lhMap = new LinkedHashMap<>(11, 0.8f, true);
        lhMap.put("Orange", 10);
        lhMap.put("Apple", 20);
        lhMap.put("Guava", 30);
        lhMap.put("Banana", 40);
        lhMap.put("Kiwi", 50);

        lhMap.get("Guava");

        for (Map.Entry<String, Integer> entry : lhMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        HashMap<String, Integer> hashMap = new HashMap<>();
        LinkedHashMap linkedHashMap = new LinkedHashMap(hashMap);

        hashMap.put("Summi", 99);
        hashMap.put("Mukesh", 41);
        hashMap.put("Hemant", 33);

        System.out.println();
        System.out.println("Summi's Marks : " + hashMap.getOrDefault("Summi", 0));
        System.out.println("Anshal's Marks : " + hashMap.getOrDefault("Anshal", 0));

        hashMap.putIfAbsent("Anshal", 91);
        hashMap.putIfAbsent("Hemant", 100);
        System.out.println("After marks refill.");

        System.out.println("Summi's Marks : " + hashMap.getOrDefault("Summi", 0));
        System.out.println("Anshal's Marks : " + hashMap.getOrDefault("Anshal", 0));
        System.out.println("Hemant's Marks : " + hashMap.getOrDefault("Hemant", 0));
        System.out.println("Mukesh's Marks : " + hashMap.getOrDefault("Mukesh", 0));
        System.out.println("Neel's Marks : " + hashMap.getOrDefault("Neel", 0));

    }

}
