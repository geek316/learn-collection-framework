package net.startegicfarming.problems.listinterface.copyonwritearraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastVsFailSafe {
    static void main() {

        System.out.println("Adding inside a ArrayList while printing the values.");
        List<Integer> list = new ArrayList<>();
        extracted(list);
        System.out.println();

        System.out.println("Adding inside a CopyOnWriteArrayList while printing the values.");
        List<Integer> list2 = new CopyOnWriteArrayList<>();
        extracted(list2);


    }

    private static void extracted(List<Integer> list) {
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        try {
            for (Integer val : list) {
                System.out.println(val);
                list.add(100);
            }
            System.out.println("Final list : " + list);
        } catch (Exception e) {
            System.out.println("Exception while adding inside list in between printing." + e);
        }
    }
}
