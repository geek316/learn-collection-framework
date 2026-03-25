package net.startegicfarming.problems.listinterface.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListVsArrayList {
    static void main() {

        int n = 100_000;

        long start1 = System.currentTimeMillis();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i=0; i<n; i++) {
            arr.add(0, i);
        }
        long end1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i=0; i<n; i++) {
            list.addFirst(i);
        }
        long end2 = System.currentTimeMillis();

        System.out.println("ArrayList : " + (end1 - start1));
        System.out.println("LinkedList : " + (end2 - start2));

    }
}
