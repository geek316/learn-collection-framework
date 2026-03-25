package net.startegicfarming.problems.listinterface.arraylist;

import java.util.ArrayList;

public class CrudOperation {
    static void main() {

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Created arraylist of Integer : " + list);
        System.out.println();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(10);
        System.out.println("Added 10 elements to Array List : " + list);
        System.out.println();

        System.out.println("Removing Even Number from arraylist.");
        for(int i=0; i<list.size(); i++) {
            if (list.get(i)%2 == 0) {
                list.remove(i);
                System.out.println(list);
            }
        }
        System.out.println("List after removing even numbers from start: " + list);
        System.out.println();

        // All the numbers in this list is even, so ideally all number should have been removed from the list.
        // After removal, index of all elements shift left, that is the reason every other number gets skipped from the removal process.
        // Fixing this property of ArrayList should be done by removing the element from the last.

        for(int j = list.size()-1 ; j >= 0; j--) {
            if(list.get(j)%2 ==0) {
                list.remove(j);
                System.out.println(list);
            }
        }
        System.out.println("List after removing even numbers from end " + list);
        System.out.println();
        System.out.println();
    }
}
