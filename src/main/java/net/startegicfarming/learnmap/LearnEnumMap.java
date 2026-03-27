package net.startegicfarming.learnmap;

import java.util.EnumMap;
import java.util.Map;

enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

public class LearnEnumMap {
    static void main() {

        // array of size same as enum
        // ["Walking","Gym,_,_,_,_,_]
        // no hashing
        // ordinal/syntax is used
        // Faster than hashmap
        // Memory Efficient
        Map<Day, String> map = new EnumMap<>(Day.class);
        map.put(Day.TUESDAY, "Gym");
        map.put(Day.MONDAY, "Walk");
        System.out.println(Day.TUESDAY.ordinal());
        System.out.println(Day.MONDAY.ordinal());
        System.out.println(map);

    }
}
