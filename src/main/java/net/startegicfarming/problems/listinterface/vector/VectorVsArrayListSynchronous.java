package net.startegicfarming.problems.listinterface.vector;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorVsArrayListSynchronous {
    public static void main(String[] args) throws InterruptedException {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> vector = new Vector<>();

        runTest("ArrayList", arrayList);
        runTest("Vector", vector);
    }

    static void runTest(String name, List<Integer> list) throws InterruptedException{

        Thread t1 = new Thread(() -> {
            for (int i=0; i<10000; i++) {
                list.add(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i=0; i<10000; i++) {
                list.add(i);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(name + " size : " + list.size());

    }
}
