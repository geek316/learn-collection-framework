package net.startegicfarming.problems.listinterface.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ReverseList {
    static void main() {

        ArrayList<Integer> list = new ArrayList<>(List.of(1,3,5,7,9,11,13,15));
        System.out.println("List Reversal");
        System.out.println("List before reversed : " + list);
        ArrayList<Integer> revList = new ArrayList<>();
        for(int i=list.size()-1; i>=0; i--){
            revList.add(list.get(i));
        }
        System.out.println("List After reversed : " + revList);
    }
}
