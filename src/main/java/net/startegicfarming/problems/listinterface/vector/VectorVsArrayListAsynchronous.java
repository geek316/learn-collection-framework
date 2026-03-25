package net.startegicfarming.problems.listinterface.vector;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorVsArrayListAsynchronous {
    static void main() {

        int n = 1_000_000;

        long start1 = System.nanoTime();
        List<Integer> arr = new ArrayList<>();
        for (int i=0; i<n; i++) {
            arr.add(i);
        }
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        List<Integer> vec = new Vector<>();
        for (int i=0; i<n; i++) {
            vec.add(i);
        }
        long end2 = System.nanoTime();

        System.out.println("ArrayList : " + (end1 - start1));
        System.out.println("Vector : " + (end2 -start2));

    }
}
