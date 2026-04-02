package net.startegicfarming.learnlistinterface;

import java.util.Arrays;
import java.util.LinkedList;

public class LearnLinkedList {
    public static void main(String[] args) {
        Node node1 = new Node();
        Node node2 = new Node();
        node1.value = 1;
        node1.next = node2;
        node2.value = 2;
        node2.next = null;

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        System.out.println(linkedList);

        linkedList.addLast(6);
        linkedList.addFirst(0);
        System.out.println(linkedList);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.size());
        System.out.println(linkedList.getClass().getName());
        System.out.println(linkedList.contains(3));


        System.out.println("Removing elements");
        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat","Dog","Elephant"));
        System.out.println("Animals " + animals);
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Dog","Lion"));
        System.out.println("Animals to remove " + animalsToRemove);
        animals.removeAll(animalsToRemove);
        System.out.println("Animals list After removing animals to remove");
        System.out.println(animals);

    }
}

class Node {
    public int value;
    public Node next;
}
