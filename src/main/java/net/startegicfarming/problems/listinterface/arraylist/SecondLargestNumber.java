package net.startegicfarming.problems.listinterface.arraylist;

import java.util.ArrayList;
import java.util.List;

public class SecondLargestNumber {
    static void main() {

        System.out.println("Finding the second largest element in arraylist.");
        ArrayList<Integer> list4 = new ArrayList<>(List.of(1,2,3,4,99));
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int num : list4) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        System.out.println("Second largest : " + second);
    }
}
