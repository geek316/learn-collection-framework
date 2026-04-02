package net.startegicfarming.learnlistinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class LearningCopyOnWriteArrayList {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);


        CopyOnWriteArrayList<String> shoppingList = new CopyOnWriteArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Bread");
        System.out.println("Initial Shopping List : " + shoppingList);

        for(String item : shoppingList) {
            System.out.println(item);
            // Try to modify the list while reading.
            if (item.equals("Milk")) {
                shoppingList.add("Cheese");
                System.out.println("Added Cheese while reading.");
                System.out.println("After adding Cheese : " + shoppingList);
            }
            if (item.equals("Eggs")) {
                shoppingList.add("Butter");
                System.out.println("Added Butter while reading.");
                System.out.println("After adding Butter : " + shoppingList);
            }
        }
    }
}
