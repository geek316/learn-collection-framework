package net.startegicfarming.learnlistinterface;

import java.util.LinkedList;
import java.util.Vector;

public class LearningVector {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(5, 3);
        System.out.println("Capacity of vector : " + vector.capacity());
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        System.out.println("Size of vector : " + vector.size());
        vector.add(6);
        System.out.println("Capacity of vector : " + vector.capacity());

        System.out.println("Clearing the vector");
        vector.clear();
        System.out.println("Size of vector after clear : " + vector.size());
        System.out.println("Capacity of vector : " + vector.capacity());


        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        Vector<Integer> vector1 = new Vector<>(linkedList);
        System.out.println("Size of vector1 : " + vector1.size());
        System.out.println(vector1);

    }
}
