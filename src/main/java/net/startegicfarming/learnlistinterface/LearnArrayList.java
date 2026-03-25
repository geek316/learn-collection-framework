package net.startegicfarming.learnlistinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnArrayList {


    static void main() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.size());

        System.out.println("Using for loop");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("Using for each loop");
        for (int x : list) {
            System.out.println(x);
        }
        System.out.println(list.contains(5));

        list.remove(Integer.valueOf(1));
        System.out.println("After removing 1");
        System.out.println(list);
        list.removeFirst();
        System.out.println("After removing first element");
        System.out.println(list);

        list.add(2, 10);
        System.out.println("After adding 10 at index 2");
        System.out.println(list);

        list.set(2, 20);
        System.out.println("After setting 20 at index 2");
        System.out.println(list);

        System.out.println("Size of list: " + list.size());
        System.out.println(list.getClass().getName());

        Collections.sort(list);
        System.out.println("After sorting");
        System.out.println(list);

        list.sort(null);
        System.out.println("After sorting using null");
        System.out.println(list);

        list.sort(new MyComparator());
        System.out.println("After sorting using MyComparator");
        System.out.println(list);

        list.sort((a, b) -> a - b);
        System.out.println("After sorting using lambda");
        System.out.println(list);

        Collections.reverse(list);
        System.out.println("After reversing");
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println("After shuffling");
        System.out.println(list);



        System.out.println("Using constructor");
        ArrayList<String> list2 = new ArrayList<>(100);
        list2.add("Banana");
        list2.add("Watermelon");
        list2.add("Kiwi");
        list2.add("Pineapple");
        list2.add("Mango");
        System.out.println(list2);
        System.out.println(list2.size());
        System.out.println(list2.getClass().getName());

        list2.sort(new StringLengthComparator());
        System.out.println("After sorting using StringLengthComparator");
        System.out.println(list2);

        list2.sort((a,b) ->  b.length() - a.length());
        System.out.println("After sorting using lambda");
        System.out.println(list2);


        List<String> list3 = Arrays.asList("a", "b", "c");
        System.out.println("Using asList: " + list3);
        System.out.println(list3.getClass().getName());
        //list3.add("d"); <- this is not possible here
        list3.set(0, "d");
        System.out.println("After setting d at index 0");
        System.out.println(list3);


        List<String> alist = List.of("a", "b", "c");
        System.out.println(alist);


        // Alternative way to check capacity (works in all Java versions)
//        try {
//            Field field = ArrayList.class.getDeclaredField("elementData");
//            field.setAccessible(true);
//            Object[] elementData = (Object[]) field.get(list2);
//            System.out.println("Capacity: " + elementData.length);
//        } catch (NoSuchFieldException | IllegalAccessException | InaccessibleObjectException e) {
//            // Handle security restrictions in newer Java versions
//            System.out.println("Cannot access internal field due to security restrictions");
//        }

        // Not working on Java 25
    }
}

class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
