package net.startegicfarming.learnmap;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class LearnTreeMap {
    static void main() {

        SortedMap<String, Integer> map = new TreeMap();
        map.put("Summi", 99);
        map.put("Hemant", 33);
        map.put("Mukesh", 40);
        map.put("Anshal", 91);
        map.put("Neel", 72);

        // Sorting happens based on keys.
        System.out.println("TreeMap : " + map);
        System.out.println("FirstKey : " + map.firstKey());
        System.out.println("LastKey : " + map.lastKey());
        System.out.println("HeadMap to R : " + map.headMap("R"));
        System.out.println("TailMap from B " + map.tailMap("B"));
        System.out.println("SubMap : " + map.subMap("H", "N"));
        System.out.println();
        System.out.println();


        NavigableMap<Integer, String> navMap = new TreeMap<>();
        navMap.put(3, "Mukesh");
        navMap.put(1, "Summi");
        navMap.put(4, "Anshal");
        navMap.put(2, "Hemant");
        System.out.println("Navigable Map : " + navMap);
        System.out.println("LowerKey 4 : " + navMap.lowerKey(4));
        System.out.println("CeilingKey 4 : " + navMap.ceilingKey(4));

    }
}
