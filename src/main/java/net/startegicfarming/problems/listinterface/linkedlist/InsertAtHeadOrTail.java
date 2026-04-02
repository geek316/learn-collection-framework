package net.startegicfarming.problems.listinterface.linkedlist;

import java.util.LinkedList;

public class InsertAtHeadOrTail {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("LinkedList Created : " + list);
        System.out.println();

        System.out.println("Inserting at head");
        list.addFirst(20);
        System.out.println(list);

        System.out.println("Inserting at tail");
        list.addLast(30);
        System.out.println(list);

        System.out.println("Inserting at head");
        list.addFirst(10);
        System.out.println(list);

        System.out.println("Inserting at tail");
        list.addLast(40);
        System.out.println(list);
        System.out.println();
        System.out.println();
    }
}
