package net.startegicfarming.learnmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class learnhashmap {
    static void main() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(null, "zero");
        map.put(1, "Only one");
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "two");
        System.out.println("Map :" + map);

        map.get(1);
        System.out.println("Value for key 1 : " + map.get(1));

        map.containsKey(2);
        System.out.println("Contains key 2 : " + map.containsKey(2));

        map.containsValue("one");
        System.out.println("Contains value 'one' : " + map.containsValue("one"));

        for (Integer key : map.keySet()) {
            System.out.println("Key : " + key + " Value : " + map.get(key));
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        for(Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        for(Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getValue().toUpperCase());
        }

        map.remove(1);
        System.out.println("Map after removing key 1 : " + map);

        map.clear();
        System.out.println("Map after clearing : " + map);

        map.isEmpty();
        System.out.println("Is map empty : " + map.isEmpty());



    }
}
