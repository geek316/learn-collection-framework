package net.startegicfarming.problems.listinterface.copyonwritearraylist;

import java.util.ArrayList;
import java.util.List;

public class HeavyWriteScenario {
    static void main() {

        int n = 100_000;

        long start1 = System.nanoTime();
        List<Integer> arr = new ArrayList<>();
        for(int i=0; i<n; i++) {
            arr.add(i);
        }
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        List<Integer> cow = new ArrayList<>();
        for(int i=0; i<n; i++) {
            cow.add(i);
        }
        long end2 = System.nanoTime();


        System.out.println("Performance comparison of ArrayList Vs CopyOnWriteArrayList when heavy writing");
        System.out.println("ArrayList time : " + (end1 - start1));
        System.out.println("CopyOnWriteArrayList time : " + (end2 - start2));


    }
}
