package net.startegicfarming.learnstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LearningLazyEvaluation {
    static void main() {

        List<String> names = Arrays.asList("Summi", "Hemant", "Mukesh", "Anshal", "Neel");

        Stream<String> stream = names.stream().filter(name -> {
            System.out.println("Filtering: " + name);
            return name.length() > 3;
        });

        System.out.println("Before Terminal Operation");

        List<String> result = stream.toList();

        System.out.println("After terminal Operation");
        System.out.println(result);

    }
}
