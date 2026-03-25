package net.startegicfarming.problems.listinterface.arraylist;

import java.util.ArrayList;
import java.util.List;

public class DuplicateRemoval {
    static void main() {

        System.out.println("Duplicate Removal");
        ArrayList<Integer> list2 = new ArrayList<>(List.of(2,2,3,4,5,6,67,8,8,6,5,43,4,5,6,7,7,8,8,8));
        System.out.println("List Contains : " + list2);

        ArrayList<Integer> dedupList = new ArrayList<>();

        for(int i=0; i<list2.size(); i++){
            if(dedupList.contains(list2.get(i))){
            } else {
                dedupList.add(list2.get(i));
            }
        }
        System.out.println("Duplicate removed : " + dedupList);
        System.out.println();
        System.out.println();
    }
}
