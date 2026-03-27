package net.startegicfarming.learnmap;

import java.util.ArrayList;
import java.util.List;

public class LearnComparable {
    static void main() {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(1);
        numbers.add(9);
        numbers.add(3);
        numbers.add(7);
        System.out.println("Numbers before sorting: " + numbers);
        numbers.sort(null); // works because Integer has natural order of sorting.
        System.out.println("Numbers after sorting: " + numbers);
        System.out.println();
        System.out.println();


        List<Animal> list = new ArrayList<>();
        list.add(new Animal("Cat", 3));
        list.add(new Animal("Cheetah", 10));
        list.add(new Animal("Lion", 6));
        list.add(new Animal("Horse", 8));
        list.add(new Animal("Dog", 4));

        System.out.println("Animal List before sorting.");
        System.out.println(list);
        list.sort(null);
        System.out.println("Animal List after sorting: ");
        System.out.println(list);

    }
}

class Animal implements Comparable<Animal>{

    String name;
    Integer speed;

    public Animal(String name, Integer speed) {
        this.name = name;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }

    public Integer getSpeed() {
        return speed;
    }

    @Override
    public int compareTo(Animal o) {
        return Integer.compare(o.getSpeed(), this.getSpeed());
    }
}
