package net.startegicfarming.problems.listinterface.copyonwritearraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentReadWriteDemo {
    static void main() {

        System.out.println("ArrayList concurrent read and write.");
        List<Integer> list = new ArrayList<>();
        multiThreading(list);


        System.out.println();
        System.out.println("CopyOnWriteArrayList concurrent read and write.");
        List<Integer> corList = new CopyOnWriteArrayList<>();
        multiThreading(corList);

    }

    static void multiThreading(List list) {

        for (int i=0; i<5; i++) {
            list.add(i);
        }

        Thread reader = new Thread(() -> {
            try{
                for (Object val : list) {
                    System.out.println("Reading : " + val);
                    Thread.sleep(100);
                }
            } catch (Exception e) {
                System.out.println("Reader Exception : " + e);
            }
        });

        Thread writer = new Thread(() -> {
            try {
                Thread.sleep(200);
                list.add(100);
                System.out.println("Added 100");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        reader.start();
        writer.start();

        try{
            reader.join();
            writer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
