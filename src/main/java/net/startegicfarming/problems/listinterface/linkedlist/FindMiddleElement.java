package net.startegicfarming.problems.listinterface.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FindMiddleElement {
    static void main() {

        LinkedList<Integer> linkList = new LinkedList<>(List.of(1,2,3,4,5,6));
        System.out.println("Finding Middle Element for LinkedList : " + linkList);
        System.out.println();

        System.out.println("Using Iteration Approach");
        int midIndex = linkList.size()/2;
        System.out.println("Middle element of the linkedlist is : " + linkList.get(midIndex));
        System.out.println();

        System.out.println("Using Two-pointer approach");
        Iterator<Integer> slow = linkList.iterator();
        Iterator<Integer> fast = linkList.iterator();
        Integer slowVal = slow.next();
        Integer fastVal = fast.next();
        while (fast.hasNext()) {
            fast.next();
            if(fast.hasNext()){
                fast.next();
                slowVal = slow.next();
            }
        }
        System.out.println("Middle : " + slowVal);

    }
}
