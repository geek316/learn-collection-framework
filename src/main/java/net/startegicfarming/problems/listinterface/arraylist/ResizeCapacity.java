package net.startegicfarming.problems.listinterface.arraylist;

import java.util.ArrayList;

public class ResizeCapacity {
    static void main() {

        System.out.println("Checking performance of arraylist when resizing with and without initializing capacity.");
        ArrayList<Integer> resizeArray = new ArrayList<>();
        long start1 = System.currentTimeMillis();
        for(int i=0; i< 1_000_000; i++){
            resizeArray.add(i);
        }
        long end1 = System.currentTimeMillis();
        System.out.println("Time taken for resizing : " + (end1 - start1));

        ArrayList<Integer> presizedArray = new ArrayList<>(1_000_000);
        long start2 = System.currentTimeMillis();
        for(int i=0; i< 1_000_000; i++){
            presizedArray.add(i);
        }
        long end2 = System.currentTimeMillis();
        System.out.println("Time taken for pre-sized : " + (end2 - start2));
    }
}
